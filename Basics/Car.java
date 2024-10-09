
// public class Practice {

//     public static void main(String[] args) {
//         // int a = 3;
//         // boolean isPrime = true;

//         // if (a <= 1) {
//         //     System.out.println(a + " Is Not Prime"); // Numbers less than or equal to 1 are not prime
//         // } else {
//         //     for (int i = 2; i < a; i++) {
//         //         if (a % i == 0) {
//         //             isPrime = false; // If a is divisible by any number, it's not prime
//         //             break;
//         //         }
//         //     }
//         //     if (isPrime) {
//         //         System.out.println(a + " Is Prime");
//         //     } else {
//         //         System.out.println(a + " Is Not Prime");
//         //     }
//         // }
//         // int a = 5;
//         // int f = 1;
//         // for (int i = a; i > 0; i--) {
//         //     f = f * i;
//         // }
//         // System.out.println(a + " Factorial is: " + f);
//         // int n = 10;  // Number of Fibonacci numbers to generate
//         // int a = 0;
//         // int b = 1;
//         // int next;
//         // System.out.print(a + " " + b + " ");  // Print the first two Fibonacci numbers
//         // for (int i = 2; i < n; i++) {
//         //     next = a + b;  // Calculate the next Fibonacci number
//         //     System.out.print(next + " ");  // Print the next number
//         //     a = b;  // Shift values
//         //     b = next;  // Prepare for the next iteration
//         // }
//         // int num = 153;
//         // StringBuffer count = new StringBuffer("153");
//         // int org_num = num;
//         // int digit = 0;
//         // int sumOfPowers = 0;
//         // while(num!=0){
//         //     digit = num % 10;
//         //     sumOfPowers +=  Math.pow(digit, count.length());
//         //     num = num / 10;
//         // }
//         // System.out.println(sumOfPowers);
//         // if(sumOfPowers == org_num){
//         //     System.out.println("Armstrong Number!");
//         // }
//         // else{
//         //     System.out.println("Not an armstrong number!");
//         // }
//     }
// }

public class Car {

    String name;
    MusicPlayer m;

    Car(String name, MusicPlayer m) {
        this.name = name;
        this.m = m;
    }
    //int pcount=0;
    int count = 0;

    void show(int count) {
        System.out.println(m.name + "count:" + count + " ");
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int pcount = 0;
        int scount = 0;
        MusicPlayer m = new MusicPlayer("Sony");
        MusicPlayer m3 = new MusicPlayer("Sony");
        MusicPlayer m4 = new MusicPlayer("Sony");
        MusicPlayer m1 = new MusicPlayer("philips");
        MusicPlayer m2 = new MusicPlayer("philips");

        Car c = new Car("kiaSeltos", m);
        Car c1 = new Car("kiaSeltos", m3);
        Car c2 = new Car("kiaSeltos", m2);
        Car c3 = new Car("kiaSeltos", m1);
        Car c4 = new Car("kiaSeltos", m4);

        Car car[] = new Car[5];
        car[0] = c;
        car[1] = c1;
        car[2] = c2;
        car[3] = c3;
        car[4] = c4;
        //c.show(car);

        for (int i = 0; i < car.length; i++) {
            if (car[i].m.name.equals("Sony")) {
                scount++;

            } else {
                pcount++;

            }
            //car[i].show(scount,pcount);
        }
        System.out.println(scount + " " + pcount);

        // show(scount,pcount);
        for (int i = 0; i < car.length; i++) {
            if (car[i].m.name.equals("Sony")) {

                car[i].show(scount);
                break;
            }

        }
        for (int i = 0; i < car.length; i++) {
            if (car[i].m.name.equals("philips")) {

                car[i].show(pcount);
                break;
            }

        }

    }

}
}
}
