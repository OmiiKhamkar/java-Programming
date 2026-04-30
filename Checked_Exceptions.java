import java.lang.Thread;
public class Checked_Exceptions {
public static void main(String[] args) throws InterruptedException
{
  for (int i = 0; i < 5; i++)
  {
      System.out.println("Number of iteration = " + i); //delay of 1000 msec
      //for
      System.out.println("Wait:");
      Thread.sleep(1000);
}//main
}//class
}

