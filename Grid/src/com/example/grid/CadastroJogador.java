package com.example.grid;

import com.example.dao.JogadorDao;
import com.example.modelo.Jogador;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class CadastroJogador extends Activity{

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.cadastrojogador);
		new JogadorDao(this);
	
	
		Button botao = (Button) findViewById(R.id.Btn_Salvar);
	    botao.setOnClickListener(new OnClickListener() {
	    	
	    	public void onClick(View v) {
				EditText nome  = (EditText) findViewById(R.id.Cmp_Nome);
				
				Jogador jogador = new Jogador();
				jogador.setNome(nome.getEditableText().toString());
				
				JogadorDao.save(jogador);
				
				finish();
			}
	    });
	}
}
