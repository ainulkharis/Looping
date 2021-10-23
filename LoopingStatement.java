import java.util.Scanner;

public class LoopingStatement {

    public static void main(String[] args) {
        Scanner myNumberLoop = new Scanner(System.in);
        System.out.println("Masukkan Banyaknya Angka Yang akan dilooping = ");
        int loopingNumber = myNumberLoop.nextInt();

        System.out.println("\nLooping menggunakan For...");
        for(int i = 0; i <= loopingNumber;i++){
            System.out.println("Angka i = " + i);
        }

        System.out.println("\nLooping menggunakan while...");
        int x;
        x=0;
        while( x<= loopingNumber){
            System.out.println("Angka x = " + x);
            x++;
        }

        System.out.println("\nLooping menggunakan do...while :");
        int y;
        y=0;
        do{
            System.out.println("Angka y = " + y);
            y++;
        }while(y<=loopingNumber);
    }
}
