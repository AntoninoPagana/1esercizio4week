public class Main {
    public static void main(String[] args) {
        System.out.println(controlloRange(9,2,8));
    }
    public static boolean controlloRange(int valore, int limMin, int limMax) {
        if(valore >= limMin && valore <= limMax) {
            return true;
        } else{
            throw new ArithmeticException();
        }
    }
}
