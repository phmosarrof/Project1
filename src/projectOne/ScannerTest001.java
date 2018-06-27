package projectOne;
import java.util.Scanner; 
public class ScannerTest001 {

	public ScannerTest001() {
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);  
	     
		   System.out.println("Enter your roll no:");  
		   
		   int roll_no=sc.nextInt(); 
		   
		   System.out.println("Enter your name:");
		   
		   String Name=sc.next();  
		   
		   System.out.println("Enter your Registration NO:"); 
		   
		   int Registration_NO =sc.nextInt(); 
		   
		   System.out.println("Enter your mark:");
		   
		   
		   double Mark = sc.nextDouble();
		   
	
		   System.out.println("\nYour Roll No:"+roll_no+"\nName:"+Name+"\nRegistration NO:"
			   		+ ""+Registration_NO+"\nYour Mark is :"+Mark); 
		   
		   sc.close();  
	}
}

 