package pplnostrateam.com.insantani.UI;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import pplnostrateam.com.insantani.R;
import pplnostrateam.com.insantani.Model.VegetableSearch;

public class SearchResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_result);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    private VegetableSearch parseJSONDetail() {
        VegetableSearch mVegetable = new VegetableSearch();

        return mVegetable;
    }
}
