import java.util.ArrayList;

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
}
