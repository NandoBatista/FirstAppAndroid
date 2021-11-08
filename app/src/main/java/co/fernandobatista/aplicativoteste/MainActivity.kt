package co.fernandobatista.aplicativoteste

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    val res = arrayOf("Sim","Não conte com isso","Talvez")
    val random = Random.Default

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        val textView = findViewById<TextView>(R.id.textView)
        val editText = findViewById<EditText>(R.id.editTextTextPersonName4)
        button.setOnClickListener {
            if (editText.text.isEmpty()) {
                textView.text = res[0]
            }else {
                val index = random.nextInt(3)
                textView.text = res[index]
            }

        }

    }
}

