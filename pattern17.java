public class pattern2 {
    public static void main(String[] args) {
        int i = 1;
        char j;
        while (i<=3) { 

            j = 'A';
            while (j<='Z') { 
                System.out.print(j+" ");
                j++;
            }

            System.out.println();
            i++;
        }
    }
}