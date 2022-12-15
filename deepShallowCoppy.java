public class deepShallowCoppy {
    public static void main(String args[]){

        Student bishal = new Student();
        bishal.name="Bishal";
        bishal.rollNum= 39;
        bishal.password="roshniwaslove11";
        bishal.marks[0]=90;
        bishal.marks[1]=80;
        bishal.marks[2]=70;

        Student thapa = new Student(bishal);
        thapa.name="Bishal Thapa";
        bishal.marks[2]=20;

        System.out.println(thapa.name);
        System.out.println(thapa.rollNum);
        System.out.println(thapa.password);
        System.out.println(thapa.marks[0]);
        System.out.println(thapa.marks[1]);
        System.out.println(thapa.marks[2]);
        
    }
}

class Student{
    String name;
    String password;
    int rollNum;
    int marks[];
    
    Student(){
        marks=new int[3];
    }

    //copy
    Student(Student bishal){
        marks=new int[3];
        this.name=bishal.name;
        this.rollNum=bishal.rollNum;
       
        //shallow copy
        this.marks=bishal.marks;

        //un comment below to do deep copy & comment above
        // for(int i=0; i<3; i++){
        //     this.marks[i]=bishal.marks[i];

        // }
    }
   
    //passWord
    Student(String password){
        this.password=password;
    }
    
    //rollNum
    Student(int rollNum){
        this.rollNum=rollNum;
        marks=new int[3];
        
       
    }

   



}