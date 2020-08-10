package POO;

public class Alumno {
	
	String nombre;
	Materia m1;
	Materia m2;
	Materia m3;
	Materia m4;
	Materia m5;
	
	double calculoDePromedio() {		
		double prom = 0;
		prom = (m1.nota + m2.nota + m3.nota + m4.nota + m5.nota) / 5;
		return prom;		
	}
	
	
	
	int materiaPerdida() {
		int materiaQuePerdio = 0;		
		if(m1.nota < 3) {
			materiaQuePerdio = materiaQuePerdio + 1;
		}		
		if(m2.nota < 3) {
			materiaQuePerdio = materiaQuePerdio + 1;
		}		
		if(m3.nota < 3) {
			materiaQuePerdio = materiaQuePerdio + 1;
		}		
		if(m4.nota < 3) {
			materiaQuePerdio = materiaQuePerdio + 1;
		}		
		if(m5.nota < 3) {
			materiaQuePerdio = materiaQuePerdio + 1;
		}		
		return materiaQuePerdio;		
	}
		
		
		
		int materiaGanada() {
			int materiaQueGano = 0;			
			if(m1.nota > 3) {
				materiaQueGano = materiaQueGano + 1;
			}		
			if(m2.nota > 3) {
				materiaQueGano = materiaQueGano + 1;
			}		
			if(m3.nota > 3) {
				materiaQueGano = materiaQueGano + 1;
			}		
			if(m4.nota > 3) {
				materiaQueGano = materiaQueGano + 1;
			}		
			if(m5.nota > 3) {
				materiaQueGano = materiaQueGano + 1;
			}		
			return materiaQueGano;
		}
			
			int creditosPerdidos() {
				int creditosQuePerdio = 0;
				if(m1.nota < 3) {
					creditosQuePerdio = creditosQuePerdio + m1.numeroDeCreditos ;
				}
				if(m2.nota < 3) {
					creditosQuePerdio = creditosQuePerdio + m2.numeroDeCreditos ;
				}
				if(m3.nota < 3) {
					creditosQuePerdio = creditosQuePerdio + m3.numeroDeCreditos ;
				}
				if(m4.nota < 3) {
					creditosQuePerdio = creditosQuePerdio + m4.numeroDeCreditos ;
				}
				if(m5.nota < 3) {
					creditosQuePerdio = creditosQuePerdio + m5.numeroDeCreditos ;
				}				
				return creditosQuePerdio;
			}
			
			
			int dineroParaRepetirCreditos() {
				int dineroParaCreditos = 0;
				if(m1.nota < 3) {
					dineroParaCreditos = dineroParaCreditos + m1.valorDeCreditos ;
				}
				if(m2.nota < 3) {
					dineroParaCreditos = dineroParaCreditos + m2.valorDeCreditos ;
				}
				if(m3.nota < 3) {
					dineroParaCreditos = dineroParaCreditos + m3.valorDeCreditos ;
				}
				if(m4.nota < 3) {
					dineroParaCreditos = dineroParaCreditos + m4.valorDeCreditos ;
				}
				if(m5.nota < 3) {
					dineroParaCreditos = dineroParaCreditos + m5.valorDeCreditos ;
				}				
				return dineroParaCreditos;
			}
}
