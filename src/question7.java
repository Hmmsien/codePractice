//Evaluate a to the power of b,
//assuming both a and b are integers and b is non-negative.

public class question7 {
    public static int power(int a, int b) {
        if((a == 0 && b == 0) || (b == 0)) {
            return 1;
        }
        else if(a == 0) {
            return 0;
        }
        else
            return (int) Math.pow(a, b);
    }

    public static void main(String[] args) {
        System.out.println(power(2,0));
        System.out.println(power(2,3));
        System.out.println(power(0,10));
        System.out.println(power(-2,5));
        System.out.println(power(0,0));
    }
}
