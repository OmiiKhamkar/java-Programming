public class name_pattern {
    public static void main(String[] args) {
        
        for (int row = 1; row <=5; row++) {
            
            for (int col = 1; col <=20; col++) {
                
                if(row==1&&(col>=2&&col<=4||col==7||col==8||col==10||col==11||col>=13&&col<=15||col>=17&&col<=19)||
                   row==2&&(col==1||col==5||col==7||col==9||col==11||col==14||col==18)||
                   row==3&&(col==1||col==5||col==7||col==9||col==11||col==14||col==18)||
                   row==4&&(col==1||col==5||col==7||col==9||col==11||col==14||col==18)||
                   row==5&&(col>=2&&col<=4||col==7||col==11||col>=13&&col<=15||col>=17&&col<=19)){
                     
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
