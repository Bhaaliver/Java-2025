class main{
    public static void main(String[] args){
        int a = 1;
        int b = 0;
        int iterations = 0;
        while(a != b){
            a = (int)(Math.random()*1000000);
            b = (int)(Math.random()*1000000);
            System.out.println("a: " + a + " b: " + b + " iterations: " + iterations);
            iterations++;
        }
    }
}