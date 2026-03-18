public class pattern4 {
    public static void main(String[] args) {
        int i = 10;
        int j;
       
        while (i<=20) { 
            System.out.print(i+"==>");
            j = 1;
             int count= 0;
            while (j<=i) { 
                  if(i%j==0){
                     System.out.print(" "+j);
                     count ++;
                    }
           
               j++;
          
            }   

            System.out.println("..."+"("+count+")");//to get a new line and also display count
            i++;
        }
    }
}