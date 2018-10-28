package mainactivity.a7moksha.example.com.appstore;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by 7moksha on 10/27/2018.
 */

public class Fragment1 extends Fragment {
    View V;
    ArrayList<Items> itemss;
    ItemAdapter itemAdapter;
    ListView listView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
         V = inflater.inflate(R.layout.fragment1, container, false);

        itemss =new ArrayList<>();
        itemss.add(new Items("Item 1","there is information about this item",R.drawable.a));
        itemss.add(new Items("Item 2","there is information about this item",R.drawable.a));
        itemss.add(new Items("Item 3","there is information about this item",R.drawable.a));
        itemss.add(new Items("Item 4","there is information about this item",R.drawable.a));
        itemss.add(new Items("Item 5","there is information about this item",R.drawable.a));
        itemss.add(new Items("Item 6","there is information about this item",R.drawable.a));
        itemss.add(new Items("Item 7","there is information about this item",R.drawable.a));
        itemss.add(new Items("Item 8","there is information about this item",R.drawable.a));
        itemss.add(new Items("Item 9","there is information about this item",R.drawable.a));


        listView=(ListView)V.findViewById(R.id.list1);
        ItemAdapter itemAdapter =new ItemAdapter(getContext(),itemss);
        listView.setAdapter(itemAdapter);

        return V;


    }


}
