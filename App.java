import java.util.ArrayList;

/**
 * Write a description of class App here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class App
{
    private ArrayList<Athlete> athletes;
    private ArrayList<Activities> activities;
    private ArrayList<Equipment> equipment;
    private int steps = 0;
    public App(){
        athletes = new ArrayList<Athlete>();
        activities = new ArrayList<Activities>();
        equipment = new ArrayList<Equipment>();
    }
    
    public int countedSteps (){
        int i = 0;
        return i;
        
    }
    
    
    public void numberOfUser(){
        
    }
     
    public void createAthlete(String name, int age, Gender gender) {
        Athlete athlete = new Athlete(name, age, gender);
        athletes.add(athlete);
    }
     
    public void listAthletes() {
        for (Athlete athlete : athletes) {
            System.out.println(athlete.getName());
        }
    }
    
    public void createEquipment(String name) {
        //Gotta figure out the method
    }
    
    public void createActivity(Athlete athlete, double distance, double duration, Days day, Equipment equip) { //+mode
        //Gotta figure out the method
    }
    
    public void listActivities() {
        //Gotta figure out the method
    }
    
    public void listActivitiesByAthlete(Athlete athlete) {
        //Gotta figure out the method
    }
    
    public void listActivitiesByMode() { //mode parameter
        //Gotta figure out the method
    }
    
    public void calculateDistanceByAthlete(Athlete athlete) { //double
        // return athlete.getTotalDistance(); (since i put void in the getTotalDistance method, it doesn't work)
    }
    
    public void calculateBurnedCaloriesByAthlete(Athlete athlete) { //double
        // return athlete.getTotalBurnedCalories(); (since i put void in the getTotalBurnedCalories method, it doesn't work)
    }
    
    public ArrayList<Athlete> getAthletes() {
        return athletes;
    }
    
    public ArrayList<Equipment> getEquipmentList() {
        return equipment;
    }
}
