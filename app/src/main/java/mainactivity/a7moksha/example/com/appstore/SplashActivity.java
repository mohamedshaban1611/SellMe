package mainactivity.a7moksha.example.com.appstore;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.preference.Preference;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {
    private final int SPLASH_DISPLAY_LENGTH=3000;
    final String FILE="mainactivity.a7moksha.example.com.appstore.my_file";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                SharedPreferences sharedPreferences=getSharedPreferences(FILE,Context.MODE_PRIVATE);
                String userName = sharedPreferences.getString("username", null);
                String password = sharedPreferences.getString("password", null);
                if (userName != null && password != null ) {
                    Intent intent=new Intent(SplashActivity.this,SecondActivity.class);
                    startActivity(intent);
                }
                else {
                    Intent intent=new Intent(SplashActivity.this,MainActivity.class);
                    startActivity(intent);
                }
            }
        },SPLASH_DISPLAY_LENGTH);



    }
}
