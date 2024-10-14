// public class ThreadsExample implements Runnable{
//     int num;

//     ThreadsExample(int num){
//         this.num = num;
//     }

//     void table(int num){
//         for(int i = 1; i <= 10; i++){
//             System.out.println(num + "x" + i + "=" + (num * i));
//         }
        
//     }

//     public void run(){
//         table(num);
//     }

//     public static void main(String[] args) {
//         ThreadsExample ob1 = new ThreadsExample(5);
//         ThreadsExample ob2 = new ThreadsExample(10);

//         Thread o1 = new Thread(ob1);
//         Thread o2 = new Thread(ob2);
//         o1.start();
//         o2.start();
//     }
// }

public class ThreadsExample extends Thread{
    int num;

    ThreadsExample(int num){
        this.num = num;
    }

    void table(int num){
        for(int i = 1; i <= 10; i++){
            System.out.println(num + "x" + i + "=" + (num * i));
        }
        
    }

    public void run(){
        table(num);
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadsExample ob1 = new ThreadsExample(5);
        ThreadsExample ob2 = new ThreadsExample(10);

        ob1.start();
        Thread.sleep(2000);

        ob2.start();
    }
}