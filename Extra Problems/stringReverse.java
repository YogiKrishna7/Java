public class stringReverse {

    String reverse(String A){
        String b[] = A.split(" ");
        String rw = "";

        for(int i = b.length - 1; i >= 0; i--){
            rw = rw.trim() + " " + b[i];
        }

        return rw;
    }

    public static void main(String[] args) {
        stringReverse s = new stringReverse();
        String a = s.reverse("qxkpvo  f   w vdg t wqxy ln mbqmtwwbaegx   mskgtlenfnipsl bddjk znhksoewu zwh bd fqecoskmo");
        System.out.println(a);
    }
}