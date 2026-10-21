package Loopingexercises;

public class ForLoop {
    public static void main (String[] args) throws InterruptedException {
        // for-loop print display count down 10 to 1

        for (int i = 10; i >= 1; i--){
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("Lunch");


    }
}
