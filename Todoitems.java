import java.util.ArrayList;
//creating a class to make functionality for the main method. Making the array list to put all the
// items in their.

public class Todoitems {
    ArrayList<String> array;

    public Todoitems(){
        array = new ArrayList<String>();
    }
    public void add(String add){
        array.add(add);
    } // created an add functionality to add items to the array
    public void delete (int delete){  // created a delete functionality to delete items in the array

            if(delete > array.size() ){
                System.out.println("That reminder does not exist");
            }
            else{
                array.remove(delete - 1);
            }
    }

    public void all(){  //created a functionality to show all the items in the array
        int counter = 1;
        for(String list: array){
            System.out.println(counter++ +" " + list);

        }
    }




}
