package mainactivity.a7moksha.example.com.appstore;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toolbar;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {
TabLayout tabLayout;
ViewPager viewPager;
PagerAdapter pagerAdapter;
android.support.v7.widget.Toolbar toolbar;
TextView lohout;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
       getMenuInflater().inflate(R.menu.option,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        tabLayout=findViewById(R.id.tab);
        viewPager=findViewById(R.id.pager);


        pagerAdapter =new PagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(pagerAdapter);

        tabLayout.addTab(tabLayout.newTab().setText("vehicles"));
        tabLayout.addTab(tabLayout.newTab().setText("Electronic"));
        tabLayout.addTab(tabLayout.newTab().setText("Fashion"));

        tabLayout.getTabAt(0).setIcon(R.drawable.ic_car);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_television);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_shirt);


        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
      toolbar=findViewById(R.id.toolbr);
      setSupportActionBar(toolbar);
      getSupportActionBar().setDisplayShowTitleEnabled(true);
      getSupportActionBar().setTitle("Mohamed ");
      getSupportActionBar().setLogo(R.drawable.ic_person_black_24dp);

       lohout=findViewById(R.id.logout);
       lohout.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent=new Intent(SecondActivity.this,MainActivity.class);
               startActivity(intent);
           }
       });




    }
}
