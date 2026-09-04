package Wendy2022;
public class Wendy02 {
    public static void main(String[] args) {
        int count =0;
        double a=0.1;
        while(true){
            a=a*2;
            count++;
            if (a>=8848860){
                break;
            }
        }
        System.out.println("折叠第"+count+"是"+a);
    }
}