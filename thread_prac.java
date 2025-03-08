// class Q extends Thread {
//     public void run() {//Thread have run method in class which extends thread or work as thread
//         for (int i = 0; i <= 10; i++) {
//             System.out.println("Hi Q thread");
//             try {
//                 Thread.sleep(5);
//             } catch (InterruptedException e) {

//                 e.printStackTrace();
//             }

//         }
//     }
// }

// class W extends Thread {
//     public void run() {
//         for (int i = 0; i <= 10; i++) {
//             System.out.println("Hi W thread");
//             try {
//                 Thread.sleep(5);
//             } catch (InterruptedException e) {

//                 e.printStackTrace();
//             }

//         }
//     }
// }

// public class thread_prac {
//     public static void main(String a[]) {
//         Q q = new Q();
//         W w = new W();
//         System.out.println(q.getPriority());
//         System.out.println(w.getPriority());
//         q.setPriority(Thread.MAX_PRIORITY);
//         System.out.println(q.getPriority());
//         q.start();//thread work with start function
//         w.start();

//     }

// }

//OR WE CAN USE WITH THE HELP OF RUNNABLE

// class Q implements Runnable {
//     public void run() {// Thread have run method in class which extends thread or work as thread
//         for (int i = 0; i <= 10; i++) {
//             System.out.println("Hi Q thread");
//             try {
//                 Thread.sleep(5);
//             } catch (InterruptedException e) {

//                 e.printStackTrace();
//             }

//         }
//     }
// }

// class W implements Runnable {
//     public void run() {
//         for (int i = 0; i <= 10; i++) {
//             System.out.println("Hi W thread");
//             try {
//                 Thread.sleep(5);
//             } catch (InterruptedException e) {

//                 e.printStackTrace();
//             }

//         }
//     }
// }

// public class thread_prac {
//     public static void main(String a[]) {
//         Runnable q = new Q();
//         Runnable w = new W();
//         Thread t1 = new Thread(q);
//         t1.setPriority(Thread.MIN_PRIORITY);
//         Thread t2 = new Thread(w);
//         t1.start();
//         t2.start();

//     }
// }

//OR WE CAN WORK WITH LAMBDA EXPRESSION AS RUNNABLE IS A FUNCTIONAL INTERFACE

// public class thread_prac {
//     public static void main(String a[]) {
//         Runnable q = () -> {
//             for (int i = 0; i <= 100; i++) {
//                 System.out.println("Hi Q thread");
//                 try {
//                     Thread.sleep(5);
//                 } catch (InterruptedException e) {

//                     e.printStackTrace();
//                 }

//             }

//         };
//         Runnable w = () -> {
//             for (int i = 0; i <= 100; i++) {
//                 System.out.println("Hi W thread");
//                 try {
//                     Thread.sleep(5);
//                 } catch (InterruptedException e) {

//                     e.printStackTrace();
//                 }

//             }

//         };
//         Thread t1 = new Thread(q);
//         Thread t2 = new Thread(w);
//         t1.start();
//         t2.start();

//     }
// }

//WORK WHEN RACE CONDITION HAPPENED

class Counter {
    int count;

    public synchronized void increment() {// add syncronized so that increment the value of count synchrounously
        count++;
    }
}

public class thread_prac {
    public static void main(String a[]) throws InterruptedException {
        Counter c = new Counter();
        Runnable q = () -> {
            for (int i = 0; i <= 100; i++) {
                c.increment();
                try {
                    Thread.sleep(5);
                } catch (InterruptedException e) {

                    e.printStackTrace();
                }

            }

        };
        Runnable w = () -> {
            for (int i = 0; i <= 100; i++) {
                c.increment();
                try {
                    Thread.sleep(5);
                } catch (InterruptedException e) {

                    e.printStackTrace();
                }

            }

        };
        Thread t1 = new Thread(q);
        Thread t2 = new Thread(w);
        t1.start();
        t2.start();

        t1.join();// add just to calculate that all iteration performed by thread
        t2.join();
        System.out.println(c.count);

    }
}