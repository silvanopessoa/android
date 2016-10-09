package br.com.silvanopessoa.autenticacao;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{

    private String mensagem =null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button btnSignIn = (Button) findViewById(R.id.btnSignIn);
        final EditText editEmail = (EditText) findViewById(R.id.editTextLogin);
        final EditText editPassword = (EditText) findViewById(R.id.editTextPassword);
        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnSignIn.setEnabled(false);
                editEmail.setEnabled(false);
                editPassword.setEnabled(false);
                if("admin".equalsIgnoreCase(editEmail.getText().toString()) && "admin".equalsIgnoreCase(editPassword.getText().toString())){
                    mensagem="Autenticado com sucesso.";
                    Toast.makeText(MainActivity.this, mensagem, Toast.LENGTH_LONG).show();
                }
                else{
                    mensagem="Usuário ou senha inválida.";
                    btnSignIn.setEnabled(true);
                    editEmail.setEnabled(true);
                    editPassword.setEnabled(true);
                    Toast.makeText(MainActivity.this, mensagem, Toast.LENGTH_LONG).show();
                }
            }
        });
    }

}
