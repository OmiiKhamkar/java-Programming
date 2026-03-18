public class pattern3 {
    public static void main(String[] args) {
        int i = 21;
        int j;
        while (i<=30) { 

            j = 1;
            while (j<=10) { 
                System.out.print(j*i+" ");
                j++;
            }

            System.out.println();
            i++;
        }
    }
}