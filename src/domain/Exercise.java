package domain;
import java.util.ArrayList;




public  class Exercise {
   public  static int Calculate (){
        int maxValue = 999999;
         ArrayList<Integer> happyTickets = new ArrayList<>();
         
         foo(maxValue,  happyTickets);
      
         int quontity  = happyTickets.size();
   return quontity;
   }
    
  
    
    
    
    /**
     * якщо сума цифр рівна - білет щасливий;
     * @param maxValue  - максимальне значення квитку 
     */
    
    public static void foo (int maxValue, ArrayList<Integer> happyTickets){
         
        for(int i = 1; i<maxValue; i++){
                if(i%10 + i%100 + i%100 == i%1000+i%10000+i%100000){
                
                    happyTickets.add(i);
                
                }
        
        }     
    
    }
    
   
    



}
