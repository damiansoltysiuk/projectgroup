public class Division {
    private double a;
    private double b;

    public Division(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double division() {
        double div = -1;
        try {
            div = this.a / this.b;
        } catch (IllegalArgumentException e) {
            System.out.println("Not try divided by 0!" + e);
        }
        return div;
    }
}
