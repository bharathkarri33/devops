public class Prime {

    public static void main(String[] args) {
        int number = 29;  // You can change this to test other numbers
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }

    public static boolean isPrime(int num) {
        // Handle special cases
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // If divisible by i, it's not prime
            }
        }
        return true; // num is prime if no divisors were found
    }
}