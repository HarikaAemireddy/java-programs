import java.util.*;

public class FinalEx 
{
	
final int A=1;
	
static final int B;
	
static 
{
		
System.out.println("Enter number");
		
Scanner sc = new Scanner(System.in);
		
B=sc.nextInt();
		
	
}
	
  
 void add()
  
 {
	  
	  
 System.out.println(A+" "+B);
   
}
	
public static void main(String[] args)
 {
				
FinalEx f =new FinalEx();
		
f.add();

	
}


}