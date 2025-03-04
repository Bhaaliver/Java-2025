public class Main {
    public static void main(String[] args) {
        System.out.println("you are " + fibinachi(0, 0, 17) + " pounds");
    }

    public static int fibinachi(int last, int current, int amountleft){
        int newcurrent = last + current;
        if(amountleft == 0){
            return newcurrent;
        }
        return fibinachi(current, newcurrent, amountleft - 1);

    }
}