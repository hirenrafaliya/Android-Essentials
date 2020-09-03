package com.example.androidessentials.Adapter

import android.app.Presentation
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.androidessentials.Model.Person
import com.example.androidessentials.R
import kotlinx.android.synthetic.main.item_person.view.*

class PersonAdapter
(val personList:ArrayList<Person>): RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_person,parent,false))
    }

    override fun getItemCount(): Int {
        return personList.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder){
            is ViewHolder->{
                holder.bind(personList.get(position))
            }
        }
    }

    class ViewHolder
    constructor(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val name = itemView.tvName
        val email = itemView.tvEmail
        val cardParent=itemView.cardParent
        val imgProfile=itemView.imgProfile
        val animation=AnimationUtils.loadAnimation(itemView.context,R.anim.anim_recycle_scale)

        fun bind(person: Person) {
            name.text = person.name
            email.text = person.email

            Glide.with(itemView.context)
                    .load(person.image)
                    .into(imgProfile)

            cardParent.startAnimation(animation)
        }
    }

}