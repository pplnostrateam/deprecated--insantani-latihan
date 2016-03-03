package pplnostrateam.com.insantani;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;

/**
 * Created by Adrian on 2/25/2016.
 */
public class SplashScreen extends AppCompatActivity {

    /**
     * The thread to process splash screen events
     */
    private Thread mSplashThread;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Splash screen view
        setContentView(R.layout.splash_screen);

        final SplashScreen sPlashScreen = this;

        // The thread to wait for splash screen events
        mSplashThread =  new Thread() {
            public void run() {
                try{
                    synchronized (this) {
                        wait(12000);
                    }
                } catch(InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    Intent openStartingPoint = new Intent(SplashScreen.this, MainActivity.class);
                    startActivity(openStartingPoint);

                }
            }
        };
        mSplashThread.start();
    }

    /**
     * Processes splash screen touch events
     */
    @Override
    public boolean onTouchEvent(MotionEvent evt)
    {
        if(evt.getAction() == MotionEvent.ACTION_DOWN)
        {
            synchronized(mSplashThread){
                mSplashThread.notifyAll();
            }
        }
        return true;
    }
}
