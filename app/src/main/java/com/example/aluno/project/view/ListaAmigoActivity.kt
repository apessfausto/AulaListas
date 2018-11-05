package com.example.aluno.project.view

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.StaggeredGridLayoutManager
import com.example.aluno.project.R
import com.example.aluno.project.adapter.AmigoRecyclerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class ListaAmigoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView  = rvListaAmigo
        val adapter = AmigoRecyclerAdapter(this)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)
       // recyclerView.layoutManager = StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.VERTICAL)


    }
}
