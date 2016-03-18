package pplnostrateam.com.insantani.UI;

import android.content.Intent;
import android.provider.Telephony;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import pplnostrateam.com.insantani.Model.CustomAdapter;
import pplnostrateam.com.insantani.Model.Vegetable;
import pplnostrateam.com.insantani.R;

public class CartListFragment extends Fragment  {

    private List vegetableItemList;
    private CustomAdapter mAdapter;

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
     }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        View view = inflater.inflate(R.layout.cart_list_fragment, container, false);
        String name = getArguments().getString("query");

        vegetableItemList = new ArrayList();
        vegetableItemList.add(new Vegetable("Baby " + name, 10000));
        vegetableItemList.add(new Vegetable("Ordinary " + name, 10000));
        vegetableItemList.add(new Vegetable("Mythical " + name, 10000));
        vegetableItemList.add(new Vegetable("Green " + name, 10000));

       // mAdapter = new CustomAdapter(getActivity(), vegetableItemList);
     //   ListView cartList = (ListView) view.findViewById(R.id.cartList);
       // cartList.setAdapter(mAdapter);

        return view;

    }
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
            super.onActivityCreated(savedInstanceState);
    }

    @OnClick(R.id.listCartButton)
    public void moveActivity() {
        Intent intent = new Intent(getActivity(), MainActivity.class);
        startActivity(intent);
        Toast.makeText(getActivity(), "Added to cart", Toast.LENGTH_LONG).show();
        this.getFragmentManager().beginTransaction().remove(this);
    }

}
