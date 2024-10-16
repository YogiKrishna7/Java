public class GreaterValue {
    public static void main(String[] args) {
        int l[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

        for(int i = 1; i < l.length; i++) {
            if(l[i] > 5){
                System.out.println(l[i]);
            }
        }
    }
}
