import java.util.*;
public class Lecture4_3 {
    public static void main(String[] args) {
        System.out.print("How long is your burp:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String msg="";
        for(int i=1;i<=n;i++){
            msg=msg+"r";
        }
        System.out.print("Bu"+msg+"p");

    }
}
