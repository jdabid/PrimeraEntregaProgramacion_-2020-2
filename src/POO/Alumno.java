package POO;

public class Alumno {
	
	String nombre; 	
	static final int MAX_CANTDEMATERIAS = 15;
	Materia [] materias = new Materia[Alumno.MAX_CANTDEMATERIAS];
	int cantDedMateriasAlumno = 0;
	static final int MAX_CANTDECREDITOS = 22;
	
	
	public void adMaterias(Materia mUno) throws Exception {
		
		boolean yaexiste = false;
		int sumatoriaDeCreditos = 0;
		
		
		for(int i = 0; i<cantDedMateriasAlumno; i++) {			
			sumatoriaDeCreditos = sumatoriaDeCreditos + mUno.numeroDeCreditos;			
			if(mUno.nombre == materias[i].nombre) {
				yaexiste = true;
			}				
		}
		
		if(yaexiste == true) {
			throw new Exception("LA materia " + mUno.nombre + " ya esta inscrita");
		}
		
		sumatoriaDeCreditos = sumatoriaDeCreditos + mUno.numeroDeCreditos;
		if(sumatoriaDeCreditos > MAX_CANTDECREDITOS)
			throw new Exception("El estudiante NO tiene creditos disponibles");
		
		
		if(cantDedMateriasAlumno == MAX_CANTDEMATERIAS) {
			throw new Exception("El estudiante ya tiene el maximo de materias inscritas");
		}
		
		
		
		
		materias[cantDedMateriasAlumno] = mUno;
		cantDedMateriasAlumno++;
		
		
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
