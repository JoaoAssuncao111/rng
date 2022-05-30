package freetime.rng

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

import freetime.rng.databinding.ActivityMainBinding
import java.lang.NumberFormatException
import kotlin.math.max
import kotlin.random.Random

class NumberGenerator : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)

        binding.generate.setOnClickListener {

            try {
                if (binding.minValue.text == null || binding.maxValue.text == null)
                    Toast.makeText(applicationContext,R.string.numberMissing,Toast.LENGTH_LONG).show()
                    val minValue = binding.minValue.text.toString().toInt()
                    val maxValue = binding.maxValue.text.toString().toInt()
                    binding.result.setText(Random.nextInt(minValue, maxValue))
                

            } catch(e: NumberFormatException){
                Toast.makeText(applicationContext,R.string.invalidInput,Toast.LENGTH_LONG).show()
            }
        }


    }
}