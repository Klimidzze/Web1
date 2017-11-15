import java.util.Scanner;

public class bin {


    public  static int  binSearch(int[] a) {
        Scanner scn = new Scanner(System.in);

        Massiv r = new Massiv();
        int x = 1;
        int start = 0, end=a.length;
        int half;
        int key;
        int index = 0;
        System.out.print("Vvedyte klyuch:");
        key = scn.nextInt();

        for(int i=0; i<x; i++) {
            half = (end+start)/2;

            if(a[half]==key) {
                index = half;
            }

            if(a[half]<key) {
                start = half;
                x++;
            }
            if(a[half]>key) {
                end = half;
                x++;
            }

        }
        System.out.println("Index klyuch:"+index);
        return index;
    }

}
