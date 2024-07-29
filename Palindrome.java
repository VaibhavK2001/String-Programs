import java.util.Scanner;

public class Palindrome {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String : ");
        String str = scanner.nextLine();
        String nstr = "";

        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            nstr = ch+nstr;
        }
        if (nstr.equals(str)) {
            System.out.println("String is Palindrome String");
        }
        else{
            System.out.println("String is NOT Palindrome");
        }

        scanner.close();
    }
}
