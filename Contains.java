import java.util.ArrayList;
import java.util.Scanner;

public class Contains {
    
    static ArrayList<Character> charlist = new ArrayList<>();

    public static boolean isPresent(Character ch){
        if (charlist.contains(ch)) {
            return true;
        }else{
            charlist.add(ch);
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String 1 : ");
        String s1 = scanner.nextLine();
        System.out.println("Enter String 2 : ");
        String s2 = scanner.nextLine();
        
        boolean flag = false;
        boolean b = false;
        if (s1.length() == s2.length()) {
            for (int i = 0; i < s1.length(); i++) {
                int j = 0;
                    if (isPresent(s2.charAt(i))) {
                        flag = true;
                        break;
                    }
                    boolean b1 = true;
                    while (j<s2.length()) {
                        if (s1.charAt(i)==s2.charAt(j)) {
                            b1 = false;
                            break;
                        }
                        j++;
                    }
                    if(b1){
                        b = true;
                        break;
                    }
                }

                if (flag || b) {
                    System.out.println("String 1 is NOT Anagram to String 2");
                }else{
                System.out.println("String 1 is Anagram to String 2");
            }
            }else{
                System.out.println("String 1 is NOT Anagram to String 2");
            }
        scanner.close();
    }
}
