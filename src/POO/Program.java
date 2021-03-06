package POO;

public class Program {

	public static void main(String[] args) throws Exception {
		
		//Crear objeto Alumno
		Alumno a1 = new Alumno();
		a1.nombre = "Rafael";		
		
		  //Crear objetos Materia
		  Materia mat1 = new Materia();
		  mat1.nombre = "Matematicas";
		  mat1.nota = 4;
		  mat1.numeroDeCreditos = 3;
		  mat1.valorDeCreditos = 21000;
		  Materia mat2 = new Materia();
		  mat2.nombre = "Microcontroladores";
		  mat2.nota = 2;
		  mat2.numeroDeCreditos = 3;
		  mat2.valorDeCreditos = 21000;
		  Materia mat3 = new Materia();
		  mat3.nombre = "Programacion";
		  mat3.nota = 4.5;
		  mat3.numeroDeCreditos = 3;
		  mat3.valorDeCreditos = 21000;
		  Materia mat4 = new Materia();
		  mat4.nombre = "Probabilidades";
		  mat4.nota = 3.8;
		  mat4.numeroDeCreditos = 2;
		  mat4.valorDeCreditos = 14000;
		  Materia mat5 = new Materia();
		  mat5.nombre = "Infoetica";
		  mat5.nota = 2.9;
		  mat5.numeroDeCreditos = 3;
		  mat5.valorDeCreditos = 21000;
		  
		  a1.adMaterias(mat1);
		  a1.adMaterias(mat2);
		  a1.adMaterias(mat3);
		  a1.adMaterias(mat4);
		  a1.adMaterias(mat5);		
		
		double promedioA1 = a1.calculoDePromedio();
		System.out.println("PROMEDIO del estudiante " + a1.nombre + " es: " + promedioA1);
		int mariaPerdidaA1 = a1.materiaPerdida();
		System.out.println("PERDIO - " + a1.nombre + " reprobó " + mariaPerdidaA1 + " materias");
		int materiaGanadaA1 = a1.materiaGanada();
		System.out.println("GANO - " + a1.nombre + " aprobó " + materiaGanadaA1 + " materias");
		int CreditosPerdidosA1 = a1.creditosPerdidos();
		System.out.println("CREDITOS PERDIDOS - " + a1.nombre + " perdío " + CreditosPerdidosA1 + " creditos");
		int CreditosAPgarA1 = a1.dineroParaRepetirCreditos();
		System.out.println("DINERO POR CREDITOS - " + a1.nombre + " debe pagar $" + CreditosAPgarA1 );
		System.out.println("************");		   
		
		
		
		Alumno a2 = new Alumno();
		a2.nombre = "Martin";		
		  Materia mate1 = new Materia();
		  mate1.nombre = "Matematicas";
		  mate1.nota = 2;
		  mate1.numeroDeCreditos = 3;
		  mate1.valorDeCreditos = 21000;
		  Materia mate2 = new Materia();
		  mate2.nombre = "Fisica";
		  mate2.nota = 5;
		  mate2.numeroDeCreditos = 3;
		  mate2.valorDeCreditos = 21000;
		  Materia mate3 = new Materia();
		  mate3.nombre = "Estructura de datos";
		  mate3.nota = 3.2;
		  mate3.numeroDeCreditos = 3;
		  mate3.valorDeCreditos = 21000;
		  Materia mate4 = new Materia();
		  mate4.nombre = "Arquitectura de software";
		  mate4.nota = 2.8;
		  mate4.numeroDeCreditos = 2;
		  mate4.valorDeCreditos = 14000;
		  Materia mate5 = new Materia();
		  mate5.nombre = "Electronica";
		  mate5.nota = 2.5;
		  mate5.numeroDeCreditos = 3;
		  mate5.valorDeCreditos = 21000;
		  
		  a2.adMaterias(mate1);
		  a2.adMaterias(mate2);
		  a2.adMaterias(mate3);
		  a2.adMaterias(mate4);
		  a2.adMaterias(mate5);		  
					
		double promedioA2 = a2.calculoDePromedio();
		System.out.println("PROMEDIO del estudiante " + a2.nombre + " es: " + promedioA2);
		int mariaPerdidaA2 = a2.materiaPerdida();
		System.out.println("PERDIO - " + a2.nombre + " perdio " + mariaPerdidaA2 + " materias");
		int materiaGanadaA2 = a2.materiaGanada();
		System.out.println("GANO - " + a2.nombre + " aprobó " + materiaGanadaA2 + " materias");
		int CreditosPerdidosA2 = a2.creditosPerdidos();
		System.out.println("CREDITOS PERDIDOS - " + a2.nombre + " perdío " + CreditosPerdidosA2 + " creditos");
		int CreditosAPgarA2 = a2.dineroParaRepetirCreditos();
		System.out.println("DINERO POR CREDITOS - " + a2.nombre + " debe pagar $" + CreditosAPgarA2);
		System.out.println("************");
		
		
		Alumno a3 = new Alumno();
		a3.nombre = "Lucas";		
		  Materia matE1 = new Materia();
		  matE1.nombre = "microcntroladores";
		  matE1.nota = 1.2;
		  matE1.numeroDeCreditos = 3;
		  matE1.valorDeCreditos = 21000;
		  Materia matE2 = new Materia();
		  matE2.nombre = "microcntroladores";
		  matE2.nota = 2;
		  matE2.numeroDeCreditos = 3;
		  matE2.valorDeCreditos = 21000;
		  Materia matE3 = new Materia();
		  matE3.nombre = "Programacion";
		  matE3.nota = 3;
		  matE3.numeroDeCreditos = 3;
		  matE3.valorDeCreditos = 21000;
		  Materia matE4 = new Materia();
		  matE4.nombre = "Probabilidades";
		  matE4.nota = 4;
		  matE4.numeroDeCreditos = 2;
		  matE4.valorDeCreditos = 14000;
		  Materia matE5 = new Materia();
		  matE5.nombre = "Infoetica";
		  matE5.nota = 5;
		  matE5.numeroDeCreditos = 3;
		  matE5.valorDeCreditos = 21000;
		  
		  a3.adMaterias(matE1);
		  a3.adMaterias(matE2);
		  a3.adMaterias(matE3);
		  a3.adMaterias(matE4);
		  a3.adMaterias(matE5);
		  
		  
		  			
		double promedioA3 = a3.calculoDePromedio();
		System.out.println("PROMEDIO del estudiante " + a3.nombre + " es: " + promedioA3);
		int mariaPerdidaA3 = a3.materiaPerdida();
		System.out.println("PERDIO - " + a3.nombre + " perdio " + mariaPerdidaA3 + " materias");
		int materiaGanadaA3 = a3.materiaGanada();
		System.out.println("GANO - " + a3.nombre + " aprobó " + materiaGanadaA3 + " materias");
		int CreditosPerdidosA3 = a3.creditosPerdidos();
		System.out.println("CREDITOS PERDIDOS - " + a3.nombre + " perdío " + CreditosPerdidosA3 + " creditos");
		int CreditosAPgarA3 = a3.dineroParaRepetirCreditos();
		System.out.println("DINERO POR CREDITOS - " + a3.nombre + " debe pagar $" + CreditosAPgarA3);
		System.out.println("************");
		
		
		Alumno a4 = new Alumno();
		a4.nombre = "Asencio";		
		  Materia maTe1 = new Materia();
		  maTe1.nombre = "microcntroladores";
		  maTe1.nota = 1;
		  maTe1.numeroDeCreditos = 3;
		  maTe1.valorDeCreditos = 21000;
		  Materia maTe2 = new Materia();
		  maTe2.nombre = "Matematicas";
		  maTe2.nota = 3;
		  maTe2.numeroDeCreditos = 3;
		  maTe2.valorDeCreditos = 21000;
		  Materia maTe3 = new Materia();
		  maTe3.nombre = "Programacion";
		  maTe3.nota = 5;
		  maTe3.numeroDeCreditos = 3;
		  maTe3.valorDeCreditos = 21000;
		  Materia maTe4 = new Materia();
		  maTe4.nombre = "Probabilidades";
		  maTe4.nota = 4.9;
		  maTe4.numeroDeCreditos = 2;
		  maTe4.valorDeCreditos = 14000;
		  Materia maTe5 = new Materia();
		  maTe5.nombre = "Infoetica";
		  maTe5.nota = 1.8;
		  maTe5.numeroDeCreditos = 3;
		  maTe5.valorDeCreditos = 21000;
		  
		  a4.adMaterias(maTe1);
		  a4.adMaterias(maTe2);
		  a4.adMaterias(maTe3);
		  a4.adMaterias(maTe4);
		  a4.adMaterias(maTe5);
		  			
		double promedioA4 = a4.calculoDePromedio();
		System.out.println("PROMEDIO del estudiante " + a4.nombre + " es: " + promedioA4);
		int mariaPerdidaA4 = a4.materiaPerdida();
		System.out.println("PERDIO - " + a4.nombre + " perdio " + mariaPerdidaA4 + " materias");
		int materiaGanadaA4 = a4.materiaGanada();
		System.out.println("GANO - " + a4.nombre + " aprobó " + materiaGanadaA4 + " materias");
		int CreditosPerdidosA4 = a4.creditosPerdidos();
		System.out.println("CREDITOS PERDIDOS - " + a4.nombre + " perdío " + CreditosPerdidosA4 + " creditos");
		int CreditosAPgarA4 = a4.dineroParaRepetirCreditos();
		System.out.println("DINERO POR CREDITOS - " + a4.nombre + " debe pagar $" + CreditosAPgarA4);
		System.out.println("************");
		
		
		
		Alumno a5 = new Alumno();
		a5.nombre = "Carolina";		
		  Materia mAte1 = new Materia();
		  mAte1.nombre = "microcntroladores";
		  mAte1.nota = 4;
		  mAte1.numeroDeCreditos = 3;
		  mAte1.valorDeCreditos = 21000;
		  Materia mAte2 = new Materia();
		  mAte2.nombre = "Matematicas";
		  mAte2.nota = 4.5;
		  mAte2.numeroDeCreditos = 3;
		  mAte2.valorDeCreditos = 21000;
		  Materia mAte3 = new Materia();
		  mAte3.nombre = "Programacion";
		  mAte3.nota = 4.2;
		  mAte3.numeroDeCreditos = 3;
		  mAte3.valorDeCreditos = 10000;
		  Materia mAte4= new Materia();
		  mAte4.nombre = "Probabilidades";
		  mAte4.nota = 4.8;
		  mAte4.numeroDeCreditos = 2;
		  mAte4.valorDeCreditos = 14000;
		  Materia mAte5 = new Materia();
		  mAte5.nombre = "Infoetica";
		  mAte5.nota = 4.5;
		  mAte5.numeroDeCreditos = 3;
		  mAte5.valorDeCreditos = 21000;
		  
		  a5.adMaterias(mAte1);
		  a5.adMaterias(mAte2);
		  a5.adMaterias(mAte3);
		  a5.adMaterias(mAte4);
		  a5.adMaterias(mAte5);		
		  			
		double promedioA5 = a5.calculoDePromedio();
		System.out.println("PROMEDIO del estudiante " + a5.nombre + " es: " + promedioA5);
		int mariaPerdidaA5 = a5.materiaPerdida();
		System.out.println("PERDIO - " + a5.nombre + " perdio " + mariaPerdidaA5 + " materias");
		int materiaGanadaA5 = a5.materiaGanada();
		System.out.println("GANO - " + a5.nombre + " aprobó " + materiaGanadaA5 + " materias");
		int CreditosPerdidosA5 = a5.creditosPerdidos();
		System.out.println("CREDITOS PERDIDOS - " + a5.nombre + " perdío " + CreditosPerdidosA5 + " creditos");
		int CreditosAPgarA5 = a5.dineroParaRepetirCreditos();
		System.out.println("DINERO POR CREDITOS - " + a5.nombre + " debe pagar $" + CreditosAPgarA5);
		System.out.println("************");
		
		
		
		Alumno a6 = new Alumno();
		a6.nombre = "Leandra";		
		  Materia mA1 = new Materia();
		  mA1.nombre = "microcntroladores";
		  mA1.nota = 5;
		  mA1.numeroDeCreditos = 3;
		  mA1.valorDeCreditos = 21000;
		  Materia mA2 = new Materia();
		  mA2.nombre = "Matematicas";
		  mA2.nota = 5;
		  mA2.numeroDeCreditos = 3;
		  mA2.valorDeCreditos = 21000;
		  Materia mA3 = new Materia();
		  mA3.nombre = "Programacion";
		  mA3.nota = 4.2;
		  mA3.numeroDeCreditos = 3;
		  mA3.valorDeCreditos = 21000;
		  Materia mA4 = new Materia();
		  mA4.nombre = "Probabilidades";
		  mA4.nota = 2;
		  mA4.numeroDeCreditos = 2;
		  mA4.valorDeCreditos = 14000;
		  Materia mA5 = new Materia();
		  mA5.nombre = "Infoetica";
		  mA5.nota = 5;
		  mA5.numeroDeCreditos = 3;
		  mA5.valorDeCreditos = 21000;
		  
		  a6.adMaterias(mA1);
		  a6.adMaterias(mA2);
		  a6.adMaterias(mA3);
		  a6.adMaterias(mA4);
		  a6.adMaterias(mA5);
		  			
		double promedioA6 = a6.calculoDePromedio();
		System.out.println("PROMEDIO del estudiante " + a6.nombre + " es: " + promedioA6);
		int mariaPerdidaA6 = a6.materiaPerdida();
		System.out.println("PERDIO - " + a6.nombre + " perdio " + mariaPerdidaA6 + " materias");
		int materiaGanadaA6 = a6.materiaGanada();
		System.out.println("GANO - " + a6.nombre + " aprobó " + materiaGanadaA6 + " materias");
		int CreditosPerdidosA6 = a6.creditosPerdidos();
		System.out.println("CREDITOS PERDIDOS - " + a6.nombre + " perdío " + CreditosPerdidosA6 + " creditos");
		int CreditosAPgarA6 = a6.dineroParaRepetirCreditos();
		System.out.println("DINERO POR CREDITOS - " + a6.nombre + " debe pagar $" + CreditosAPgarA6);
		System.out.println("************");
	}
}
