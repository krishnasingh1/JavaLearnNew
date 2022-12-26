package DicisionMakingControlStatement.Loops.FoeEachLoop;

public class ForEachLoop {
    public static void main(String[] args) {

        // TODO Auto-generated method
        String [] names = {"Java", "C", "C++", "Python", "JavaScript"};
        System.out.println("Printing the content of the array names :\n");
        for (String name : names){
            System.out.println(name);
        }
    }
}

/*
        Java for-each loop --> Java provides an enhanced for loop to traverse the data structures like array or collection. In the
                               for-each loop, we don't need to update the loop variable. The syntax to use the for-each loop in java
                               is given below.

                               for(data_type var : array_name/collection_name){
                               //statements
                               }for(data_type var : array_name/collection_name){
                               //statements
                               }
 */
