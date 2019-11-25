package meuemprego.co.mz.rv;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

import meuemprego.co.mz.CategoriasCandidatos;
import meuemprego.co.mz.Perfil;
import meuemprego.co.mz.R;
import meuemprego.co.mz.model.Categorias;
import meuemprego.co.mz.model.Usuario;


public class Rv_categorias extends RecyclerView.Adapter<Rv_categorias.MyViewHoder> {

        Context mContext;
        List<Categorias> mData;


    public Rv_categorias(Context mContext, List<Categorias> mData) {
        this.mContext = mContext;
        this.mData = mData;

    }



    @Override
    public MyViewHoder onCreateViewHolder( ViewGroup viewGroup, int i) {

        View v;

        v = LayoutInflater.from(mContext).inflate(R.layout.card_categorias, viewGroup,false);

        MyViewHoder viewHoder = new MyViewHoder(v);

        return viewHoder;
    }

    @Override
    public void onBindViewHolder(@NonNull final MyViewHoder holder, final int position) {


        holder.cardView.setCardBackgroundColor(mData.get(position).getColor());
        holder.textView.setText(mData.get(position).getCategoria());

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext , CategoriasCandidatos.class);
                intent.putExtra("categoria" , mData.get(position).getCategoria());
                mContext.startActivity(intent);
            }
        });

    }


    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHoder extends RecyclerView.ViewHolder{



        CardView cardView;
        private TextView textView;

        public MyViewHoder(@NonNull View itemView) {
            super(itemView);

            textView = itemView.findViewById(R.id.categorias);
            cardView = itemView.findViewById(R.id.card_id);



        }
    }


}
