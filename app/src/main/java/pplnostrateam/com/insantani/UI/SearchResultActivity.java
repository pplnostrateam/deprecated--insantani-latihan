package pplnostrateam.com.insantani.UI;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.widget.FrameLayout;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import pplnostrateam.com.insantani.Model.VegetableSearch;
import pplnostrateam.com.insantani.R;

public class SearchResultActivity extends AppCompatActivity {

    FragmentManager fragmentManager = this.getSupportFragmentManager();
    FragmentTransaction fragmentTransaction;

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
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_frame, fragment);
        fragmentTransaction.commit();
        Toast.makeText(this, "Show cart", Toast.LENGTH_SHORT).show();


    }

    private VegetableSearch parseJSONDetail() {
        VegetableSearch mVegetable = new VegetableSearch();
        return mVegetable;
    }

}
