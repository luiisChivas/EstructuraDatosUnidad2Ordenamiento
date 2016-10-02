package sellShort;

public class SellShort {
	
	public double [] shell(double[] array){
		boolean estado;
		for(int j = array.length / 2; j > 0; j = j == 2 ? 1 : j / 2){
			do{
				estado = false;
			for(int i = 0; i + j < array.length;i++ ){
				if(array[i+j] < array[i]){
					double aux = array[i+j];
					array[i+j] = array[i];
					array[i] = aux;	
					estado = true;
				}
			}
			}while(estado);
		}
		
		return array;
	}
	
	public static void main(String[] args) {
		double[] numeros ={10.23, 23.10, 55.10, 55.001, 24.15, 24.5, 24.01, 18.0, 13.3, 10.23};
		
		SellShort sell = new SellShort();
		
		double[] result = sell.shell(numeros);
		
		for(int i=0; i<result.length;i++){
			System.out.print(result[i] + " , ");
		}
	}

}
