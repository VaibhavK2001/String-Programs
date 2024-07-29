public class FunctionalInterface {
    
    interface myInter {
        String Ola(String a, String b);  
        
    }
    public static void main(String[] args) {
        myInter obj = (a,b) -> {System.out.println("Cab is booked from "+a+" to "+b);
        return "Price is 5000";};

        System.out.println(obj.Ola("Mumbai", "Pune"));
    }
}
