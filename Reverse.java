import java.util.Scanner;

class Reverse{

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String : ");
        String str = scanner.next(); 
        
//---------------------------------------------------------
    // By adding char next to existing string
        
        // String nstr="";
        // for (int i = 0; i < str.length(); i++) {
        //     char ch = str.charAt(i);
        //     nstr = ch+nstr;
        // }
        // System.out.println("Reverse String : ");
        // System.out.println(nstr);

//------------------------------------------------------------
    // By Reverse iteration
        
        // for (int i = str.length()-1; i >= 0 ; i--) {
        //     System.out.print(str.charAt(i));
        // }

//-------------------------------------------------------------
    // By swapping logic

        char[] arr = str.toCharArray();
        for(int i = 0; i<(arr.length)/2; i++){
            char temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
        System.out.println("Reverse String : ");
        System.out.println(arr);
        scanner.close();
    }

}