import java.util.*; 
import java.util.Scanner;

/**
 * Write a description of class Equipment here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Equipment 

{
    private String name;
    private Mode mode;

    public Equipment(String name, Mode mode) {
        this.name = name;
        this.mode = mode;
    }
    
    public static void createEquipment(){
    String name;
    Mode mode;
    Scanner scanner = new Scanner(System.in);
    System.out.print("Do you usa a bike");
    switch(scanner.next()){
    case"Yes" :
        mode = Mode.RIDING;
    break;
    }
}
    

    public String getName() {
        return name;
    }

    public Mode getMode() {
        return mode;
    }

    public String toString() {
        return name + " (" + mode + ")";
    }
    //changed it so it can accept both a name and a mode (help us for app class)
}


