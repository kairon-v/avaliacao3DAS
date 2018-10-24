package Calculadoras;

import Cadastros.Viagem;

public class DuracaoMinutos extends BaseTempo {

	public DuracaoMinutos(Viagem viagem) {
		super(viagem);
	}

	public int duracaoMinutos;

	public int calcular() {
		int minutosTermino = getViagem().getMinutosTermino();
		int minutosInicio = getViagem().getMinutoInicio();
		if (minutosTerminoMaiorQMinutosInicio()) 
			duracaoMinutos = minutosTermino - minutosInicio;
		else {
			duracaoMinutos = 60 - minutosInicio + minutosTermino;
			if (duracaoMinutos == 60) //caso especial
				duracaoMinutos = 0;
		}
		return duracaoMinutos;
	}

}
