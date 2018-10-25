package e.wolfsoft1.Kucing;

import android.graphics.Color;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

import adapter.Adapter_Hasil_cari;
import e.wolfsoft1.ecom.R;
import model.SearchresultModel;

public class HasilCari extends AppCompatActivity implements View.OnClickListener {
    private ArrayList<SearchresultModel> todotodaytaskModelArrayList;
    private RecyclerView recyclerview;
    private Adapter_Hasil_cari bAdapter;
    ImageView back;

    Integer[] image = {R.drawable.kucing4,R.drawable.kucing4,R.drawable.kucing4,R.drawable.kucing4,R.drawable.kucing4,R.drawable.kucing4};


    Spinner sp_car_name2,sp_car_name3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil_cari);
        back = findViewById(R.id.btn_back);

        sp_car_name2 = findViewById(R.id.sp_car_name2);
        //sp_car_model = (Spinner)view.findViewById(R.id.sp_car_model);

        back.setOnClickListener(this);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.WHITE);
        }

        List<String> list = new ArrayList<String>();
        list.add("LATEST ");
        list.add("LATEST ");
        list.add("LATEST");


        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(HasilCari.this, R.layout.spinner_item_search, R.id.spinner_text, list);
        sp_car_name2.setAdapter(dataAdapter);
        int spinnerPosition = dataAdapter.getPosition("TERBARU");


        sp_car_name2.setSelection(spinnerPosition);



        sp_car_name3 = findViewById(R.id.sp_car_name3);
        //sp_car_model = (Spinner)view.findViewById(R.id.sp_car_model);

        List<String> list1 = new ArrayList<String>();
        list1.add("FILTERS ");
        list1.add("FILTERS ");
        list1.add("FILTERS");

        ArrayAdapter<String> dataAdapter1 = new ArrayAdapter<String>(HasilCari.this,
                R.layout.spinner_item_result, R.id.spinner_text, list1);
        sp_car_name3.setAdapter(dataAdapter1);



        recyclerview = findViewById(R.id.recyclerview);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(HasilCari.this,2);
        recyclerview.setLayoutManager(layoutManager);
        recyclerview.setItemAnimator(new DefaultItemAnimator());

        todotodaytaskModelArrayList = new ArrayList<>();

        for (int i = 0; i < image.length; i++) {
            SearchresultModel beanClassForRecyclerView_contacts = new SearchresultModel(image[i]);
            todotodaytaskModelArrayList.add(beanClassForRecyclerView_contacts);
        }
        bAdapter = new Adapter_Hasil_cari(HasilCari.this,todotodaytaskModelArrayList);
        recyclerview.setAdapter(bAdapter);

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
