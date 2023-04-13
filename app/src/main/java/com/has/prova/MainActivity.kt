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
        val valorpeso = binding.valorpeso.text.toString()

        var IMC = peso/(altura * altura)


        if(IMC <= 18.5){
            val pesoImage: ImageView = findViewById(R.id.img)
            pesoImage.setImageResource(R.drawable.abaixodopeso1)

            binding.imcvalor.text =  IMC.toString()
            binding.valorpeso.text = "Abaixo do Peso"
        }
        else if(IMC > 18.6 && IMC <= 24.9){
            val pesoImage: ImageView = findViewById(R.id.img)
            pesoImage.setImageResource(R.drawable.pesoideal1)

            binding.imcvalor.text =  IMC.toString()
            binding.valorpeso.text = "Peso Ideal"

        }
        else if(IMC > 25 && IMC <= 29.9){
            val pesoImage: ImageView = findViewById(R.id.img)
            pesoImage.setImageResource(R.drawable.sobre_peso1)

            binding.imcvalor.text =  IMC.toString()
            binding.valorpeso.text = "Sobre Peso "

        }
        else if(IMC > 30 && IMC  <= 34.9){
            val pesoImage: ImageView = findViewById(R.id.img)
            pesoImage.setImageResource(R.drawable.obesidade1)

            binding.imcvalor.text =  IMC.toString()
            binding.valorpeso.text = "Obesidade"

        }
        else if (IMC > 35 && IMC <= 39.9){
            val pesoImage: ImageView = findViewById(R.id.img)
            pesoImage.setImageResource(R.drawable.iniciodaobesidade1)

            binding.imcvalor.text =  IMC.toString()
            binding.valorpeso.text = "Inicio da obesidade"

        }
        else {
            val pesoImage: ImageView = findViewById(R.id.img)
            pesoImage.setImageResource(R.drawable.excessodeobesidade1)

            binding.imcvalor.text =   IMC.toString()
            binding.valorpeso.text = "Excesso de obesidade"
        }


        }

    }
