package cl.awakelab.ejercicioindividual7modulo5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import cl.awakelab.ejercicioindividual7modulo5.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(R.layout.activity_main);
    }

}