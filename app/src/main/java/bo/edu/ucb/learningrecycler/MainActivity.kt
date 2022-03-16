package bo.edu.ucb.learningrecycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    // codigo antes del render
    lateinit var rv: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // codigo luego del render
        rv = findViewById(R.id.recyclerView)

        val linearLayoutManager = LinearLayoutManager(this)
        linearLayoutManager.orientation = LinearLayoutManager.VERTICAL

        rv.layoutManager = linearLayoutManager

        val list = arrayListOf<User>( User("roberto1", "calyr.software@gmail.com"),
            User("roberto2", "calyr.software@gmail.com"),
            User("roberto3", "calyr.software@gmail.com"),
            User("roberto4", "calyr.software@gmail.com")
        )

        rv.adapter = UserListAdapter(list, this)

    }
}