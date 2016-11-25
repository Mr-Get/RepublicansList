package at.obsidion.markus.republicanslist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Leo Ignis on 25.11.2016.
 */

public class CustomAdapter extends BaseAdapter {

    List<Republican> listRepublicans;
    Context context;
    LayoutInflater inflter;

    public CustomAdapter(Context applicationContext, List<Republican> listRepublicans) {
        this.context = applicationContext;
        this.listRepublicans= listRepublicans;
        inflter = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return listRepublicans.size();
    }

    @Override
    public Object getItem(int i) {
        return listRepublicans.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    // Not the Best solution; Better -> ViewHolder
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view==null) {
            view = inflter.inflate(R.layout.row_item, null);//set layout for displaying items
        }
        TextView viewName=(TextView)view.findViewById(R.id.textViewListName);
        TextView viewAddress=(TextView)view.findViewById(R.id.textViewListAddress);
        TextView viewPhone=(TextView)view.findViewById(R.id.textViewListPhone);

        Republican republican = listRepublicans.get(i);
        viewName.setText(republican.getName());
        viewAddress.setText(republican.getAddress());
        viewPhone.setText(republican.getPhoneNumber());

        return view;
    }

}
