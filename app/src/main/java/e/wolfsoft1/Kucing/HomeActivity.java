package e.wolfsoft1.Kucing;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

import adapter.TabAdapter;
import e.wolfsoft1.ecom.R;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener{


    ViewPager viewPager1;
    TabLayout tabLayout1;
    TabAdapter adapter;
    ImageView cari;
    Spinner sp_car_name;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        cari = findViewById(R.id.iv_cari);

        cari.setOnClickListener(this);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.WHITE);

        }
//        sp_car_name = findViewById(R.id.sp_car_name);
        //sp_car_model = (Spinner)view.findViewById(R.id.sp_car_model);

        List<String> list = new ArrayList<String>();
        list.add("WOMEN ");
        list.add("KID ");
        list.add("PRODUCT");

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(HomeActivity.this,
                R.layout.spinner_item, R.id.spinner_text, list);
//        sp_car_name.setAdapter(dataAdapter);

        tabLayout1 = findViewById(R.id.tablayout1);

        viewPager1 = findViewById(R.id.viewpager1);

//        setCustomFontAndStyle(tabLayout1, 0);
        tabLayout1.setTabGravity(TabLayout.GRAVITY_FILL);


        tabLayout1.addTab(tabLayout1.newTab().setText("BERANDA"));
        tabLayout1.addTab(tabLayout1.newTab().setText("JENIS-JENIS"));
        tabLayout1.addTab(tabLayout1.newTab().setText("TOKO"));




        adapter = new TabAdapter(getSupportFragmentManager(), tabLayout1.getTabCount());
        viewPager1.setAdapter(adapter);
        viewPager1.setOffscreenPageLimit(3);
        viewPager1.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout1));
        tabLayout1.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {

            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager1.setCurrentItem(tab.getPosition());

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.iv_cari:
                startActivity(new Intent(HomeActivity.this,HasilCari.class));

                break;
        }
    }
}
