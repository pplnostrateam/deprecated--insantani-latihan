package pplnostrateam.com.insantani.UI;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import pplnostrateam.com.insantani.R;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.searchVegetableText) TextView mTextView;
    @Bind(R.id.searchVegetableButton) Button mSearchButton;

    @OnClick(R.id.searchVegetableButton) void onClick() {
        Toast.makeText(this, "Clicked!", Toast.LENGTH_SHORT).show();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


    }

    protected void startSearch(String query) {
        Intent intent = new Intent(this, SearchResultActivity.class);
        intent.putExtra("query",query);
        startActivity(intent);
    }
}
