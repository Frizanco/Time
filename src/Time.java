public class Time {

		private int hora;
		private int minuto;
		private int segundo;
		public Time(int hora, int minuto, int segundo) {
			this.hora = hora;
			this.minuto = minuto;
			this.segundo = segundo;
		}
		public int getHora() {
			return hora;
		}
		public int getMinuto() {
			return minuto;
		}
		public int getSegundo() {
			return segundo;
		}
			
		String HoraPadrao() {
			return hora+":"+minuto+":"+segundo;
		}
		String HoraDificil() {
			if (hora>12) {
				hora= hora-12;
				return hora+":"+minuto+":"+segundo+" PM";
			}
			else if (hora >0 && hora<12){
				return hora+":"+minuto+":"+segundo+" AM";
			}
			else if (hora==12){
				return hora+":"+minuto+":"+segundo+" PM";
			}
			else {
				hora = hora+12;
				return hora+":"+minuto+":"+segundo+" AM";
			}
		}

			
			
			
			
			
}
