package prueba;
import java.util.ArrayList;
import java.util.Random;

public class Problema {

	int matriz[][];
	int nfilas, ncolumnas;
	long semilla;
	int nobstaculos;	
	Random rn;
	
	//posiciones inicial y final del bot3 
    int f_inicial;
    int c_inicial;
    int f_final;
    int c_final;
	
    
	public Problema(int nfilas,int ncolumnas, int nobstaculos, long semilla) {
		
	this.nfilas=nfilas;
	this.ncolumnas=ncolumnas;
	matriz=new int[nfilas][ncolumnas];
	this.nobstaculos=nobstaculos;
	this.semilla=semilla;
	rn=new Random();
	rn.setSeed(semilla);
	llenarMatriz();
	generarObstaculos();
	posicionInicialyFinal();
	
	}
	
	/*
	 * Generar obstaculos en la matriz, posicion inicial y final (libres de obstaculos) aleatorias (Random)
	 * 
	 */
	
	public void posicionInicialyFinal() {
		f_inicial=rn.nextInt(nfilas);
		c_inicial=rn.nextInt(ncolumnas);
		f_final=rn.nextInt(nfilas);
		c_final=rn.nextInt(ncolumnas);
		
		while(matriz[f_inicial][c_inicial]==0) {
			f_inicial=rn.nextInt(nfilas);
			c_inicial=rn.nextInt(ncolumnas);
		}
		
		while(matriz[f_final][c_final]==0) {
			f_final=rn.nextInt(nfilas);
			c_final=rn.nextInt(ncolumnas);
		}
		/*
		System.out.println(f_inicial +"y" +c_inicial);
		System.out.println(f_final+"y"+c_final);
		*/
	}
	
	public void generarObstaculos() {
		int c=0;
		while(c!=nobstaculos) {
			int fila=rn.nextInt(nfilas);
			int col=rn.nextInt(ncolumnas);
		//	matriz[fila][col]=0;
			if(matriz[fila][col]==0) {
				fila=rn.nextInt(nfilas);
				col=rn.nextInt(ncolumnas);
				matriz[fila][col]=0;
			}else {
				matriz[fila][col]=0;
			}
			c++;
		}
	}
	
	public void llenarMatriz() {
		
		for(int i=0;i<nfilas;i++) {
			for(int j=0;j<ncolumnas;j++) {
				matriz[i][j]=1;
				
				
			}
		}
	}
	public void mostrarMatriz() {
		for(int i=0;i<nfilas;i++) {
			for(int j=0;j<ncolumnas;j++) {
				System.out.print(matriz[i][j]+"\t");	
			}
			System.out.println();
		}
	}
	//generar numero de obstaculos y posicionarlos
	// generar aleatoriamente una posición inical y otra final
	//válidas (libres de obstáculos) para nuestro robot.
	

}

	
	
