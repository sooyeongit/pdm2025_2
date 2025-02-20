package mx.unam.fciencias.moviles.practica;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

/**
 * @author Soo Yeon Kim
 * <a href="sooyeongit:sooyeonkimunam@ciencias.unam.mx">sooyeonkimunam@ciencias.unam.mx</a>
 * @author Rojas Lira Uriel
 * <a href="Rojas-Lira17:rjslr17@ciencias.unam.mx">rjslr17@ciencias.unam.mx<a/>
 * Testing otra vez
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}