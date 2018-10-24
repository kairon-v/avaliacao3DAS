package Calculadoras;

import Cadastros.Viagem;

public class DuracaoHoras extends BaseTempo {

	public int duracaoHoras;
	
	public DuracaoHoras(Viagem viagem) {
		super(viagem);
	}
	
	public int calcular() {
		int horaTermino = getViagem().getHoraTermino();
		int horaInicio = getViagem().getHoraInicio();
	
		if (horaInicioIqualHoraTermino())
			duracaoHoras = 0;
		if (horaTerminoMaiorQHoraInicio()) //varias possibilidades... 
			if (horaTermino == horaInicio + 1) {  
				if (minutosInicioMaiorQMinutosTermino())  //nao chegou a uma hora
					duracaoHoras = 0;
				else //durou pelo menos uma hora
					duracaoHoras = 1;
			} else { //possivelmente ultrapassou duas horas
				if (horaTerminoMenosHoraInicio() > 2) //
					duracaoHoras = horaTerminoMenosHoraInicio();
				else if (horaTerminoMenosHoraInicio() == 2 &&   //certamente menos de duas horas  
						minutosInicioMaiorQMinutosTermino())    //e mais de uma hora
					duracaoHoras = 1;
				else //duracao de duas horas, certamente
					duracaoHoras = 2;
					
			}
		if (horaInicio > horaTermino) 
			duracaoHoras = -1; //para casos em que a hora de termino nao foi registrada
		return duracaoHoras;
	}
	
}
