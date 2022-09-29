import java.util.Scanner;

public class teste{
    
    public static void main(String[] args) {
        System.out.print("CONTAGEM REGRESSIVA\nDIGITE UM NUMERO: ");
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            regressiva(n);
    }

    }

    public static int regressiva(int n){
        if(n<0){
            return n;
        }
        else{
            System.out.print(n+" ");
            n-=1;
            return regressiva(n);
        }
    }
}