package usuario.android.calculadoradenotas

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btCalcular = button
        val resultado = textView

        btCalcular.setOnClickListener {

            val nota1 = Integer.parseInt(editText.text.toString())
            val nota2 = Integer.parseInt(editText2.text.toString())
            val media = (nota1+nota2)/2
            val faltas = Integer.parseInt(editText3.text.toString())


            if (media>6 && faltas <=10){
                resultado.setText("Aluno foi Aprovado" + "\n"+ "Nota Final:" + media+"\n"+ faltas)
                resultado.setTextColor(Color.GREEN)
            } else{

                resultado.setText("Aluno foi Reprovado" + "\n"+ "Nota Final:" + media+"\n"+ "Numero de Faltas:" + faltas)
                resultado.setTextColor(Color.RED)
            }

        }

    }
}
