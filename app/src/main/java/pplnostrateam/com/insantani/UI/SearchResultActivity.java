package pplnostrateam.com.insantani.UI;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import butterknife.ButterKnife;
import pplnostrateam.com.insantani.Model.VegetableSearch;
import pplnostrateam.com.insantani.R;

public class SearchResultActivity extends AppCompatActivity {

    FragmentManager mFragmentManager = this.getSupportFragmentManager();
    FragmentTransaction mFragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_result);
        ButterKnife.bind(this);
        Intent intent = getIntent();
        String message = intent.getStringExtra("query");
        Bundle bundle=new Bundle();
        bundle.putString("query", message);
        //set Fragmentclass Arguments
        Fragment fragment= (Fragment)new CartListFragment();
        fragment.setArguments(bundle);
        FragmentManager fragmentManager = this.getSupportFragmentManager();
        mFragmentTransaction = fragmentManager.beginTransaction();
        mFragmentTransaction.replace(R.id.fragment_frame, fragment);
        mFragmentTransaction.commit();
        Toast.makeText(this, "Show cart", Toast.LENGTH_SHORT).show();


    }

    private VegetableSearch parseJSONDetail() {
        VegetableSearch mVegetable = new VegetableSearch();
        return mVegetable;
    }

}
