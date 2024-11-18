import java.util.*;

public class reversedString{

    LinkedList reverse(LinkedList A){
        LinkedList r = new LinkedList();
        if(A.contains(null)){
            A.remove(null);
            A.addFirst(null);

            r.addAll(A.reversed());
        }

        return r;
    }

    public static void main(String a[]){
        LinkedList<Integer> nums = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, null));

        reversedString s = new reversedString();

        LinkedList returned = s.reverse(nums);
        System.out.println(returned);

    }
}