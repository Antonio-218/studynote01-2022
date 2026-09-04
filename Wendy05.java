package Wendy2022;
public class Wendy05 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,7};
        int[]arr2;
        for (int i=0;i<arr1.length;i++) {
            System.out.print(arr1[i]+"\t");
        }
        arr2=arr1;
        System.out.println();
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr1[i]+"\t");

        }
        System.out.println("==============");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+"\t");
        }


    }
}
