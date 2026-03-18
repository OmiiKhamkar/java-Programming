
/*
   ***   ***
  ***** ***** 
 *************
  ***********
   *********
    *******
     *****
      ***
       *
*/
public class heart_pattern8 {
    public static void main(String[] args) {
        for (int row = 1; row <= 9; row++) {
            for (int col = 1; col <= 13; col++) {
                if (row==1&&(col==3||col==4||col==5||col==9||col==10||col==11)||
                    row==2&&(col==2||col==3||col==4||col==5||col==6||col==8||
                    col==9||col==10||col==11||col==12)||row==3||
                    row==4&&(col>=2&&col<=12)||row==5&&(col>=3&&col<=11)||row==6&&(col>=4&&col<=10)||
                    row==7&&(col>=5&&col<=9)||row==8&&(col==6||col==7||col==8)||row==9&&col==7
                    ) {
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                  }
            }
            System.out.println();
        }
    }
}