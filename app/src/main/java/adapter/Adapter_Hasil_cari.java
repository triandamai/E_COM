package adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.ArrayList;

import e.wolfsoft1.Kucing.DetailKucing;
import e.wolfsoft1.ecom.R;
import model.SearchresultModel;

public class Adapter_Hasil_cari extends RecyclerView.Adapter<Adapter_Hasil_cari.MyViewHolder>{

    int myPos = 0;
    private Context context;


    ArrayList<SearchresultModel> todotodaytaskModelArrayList;

    public Adapter_Hasil_cari(Context context, ArrayList<SearchresultModel> todotodaytaskModelArrayList) {
        this.context = context;
        this.todotodaytaskModelArrayList = todotodaytaskModelArrayList;
    }

    @NonNull
    @Override
    public Adapter_Hasil_cari.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_hasil_cari, parent, false);
        return new Adapter_Hasil_cari.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final Adapter_Hasil_cari.MyViewHolder holder, final int position) {
        SearchresultModel modelfoodrecycler = todotodaytaskModelArrayList.get(position);

        holder.image.setImageResource(modelfoodrecycler.getImage());

//holder.favimg.setOnClickListener(new View.OnClickListener() {
//    @Override
//    public void onClick(View v) {
//
//    }


        holder.favimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                holder.favimg.setImageResource(R.drawable.fav_blue);



            }
        });
        holder.parent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(new Intent(context,DetailKucing.class));
            }
        });
//});
//
//        if (myPos == position){
//            holder.favimg.setImageResource(R.drawable.fav_blue);
//
//
//
//        }else {
////            holder.favimg.setImageResource(R.drawable.fav);
//        }
//
//
//        holder.itemView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                myPos = position;
//                notifyDataSetChanged();
//
//            }
//
//
//        });




    }

    @Override
    public int getItemCount() {
        return todotodaytaskModelArrayList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView image,favimg;
        LinearLayout parent;
        public MyViewHolder(View itemView) {
            super(itemView);

            image = itemView.findViewById(R.id.image);
            favimg = itemView.findViewById(R.id.favimg);
            parent = itemView.findViewById(R.id.parent_item);



        }
    }
}
