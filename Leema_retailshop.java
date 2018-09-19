/*
 Assumption "Employee id starts with "1"", Affiliate id starts with "2""
 all other user id will never start with a number.

 */
package leema_retailshop;
import java.util.Scanner;
/**
 *
 * @author leemamadhunair
 */
public class Leema_retailshop {

    /**
     * @param args the command line arguments
     */
    public static class Bill{
        String userid;
        float grocery_amount;
        float nongrocery_amount;
        int memberduration;
        
        void insertBill(String id, float gro_amt, float nongro_amt, int mem_dur){
            userid =id;
            grocery_amount= gro_amt;
            nongrocery_amount = nongro_amt;
            memberduration = mem_dur;
        }
        float grandTotalCalculation(){
            float total;
            float grandtotal;
            int n_amount;
            if(userid.startsWith("1")){
                total = (float) (nongrocery_amount -(nongrocery_amount*0.3));
                grandtotal = total+grocery_amount;    
            }
            else if(userid.startsWith("2")){
                total = (float) (nongrocery_amount -(nongrocery_amount*0.1));
                grandtotal = total+grocery_amount; 
            
            }
            else {
                if(memberduration>2){
                    total = (float) (nongrocery_amount -(nongrocery_amount*0.05));
                    grandtotal = total+grocery_amount; 
                } 
                else{
                    n_amount = (int) (nongrocery_amount/100);
                    if(n_amount == 0){
                       total = nongrocery_amount;
                       grandtotal = total+grocery_amount;                        
                    }
                    else{
                        total = (nongrocery_amount- (n_amount*5));
                        grandtotal = total+grocery_amount; 
                    }
                    
                }
            
            
            } 
            return grandtotal;
        }
                
        }
//    public static class GrandTotalCalculation{
//        
//    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        String user;
        float g_amount;
        float nong_amount;
        int memb_duration;
        float grand_total;
        System.out.println("Enter your user id:");
        user = input.nextLine();
        System.out.println("Enter your grocery amount:");
        g_amount = input.nextInt();
        System.out.println("Enter your non_grocery amount:");
        nong_amount = input.nextInt();
        System.out.println("Enter the duration of membership:");
        memb_duration = input.nextInt();
        
        Bill B = new Bill();
        B.insertBill(user,g_amount,nong_amount,memb_duration);
        grand_total = B.grandTotalCalculation();
        System.out.println("Grand Total after discount:"+grand_total);
    }
    
}
