import java.util.*;
public class task1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int c=1;
        while(c>0){
            System.out.println("Enter two Integers:");
            int a=sc.nextInt();
            int b=sc.nextInt();
            System.out.println("Here are your Options:");
            System.out.println("Option-1:ADDITION(+)\nOption-2:SUBTRACTION(-)\nOption-3:MULTIPLICATION(*)\nOption-4:DIVISION(/)\nOption-5:REMAINDER(%)\nOption-6:QUIT");
            System.out.println("Enter Integer in the range(1-6) for optio selection");
            int option=sc.nextInt();
            if(option<1||option>6){
                System.out.println("Invalid Option");
                break;
            }
            if(option==1){
                System.out.println("Result is:"+String.valueOf((a+b)));
            }
            else if(option==2){
                System.out.println("Result is:"+String.valueOf((a-b)));
            }
            else if(option==3){
                System.out.println("Result is:"+String.valueOf((a*b)));
            }
            else if(option==4){
                System.out.println("Result is:"+String.valueOf((a/b)));
            }
            else if(option==5){
                System.out.println("Result is:"+String.valueOf((a%b)));
            }
            else{
                System.out.println("Quiting...");
                break;
            }
        }
    }
}
