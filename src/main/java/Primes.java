public class Primes {
    public static int countFactors(int n){
        int factors = 0;
        for(int i = 1; i <= n; i++){
            if (n % i == 0)
                factors++;
        }
        return factors;
    }

    public static boolean isPrime(int n){
        boolean prime = true;
        prime = countFactors(n) == 2;
        return prime;
    }

    public static int countPrimes(int n){
        int numPrimes = 0;
        for(int i = 2; i < n; i++)
            if (isPrime(i))
                numPrimes++;
        return numPrimes;
    }
}
