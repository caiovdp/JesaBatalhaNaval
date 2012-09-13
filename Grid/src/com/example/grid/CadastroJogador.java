package com.example.grid;

import com.example.dao.JogadorDao;

import android.app.Activity;
import android.os.Bundle;

public class CadastroJogador extends Activity{

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//setContentView(R.layout.);
		new JogadorDao(this);
	}
}
