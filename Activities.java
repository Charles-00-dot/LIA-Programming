import java.util.ArrayList;

/**
 * Write a description of class Activities here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Activities extends App
{
    private Athlete athlete;
    // private Mode mode
    private double distance = 0;
    private double duration;
    private Days day;
    private Equipment equipment; //(can be null)
    
    public Activities(Athlete athlete, double distance, double duration, Days day, Equipment equipment){ //+ Mode mode in the parameters
        this.athlete = athlete;
        this.distance = distance;
        this.duration = duration;
        this.day = day;
        this.equipment = equipment;
        // this.mode = mode
    }
    
    public void regularActivities(){
        ArrayList<String> normalAct = new ArrayList<String>();
        normalAct.add("Swim");
        normalAct.add("Walk");
        normalAct.add("Hike");
        //Added by Aadam
        normalAct.add("Jogging");
    }
    
    public void poweredActivities(){
        ArrayList<String> intensity = new ArrayList<String>();
        intensity.add("Bike");
        intensity.add("Run");
        intensity.add("Rollerblade");
        //Added by Aadam
        intensity.add("Ball Sport");
    }
    
    public double getDistance() {
        return distance;
    }

    public double getDuration() {
        return duration;
    }

    public Days getDay() {
        return day;
    }

    public Equipment getEquipment() {
        return equipment;
    }
    
    public void getCaloriesBurned(){ //not void but double, gotta figure out the code
        // If we have to take into consideration the fact that an equipment got used and the nature of the activity to know exactly the calories burned, we should use an if statement
    }
    
    public void getSummary() { //String, not void
        System.out.println("something that summarizes");
        // return something
    }
}
