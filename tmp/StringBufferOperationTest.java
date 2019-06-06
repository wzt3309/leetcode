import java.util.*;

public class StringBufferOperationTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer source = new StringBuffer(sc.nextLine());
        
        System.out.printf("Delete 0, length - 1: %s %s\n",  source.delete(0, source.length() - 1), source);
        source.delete(0, source.length());
        System.out.printf("Delete 0, length: %s %s\n", false, "".contentEquals(source));
    }

}
