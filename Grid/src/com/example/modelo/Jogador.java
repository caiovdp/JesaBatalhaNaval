package com.example.modelo;

public class Jogador {
	
	double Ranking[];
	String Nome;
	
	public double[] getRanking() {
		return Ranking;
	}

	public void setRanking(double Ranking[]) {
		this.Ranking = Ranking;
	}
	
	public String getNome() {
		return Nome;
	}

	public void setNome(final String nome) {
		this.Nome = nome;
	}
	
}
