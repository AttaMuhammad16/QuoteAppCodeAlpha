package com.saqaauthor190.simpleauthorsquotesapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import java.util.Random

class MainActivity : AppCompatActivity() {

    lateinit var list:ArrayList<QuotesDataClass>

    lateinit var author:TextView
    lateinit var quote:TextView
    lateinit var shareImg:ImageView
    lateinit var nextBtn:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.statusBarColor=ContextCompat.getColor(this@MainActivity,R.color.teal_200)

        list=ArrayList()

        setContentView(R.layout.activity_main)
        author=findViewById(R.id.author)
        quote=findViewById(R.id.quote)
        shareImg=findViewById(R.id.shareImg)
        nextBtn=findViewById(R.id.nextBtn)

        list.add(QuotesDataClass(" Write your plans in pencil and give God the eraser.","Paulo Coelho"))
        list.add(QuotesDataClass("Friendship is Love without his wings!","Lord Byron"))
        list.add(QuotesDataClass("It requires wisdom to understand wisdom: the music is nothing if the audience is deaf.","Walter Lippmann"))
        list.add(QuotesDataClass("The attempt to combine wisdom and power has only rarely been successful and then only for a short while.","Albert Einstein"))
        list.add(QuotesDataClass("I can't believe that God put us on this earth to be ordinary.","Lou Holtz"))
        list.add(QuotesDataClass("Winners never quit and quitters never win.","Vince Lombardi"))
        list.add(QuotesDataClass("Fame usually comes to those who are thinking about something else.","Oliver Wendell Holmes Jr"))
        list.add(QuotesDataClass("The truest greatness lies in being kind, the truest wisdom in a happy mind.","Ella Wheeler Wilcox"))
        list.add(QuotesDataClass("It is not so important to know everything as to appreciate what we learn.","Hannah More"))
        list.add(QuotesDataClass("Be slow to fall into friendship; but when thou art in, continue firm and constant.","Isocrates"))
        list.add(QuotesDataClass("A man sees in the world what he carries in his heart.","Johann Wolfgang von Goethe"))
        list.add(QuotesDataClass("at we see depends mainly on what we look for.","WhJohn Lubbock"))
        list.add(QuotesDataClass("The greatest danger for most of us is not that our aim is too high, and we miss it, but that it is too low, and we reach it.","Michelangelo"))
        list.add(QuotesDataClass("In life, all good things come hard, but wisdom is the hardest to come by.","Lucille Ball"))
        list.add(QuotesDataClass("Adversity causes some men to break, others to break records.","William Arthur Ward"))
        list.add(QuotesDataClass("Once we accept our limits, we go beyond them.","Albert Einstein"))
        list.add(QuotesDataClass("An invincible determination can accomplish almost anything and in this lies the great distinction between great men and little men.","Thomas Fuller"))
        list.add(QuotesDataClass("Change is the law of life. And those who look only to the past or present are certain to miss the future.","John F. Kennedy"))
        list.add(QuotesDataClass("To listen well is as powerful a means of communication and influence as to talk well.","John Marshall"))
        list.add(QuotesDataClass("The key to growth is the introduction of higher dimensions of consciousness into our awareness.","Laozi"))
        list.add(QuotesDataClass("God made me fast. And when I run, I feel His pleasure.","Eric Liddell"))

        nextBtn.setOnClickListener {
            setRandomQuote()
        }

        shareImg.setOnClickListener {
            val shareText = "${author.text}: ${quote.text}"
            val intent = Intent().apply {
                action = Intent.ACTION_SEND
                putExtra(Intent.EXTRA_TEXT, shareText)
                type = "text/plain"
            }
            startActivity(Intent.createChooser(intent, "Share Quote"))
        }

    }

    private fun setRandomQuote() {
        val random = Random()
        val randomIndex = random.nextInt(list.size)
        val randomQuote = list[randomIndex]
        author.text = randomQuote.author
        quote.text = randomQuote.quotes
    }

}
