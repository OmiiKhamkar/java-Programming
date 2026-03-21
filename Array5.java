public class Array5 {
    public static void main(String[] args) {
        int a[]={3,10,125,49,14,15,65,63,21,80,11,5};
        int even = 0;
        int odd = 0;
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < a.length; i++) {
            if(a[i]%2==0){
                even ++;
                sum1 = sum1 + a[i];
            }
            else{
                odd ++;
                sum2 = sum2 + a[i];
            }
        }  
        System.out.println("There are "+even+" even numbers and "+odd+" odd numbers");
        System.out.println("Sum of even numbers = "+sum1);
        System.out.println("And sum of odd numbers = "+sum2);
      }
}
