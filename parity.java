import java.util.*;

public class parity {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        int num1=0;
        String lastnumber="";
        while (!str.equals("#")) {
            for(int i=0;i<str.length()-1;i++){
                if (str.substring(i, i+1).equals("1")) {
                    num1++;
                }
            }
            //last digit shows e
            if (str.substring(str.length()-1,str.length()).equals("e")) {
                // check if num 1 is even 
                if ((num1%2)==0) {lastnumber="0";}
                else{lastnumber="1";}
            }
            else{
                if ((num1%2)==1) {lastnumber="0";}
                else{lastnumber="1";}
            }
            //num 1 and last digit are correct.
            System.out.println(str.substring(0, str.length()-1)+lastnumber);
            num1=0;
            str=scanner.nextLine();
            lastnumber="";
        }
    }
}
