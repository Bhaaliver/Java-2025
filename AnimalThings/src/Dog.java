public class Dog extends Animal{
    private String breed;
    private String color;

    public Dog(String name, int age, float price, String breed, String color){
        super(name, age, price);
        this.breed = breed;
        this.color = color;
    }

    public String getBreed(){
        return this.breed;
    }

    public String getColor(){
        return this.color;
    }

    public void sayName(){
        System.out.println("this dog's name is " + this.getName());
    }
}