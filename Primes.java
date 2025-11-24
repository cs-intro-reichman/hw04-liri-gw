public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        if(n < 2) {
            System.out.println("There are no prime numbers between 2 and " + n);
            return;
        }
        boolean [] isPrime = new boolean [n + 1];
        for (int i = 2; i < isPrime.length; i++) {
            isPrime[i] = true;
        }
        int p = 2;
        while(p <= (double)Math.sqrt(n)) {
            // check the multiples of the primes and sets as false
            if(isPrime[p]) {
                for(int i = p + 1; i < isPrime.length; i++) {
                if(i % p == 0) {
                    isPrime[i] = false;
                }
            }
        }
            // incrementing p to the next prime number
            p++;
            while(p <= n && !isPrime[p]) {
                p++;
                }
            }
        int count = 0;
        for(int i = 0; i < isPrime.length; i++) {
            if(isPrime[i] == true) {
                count ++;
            }
        
        }
        System.out.println("There are " + count + " primes between 2 and " + n +
         " (" + (int)((double)count/n *100) + "% are primes)");
                   
    } 
     }