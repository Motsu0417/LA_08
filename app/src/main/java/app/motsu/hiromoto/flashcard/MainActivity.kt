package app.motsu.hiromoto.flashcard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val wordArray = arrayOf(
                Word(R.drawable.cherry,"サクランボ"),
                Word(R.drawable.dog,"犬"),
                Word(R.drawable.fish,"魚"),
                Word(R.drawable.peach,"桃"),
                Word(R.drawable.starfish,"ヒトデ")
        )
        for(word in wordArray){
            addWord(word)
        }
    }

    fun addWord(word:Word){
        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.HORIZONTAL

        val nameTextView = TextView(this)
        nameTextView.text = word.name

        val imageView = ImageView(this)
        imageView.setImageResource(word.resId)
        val layoutParams : ViewGroup.LayoutParams = ViewGroup.LayoutParams(300,300)
        imageView.layoutParams = layoutParams

        layout.addView(imageView)
        layout.addView(nameTextView)

        container.addView(layout)
    }
}