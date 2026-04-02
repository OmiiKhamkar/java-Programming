import java.util.Scanner;

public class Reverse_String_Fun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Word :");
        String s = sc.nextLine();
        System.out.println(reverse_String(s));
    }
    static String  reverse_String(String s){
        String rev = "";
        for (int i = s.length()-1; i >=0; i--) {
            rev += s.charAt(i);
        }
        return rev;
       
    }
}

