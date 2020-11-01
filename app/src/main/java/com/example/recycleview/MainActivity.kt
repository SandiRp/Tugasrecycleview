package com.example.recycleview

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listBooks = listOf(
            Book(name = "Ahiru No Sora", image = "https://cdn.myanimelist.net/images/anime/1975/108030.jpg"),
            Book(name = "Aono Excorsist", image = "https://upload.wikimedia.org/wikipedia/id/8/82/Ao_no_Exorcist.jpg"),
            Book(name = "Black Clover", image = "https://upload.wikimedia.org/wikipedia/en/thumb/c/c8/Black_Clover_Volume_1_Blu-Ray.jpg/220px-Black_Clover_Volume_1_Blu-Ray.jpg"),
            Book(name = "Boruto", image = "https://upload.wikimedia.org/wikipedia/id/thumb/d/db/Boruto_manga_vol_1.jpg/220px-Boruto_manga_vol_1.jpg"),
            Book(name = "Captain Tsubasa", image = "https://cdn.myanimelist.net/images/anime/1866/91270.jpg"),
            Book(name = "My Hero Academia", image = "https://upload.wikimedia.org/wikipedia/en/thumb/1/1d/My_Hero_Academia_-_Two_Heroes_poster.jpg/220px-My_Hero_Academia_-_Two_Heroes_poster.jpg"),
            Book(name = "Naruto", image = "https://upload.wikimedia.org/wikipedia/en/9/94/NarutoCoverTankobon1.jpg"),
            Book(name = "One Piece", image = "https://upload.wikimedia.org/wikipedia/en/9/90/One_Piece%2C_Volume_61_Cover_%28Japanese%29.jpg"),
            Book(name = "Tate No Yusha", image = "https://cdn.myanimelist.net/images/anime/1490/101365.jpg")
            )

        val booksAdapter = BookAdapter(listBooks) {book ->
            Toast.makeText(this, "Anime ini berjudul ${book.name}", Toast.LENGTH_SHORT).show()
        }
        mRecyclerView.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = booksAdapter
        }
    }
}