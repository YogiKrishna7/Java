public class PrimeNumsInRange {
    public static void main(String[] args) {
        int range = 50;
        for (int i = 2; i <= range; i++) {
            boolean flag = true;

            for (int j = 2; j  <= i/2; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(i);
            }
        }
    }
}
