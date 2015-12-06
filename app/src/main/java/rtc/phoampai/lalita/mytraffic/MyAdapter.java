package rtc.phoampai.lalita.mytraffic;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by User on 6/12/2558.
 */
public class MyAdapter extends BaseAdapter {

    //Explicit
    private Context objContext;
    private String[] titleStrings, detailStrings;
    private int[] iconints;

    public MyAdapter(Context objContext, String[] titleStrings, String[] detailStrings, int[] iconints) {
        this.objContext = objContext;
        this.titleStrings = titleStrings;
        this.detailStrings = detailStrings;
        this.iconints = iconints;
    }   //Constructor

    @Override
    public int getCount() {
        return titleStrings.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        //Open Service
        LayoutInflater objLayoutInflater = (LayoutInflater) objContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = objLayoutInflater.inflate(R.layout.my_listview, parent, false);

        //SetUp TextView
        TextView titleTextView = (TextView) view.findViewById(R.id.textView2);
        titleTextView.setText(titleStrings[position]);
        TextView detailTextView = (TextView) view.findViewById(R.id.textView3);
        detailTextView.setText(detailStrings[position]);

        //SetUp Image
        ImageView iconImageView = (ImageView) view.findViewById(R.id.imageView);
        iconImageView.setImageResource(iconints[position]);

        return view;
    }
}   //Main Class

