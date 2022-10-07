package MustDo;

public class CountPrimes {
    public static void main(String[] args) {
        int n = 25;
        System.out.println("The number of primes less than " +n +" is "+countPrimes(n));
    }

    static int countPrimes(int n) {
        int count = 0;
        boolean[] isMultipleOfPrimes = new boolean[n];
        for(int i = 2; i < n; i++) {
            if(!isMultipleOfPrimes[i]) {
                count ++;
                for(int j = i; j < n; j = j + i) {
                    isMultipleOfPrimes[j] = true;
                }
            }
        }
        return count;
    }
}
