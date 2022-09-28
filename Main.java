public class Main {
    public static void main(String[] args) {
        boolean a = returnFalse() && returnTrue();
        System.out.println("=====");
        boolean b = returnFalse() & returnTrue();
    }

    public static boolean returnFalse() {
        System.out.println("false");
        return false;
    }

    public static boolean returnTrue() {
        System.out.println("true");
        return true;
    }
}
