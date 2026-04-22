public class Prime_Number_in_Array {
    public static void main(String[] args) {

        int a[] = {11,12,13,14,15,16,17,18,19};
        for (int i = 0; i < a.length; i++) {
          Prime(a[i]);
        }
        
    }
    static void Prime(int num){
        boolean isPrime = true;
           for (int i = 2; i*i<= num; i++) {
             if(num%i==0){
                 isPrime = false;
                 break;
             }
           }
           if(isPrime){
            System.out.println(num);
           }
          
        }
    }
