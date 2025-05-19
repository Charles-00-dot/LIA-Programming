import java.util.ArrayList;
import java.util.Scanner;

/**
 *This class acts pretty similar like the activity class.
 *
 * @author (Charles)
 * @version (2025-05-18)
 */
public class PoweredAct extends Activity
{
    private String highIntencity;
    private Equipment equipment;
    private static ArrayList<PoweredAct> powerActs;
    
    public PoweredAct(/*Athlete athlete,*/ double distance, double duration, Mode mode, Equipment equipment) {
        super(/*athlete,*/ distance, duration, mode);
        this.equipment = equipment;
        powerActs = new ArrayList<PoweredAct>();
    }
    
    /**
     * This will allow you to create a Powered Activity.
     */public static void createPoweredAct(){
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
       duration = scanner.nextDouble();
       scanner.nextLine();
       System.out.print("which activity: Bike or RollerBlade");
       mode = null;
       equipment = null;
       switch(scanner.next()){
        case"Bike" :
        mode = Mode.RIDING;
        Equipment.createEquipment();
        break;
        case"RollerSkate":
        mode = Mode.ROLLERBLADING;
        break;
       }
       System.out.print("you have burned this much calories : Type [1] to confirm" 
       );
       switch (scanner.next()){
        case "1":
                calculateBurnedCaloriesByAthlete(mode,distance);
            break;
        }
       PoweredAct powerInfo = new PoweredAct (/*athlete*/ distance,  duration,  mode, equipment);
       powerActs.add(powerInfo);
    
    }
    /**
    * It same with the app class. Calculation of the calories.
    * 
    */public static void calculateBurnedCaloriesByAthlete(Mode mode, double distance) { 
        switch(mode){
            case RIDING:
                System.out.print(distance * 10);
                break;
            case ROLLERBLADING:
                System.out.print(distance * 30);
                break;
        }
    }
    
    /**
     * Gives you acces to your list of Powered Activity.
     */public static void ListOfPowered(){
         for (PoweredAct powerActs : powerActs){
            System.out.println(powerActs);
        }
        
    }
}
