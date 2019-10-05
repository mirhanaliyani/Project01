package id.ac.poliban.dts.mirhan.project01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText etNama =findViewById(R.id.etNama);
        EditText etNim =findViewById(R.id.etNim);
        EditText etProdi =findViewById(R.id.etProdi);
        EditText etTTL =findViewById(R.id.etTTL);
        EditText etAlamat =findViewById(R.id.etAlamat);
        Button btClear = findViewById(R.id.btClear);
        Button btLogin = findViewById(R.id.btLogin);

        btClear.setOnClickListener(v -> {
            etNama.setText("");
            etNim.setText("");
            etProdi.setText("");
            etTTL.setText("");
            etAlamat.setText("");
        });

        btLogin.setOnClickListener(v -> {
            etNama.setText("");
            etNim.setText("");
            etProdi.setText("");
            etTTL.setText("");
            etAlamat.setText("");
            Toast.makeText(this, "Login Succesfully", Toast.LENGTH_SHORT).show();
        });
    }
}
