package e.wolfsoft1.Kucing;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import e.wolfsoft1.ecom.R;

public class MainActivity extends AppCompatActivity {


//    private ArrayList<EcomlistModel> kwikListModelClasses;
//    private RecyclerView recyclerView;
//    private Ecom_ListRecycleAdapter bAdapter;
//
//    private String txt[]={"1.Home_ecom","2.Categories_ecom","3.Search-Results_ecom","4.Product-Page_ecom"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainactivity);
        startActivity(new Intent(MainActivity.this,Splash_Screen.class));
        finish();

//        recyclerView = findViewById(R.id.recyclerView);
//        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
//        recyclerView.setLayoutManager(layoutManager);
//        recyclerView.setItemAnimator(new DefaultItemAnimator());
//
//        kwikListModelClasses = new ArrayList<>();
//
//        for (int i = 0; i < txt.length; i++) {
//            EcomlistModel beanClassForRecyclerView_contacts = new EcomlistModel(txt[i]);
//            kwikListModelClasses.add(beanClassForRecyclerView_contacts);
//        }
//        bAdapter = new Ecom_ListRecycleAdapter(MainActivity.this,kwikListModelClasses);
//        recyclerView.setAdapter(bAdapter);


    }
}
