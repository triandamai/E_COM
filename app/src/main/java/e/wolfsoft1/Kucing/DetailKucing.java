package e.wolfsoft1.Kucing;

import android.graphics.Color;
import android.os.Build;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

import adapter.Adapter_Foto_Kucing_viewpager;
import adapter.TabInfoAdapter;
import e.wolfsoft1.ecom.R;
import me.relex.circleindicator.CircleIndicator;

public class DetailKucing extends AppCompatActivity implements View.OnClickListener {

    private ViewPager v1;
    private Adapter_Foto_Kucing_viewpager a;
    private CircleIndicator indicator;

    ImageView favimg1,back;

    ViewPager viewpager1;
    TabLayout tablayout1;
    TabInfoAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_kucing);
    back = findViewById(R.id.btn_back);
    back.setOnClickListener(this);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.TRANSPARENT);
        }


        v1 = (ViewPager)findViewById(R.id.v1);
        CircleIndicator indicator = (CircleIndicator)findViewById(R.id.indicator);
        a = new Adapter_Foto_Kucing_viewpager(getSupportFragmentManager());
        v1.setAdapter(a);
        indicator.setViewPager(v1);
        a.registerDataSetObserver(indicator.getDataSetObserver());

        tablayout1 = findViewById(R.id.tablayout1);

        viewpager1 = findViewById(R.id.viewpager1);

//      setCustomFontAndStyle(tabLayout1, 0);
        tablayout1.setTabGravity(TabLayout.GRAVITY_FILL);


        tablayout1.addTab(tablayout1.newTab().setText("INFO"));
        tablayout1.addTab(tablayout1.newTab().setText("SIZE CHART"));




        adapter = new TabInfoAdapter(getSupportFragmentManager(), tablayout1.getTabCount());
        viewpager1.setAdapter(adapter);
        viewpager1.setOffscreenPageLimit(2);
        viewpager1.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tablayout1));
        tablayout1.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {

            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewpager1.setCurrentItem(tab.getPosition());

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
            case R.id.btn_back:
                onBackPressed();
                finish();
                break;
        }
    }
}
