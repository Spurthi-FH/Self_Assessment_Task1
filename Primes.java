public class Primes {
    public static void main(String[] args) {
        int nValues = 50;

        outerLoop: // Label for continue
        for (int i = 2; i <= nValues; i++) {
            for (int j = 2; j * j <= i; j++) { // Only check up to sqrt(i)
                if (i % j == 0) {
                    continue outerLoop; // Not prime
                }
            }
            System.out.println(i); // Prime number
        }
    }
}
