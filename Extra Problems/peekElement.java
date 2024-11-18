//{ Driver Code Starts
// Initial Template for Java

// import java.io.*;
// import java.lang.*;
// import java.util.*;

// class GFG {
//     public static void main(String args[]) throws IOException {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         int t = Integer.parseInt(br.readLine());

//         while (t-- > 0) {
//             String arr[] = br.readLine().split(" ");
//             int a[] = new int[arr.length];

//             for (int i = 0; i < arr.length; i++) {
//                 a[i] = Integer.parseInt(arr[i]);
//             }
//             Solution obj = new Solution();
//             int f = 0;
//             int A = obj.peakElement(a);
//             int n = a.length;
//             if (A < 0 && A >= n)
//                 System.out.println("false");
//             else {
//                 if (n == 1 && A == 0)
//                     f = 1;
//                 else if (A == 0 && a[0] >= a[1])
//                     f = 1;
//                 else if (A == n - 1 && a[n - 1] >= a[n - 2])
//                     f = 1;
//                 else if (A >= 0 && A < n && a[A] >= a[A + 1] && a[A] >= a[A - 1])
//                     f = 1;
//                 else
//                     f = 0;
//                 if (f == 1) {
//                     System.out.println("true");
//                 } else {
//                     System.out.println("false");
//                 }
//             }
//             System.out.println("~");
//         }
//     }
// }
// } Driver Code Ends


class Solution1 {

    public int peakElement(int[] arr) {
        // code here
        int max = 0;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > arr[max]){
                max = arr[i];
                max = i;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int l[] = {1,2,3};
        Solution1 ob1 = new Solution1();
        int a = ob1.peakElement(l);
        System.out.println(a);
    }
}
