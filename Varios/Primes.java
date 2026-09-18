public class Primes{
    public static void main(String[] args){
        assert isPrime(7)==true;
        System.out.println("Todo bien por el momento");
        assert isPrime(2)==true : "Todo mal";
        System.out.println("Todo bien por el momento");
        printPrimes(Integer.parseInt(args[0]));
    }
    public static void printPrimes(int limite){
        int contador = 0;
        for(int i=2;i<=limite;i++){
            
            if(isPrime(i)){
                if(contador<10){
                    System.out.print(i + " ");
                    contador+=1;
                }else{
                    System.out.println();
                    contador=0;
                }
                
            }
        }
    }
    public static boolean isPrime(int numero){
        if(numero<=1){
            return false;
        }else{
            for(int i=2;i<numero;i++){
                if(numero%i==0){
                    return false;
                }
            }
            return true;
        }
    }
}