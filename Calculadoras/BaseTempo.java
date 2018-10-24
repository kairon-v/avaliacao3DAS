package Calculadoras;

import Cadastros.Viagem;

public class BaseTempo {
	private Viagem viagem;
	
	public BaseTempo(Viagem viagem) {
		this.viagem = viagem;
	}
	
	public Viagem getViagem() {
		return viagem;
	}
	

	public boolean minutosInicioMaiorQMinutosTermino() {
		int minutosTermino = viagem.getMinutosTermino();
		int minutosInicio = viagem.getMinutoInicio();
		return minutosTermino < minutosInicio;
	}
	
	public boolean minutosTerminoMaiorQMinutosInicio() {
		return !minutosInicioMaiorQMinutosTermino();
	}
	
	public boolean horaTerminoMaiorQHoraInicio() {
		int horaTermino = getViagem().getHoraTermino();
		int horaInicio = getViagem().getHoraInicio();
		return horaTermino > horaInicio;
	}
	
	public int horaTerminoMenosHoraInicio() {
		int horaTermino = getViagem().getHoraTermino();
		int horaInicio = getViagem().getHoraInicio();
		return horaTermino - horaInicio;
	}
	
	
	public boolean horaInicioMaiorQHoraTermino() {
		return horaTerminoMaiorQHoraInicio();
	}
	
	public boolean horaInicioIqualHoraTermino() {
		return horaTerminoMaiorQHoraInicio() != horaInicioMaiorQHoraTermino();
	}

}
