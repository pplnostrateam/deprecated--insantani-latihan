package pplnostrateam.com.insantani.UI;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import pplnostrateam.com.insantani.R;

/*
 * All activity except login register goes here
 */

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.searchVegetableText) TextView mTextView;
    @Bind(R.id.searchVegetableButton) Button searchButton;
    @Bind(R.id.tvLoginLink) TextView login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.tvLoginLink)
    void loginTextView(View view) {
        if (view.getId() == R.id.tvLoginLink) {
<<<<<<< HEAD
            startActivity(new Intent(this, Login.class));
=======
            login.setText("Logout");
            startActivity(new Intent(this, LoginActivity.class));
>>>>>>> cb7cd8063f09afca09972554720009a25b7bba5a
        }
    }

    @OnClick(R.id.searchVegetableButton)
    protected void startSearch() {
        String query  = mTextView.getText().toString();
        Intent intent = new Intent(this, SearchResultActivity.class);
        intent.putExtra("query",query);
        startActivity(intent);
    }
}
