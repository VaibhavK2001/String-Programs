import java.util.Scanner;

public class ASCIIvalue {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String : ");
        String str  = scanner.nextLine();

        for (int i = 0; i < str.length(); i++) {
            int value = str.charAt(i);
            System.out.println(str.charAt(i)+"="+value);
        }

        scanner.close();
    }
}
