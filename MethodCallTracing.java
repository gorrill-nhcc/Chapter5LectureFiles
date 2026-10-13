public class MethodCallTracing {
    public static void main(String[] args) {
        int result = methodA(5);
        System.out.println("main returning " + result);
    }

    public static int methodA(int x) {
        System.out.println("methodA called with x = " + x);
        int result = methodB(x + 1);
        System.out.println("methodA returning " + result);
        return result;
    }

    public static int methodB(int y) {
        System.out.println("methodB called with y = " + y);
        int result = methodC(y + 1);
        System.out.println("methodB returning " + result);
        return result;
    }

    public static int methodC(int z) {
        System.out.println("methodC called with z = " + z);
        int result = z * 2;
        System.out.println("methodC returning " + result);
        return result;
    }
    
}
