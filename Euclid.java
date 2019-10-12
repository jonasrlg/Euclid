public class Euclid {
  public static int gdc (int a, int b) {
    if (b == 0) return a;
    return gdc(b, a % b);
  }
  public static void main (String[] args) {
    int a = Integer.parseInt(args[0]);int b = Integer.parseInt(args[1]);
    System.out.println("The greatest common divisor is: " + gdc(a,b));
  }
}
