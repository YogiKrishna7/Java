public class CommonElements {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {5, 4, 3, 2, 1};

        // Uncomment the following lines to use nested loops
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    System.out.println(a[i] + " is a common element.");
                    break; // Break out of the inner loop if a common element is found
                }
            }
        }

        // Uncomment the following lines to use sets
        // Set<Integer> setA = new HashSet<>();
        // Set<Integer> setB = new HashSet<>();

        // for (int num : a) {
        //     setA.add(num);
        // }

        // for (int num : b) {
        //     setB.add(num);
        // }

        // setA.retainAll(setB);

        // System.out.println("Common elements: " + setA);
    }
}