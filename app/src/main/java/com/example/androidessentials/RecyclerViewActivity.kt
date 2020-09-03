package com.example.androidessentials

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.androidessentials.Adapter.PersonAdapter
import com.example.androidessentials.Model.Person
import kotlinx.android.synthetic.main.activity_recycler_view.*

class RecyclerViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)

        var personList= arrayListOf<Person>(
                Person("Binod Tharu","biniTh@gmail.com"),
                Person("Virat Sharma","vsharama665@gmail.com"),
                Person("MS Kohli","Mskohli885hiff@gmail.com"),
                Person("Ravi Shashtri","mybeear@gmail.com"),
                Person("Hardik Pandya","coffepandya@gmail.com"),
                Person("Binod Tharu","biniTh@gmail.com"),
                Person("Virat Sharma","vsharama665@gmail.com"),
                Person("MS Kohli","Mskohli885hiff@gmail.com"),
                Person("Ravi Shashtri","mybeear@gmail.com"),
                Person("Hardik Pandya","coffepandya@gmail.com"),
                Person("Binod Tharu","biniTh@gmail.com"),
                Person("Virat Sharma","vsharama665@gmail.com"),
                Person("MS Kohli","Mskohli885hiff@gmail.com"),
                Person("Binod Tharu","biniTh@gmail.com"),
                Person("Virat Sharma","vsharama665@gmail.com"),
                Person("MS Kohli","Mskohli885hiff@gmail.com"),
                Person("Ravi Shashtri","mybeear@gmail.com"),
                Person("Hardik Pandya","coffepandya@gmail.com"),
                Person("Binod Tharu","biniTh@gmail.com"),
                Person("Virat Sharma","vsharama665@gmail.com"),
                Person("MS Kohli","Mskohli885hiff@gmail.com"),
                Person("Ravi Shashtri","mybeear@gmail.com"),
                Person("Hardik Pandya","coffepandya@gmail.com"),
                Person("Binod Tharu","biniTh@gmail.com"),
                Person("Virat Sharma","vsharama665@gmail.com"),
                Person("MS Kohli","Mskohli885hiff@gmail.com"),
                Person("Ravi Shashtri","mybeear@gmail.com"),
                Person("Hardik Pandya","coffepandya@gmail.com"),
                Person("Hardik Tharu","cofeekungfypandya555@gmail.com")
        )

        recyclerView.setHasFixedSize(true)
        recyclerView.apply {
            layoutManager=LinearLayoutManager(this@RecyclerViewActivity)
            adapter=PersonAdapter(personList)
        }

    }
}