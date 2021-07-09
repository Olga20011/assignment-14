package com.example.contacts_book

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var rvContacts:RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun ViewContacts(){
        var contact_lists= listOf<Contacts>(
            Contacts("Olga Akello","olgaestherakello@gmail.com","0782899731"),
            Contacts("Ivan Ochom","ochomivan321@gmail.com","0755004838"),
            Contacts("Agnes Dorothy","agnesdorothy@gmail.com","0772642770"),
            Contacts("ANgella Nambooze","angellassimbwa@gmail.com","07463545526"),
            Contacts("AUdrey Munyiva","audreymunyiva@gmail.com","073636366266")


        )
        rvContacts=findViewById(R.id.rvContacts)
        var contantsAdapter=contactRvAdapter(contact_lists)
        rvContacts.layoutManager=LinearLayoutManager(baseContext)
        rvContacts.adapter=contantsAdapter


    }
}