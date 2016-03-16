package pplnostrateam.com.insantani.UI;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

import pplnostrateam.com.insantani.R;
import pplnostrateam.com.insantani.Model.VegetableSearch;

public class SearchResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_result);
<<<<<<< HEAD
        Intent intent = getIntent();
        String message = intent.getStringExtra("query");
        Toast.makeText(this, "Search Result Activity started " + message, Toast.LENGTH_SHORT ).show();

        /*
        Bundle bundle=new Bundle();
        bundle.putString(message, "query");
        //set Fragmentclass Arguments
        CartListFragment fragment=new CartListFragment();
        fragment.setArguments(bundle);
        */
=======
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
>>>>>>> b4491e53b97324cb5415cd5fc107f17d25a2ee0c
    }

    private VegetableSearch parseJSONDetail() {
        VegetableSearch mVegetable = new VegetableSearch();
        return mVegetable;
    }
}
