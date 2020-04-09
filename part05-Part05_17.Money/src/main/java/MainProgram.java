
public class MainProgram {

    public static void main(String[] args) {
        // test your class here
        
        Money a = new Money(10, 0);
        Money b = new Money(-3, 1);
        
        System.out.println(a.lessThan(b));
    }
}
