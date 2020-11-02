public class Main {
    public static void main(String[] args) {
        boolean debit = true;
        int start = 300;
        long sum;
        if (debit) {
            sum = 1500;
        } else {
            sum = 900;
        }
        long result = start + sum + (sum / 100);
        long limit = 1000;
        if ( result >= limit); {
        }
        System.out.println(result);
    }
}
