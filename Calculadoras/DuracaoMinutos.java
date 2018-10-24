package Calculadoras;

import Cadastros.Viagem;

public class DuracaoMinutos {
	public Viagem viagem;
	public int duracaoMinutos;
	
	public DuracaoMinutos(Viagem viagem) {
		this.viagem = viagem;
	}
	
	public int calcular() {
		int minutosTermino = viagem.getMinutosTermino();
		int minutosInicio = viagem.getMinutoInicio();
		
		if (minutosTermino > minutosInicio) 
			duracaoMinutos = minutosTermino - minutosInicio;
		else {
			duracaoMinutos = 60 - minutosInicio + minutosTermino;
			if (duracaoMinutos == 60) //caso especial
				duracaoMinutos = 0;
		}
		return duracaoMinutos;
	}
}
