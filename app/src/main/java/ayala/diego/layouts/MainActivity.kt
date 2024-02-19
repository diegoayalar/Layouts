package ayala.diego.layouts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.InputFilter
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etTelefono: EditText = findViewById<EditText>(R.id.et_telefono)
        etTelefono.filters = arrayOf(InputFilter.LengthFilter(10))
    }
}