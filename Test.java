
class InvalidAgeException extends Exception{

    public InvalidAgeException(String str){
        super(str);
    }
}

public class Test {

    public static void validate(int age) throws InvalidAgeException{

        if (age<18) {
            throw new InvalidAgeException("Age is not valid to VOTE");
        }else{
            System.out.println("Welcome to Vote");
        }
    }

    public static void main(String[] args) {
        
        try {
            validate(15);
        } catch (InvalidAgeException e) {
            System.out.println("Caught Exception : ");
            System.out.println(e);
        }
    }
    
}