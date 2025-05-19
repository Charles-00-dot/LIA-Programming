import java.util.ArrayList;

/**
 * This class is mostly for the creation of an acitvity.
 *
 * @author (Charles)
 * @version (2025-05-18)
 */
public class Activity 
{
private Athlete athlete;
private PoweredAct powereAct;
private double distance;
private double duration;
private double caloriesBurned;
    
private Mode mode;
private Equipment equipment; 
    
    
/*
     * 
     * 
     */
public Activity(/*Athlete athlete*/ double distance, double duration, Mode mode){ 
    this.athlete = athlete;
    this.distance = distance;
    this.duration = duration;
    this.mode = mode;
        
    }
    
public double getDistance() {
        return distance;
    }

public double getDuration() {
        return duration;
    }

public Mode getMode() {
        return mode;
    }

public Equipment getEquipment() {
        return equipment;
    }
    
public void getCaloriesBurned(){ 
    
    }
    
public void getSummary() {
        System.out.println("something that summarizes");
    }
}
