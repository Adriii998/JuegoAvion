package avion.juegoavion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        dibujar();
        setContentView(R.layout.activity_main);
    }
    public void dibujar(){
        System.out.println("HOLA QEU TALL");
    }
}
