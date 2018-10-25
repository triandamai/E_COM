package adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

import e.wolfsoft1.ecom.R;
import model.CategoriesModel;

public class Adapter_Jenis extends RecyclerView.Adapter<Adapter_Jenis.MyViewHolder>{
    boolean collap = true;
    private Context context;

    int myPos = 0;
    ArrayList<CategoriesModel> todotodaytaskModelArrayList;

    public Adapter_Jenis(Context context, ArrayList<CategoriesModel> todotodaytaskModelArrayList) {
        this.context = context;
        this.todotodaytaskModelArrayList = todotodaytaskModelArrayList;
    }

    @NonNull
    @Override
    public Adapter_Jenis.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_jenis, parent, false);
        return new Adapter_Jenis.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final Adapter_Jenis.MyViewHolder holder, int position) {
        CategoriesModel modelfoodrecycler = todotodaytaskModelArrayList.get(position);

        holder.text.setText(modelfoodrecycler.getText());

        holder.ll1.setBackgroundResource(R.drawable.kucing);

        if (position == 0){
            holder.ll1.setBackgroundResource(R.drawable.kucing_2);

            // holder.hoteltext1.setBackgroundResource(Color.parseColor("ffffff"));
        }else if(position == 1){

            holder.ll1.setBackgroundResource(R.drawable.kucing);
            // holder.hoteltext1.setBackgroundColor(Color.parseColor("#00000000"));
        }else if(position == 2) {

            holder.ll1.setBackgroundResource(R.drawable.kucing_2);
        }else if(position == 3) {

            holder.ll1.setBackgroundResource(R.drawable.kucing);

        }else if(position == 4) {

            holder.ll1.setBackgroundResource(R.drawable.kucing_2);

        }
        holder.coll.setVisibility(View.GONE);
        collap = true;
        holder.ll1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
           if( holder.coll.getVisibility() == View.VISIBLE){
              // holder.coll.setVisibility(View.GONE);
               holder.coll.setVisibility(View.GONE);


           }else {

                holder.coll.setVisibility(View.VISIBLE);

           }

            }
        });



    }

    @Override
    public int getItemCount() {
        return todotodaytaskModelArrayList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView text;
        FrameLayout ll1;
        LinearLayout coll;
        public MyViewHolder(View itemView) {
            super(itemView);

            text = itemView.findViewById(R.id.text);
            ll1 = itemView.findViewById(R.id.ll1);
            coll = itemView.findViewById(R.id.collapse_parent);

        }
    }
}
