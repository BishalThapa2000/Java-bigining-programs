public class polymorphysam {
    public static void main(String args[]){

        // Calc add= new Calc();
        
        //Over loading
        // System.out.print(add.addition(2,3,5));

        //overriding
        Dog1 tommy = new Dog1();
        tommy.eats();

    }
}

class Animal1{
    void eats(){
        System.out.println("Eats AnyThing...");
    }
}

class Dog1 extends Animal1{
    void eats(){
        System.out.println("Eats Dog Food...");
    }
}







class Calc{
   
    
    int addition(int a, int b){
        return a+b;
    }
    float addition(float a, float b){
        return a+b;
    }
    int addition(int a, int b, int c){
        return a+b+c;
    }
    
}
