import java.util.Scanner;
public class WifiDiagnosis
{
    
	public static void main(String[] args) 
	{
	    Scanner scan = new Scanner(System.in);

	//header	
		System.out.println("If you have a problem with internet connectivity, this WiFi Diagnosis might work.\n");
	
	//step 1
	    System.out.println("First step: reboot your computer");
	    System.out.print("Are you able to connect with the internet? (yes or no)\n");
	    String choice = scan.nextLine();
	        if (choice.equals("yes"))
	            {
	               System.out.println("Rebooting your computer seemed to work");
	               return;
	            } else {
	                //step 2
	                System.out.println("Second step: reboot your router");
	                System.out.println("Now are you able to connect with the internet? (yes or no)");
	                String choice2 = scan.nextLine();
	                    if (choice2.equals("yes"))
	                        {
	                            System.out.println("Rebooting your router seemed to work");
	                            return;
	                        } else {
	                            //step 3
	                            System.out.println("Third step: make sure the cables to your router are plugged in firmly and your router is getting power");
	                            System.out.println("Now are you able to connect with the internet? (yes or no)");
	                            String choice3 = scan.nextLine();
	                                if (choice3.equals("yes"))
	                                    {
	                                        System.out.println("Checking the router's cables seemed to work");
	                                        return;
	                                    } else {
	                                        //step 4
	                                        System.out.println("Fourth step: move your computer closer to your router");
	                                        System.out.println("Now are you able to connect with the internet? (yes or no)");
	                                        String choice4 = scan.nextLine();
	                                            if (choice4.equals("yes"))
	                                                {
	                                                    System.out.println("Moving your computer closer to the router seemed to work");
	                                                    return;
	                                                } else {
	                                                    //step 5
	                                                    System.out.println("Fifth step: contact your ISP");
	                                                    System.out.println("Make sure your ISP is hooked up to your router.");
	                                                }
	                                    }
	                    }   
	            }
	            
    }
}
