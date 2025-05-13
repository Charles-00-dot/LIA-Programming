import java.util.*; 
/**
 * Write a description of class Equipment here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Equipment 

{
    private String name;
    private Mode mode;

    public Equipment(String name, Mode mode) {
        this.name = name;
        this.mode = mode;
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


