public class interfaces {
    public static void main(String args[]){
         
        // Dog tommy= new Dog();
        // tommy.eats();
        // tommy.walks();

        Ramesh ramesh= new Ramesh();
        ramesh.beautifulEyes();
        ramesh.qualityHairs();
    }
}

// interface for miltipal inheritance

//mother
interface Sita{
    void beautifulEyes();
}

//father
interface Lakashay{
    void qualityHairs();
}

//son taking both above parents property.
class Ramesh implements Lakashay, Sita{
    public void beautifulEyes(){
        System.out.println("Ramesh got Eyes from his Mother");
    }
    public void qualityHairs(){
        System.out.println("Ramesh got his good hairs from his Father");
    }

}




//interfaces for Total Abstraction 
interface Animal{
    void walks();
}

//implementing interface in classes

class Dog implements Animal{
    void eats(){
        System.out.println("They eat Dog Food for sure.");
    }
    public void walks(){
        System.out.println("Walks on Four Legs.");
    }
}
