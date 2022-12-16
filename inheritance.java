public class inheritance {
    public static void main(String args[]){
        //single level Inhiritance
        // Dog tommy = new Dog();
        // tommy.eats();
        // tommy.sleeps();
        // tommy.barks();

        //multi level Inheritance
        // Breed dog= new Breed();
        // dog.eats();
        // dog.pug();
        // dog.sleeps();
        // dog.barks();


    }
}
//base
class Animal{
    void sleeps(){
        System.out.println("Sleeps");
    }
    void eats(){
        System.out.println("Eats");
    }
}
//fish
class Fish extends Animal{
    void swim(){
        System.out.println("Swim");
    }
}
//bird
class Bird extends Animal{
    void flys(){
        System.out.println("Fly");
    }
}
//mammal
class Mammal extends Animal{
    void fourChambered(){
        System.out.println("Four Chambered heart");
    }
}

//fish sub class
class Tuna extends Fish{
    void bites(){
        System.out.println("Bites");
    }
}
class Shart extends Fish{
    void Hunts(){
        System.out.println("Hunts");
    }
}

// Mammal sub class
class Dog extends Mammal{
    void Barks(){
        System.out.println("Barks");
    }
}
class Cat extends Mammal{
    void Moow(){
        System.out.println("Mow");
    }
}
class Humans extends Animal{
    void swim(){
        System.out.println("Speaks");
    }
}

//bird sub class
class Picock extends Bird{
    void Dances(){
        System.out.println("Dances");
    }
}




// class Breed extends Dog{
//     void pug(){
//         System.out.println("pug");
//     }
// }
