import java.util.ArrayList;

public class Singers {
    private ArrayList<String> singer_list = new ArrayList<String>();

    public void write_singers() {
        System.out.println("Singer list contains " + singer_list.size() + " many singers" );

        for (int i = 0; i < singer_list.size(); i++){
            System.out.println((i+1) +"th singer :" + singer_list.get(i));
        }
    }
    public void add_singer(String name){
        singer_list.add(name);

        System.out.println("Singer list updated");
    }
    public void update_singer(String new_name, int position){
        singer_list.set(position,new_name);

        System.out.println("Singer name updated");
    }
    public void remove_singer(int position){
        String name = singer_list.get(position);

        singer_list.remove(position);

        System.out.println("Singer " + name +" has been deleted from the list");
    }
    public void search_singer(String name){

        int position = singer_list.indexOf(name);

        if (position >= 0){
            System.out.println("Singer found");
            System.out.println(name + " 's position is " + (position+1));
        }
        else {
            System.out.println("Singer is not on the list");
        }
    }
}
