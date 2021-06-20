import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter one/two/three/null");
        String type = sc.next();
        try{
            throwErrors(type);
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("Finally is exceuted");
        }
    }
    public static void throwErrors(String type) throws Exception{
        if(type.equals("one"))
            throw new Error1(type);
        if(type.equals("two"))
            throw new Error2(type);
        if(type.equals("three"))
            throw new Error3(type);
        if(type.equals("null"))
            throw new NullPointerException(type);
    }
}
