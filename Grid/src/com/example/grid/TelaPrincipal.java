package com.example.grid;

import com.example.dao.JogadorDao;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class TelaPrincipal extends Activity{
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tela_principal);
		new JogadorDao(this);
	
	
		Button botaoUmJogador = (Button) findViewById(R.id.Btn_UmJogador);
		botaoUmJogador.setOnClickListener(new OnClickListener() {
	    	
	    	public void onClick(View v) {
	    		NovoJogoUmJogador();
			}
	    });
	    
	    Button botaoDoisJogadores = (Button) findViewById(R.id.Btn_DoisJogadores);
	    botaoDoisJogadores.setOnClickListener(new OnClickListener() {
	    	
	    	public void onClick(View v) {
	    		NovoJogoDoisJogadores();
			}
	    });
	    
	    Button botaoOpcoes = (Button) findViewById(R.id.Btn_Opcoes);
	    botaoOpcoes.setOnClickListener(new OnClickListener() {
	    	
	    	public void onClick(View v) {
	    		Opcoes();
			}
	    });
	    
	    Button botaoSair = (Button) findViewById(R.id.Btn_Sair);
	    botaoSair.setOnClickListener(new OnClickListener() {
	    	
	    	public void onClick(View v) {
	    		finish();
			}
	    });
	    
	}
	
	private void NovoJogoUmJogador() {
		startActivity(new Intent(TelaPrincipal.this, MainActivity.class));
	}
	
	private void NovoJogoDoisJogadores() {
		startActivity(new Intent(TelaPrincipal.this, MainActivity.class));
	}
	
	private void Opcoes() {
		startActivity(new Intent(TelaPrincipal.this, CadastroJogador.class));
	}
	

}
