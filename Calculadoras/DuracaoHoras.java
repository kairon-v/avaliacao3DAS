package Calculadoras;

import Cadastros.Viagem;

public class DuracaoHoras {
	public Viagem viagem;
	public int duracaoHoras;
	
	public DuracaoHoras(Viagem viagem) {
		this.viagem = viagem;
	}
	
	public int calcular() {
		int horaTermino = viagem.getHoraTermino();
		int horaInicio = viagem.getHoraInicio();
		int minutosTermino = viagem.getHoraTermino();
		int minutosInicio = viagem.getMinutoInicio();
		if (horaTermino == horaInicio)
			duracaoHoras = 0;
		if (horaTermino > horaInicio) //varias possibilidades... 
			if (horaTermino == horaInicio + 1) {  
				if (minutosTermino < minutosInicio)  //nao chegou a uma hora
					duracaoHoras = 0;
				else //durou pelo menos uma hora
					duracaoHoras = 1;
			} else { //possivelmente ultrapassou duas horas
				if (horaTermino - horaInicio > 2) //
					duracaoHoras = horaTermino - horaInicio;
				else if (horaTermino - horaInicio == 2 &&   //certamente menos de duas horas  
						 minutosTermino < minutosInicio)    //e mais de uma hora
					duracaoHoras = 1;
				else //duracao de duas horas, certamente
					duracaoHoras = 2;
					
			}
		if (horaTermino < horaInicio) 
			duracaoHoras = -1; //para casos em que a hora de termino nao foi registrada
		return duracaoHoras;
	}
}
