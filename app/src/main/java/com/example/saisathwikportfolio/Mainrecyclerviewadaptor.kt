package com.example.saisathwikportfolio

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.saisathwikportfolio.homelist.Affirmation
import com.example.saisathwikportfolio.homelist.Datasource

class Mainrecyclerviewadaptor (private val context: Context, private val homelist: List<Affirmation>): RecyclerView.Adapter<Mainrecyclerviewadaptor.ViewHolder>() {
 var hcontext=context
    // Provide a direct reference to each of the views within a data item
    // Used to cache the views within the item layout for fast access

    inner class ViewHolder(
        itemView:
        View
    ) : RecyclerView.ViewHolder(itemView) {
        // Your holder should contain and initialize a member variable
        // for any view that will be set as you render a row
        val heading: TextView = itemView.findViewById(R.id.header)

        var contents: TextView = itemView.findViewById(R.id.content)

        val button: Button = itemView.findViewById(R.id.button)
    }
  /*  private inner class View2ViewHolder(itemView: View, context: Context) :
        RecyclerView.ViewHolder(itemView) {

        var contents: TextView = itemView.findViewById(R.id.content)
        fun bind(position: Int) {
            val detail = homelist[position]
            contents.text = context.resources.getString(detail.stringResourceId)
        }
    }
    private inner class View3ViewHolder(itemView: View, context: Context) :
        RecyclerView.ViewHolder(itemView) {

        var button: TextView = itemView.findViewById(R.id.button)
        fun bind(position: Int) {
            val detail = homelist[position]
            button.text = context.resources.getString(detail.stringResourceId)
        }
    }
*/


        override fun onCreateViewHolder(
            parent: ViewGroup,
            viewType: Int
        ): ViewHolder {



                  val item=LayoutInflater.from(parent.context).inflate(R.layout.detailslayout, parent, false)
            return ViewHolder(item)


        }


        override fun onBindViewHolder(
            viewHolder: ViewHolder,
            position: Int
        ) {
            this.hcontext = context

            // Get the data model based on position
            val detail: Affirmation = homelist[position]
            // Set item views based on your views and data model
            val aboutheadingb = viewHolder.heading
            viewHolder.heading.text = hcontext.resources.getString(detail.stringResourceId)
            val aboutcontentsb = viewHolder.contents
            viewHolder.contents.text = hcontext.resources.getString(detail.stringResourceId2)
            val aboutbuttonb = viewHolder.button
            viewHolder.button.text = hcontext.resources.getString(detail.stringResourceId3)
          aboutbuttonb.setOnClickListener{  when (aboutbuttonb.text) {
                "SKILLS" -> {
                    val intent = Intent(hcontext, Skills::class.java)
                    hcontext.startActivity(intent)
                }
                "EDUCATION" -> {
                    val intent = Intent(hcontext, Educationscreen::class.java)
                    hcontext.startActivity(intent)
                }
                "ABOUT" -> {
                    val intent = Intent(hcontext, Aboutscreen::class.java)
                    hcontext.startActivity(intent)
                }
              "KNOW MORE"->{
                  val intent = Intent(hcontext, Knowmorescreen::class.java)
                  hcontext.startActivity(intent)
              }
            }}



        }

        override fun getItemCount(): Int {
            return homelist.size
        }

    }

