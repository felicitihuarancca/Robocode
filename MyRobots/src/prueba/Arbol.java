package prueba;


import java.util.Hashtable;

public class Arbol {

	Problema pro;
	Hashtable<Estado,Nodo> arbol;
	Estado s;
	Nodo n;
	public Arbol() {
		
		arbol=new Hashtable<Estado,Nodo>();
		s=new Estado(pro.f_inicial,pro.c_inicial);
		n=new Nodo(pro.f_inicial,pro.c_inicial,null);
	
	}
	public Arbol(Problema problema) {
		pro=problema;
	}
	
	public void Agregar() {
		
	}
}
