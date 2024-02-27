package aryan.jairath.nbaapplication;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.TextView;

import java.util.List;

public class TextAdapter extends BaseAdapter {
    private Context context;
    private List<String> items;

    // Constructor
    public TextAdapter(Context context, List<String> items) {
        this.context = context;
        this.items = items;
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

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView textView;
        if (convertView == null) {
            // If the view is not recycled, initialize some attributes
            textView = new TextView(context);
            textView.setLayoutParams(new GridView.LayoutParams(GridView.AUTO_FIT, 100));
            textView.setPadding(8, 8, 8, 8);
            textView.setTypeface(Typeface.MONOSPACE);
            textView.setTextSize(23);
        } else {
            textView = (TextView) convertView;
        }
        textView.setText(items.get(position));
        return textView;
    }
}

