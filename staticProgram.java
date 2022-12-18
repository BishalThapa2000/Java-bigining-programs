public class staticProgram {
    public static void main(String args[]){
        Student Ram= new Student();
        Ram.setName("Ram");
        Ram.setClass(4);
        Ram.schoolnaming("Army Public School");
        
        Ram.getData();

        System.out.println();

        //creating student two without declearing school name
        Student Sita = new Student();
        Sita.setName("Sita");
        Sita.setClass(7);
        
        Sita.getData();
        //Sita will automatically get The Same School Name as Ram, so Ram and Sita are pointing same Static Element.

    }
}
class Student{
String name;
int clas;

static String schoolName;

void setName(String name){
    this.name=name;
}

void setClass(int clas){
    this.clas=clas;
}
void schoolnaming( String schoolName){
    this.schoolName= schoolName;
}

void getData(){
    System.out.println(name);
    System.out.println(clas);
    System.out.println(schoolName);
}


}

