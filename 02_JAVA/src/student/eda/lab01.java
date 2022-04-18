package student.eda;

public class lab01 {
    public static void main(String[] args) {
        //Write a return method that can reverse  String
        //Ex: Reverse("ABCD"); ==> DCBA
        String wishYouLuck = "In your new Job";
        System.out.println(reverse(wishYouLuck));
    }
        public static String reverse (String wishYouLuck){

    String reverse="";

        for (int i = wishYouLuck.length()-1; i >=0 ; i--) {
            reverse+=wishYouLuck.charAt(i);
        }
        return reverse;
    }
}
