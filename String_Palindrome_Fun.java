import java.util.Scanner;

public class String_Palindrome_Fun {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Word :");
        String s = sc.nextLine();
        if(isPalindString(s)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not palindrome");
        } 
    }
    static Boolean  isPalindString(String s){
        String rev = "";
        for (int i = s.length()-1; i >=0; i--) {
            rev += s.charAt(i);
        }
        return s.equalsIgnoreCase(rev);
       
    }
}
