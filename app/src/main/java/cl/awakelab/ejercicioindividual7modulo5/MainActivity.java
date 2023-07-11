package cl.awakelab.ejercicioindividual7modulo5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Toast;

import cl.awakelab.ejercicioindividual7modulo5.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements IViewPresenter {

    ActivityMainBinding binding;
    private Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        presenter = new Presenter(this);

        binding.editTextPassword.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                presenter.passwordEvaluation(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

    }

    @Override
    public void showWeak() {
        System.out.println("Weaaak");
        Toast.makeText(this, "Password is too weak", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showMedium() {
        Toast.makeText(this, "Password has medium security", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showStrong() {
        Toast.makeText(this, "Password is strong", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showError() {
        Toast.makeText(this, "Something happened, try again", Toast.LENGTH_SHORT).show();
    }

}
