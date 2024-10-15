import java.util.Arrays;

public class KthSmallestNumber{
    public static void main(String[] args) {
        int k = 3;
        int arr[] = {7,10,4,3,20,15};
        Arrays.sort(arr);
        System.out.println("The 3rd Smallest Number is: " + arr[k-1]);
    }
}