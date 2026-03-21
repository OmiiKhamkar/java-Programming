public class Array4 {
        public static void main(String[] args) {
    int a[]={3,10,125,120,14,15,65,63,14,80,28,5};
    int count1 = 0 ;
    int count2 = 0 ;
    System.out.print("The Numbers divisible by 5 are ");
    for (int i = 0; i < a.length; i++) {
        if(a[i]%5==0){
          System.out.print(a[i]+" ");
          count1++;
        }
    }
    System.out.println("\nThe Count of Number divisible by 5 is "+count1);
    for (int i = 0; i < a.length; i++) {
        if(a[i]%10==0){
          System.out.print(a[i]+" ");
          count2++;
        }
    }
    System.out.println("\nTotal "+count2+" numbers are divisible by 10");
}//main
}//class

