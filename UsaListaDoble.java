public class UsaListaDoble{
	
	public static void main(String[] args){
		ListaDoble lista = new ListaDoble();
		lista.insertaPrimerNodo("R");
		lista.imprimir();
		lista.insertaPrimerNodo("F");
		lista.imprimir();
		System.out.println(lista);
		lista.insertaAntesPrimerNodo("H");
		System.out.println(lista);
		lista.insertaAlFinal("Z");
		System.out.println(lista);
		lista.insertaEntreNodos("T", "R");
		System.out.println(lista);
		lista.insertaAntesPrimerNodo("K");
		System.out.println(lista);
		lista.insertaAlFinal("Ñ");
		System.out.println(lista);
		lista.borrarPrimerNodo();
		System.out.println(lista);
		lista.borrarUltimoNodo();
		System.out.println(lista);
		lista.borrarCualquierNodo("R");
		System.out.println(lista);
		
                // Buscar un nodo por posición
        Node nodoEnPosicion2 = lista.buscarPorPosicion(2);
        System.out.println("Nodo en posición 2: " + nodoEnPosicion2.name);

        // Insertar antes del último nodo
        lista.insertarAntesUltimoNodo("M");
        System.out.println(lista);

        // Intercambiar un nodo por otro buscado
        lista.intercambiarNodos("F", "X");
        System.out.println(lista);
	}
}

