package com.example.dao;

import com.example.modelo.Jogador;

import android.content.ContentValues;
import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class JogadorDao extends SQLiteOpenHelper{
	
	private static final String NOMEBANCO = "BatalhaNaval.db";
	private static final String NOMETABELA = "Jogador";
	private static final int VERSAO = 1;
	private static SQLiteDatabase db;
	//private static final String[] COLS = new String[]{"idJogador","nome","ranking"};
	
		
	public JogadorDao(Context ctx){
		super(ctx, NOMEBANCO, null, VERSAO);
		db = this.getWritableDatabase();
	}
	
	public void onCreate(SQLiteDatabase db) {
		String sql = 	
		"CREATE TABLE " + NOMETABELA + 
		"(id INTEGER PRIMARY KEY AUTOINCREMENT," +
		" jodador VARCHAR(20));";
		try {
			db.execSQL(sql);
			JogadorDao.db = db;
		} catch (SQLException e) {
			Log.e("Erro Banco", JogadorDao.class.getSimpleName(), e);
		}
	}
	
	public void onUpgrade(SQLiteDatabase db, int arg1, int arg2) {
		String sql = "DROP TABLE IF EXISTS " + NOMETABELA;
		db.execSQL(sql);
		this.onCreate(db);
	}
	
	public synchronized void close() {
		db.close();
	}
	
	public static SQLiteDatabase getDB(){
		return db;
	}
	
	public static void save(Jogador jogador){
		ContentValues values = new ContentValues();
		values.put("nome", jogador.getNome());
		db.insert(NOMETABELA, null, values);
	}
	
	//criar para pegar a lista de ranking no servidor
}
