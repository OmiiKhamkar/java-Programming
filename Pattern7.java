/*
    *
   ***
  *****
 *******
*********
 */
public class Pattern7 {
    public static void main(String[] args) {
        for (int row = 1; row <=5; row++) {
            
            for (int col = 1; col <=9; col++) {
                if((col==5 || row==5 )||(col==4&&row==2||row==2&&col==6)||
                (row==3&&col==3||row==3&&col==4||row==3&&col==6||row==3&&col==7)||
                (row==4&&col==2||row==4&&col==3||row==4&&col==4||row==4&&col==6||
                    row==4&&col==7||row==4&&col==8)){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
              //  System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
