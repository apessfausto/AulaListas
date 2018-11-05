package com.example.aluno.project.adapter

//import android.support.v7.RecyclerView
import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.aluno.project.R
import kotlinx.android.synthetic.main.item_lista_amigo.view.*


class AmigoRecyclerAdapter internal constructor(context: Context) :

        RecyclerView.Adapter<AmigoRecyclerAdapter.ViewHolder>() {
    private val inflater: LayoutInflater = LayoutInflater.from(context)
    private var amigos = lista()

    override fun onCreateViewHolder(holder: ViewGroup, position: Int): ViewHolder {
        //cria a view
        val view: View = inflater.inflate(R.layout.item_lista_amigo, holder, false)
        return ViewHolder(view)
    }

    override fun getItemCount() = amigos.size
    //conta a quantidade de itens


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        //implementa a lógica
        val current: String = amigos[position]
        holder.nomeAmigo.text = current
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val nomeAmigo: TextView = itemView.txtFriendListNome
    }

    private fun lista(): List<String> {
        return listOf(
                "Mario",
                "Maria"
        )
    }
}

