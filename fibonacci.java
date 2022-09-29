public class fibonacci {


    public static long fibonoggers( long num){
        
        if(num>1){
            return fibonoggers(num - 1) + fibonoggers(num - 2);}
        else{
            
            return num;}
    }
    public static void main(String[] args) {
        long x = 50;
        
        for (int i = 0; i <= x; i++) {

            System.out.printf("(%s)"+fibonoggers(i)+" ",i);    
        }
        
    }
}
