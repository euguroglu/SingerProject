import java.util.Scanner;

public class Main {
    private static Singers singers = new Singers();
    private static Scanner scanner = new Scanner(System.in);

    public static void write_operations() {
        System.out.println("\t 0-Check operations");
        System.out.println("\t 1-Check singers");
        System.out.println("\t 2-Add singers");
        System.out.println("\t 3-Update singers");
        System.out.println("\t 4-Remove singers");
        System.out.println("\t 5-Search singers");
        System.out.println("\t 6-Exit from application");
    }
    public static void check_list(){
        singers.write_singers();
    }
    public static void add(){
        System.out.println("Please enter singer that you want to add: ");
        String name = scanner.nextLine();
        singers.add_singer(name);
    }
    public static void update(){
        System.out.println("Please enter the position that you want to update e.g(1,2,3): ");
        int pos = scanner.nextInt();
        scanner.nextLine();
        String new_name = scanner.nextLine();
        singers.update_singer(new_name,pos-1);
    }
    public static void delete(){
        System.out.println("Please enter the position that you want to delete e.g(1,2,3): ");
        int pos = scanner.nextInt();
        singers.remove_singer(pos-1);
    }
    public static void search(){
        System.out.println("Please enter the name you want to find: ");
        String name = scanner.nextLine();
        singers.search_singer(name);
    }
    public static void main(String[] args){
        System.out.println("\t Welcome to singer application");

        write_operations();

        boolean exit = false;
        int operation;

        while(!exit) {
            System.out.println("Choose your operation");
            operation = scanner.nextInt();
            scanner.nextLine();

            switch(operation) {
                case 0:
                    write_operations();
                    break;
                case 1:
                    check_list();
                    break;
                case 2:
                    add();
                    break;
                case 3:
                    update();
                    break;
                case 4:
                    delete();
                    break;
                case 5:
                    search();
                    break;
                case 6:
                    exit = true;
                    System.out.println("Exiting...");
                    break;
            }
        }
    }
}
