package POO;

public class Alumno {
	
	String nombre;
 	
	Materia [] materias = new Materia[15];
	int cantDedMateriasAlumno = 0;
	
	boolean materiaRepetida(String nombreMateria) {
		boolean respuesta = false;
		for(int i = 0; i<cantDedMateriasAlumno; i++) {
			if(nombreMateria == materias[i].nombre) {
				respuesta = true;
			}				
		}
		return respuesta;
		}
	
	
	double calculoDePromedio() {		
		double prom = 0;
		
		for(int i = 0; i<cantDedMateriasAlumno; i++) {
			prom = prom + materias[i].nota;
		}		
		return prom / cantDedMateriasAlumno;		
		}
	
	
	int materiaPerdida() {
		int materiaQuePerdio = 0;
		
		for(int i = 0; i<cantDedMateriasAlumno; i++) {
			if(materias[i].nota < 3) {
				materiaQuePerdio++;				
			}
		}
		return materiaQuePerdio;
		}
	
	
	int materiaGanada() {
		int materiaQueGano = 0;
		
		for(int i = 0; i<cantDedMateriasAlumno; i++) {
			if(materias[i].nota > 3) {
				materiaQueGano++;				
			}
		}
		return materiaQueGano;
		}
		
		
	int creditosPerdidos() {
			int creditosQuePerdio = 0;
			
			for(int i = 0; i<cantDedMateriasAlumno; i++) {
				if(materias[i].nota < 3) {
					creditosQuePerdio = creditosQuePerdio + materias[i].numeroDeCreditos;				
				}
			}
			return creditosQuePerdio;
		}
		
		
	int dineroParaRepetirCreditos() {
			int dineroParaCreditos = 0;
			
			for(int i = 0; i<cantDedMateriasAlumno; i++) {
				if(materias[i].nota < 3) {
					dineroParaCreditos = dineroParaCreditos + materias[i].valorDeCreditos;				
				}
			}
			return dineroParaCreditos;
		}		
}
