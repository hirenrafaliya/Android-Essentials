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
                Person("Binod Tharu","biniTh@gmail.com","https://raw.githubusercontent.com/hirenrafaliya/Android-Essentials/master/app/src/main/res/raw/001-calendar.png"),
                Person("Virat Sharma","vsharama665@gmail.com","https://raw.githubusercontent.com/hirenrafaliya/Android-Essentials/master/app/src/main/res/raw/002-ticket.png"),
                Person("MS Kohli","Mskohli885hiff@gmail.com","https://raw.githubusercontent.com/hirenrafaliya/Android-Essentials/master/app/src/main/res/raw/003-address%20book.png"),
                Person("Ravi Shashtri","mybeear@gmail.com","https://raw.githubusercontent.com/hirenrafaliya/Android-Essentials/master/app/src/main/res/raw/004-id%20card.png"),
                Person("Hardik Pandya","coffepandya@gmail.com","https://raw.githubusercontent.com/hirenrafaliya/Android-Essentials/master/app/src/main/res/raw/005-watch.png"),
                Person("Binod Tharu","biniTh@gmail.com","https://raw.githubusercontent.com/hirenrafaliya/Android-Essentials/master/app/src/main/res/raw/006-microphone.png"),
                Person("Virat Sharma","vsharama665@gmail.com","https://raw.githubusercontent.com/hirenrafaliya/Android-Essentials/master/app/src/main/res/raw/007-lectern.png"),
                Person("MS Kohli","Mskohli885hiff@gmail.com","https://raw.githubusercontent.com/hirenrafaliya/Android-Essentials/master/app/src/main/res/raw/008-projector%20screen.png"),
                Person("Binod Tharu","biniTh@gmail.com","https://raw.githubusercontent.com/hirenrafaliya/Android-Essentials/master/app/src/main/res/raw/001-calendar.png"),
                Person("Virat Sharma","vsharama665@gmail.com","https://raw.githubusercontent.com/hirenrafaliya/Android-Essentials/master/app/src/main/res/raw/002-ticket.png"),
                Person("MS Kohli","Mskohli885hiff@gmail.com","https://raw.githubusercontent.com/hirenrafaliya/Android-Essentials/master/app/src/main/res/raw/003-address%20book.png"),
                Person("Ravi Shashtri","mybeear@gmail.com","https://raw.githubusercontent.com/hirenrafaliya/Android-Essentials/master/app/src/main/res/raw/004-id%20card.png"),
                Person("Hardik Pandya","coffepandya@gmail.com","https://raw.githubusercontent.com/hirenrafaliya/Android-Essentials/master/app/src/main/res/raw/005-watch.png"),
                Person("Binod Tharu","biniTh@gmail.com","https://raw.githubusercontent.com/hirenrafaliya/Android-Essentials/master/app/src/main/res/raw/006-microphone.png"),
                Person("Virat Sharma","vsharama665@gmail.com","https://raw.githubusercontent.com/hirenrafaliya/Android-Essentials/master/app/src/main/res/raw/007-lectern.png"),
                Person("MS Kohli","Mskohli885hiff@gmail.com","https://raw.githubusercontent.com/hirenrafaliya/Android-Essentials/master/app/src/main/res/raw/008-projector%20screen.png"),
                Person("Binod Tharu","biniTh@gmail.com","https://raw.githubusercontent.com/hirenrafaliya/Android-Essentials/master/app/src/main/res/raw/001-calendar.png"),
                Person("Virat Sharma","vsharama665@gmail.com","https://raw.githubusercontent.com/hirenrafaliya/Android-Essentials/master/app/src/main/res/raw/002-ticket.png"),
                Person("MS Kohli","Mskohli885hiff@gmail.com","https://raw.githubusercontent.com/hirenrafaliya/Android-Essentials/master/app/src/main/res/raw/003-address%20book.png"),
                Person("Ravi Shashtri","mybeear@gmail.com","https://raw.githubusercontent.com/hirenrafaliya/Android-Essentials/master/app/src/main/res/raw/004-id%20card.png"),
                Person("Hardik Pandya","coffepandya@gmail.com","https://raw.githubusercontent.com/hirenrafaliya/Android-Essentials/master/app/src/main/res/raw/005-watch.png"),
                Person("Binod Tharu","biniTh@gmail.com","https://raw.githubusercontent.com/hirenrafaliya/Android-Essentials/master/app/src/main/res/raw/006-microphone.png"),
                Person("Virat Sharma","vsharama665@gmail.com","https://raw.githubusercontent.com/hirenrafaliya/Android-Essentials/master/app/src/main/res/raw/007-lectern.png"),
                Person("MS Kohli","Mskohli885hiff@gmail.com","https://raw.githubusercontent.com/hirenrafaliya/Android-Essentials/master/app/src/main/res/raw/008-projector%20screen.png")

        )

        recyclerView.setHasFixedSize(true)
        recyclerView.apply {
            layoutManager=LinearLayoutManager(this@RecyclerViewActivity)
            adapter=PersonAdapter(personList)
        }

    }
}