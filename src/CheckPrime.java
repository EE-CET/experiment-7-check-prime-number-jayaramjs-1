import java.util.Scanner;
public class CheckPrime {
   
        // TODO: Read n
        // TODO: Check if n is prime
        // Hint:
        // 1. If n <= 1, it is Not Prime.
        // 2. Loop from 2 to sqrt(n). If n is divisible by any number, it is Not Prime.
        // 3. Otherwise, it is Prime.
        // TODO: Print "Prime" or "Not Prime"

        public static boolean prime(int n){

                if (n <= 1){
                 return false;
                }
                for (int i=2; i<= Math.sqrt(n); i++){
                        if (n%i==0){
                                return false;
                        }           
                }
                return true;


        }

        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            boolean check = prime(n);
            if (check){
                System.out.print("Prime");
            }
            else{
                System.out.print("Not Prime");
            }   
        }
        scanner.close();
    }
    
}





