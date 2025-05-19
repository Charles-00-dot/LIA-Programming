import java.util.*; 
import java.util.Scanner;

/**
 *This is where you can find the mechanics for the creation of an equipment.
 *
 * @author (Charles)
 * @version (2025-05-18)
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
    System.out.print("Did you use a bike: (1)Yes");
    switch(scanner.next()){
    case"Yes" :
        mode = Mode.RIDING;
    break;
    }
    
    System.out.print("What Type of Bike are you riding: Ebike(1), MountainBike(2), or NormalBike(3)");
    
    switch(scanner.next()){
        case "1":
            System.out.print("Your choose the Ebike"
            );
            break;
        case "2":
            System.out.print("Your choose the MountainBike"
            );
            break;
        case "3":
            System.out.print("Your choose the NormalBike"
            );
            break;
    }
    
    System.out.print("What color do you want: Red(1) or Blue(2)"
    );
    
    switch(scanner.next()){
        case "1":
            System.out.print("You are riding a Red one");
            break;
        case "2":
            System.out.print("You are riding a Blue one");
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


