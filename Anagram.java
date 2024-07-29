import java.util.Scanner;

public class Anagram {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String 1 : ");
        String str1  = scanner.nextLine();
        System.out.println("Enter String 2 : ");
        String str2  = scanner.nextLine();
        boolean flag2 = true;
        for(int i =  0; i<str1.length(); i++){
            boolean flag = false;
            for (int j = 0; j < str2.length(); j++) {
                if (str1.charAt(i) == str2.charAt(j) ) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                System.out.println(str1+" is NOT Anagram to "+str2);
                flag2 = false;
                break;
            }
        }
        if (flag2) {
            System.out.println(str1+" is Anagram to "+str2);
        }

        
        scanner.close();

    }
}
