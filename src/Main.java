public class Main {
    public static void main (String[] args) {
        boolean debit = true;
        long sum;
        if (debit) {
            sum = 1500;
        } else {
            sum = 300;
        }
        long bonus = sum / 100 ;
        long limit = 1000;
        if (sum <= limit) {
            bonus = 0;
        }
        System.out.println(bonus);
    }
}
