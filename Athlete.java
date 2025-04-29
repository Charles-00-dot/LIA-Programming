import java.util.ArrayList;

/**
 * Write a description of class Athlete here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Athlete extends App
{
    private String name;
    private int age;
    private Gender gender;
    private ArrayList<Activities> activities;
    
    public Athlete(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        activities = new ArrayList<Activities>();
    }
    
    public void addActivity(Activities activity) {
        activities.add(activity);
    }
    
    public String getName() {
        return name;
    }
    
    public ArrayList<Activities> getActivities() {
        return activities;
    }
}

