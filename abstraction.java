public class abstraction {
    public static void main(String args[]){
        // Dog tommy = new Dog();
        // tommy.walks();
        // tommy.eats();

        Begal ronny = new Begal();
        ronny.eats();
        ronny.changeColor();
        ronny.walks();
    }
}
abstract class Animal{

    public String animalColor;
    Animal(){
        System.out.println("Animal Constructor was called.");
        animalColor="Brown";
    }
    void eats(){
        System.out.println("Eats Any Thing...");
    }
    abstract void walks();
}

class Dog extends Animal{
    void changeColor(){

        animalColor= "Blue";
    }    
    void walks(){
        System.out.println("Color of this animal is :"+ animalColor);
        System.out.println("Walks in the Park");
    }
}
class Begal extends Animal{
    void changeColor(){
        
        animalColor= "Blue";
    }   
    
    void walks(){
        System.out.println("Color of this animal is :"+ animalColor);
        System.out.println("Begal walks inside the Home.");
    }

}
