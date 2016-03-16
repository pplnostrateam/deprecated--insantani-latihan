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
import butterknife.OnCheckedChanged;
import butterknife.OnClick;
import pplnostrateam.com.insantani.R;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.searchVegetableText) TextView mTextView;
    /*
    @OnClick(R.id.homeButton) void onClick() {
        startSearch(mTextView.getText().toString());
    }*/
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
            startActivity(new Intent(this, LoginActivity.class));
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
