import java.util.*;
public class Lecture4_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("What is your speed:");
        int speed = sc.nextInt();
        System.out.println("Is it your birthday :");
        boolean birthday=sc.nextBoolean();
        if(birthday==true){
            if(speed>85){
                System.out.println("High Rate Ticket");
            }else if(speed>65 && speed<85){
                System.out.println("Medium Rate Ticket");
            }else if(speed<65){
                System.out.println("No Ticket");
            }
        }else{
            if(speed>80){
                System.out.println("High Rate Ticket");
            }else if(speed>60 && speed<80){
                System.out.println("Medium Rate Ticket");
            }else if(speed<60){
                System.out.println("No Ticket");
            }
        }

    }
}
