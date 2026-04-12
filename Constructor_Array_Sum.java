class Array {
   private int a[];
   public Array(int []a){
    this.a = a;
   }
   void findSum(){
    int sum = 0;
    for (int i = 0; i < a.length; i++) {
        sum += a[i];
    }
    System.out.println("Sum is "+sum);
   }
}
public class Constructor_Array_Sum { 
public static void main(String args[])
{  
    int arr1[]={10,20,30,40,50};
    int arr2[]={100,200,300,400};
    Array p1=new Array(arr1);
    p1.findSum();
    Array p2=new Array(arr2);
    p2.findSum();
}//main
}

