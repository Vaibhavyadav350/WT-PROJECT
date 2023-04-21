class MyException extends Exception {
    public MyException(String s)
    {
        
        super(s);
    }
}
 

public class UserDefined {
    // Driver Program
    public static void main(String args[])
    {
        try {
           
            throw new MyException("hoho");
        }
        catch (MyException ex) {
            System.out.println("Caught");
 
            
            System.out.println(ex.getMessage());
        }
    }
}