public class Division {
    public static double division(double a, double b) {
        try{
            return a / b;
        } catch (Exception e) {
            System.out.println("Not divided to 0!");
        }
        return -1;
    }
}
