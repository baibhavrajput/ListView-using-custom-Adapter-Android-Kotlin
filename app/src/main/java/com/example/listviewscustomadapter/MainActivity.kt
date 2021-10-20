package com.example.listviewscustomadapter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val name = arrayOf<String>(
        "Rahul","Rohit","Baibhav","Aman","Ankit","Anshu","Anand","Sajal","Rajat","Abhi","Rohan"
    )
    val roll = arrayOf<String>(
        "1300031901","1300031902","1300031903","1300031904","1300031905","1300031906","1300031907",
        "1300031908","1300031909","13000319010","13000319011",
    )
    val imageId = arrayOf<Int>(
        R.drawable.img_1300031901,R.drawable.img_1300031902,R.drawable.img_1300031903,R.drawable.img_1300031904,
        R.drawable.img_1300031905,R.drawable.img_1300031906,R.drawable.img_1300031907,R.drawable.img_1300031908,
        R.drawable.img_1300031909,R.drawable.img_13000319010,R.drawable.img_13000319011
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myListAdapter = MyListAdapter(
            this,
            name,
            roll,
            imageId,
        )
        listView.adapter = myListAdapter

        listView.setOnItemClickListener { parent, view, position, id ->
            val itemAtPos = parent.getItemAtPosition(position)
            val itemIdAtPos = parent.getItemIdAtPosition(position)

            Toast.makeText( this,"Clicked on item at ${itemIdAtPos+1} which is $itemAtPos", Toast.LENGTH_SHORT).show()
        }
    }
}