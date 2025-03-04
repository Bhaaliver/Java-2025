public class Animal{
    private String name;
    private int age;
    private float price;

    public Animal(String name, int age, float price){
        this.name = name;
        this.age = age;
        this.price = price;
    }
    public Animal(String name){
        this.name = name;
        this.age = -64;
        this.price = 200;
    }

    public String getName(){
        return this.name;
    }

    public void sayName(){
        System.out.println("this animal's name is " + this.name);
    }

    public void sayPriceOptions(){
        float MonthlyPrice = (float) (this.price * 1.2 / 12);

        System.out.println("The monthly price for " + this.name + " is " + MonthlyPrice + " and the payment in full is " + this.price);
    }

    public int getAge(){
        return this.age;
    }
}