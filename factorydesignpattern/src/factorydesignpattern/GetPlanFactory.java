package factorydesignpattern;

public class GetPlanFactory {
	
	 public Plan getPlan(String plan){  
         if(plan == null){  
          return null;  
         }  
       if(plan.equalsIgnoreCase("DomesticPlan")) {  
              return new DomesticPlan();  
            }   
        else if(plan.equalsIgnoreCase("CommercialPlan")){  
             return new CommercialPlan();  
         }   
       else if(plan.equalsIgnoreCase("InstitutionalPlan")) {  
             return new InstitutionalPlan();  
       } else{
    	   System.out.println("invalid input");
       }
   return null;  
}  

}
