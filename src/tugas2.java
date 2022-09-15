/*
 * Created by 21343080_Andi Sultan Al Ayyubi
 */


public class tugas2 {
    public static void main (String[] args){
        int x = 10;
        int y = 23;
        int z = 5;
        int max;

        System.out.println("number 1 = "+x);
        System.out.println("number 2 = "+y);
        System.out.println("number 3 = "+z);

        //mencari nilai tertinggi
        max = (y >= x) ? y : x;
        max = (z >= max) ? z : max;
        System.out.println("Nilai tertingginya adalah angka = "+max);
    }
}
