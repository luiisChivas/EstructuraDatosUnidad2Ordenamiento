package burbuja;

public class Burbuja {
	
	public static void main(String[] args) {
		String [] arreglo={"Lucia",	"Roberto", "Juan", "Penélope", "María", "Mario", "Noé","Ana", "Pablo", "Bruno"};
				
		//Imprime el arreglo desordenado
		System.out.println("ARREGLO DESORDENADO");
		for(int i=0;i<arreglo.length;i++){
			System.out.println("Arreglo ["+i+"]:"+ arreglo[i]);
		}
		
		String aux;
		
		for(int i=0;i<arreglo.length;i++){
			for(int j=0;j<arreglo.length-1;j++){
				if(arreglo[j].compareTo(arreglo[j+1])>0){
					aux=arreglo[j];
					arreglo[j]=arreglo[j+1];
					arreglo[j+1]=aux;
				}
			  }
			}
		System.out.println();
		System.out.println("ARREGLO ORDENADO");
			for(int i=0;i<arreglo.length;i++){
				System.out.println("Arreglo ["+i+"]:"+ arreglo[i]);
			
		}
	}
	

}
