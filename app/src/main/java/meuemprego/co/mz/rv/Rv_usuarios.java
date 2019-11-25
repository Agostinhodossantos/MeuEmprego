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

import meuemprego.co.mz.Perfil;
import meuemprego.co.mz.R;
import meuemprego.co.mz.model.Usuario;


public class Rv_usuarios extends RecyclerView.Adapter<Rv_usuarios.MyViewHoder> {

        Context mContext;
        List<Usuario> mData;


    public Rv_usuarios(Context mContext, List<Usuario> mData) {
        this.mContext = mContext;
        this.mData = mData;

    }



    @Override
    public MyViewHoder onCreateViewHolder( ViewGroup viewGroup, int i) {

        View v;

        v = LayoutInflater.from(mContext).inflate(R.layout.card_emprego, viewGroup,false);

        MyViewHoder viewHoder = new MyViewHoder(v);

        return viewHoder;
    }

    @Override
    public void onBindViewHolder(@NonNull final MyViewHoder holder, final int position) {

        String strPrimeiraMalicula = mData.get(position).getNome();


        if (mData.get(position).getNome().length() > 2){
            //tranformar aprimeira letra em maiuscula //
          strPrimeiraMalicula =  mData.get(position).getNome().substring(0 , 1).toUpperCase()+mData.get(position).getNome().substring(1).toLowerCase();
        }
        holder.tv_nome.setText(strPrimeiraMalicula);
        if (mData.get(position).getNome().length() > 2){
            strPrimeiraMalicula =  mData.get(position).getProficao().substring(0 , 1).toUpperCase()+mData.get(position).getProficao().substring(1).toLowerCase();
        }
        holder.tv_proficao.setText(strPrimeiraMalicula);
        holder.tv_localizaao.setText(mData.get(position).getLocalizacao());
      //  holder.tv_tempo.setText(mData.get(position).getTempo());
        holder.tv_descricao.setText(mData.get(position).getDescricao());

        if (mData.get(position).getImg() != null && !mData.get(position).getImg().trim().equals("") ){

            //Picasso.get().load(mData.get(position).getImg()).fit().centerCrop().into(holder.img);

        }
        else
        {

        }


        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(mContext , Perfil.class);
                intent.putExtra("id_user" ,mData.get(position).getUid());
                mContext.startActivity(intent);

            }
        });


    }


    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHoder extends RecyclerView.ViewHolder{

        private TextView tv_nome;
        private ImageView img;
       // private TextView tv_tempo;
        private TextView tv_localizaao;
        private TextView tv_descricao;
        private TextView tv_proficao;
        CardView cardView;

        public MyViewHoder(@NonNull View itemView) {
            super(itemView);

            tv_nome      = itemView.findViewById(R.id.tv_nome);
            tv_localizaao = itemView.findViewById(R.id.tv_localizacao);
            //tv_tempo = itemView.findViewById(R.id.tv_tempo);
            img = itemView.findViewById(R.id.img);
            tv_descricao = itemView.findViewById(R.id.tv_descricao);
            tv_proficao = itemView.findViewById(R.id.tv_proficao);
            cardView = itemView.findViewById(R.id.card_id);


        }
    }


}
