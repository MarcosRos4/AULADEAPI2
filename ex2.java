public class ex2 {
    public static int binarise_minha_genere(int x){
        int binario=0;
        if(x==0){return 0;}
        
        else{
            System.out.println(x);
            System.out.println(x%2 +10);
            return binario = x%2 + 10 * (binarise_minha_genere(x/2));}
    }
    public static void main(String[] args) {
        System.out.println(binarise_minha_genere(10));
    }
}
