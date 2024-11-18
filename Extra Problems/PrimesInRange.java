public class PrimesInRange {
    public static void main(String[] args) {
        int range = 20;

        for (int i = 2; i <= range; i++) {
            boolean prime = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }

            if (prime) {
                System.out.println(i);
            }
        }
    }
}
