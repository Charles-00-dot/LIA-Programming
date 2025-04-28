import java.util.ArrayList;

/**
 * Write a description of class Activities here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Activities extends App
{
    
    private int distance = 0;
    
    
    public Activities(){
        
    }
    
    public void regularActivities(){
    ArrayList<String> normalAct = new ArrayList<String>();
    normalAct.add("Swim");
    normalAct.add("Walk");
    normalAct.add("Hike");
    }
    
    public void poweredActivities(){
    ArrayList<String> intencity = new ArrayList<String>();
    intencity.add("Bike");
    intencity.add("Run");
    intencity.add("Rollerblade");
    }
}
