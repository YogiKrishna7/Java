class Solution {
    static void fizz(int A) {
        for(int i = 1; i >= A; i++){
            System.out.println(i);
        }
    }
}

public class FizzBuzz {
    public static void main(String[] args) {
        Solution.fizz(7);
    }
}
