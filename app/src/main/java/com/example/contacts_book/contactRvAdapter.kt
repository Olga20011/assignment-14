package com.example.contacts_book

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

import androidx.recyclerview.widget.RecyclerView

class contactRvAdapter(var contact_list:List<Contacts>):RecyclerView.Adapter<Contact_View_Holder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Contact_View_Holder {
        var itemView=LayoutInflater.from(parent.context).inflate(R.layout.contact_lists,parent,false)
        return Contact_View_Holder(itemView)

    }

    override fun onBindViewHolder(holder: Contact_View_Holder, position: Int) {
        var currentContacts=contact_list.get(position)
        holder.tvName.text=currentContacts.Name
        holder.tvEmail.text=currentContacts.Email
        holder.tvPhoneNumber.text=currentContacts.PhoneNumber

    }

    override fun getItemCount(): Int {
        return contact_list.size

    }
}
class Contact_View_Holder(itemView:View):RecyclerView.ViewHolder(itemView){
    var tvName=itemView.findViewById<TextView>(R.id.tvName)
    var tvEmail=itemView.findViewById<TextView>(R.id.tvEmail)
    var tvPhoneNumber=itemView.findViewById<TextView>(R.id.tvPhoneNumber)
}
