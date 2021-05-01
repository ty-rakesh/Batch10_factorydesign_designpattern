package factorydesignpattern;

import java.util.Scanner;

public class GenerateBill {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		GetPlanFactory getPlanFactory=new GetPlanFactory();
		System.out.println("Enter the name of the plan : ");
		String PlanName=sc.nextLine();
		System.out.println("enter the number of units to generate bill :");
	    int units=Integer.parseInt(sc.nextLine());	
	    Plan plan=getPlanFactory.getPlan(PlanName);
	    System.out.print("Bill amount for "+PlanName+" of  "+units+" units is: ");  
        plan.getRate();  
        plan.calculateBill(units);  
	    

	}

}
