package pplnostrateam.com.insantani.UI;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;
<<<<<<< HEAD
import butterknife.OnCheckedChanged;
=======
>>>>>>> b4491e53b97324cb5415cd5fc107f17d25a2ee0c
import butterknife.OnClick;
import pplnostrateam.com.insantani.R;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.searchVegetableText) TextView mTextView;
<<<<<<< HEAD
    @OnClick(R.id.homeButton) void onClick() {
        startSearch(mTextView.getText().toString());
    }
=======
    @Bind(R.id.searchVegetableButton) Button searchButton;
    @Bind(R.id.tvLoginLink) TextView login;
>>>>>>> b4491e53b97324cb5415cd5fc107f17d25a2ee0c

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    protected void startSearch(String query) {
        Intent intent = new Intent(this, SearchResultActivity.class);
        intent.putExtra("query", query);
<<<<<<< HEAD
       // Toast.makeText(this, query, Toast.LENGTH_SHORT).show();
       startActivity(intent);
    }

=======
        startActivity(intent);
    }

    @OnClick(R.id.tvLoginLink)
    void loginTextView(View view) {
        if (view.getId() == R.id.tvLoginLink) {
            login.setText("Logout");
            startActivity(new Intent(this, Login.class));
        }
    }
>>>>>>> b4491e53b97324cb5415cd5fc107f17d25a2ee0c
}
