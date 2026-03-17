public class pattern12 {
    public static void main(String[] args) {
        char ch;
        for (int i = 0 ; i <5; i++) {
           ch=(char)('A'+i);
            for (int j = 1; j <=5; j++) { 
                System.out.print(ch+" ");  
                ch ++;
            } 
            System.out.println();
        }
       
    }
}