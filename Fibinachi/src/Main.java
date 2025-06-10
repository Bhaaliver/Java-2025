public class Main {
    public static void main(String[] args) {
        System.out.println(fibinachi(1, 1, 17));
    }

    public static int fibinachi(int last, int current, int amountleft){
        int newcurrent = last + current;
        if(amountleft == 0){
            return newcurrent;
        }
        return fibinachi(current, newcurrent, amountleft - 1);

    }
}