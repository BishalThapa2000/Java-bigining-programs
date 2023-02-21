import java.util.ArrayList;
public class arrayListSyntax {
    public static void main(String args[]){

        //Araylist
        /* why we use ArrayList
         * 1. it has dynamic memory (no fixed size)
         * 2. works same as vector in c++
         * 3. we can only use non-primetive data types with ArrayList
         */

         ArrayList <Integer> list = new ArrayList<>();

         /*basic operation of ArrayList 
          * # Add Element ---> 0(1)
            # Get Element ---> 0(1)
            # Remove Element ---> 0(n)
            # Set Element at Index ---> 0(n)
            # Contains Element --->0(n)
         */


         //     @Add 
         list.add(1);
         list.add(2);
         list.add(3);
         list.add(4);
        //  list.add(2,10);
        //  System.out.println(list);



        //      @get element from a particular 
        //int element = list.get(3);
        //System.out.println(element);




        //      @Remove 
        // list.remove(2);

        // System.out.print(list);




        //      @set 
        // list.set(2,10);
        // System.out.println(list);


        // //      @contains
        // System.out.println(list.contains(1));
        // System.out.println(list.contains(11));


        //Size of the ArrayList ?

        // System.out.print(list.size());


        //using loop with Array List
            for(int i=0; i< list.size(); i++){
                System.out.print(list.get(i)+" \n");
            }
            
            //revenrce loop
            for(int i= list.size()-1; i>=0; i--){
                
                System.out.print(list.get(i)+" \n");
            }

    }
}
