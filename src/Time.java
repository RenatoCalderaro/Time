
public class Time {
	
	private int hora;
	private int minuto;
	private int segundo;
	
	public Time(int hora, int minuto, int segundo) {
		super();
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public int getMinuto() {
		return minuto;
	}

	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}

	public int getSegundo() {
		return segundo;
	}

	public void setSegundo(int segundo) {
		this.segundo = segundo;
	}

	public String ExibirUniversal() {
		return (+hora+":"+minuto+":"+segundo);
	}
	
	public String ExibirPadrao() {
		int h=0;
			if (hora > 12) {
				h = hora - 12;
				return (h+":"+minuto+":"+segundo+" PM");
			} else {
				return (h+":"+minuto+":"+segundo+" AM");
}
}
}


