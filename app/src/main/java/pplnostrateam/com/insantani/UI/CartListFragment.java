package pplnostrateam.com.insantani.UI;

import android.app.ListFragment;
import android.content.Intent;
import android.provider.Telephony;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.RadioButton;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import pplnostrateam.com.insantani.Model.CustomAdapter;
import pplnostrateam.com.insantani.Model.Vegetable;
import pplnostrateam.com.insantani.R;

public class CartListFragment extends ListFragment implements AdapterView.OnItemClickListener {

    private List vegetableItemList;
    private CustomAdapter mAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        View view = null;
        try {
            view = inflater.inflate(R.layout.cart_list_fragment, container, false);
        }
        catch(Exception e) {
            Toast.makeText(getActivity(), "Exception in inflating ", Toast.LENGTH_LONG ).show();
        }
        return view;

    }
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        String name = getArguments().getString("query");

        vegetableItemList = new ArrayList();
        vegetableItemList.add(new Vegetable("Baby " + name, 10000));
        vegetableItemList.add(new Vegetable("Ordinary " + name, 10000));
        vegetableItemList.add(new Vegetable("Mythical " + name, 10000));
        vegetableItemList.add(new Vegetable("Green " + name, 10000));

        mAdapter = new CustomAdapter(getActivity(), vegetableItemList);


        setListAdapter(mAdapter);
        getListView().setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(getActivity(), "Item : " + position, Toast.LENGTH_SHORT ).show();
    }

}
