/*
 * Created by 21343080_Andi Sultan Al Ayyubi
 */


public class kondisiOperator {
    public static void main (String[] args) {
        String status = "";
        int grade = 50;

        //mendapatkan status pelajar
        status = (grade >= 60) ? "Passed" : "Fail";

        //Print Status
        System.out.println(status);
    }
}
