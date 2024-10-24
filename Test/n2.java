import java.util.*;

public class n2 {
    public static void main(String[] args) {
        ArrayList<n1> num = new ArrayList<>();
        num.add(new n1(54));
        num.add(new n1(65));
        num.add(new n1(16));
        num.add(new n1(13));
        num.add(new n1(71));
        num.add(new n1(72));
        num.add(new n1(14));

        Comparator<n1> com = new Comparator<n1>() {
            public int compare(n1 num1, n1 num2) {
                if(num1.nums % 10 > num2.nums % 10){
                    return 1;
                }else{
                    return -1;
                }
            };
        };

        Collections.sort(num, com);

        for(n1 i : num){
            System.out.println(i);
        }
    }

    
}
