package pplnostrateam.com.insantani.Model;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
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

import butterknife.Bind;
import pplnostrateam.com.insantani.R;
import pplnostrateam.com.insantani.UI.CartListFragment;

/**
 * Created by Adrian on 3/15/2016.
 */
public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {

    private Context context;
    private boolean useList = true;
    private List<Vegetable> items;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView mTextView;

        public ViewHolder(TextView v) {
            super(v);
            mTextView = v;
        }

    }


    public CustomAdapter(List<Vegetable> v) {
        this.context = context;
        this.items = items;
    }



    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public int getItemCount() {
        return 0;
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

        holder.etCartText = (EditText)viewToUse.findViewById(R.id.cartTitleTextView);
        holder.bCartButton = (RadioButton)viewToUse.findViewById(R.id.cartRadioButton);
        holder.bCartButton.setText(items.get(position).getName());


        return viewToUse;
    }

}
