public class ex1 {

    public static int potencia(int a, int n){
        if(n==0){return 1;}
        if(n==1){return a;}
        
        return a * potencia(a, n-1);
    }
    public static void main(String[] args) {
        System.out.println(potencia(2, 5));

    }
}
