package projectOne;
import java.util.Scanner; 
public class ScannerTest001 {

	public ScannerTest001() {
		
	}

	public static void main(String[] args) {
		
		//Scanner sc = new Scanner(System.in); 
		Scanner SD = new Scanner(System.in);
	     
		   System.out.println("Enter your roll No:");  
		   
		   int roll_no = SD.nextInt(); 
		   
		   System.out.println("EnterStudent Name:");
		   
		   String Name = SD.next();
		   
		   System.out.println("Enter Student Registration NO:"); 
		   
		   int Registration_NO = SD.nextInt();
		   
		   System.out.println("Enter Student mark:");
		   
		   double Mark = SD.nextDouble();
		   
		   System.out.println("\nYour Roll No:"+roll_no+"\nName:"+Name+"\nRegistration NO:"
			   		+ ""+Registration_NO+"\nYour Mark is :"+Mark); 
		 
		   
		   SD.close(); 
		   if (Mark==80) {
			   System.out.println("Grade = A");
		   }
	}
}

 
