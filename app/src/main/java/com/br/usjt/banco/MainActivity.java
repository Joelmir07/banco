import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.br.usjt.banco.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int sacar = 1;
    int extrato= 2;
    int transferir = 3;
    int pedido = 0;

    public void clicaSacar(View view){
        pedido = sacar;
    }

    public void clicaExtrato(View view){
        pedido = extrato;
    }

    public void clicaTransferir(View view){
        pedido = transferir;
    }

}
