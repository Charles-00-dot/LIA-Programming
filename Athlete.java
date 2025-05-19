import java.util.ArrayList;
/**
 * The details of an athlete can be found here.
 *
 * @author (Charles)
 * @version (2025-05-18)
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
    
    public void getTotalDistance(){ 
      
    }
    
    public void getTotalBurnedCalories() {
        
    }
    
    //Added by Aadam
    public void printSummary() {
    }
}


