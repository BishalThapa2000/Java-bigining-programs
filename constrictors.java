
public class constrictors {
    public static void main(String args[]){
        //std1 initialised
        Student std1= new Student("Bishal", "roshniwaslove11", 07);
            
        
            std1.marks[0]=100;
            std1.marks[1]=80;
            std1.marks[2]=20;
        
        
        
        
        Student std2= new Student(std1);
        std2.Password= "lovingmyself";
        std1.marks[2]= 50;
       
        
        System.out.println(std2.name);
        System.out.println(std2.Password);
        System.out.println(std2.roll );
        for(int i=0; i<3; i++){
            System.out.println(std1.marks[i]);
        }
    }
}
class Student{
    String name;
    String Password;
    int roll;
    int marks[];
    Student(Student std1){
        int marks[]=new int[3];
        this.name= std1.name;
        this.roll= std1.roll;
        
            this.marks=std1.marks;
        }
      
    
    Student(String name, String Password, int roll){
        this.name= name;
        this.Password= Password;
        this.roll= roll;
        
        int marks[]=new int[3];

        for(int i=0; i<marks.length; i++){
            this.marks[i]=marks[i];
        }   
    }
}
