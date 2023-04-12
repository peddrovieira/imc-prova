package com.has.prova

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.has.prova.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.calcular.setOnClickListener{ medirIMC()}
    }

    fun medirIMC() {

        val pesoInTextField = binding.pesonum.text.toString()
        val peso = pesoInTextField.toDouble()
        val alturaInTextField = binding.alturanum.text.toString()
        val altura = alturaInTextField.toDouble()
        val imcvalor = binding.imcvalor.text.toString()

        var IMC = peso/(altura*altura)

        if(IMC <18.5){
            val pesoImage: ImageView = findViewById(R.id.imageView4)
            pesoImage.setImageResource(R.drawable.abaixodopeso)

        }
        else if(IMC <18.5){
            val pesoImage: ImageView = findViewById(R.id.imageView4)
            pesoImage.setImageResource(R.drawable.pesoideal)
            binding.imcvalor.text = IMC.toString()

        }
        else if(IMC > 18.6 && IMC < 24.9){
            val pesoImage: ImageView = findViewById(R.id.imageView4)
            pesoImage.setImageResource(R.drawable.sobre_peso)
            binding.imcvalor.text = IMC.toString()

        }
        else if(IMC <25 && IMC <29.9){
            val pesoImage: ImageView = findViewById(R.id.imageView4)
            pesoImage.setImageResource(R.drawable.iniciodaobesidade)
            binding.imcvalor.text = IMC.toString()

        }
        else if(IMC > 30 && IMC > 34.9){
            val pesoImage: ImageView = findViewById(R.id.imageView4)
            pesoImage.setImageResource(R.drawable.obesidade)
            binding.imcvalor.text = IMC.toString()

        }
        else{
            val pesoImage: ImageView = findViewById(R.id.imageView4)
            pesoImage.setImageResource(R.drawable.excessodeobesidade)
            binding.imcvalor.text = IMC.toString()

        }


        }

    }
}