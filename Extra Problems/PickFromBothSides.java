import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class PickFromBothSides {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList(Arrays.asList(5,-2,3,1,2));
        int b = 3;

        int sum = 0;
        A.sort(Comparator.reverseOrder());

        for(int i = 0; i < A.size(); i++){
            if(i >= 0){
                sum += sum + i;
            }
        }
        System.out.println(A);
        System.out.println(sum);
    }
}
