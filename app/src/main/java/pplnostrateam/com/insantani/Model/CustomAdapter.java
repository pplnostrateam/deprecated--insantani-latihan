package pplnostrateam.com.insantani.Model;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.app.Activity;
import android.widget.Toast;

import java.util.List;

import pplnostrateam.com.insantani.R;
import pplnostrateam.com.insantani.UI.CartListFragment;

/**
 * Created by Adrian on 3/15/2016.
 */
public class CustomAdapter extends BaseAdapter {

    private Context context;
    private boolean useList = true;
    private List<Vegetable> items;


    public CustomAdapter(Context context, List items) {
        this.context = context;
        this.items = items;
        Log.d("items ",items.size()+"");
    }

    /*
     * Holder for the list items
     */
     private class ViewHolder {
        RadioButton mRadioButton;
        EditText mEditText;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    /**
     *
     * @param position
     * @param convertView
     * @param parent
     * @return
     */
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = new ViewHolder();
        View viewToUse;
        Vegetable item = (Vegetable)getItem(position);

        LayoutInflater mInflater = (LayoutInflater) context
                .getSystemService(Activity.LAYOUT_INFLATER_SERVICE);

        viewToUse = mInflater.inflate(R.layout.simple_list_item_3, null);

        holder.mEditText = (EditText)viewToUse.findViewById(R.id.cartTitleTextView);
        holder.mRadioButton = (RadioButton)viewToUse.findViewById(R.id.cartRadioButton);
        holder.mRadioButton.setText(items.get(position).getName());

        return viewToUse;
    }

}
