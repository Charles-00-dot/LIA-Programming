import java.util.ArrayList;
/**
 * Write a description of class Athlete here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Athlete 
{
    private String name;
    private int age;
    private Gender gender;
    private ArrayList<Activity> activities;
    
    public Athlete(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        activities = new ArrayList<Activity>();
    }
    
    public void addActivity(Activity activity) {
        activities.add(activity);
    }
    
    public String getName() {
        return name;
    }
    
    public ArrayList<Activity> getActivities() {
        return activities;
    }
    
    // Still not sure about this
    public void getTotalDistance(){ // not void but double, but I have to write this for now until we figure out the method
      //still gotta figure out the method implementation (Loop)
    }
    
    public void getTotalBurnedCalories() {// not void but double, but I have to write this for now until we figure out the method
        //still gotta figure out the method implementation (Loop)
    }
    
    //Added by Aadam
    public void printSummary() {
    }
}


