package mainactivity.a7moksha.example.com.appstore;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 7moksha on 10/27/2018.
 */

public class ItemAdapter extends ArrayAdapter<Items> {


    public ItemAdapter(@NonNull Context context,  @NonNull ArrayList<Items> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        convertView= LayoutInflater.from(getContext()).inflate(R.layout.custom_row,parent,false);
        TextView name=convertView.findViewById(R.id.txt1);
        TextView price=convertView.findViewById(R.id.txt2);
        ImageView imageView=convertView.findViewById(R.id.img);

        Items items=getItem(position);
        name.setText(items.getName());
        price.setText(items.getPrice());
        imageView.setImageResource(items.getImage_id());

        return convertView;
    }
}
