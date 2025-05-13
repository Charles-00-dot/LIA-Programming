import java.util.ArrayList;
import java.util.Scanner;

/**
 * Write a description of class PoweredAct here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PoweredAct extends Activity
{
    private String highIntencity;
    private Equipment equipment;
    public PoweredAct(Athlete athlete, double distance, double duration, Mode mode, Equipment equipment) {
        super(athlete, distance, duration, mode);
        this.equipment = equipment;
        
    }
    
    public static void createPoweredAct(){
        double distance;
        double duration;
        double caloriesBurned;
        Mode mode;
        Equipment equipment;
        
        Scanner scanner = new Scanner(System.in);
    System.out.print("distance traveled: ");
    distance = scanner.nextDouble();
    scanner.nextLine();
    System.out.print("Time traveled: ");
    distance = scanner.nextDouble();
    scanner.nextLine();
    System.out.print("which activity: Bike or RollerBlade");
    switch(scanner.next()){
        case"Bike" :
        Equipment.createEquipment();
        break;
        case"RollerSkate":
        mode = Mode.ROLLERBLADING;
        break;
    }
    }
}
