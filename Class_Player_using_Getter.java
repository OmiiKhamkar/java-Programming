
class Player {
private int runs;
private String name;
public void display()
{
  System.out.println("Name:"+name+"\tRuns:"+runs);
}
public void setRuns(int runs) {
  this.runs = runs;
}
public void setName(String name) {
  this.name = name;
}
public int getRuns() {
  return runs;
}
public String getName() {
  return name;
}
}
public class Class_Player_using_Getter {

public static void main(String args[])
{  
  Player p1=new Player();
  Player p2=new Player();
  Player p3=new Player();
  p1.setName("Virat");
  p1.setRuns(129);
  p2.setName("Ajinkya");
  p2.setRuns(81);
  p3.setName("Rohit");
  p3.setRuns(173);
  System.out.println("Name of player with minimum runs is ");
  if(p1.getRuns()<p2.getRuns()&&p1.getRuns()<p3.getRuns()){
    System.out.println(p1.getName());
  }
  else if(p2.getRuns()<p3.getRuns()){
    System.out.println(p2.getName());
  }
  else{
    System.out.println(p3.getName());
  }
  
}//main
}//class Demo

