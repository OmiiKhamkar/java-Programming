public class Array3 {
    public static void main(String[] args) {
   char ch[] = {'r', 'a', 'j', 'e', 's', 'h', 'j', 'a', 'i', 'n', 'a', 'c', 'a', 'd', 'e','m','y'};
    int count =0;
    for (char i = 0; i < ch.length; i++) {
        if(ch[i]=='a'||ch[i]=='e'||ch[i]=='o'||ch[i]=='i'||ch[i]=='u'){
            count++;
            
        }
    }
    System.out.println("Number of vowels in Array :"+count);
}//main
}//class

