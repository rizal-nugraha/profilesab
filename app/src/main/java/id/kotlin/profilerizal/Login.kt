
//author @rdrizalnugraha
package id.kotlin.profilerizal

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Login : AppCompatActivity() {
    lateinit var editUsername: EditText
    lateinit var editPassword: EditText
    lateinit var btnLogin: Button
    lateinit var username: String
    lateinit var password: String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        editUsername = findViewById(R.id.username) as EditText
        editUsername = findViewById(R.id.password) as EditText
        btnLogin = findViewById(R.id.btn_login) as Button
        btnLogin!!.setOnClickListener {
            username = editUsername!!.text.toString()
            password = editPassword!!.text.toString()
            if (!username.isEmpty() || !password!!.isEmpty()) {
                if (username.equals("123", ignoreCase = true) &&
                    password.equals("123", ignoreCase = true)) {
                    val i = Intent(this@Login, MainActivity::class.java)
                    startActivity(i)
                } else {
                    Toast.makeText(this@Login, "Username ato Password SALAH! Harap inputkin yang bener!",
                        Toast.LENGTH_LONG).show()
                }
            } else {
                Toast.makeText(this@Login, "Inputin NGGAK boleh KOSONG!",
                    Toast.LENGTH_LONG).show()
            }
        }
    }
}