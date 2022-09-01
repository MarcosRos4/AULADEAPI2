import java.util.Random;
public class Main{
    public static void beatbolha (int[] vetor){
	    int aux = 0;
	    for(int i=0; i<vetor.length - 1; i++){
	        for(int j=0; j<vetor.length - 1 - i; j++){
	            
	            // troca de vetor
	            if(vetor[j]>vetor[j+1]){
	                aux = vetor[j];
	                vetor[j] = vetor[j+1];
	                vetor[j+1]=aux;
	            }
	        }
	    }
	    
	    for(int i=0; i<vetor.length; i++){
	            System.out.println(vetor[i]);
	        }
	}
	
	public static boolean buscaBinaria(int[] v, int num){
        int esq = 0;
        int dir = v.length-1;
        while(esq<=dir) {
            int meio = (esq+dir)/2;
            if(v[meio]==num){
                System.out.println("Encontra-se o mesmo valor na posicao: " + meio);
                return true;
            }
            if(v[meio]<num) esq = meio+1;
            else dir = meio -1;
        }
        System.out.println("nao tem esse numero aqui irmao");
        return false;
    }
    
	public static void main(String[] args) {
	    Random random = new Random();
		int[] arroz = new int[10];
		for(int i=0; i<arroz.length; i++){
		    arroz[i]=random.nextInt(100);
		}
		beatbolha(arroz);
		System.out.println();
		buscaBinaria(arroz, 8);
	}
	
}
