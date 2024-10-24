import java.util.*;

class ClassA {
    int nums;

    ClassA(int nums) {
        this.nums = nums;
    }

    public int getNums() {
        return nums;
    }

    public void setNums(int nums) {
        this.nums = nums;
    }

    public String toString() {
        return "ClassA [nums=" + nums + "]";
    }
}

public class ComparatorEx {
    public static void main(String[] args) {
        ArrayList<ClassA> num = new ArrayList<>();
        num.add(new ClassA(54));
        num.add(new ClassA(65));
        num.add(new ClassA(16));
        num.add(new ClassA(13));
        num.add(new ClassA(71));
        num.add(new ClassA(72));
        num.add(new ClassA(14));

        Comparator<ClassA> com = new Comparator<ClassA>() {
            public int compare(ClassA num1, ClassA num2) {
                if (num1.nums % 10 > num2.nums % 10) {
                    return 1;
                } else {
                    return -1;
                }
            };
        };

        Collections.sort(num, com);

        for (ClassA i : num) {
            System.out.println(i);
        }
    }

}
