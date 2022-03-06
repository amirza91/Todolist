import java.util.ArrayList;

public class Todoitems {
    ArrayList<String> array;

    public Todoitems(){
        array = new ArrayList<String>();
    }
    public void add(String add){
        array.add(add);
    }
    public void delete (int delete){

            if(delete > array.size() ){
                System.out.println("That reminder does not exist");
            }
            else{
                array.remove(delete - 1);
            }
    }

    public void all(){
        int counter = 1;
        for(String list: array){
            System.out.println(counter++ +" " + list);

        }
    }




}
