import java.util.*;

public class asciiart {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextLine()) {
            System.out.println("I am not sure how to answer that.");
            return;
        }

        String str=scanner.nextLine();

        if(str.length()<=19){
            System.out.println("I am not sure how to answer that.");
        }
        else{
            str = str.trim().replaceAll(" +", " ");
            if (str.equals("What is problem A about?")) {
                System.out.println("Problem A is about Ascii Art\n" + //
                                    "   _     __   __  _   _\n" + //
                                    "  / \\   / /  / / | | | |\n" + //
                                    " / _ \\  \\ \\ | |  | | | |\n" + //
                                    "/_/ \\_\\ /_/  \\_\\ |_| |_|");
            }
            else if (str.equals("What is problem B about?")) {
                System.out.println("Problem B is about Fortnite\n" + //
                                    "###############\n" + //
                                    "###############\n" + //
                                    "####       /###\n" + //
                                    "####   ########\n" + //
                                    "####       ####\n" + //
                                    "####   ########\n" + //
                                    "####   ########\n" + //
                                    "####   ########\n" + //
                                    "####_~<########\n" + //
                                    "###############");
            }
            else if (str.equals("What is problem C about?")) {
                System.out.println("Problem C is about The Legend of Zelda\n" + //
                                    "     /\\\n" + //
                                    "    /  \\\n" + //
                                    "   /____\\\n" + //
                                    "  /\\    /\\\n" + //
                                    " /  \\  /  \\\n" + //
                                    "/____\\/____\\");
            }
            else{
                System.out.println("I am not sure how to answer that.");
            }
    }

}
}