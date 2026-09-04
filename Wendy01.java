package Wendy2022;
import java.util.Scanner;

public class Wendy01 {
    public static void main(String[] args) {
    Scanner scanner =     new Scanner(System.in);
    int grade= scanner.nextInt();
    if (grade<60){
        System.out.println("C");
    }else if(grade<80){
        System.out.println("B");
    }else if (grade<90){
        System.out.println("A");
    }else{
        System.out.println("A+");
        scanner. close();
    }


}
}