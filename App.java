import java.util.ArrayList;
import java.util.Scanner;
/**
 * Write a description of class App here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class App
{
    private ArrayList<Athlete> athletes;
    private ArrayList<Activity> activities;
    private ArrayList<Equipment> equipment;
    private double distance = 0;
    
    public static void main(String[] args){
        new App();
    }

    
    public App(){
        athletes = new ArrayList<Athlete>();
        activities = new ArrayList<Activity>();
        equipment = new ArrayList<Equipment>();
        printWelcome();
    }
    
public void printWelcome(){
         Scanner sc = new Scanner(System.in);
         System.out.println("Welcome to AmazingApp");
         System.out.println("What do you want: (1)SignUp,(2) ListOfAtletes, (3)ListOfActivities, (4)Quit");
         System.out.println("SignUp");
         System.out.println("ListOfAthletes");
         switch(sc.next()){
             case "1":
                 userSignUp();
                 break;
            case"2":
            numberOfUser();
            listAthletes();
            break;
         }
    }
    
public void userSignUp() {
        String name;
        int age;
        Gender gender;
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter athlete name: ");
        name = scanner.nextLine();

        System.out.print("Enter athlete age: ");
        age = scanner.nextInt();
        scanner.nextLine();
    
        System.out.print("Select gender:( (1)MALE, (2)FEMALE, (3)OTHER ): ");
        gender = null;
        switch (scanner.next()) {
            case "1":
                gender = Gender.MALE;
                break;
            case "2":
                gender = Gender.FEMALE;
                break;
            case "3":
                gender = Gender.OTHER;
                break;
        }

        // System.out.print("Enter gender (MALE, FEMALE, OTHER): ");
        // String genderInput = scanner.nextLine().toUpperCase();
        // gender = Gender.valueOf(genderInput);
    
        Athlete athlete = new Athlete(name, age, gender);
        athletes.add(athlete);
    
        System.out.println("What do want to do next?");
         System.out.println("DoRegularAct (1)");
         System.out.println("DoPoweredAct (2)");
        switch (scanner.next()) {
            case "1":
                createActivity();
                break;
            case "2":
                PoweredAct.createPoweredAct();
                break;
        }   

    
}
    
public void numberOfUser(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(athletes.size());
    }
     
public void listAthletes() {
        Scanner scanner = new Scanner(System.in);
        for (Athlete athlete : athletes) {
            System.out.println(athlete.getName());
        }
    }
    
public void createEquipment(String name) {
        //Gotta figure out the method
    }
    
public void createActivity() { 
    double caloriesBurned;
    double distance;
    double duration;
    int multi;
    Mode mode;
    
    Scanner scanner = new Scanner(System.in);
    System.out.print("distance traveled: ");
    distance = scanner.nextDouble();
    scanner.nextLine();
    System.out.print("Time traveled: ");
    distance = scanner.nextDouble();
    scanner.nextLine();
     System.out.print("which activity: (1)WALK, (2)SWIM, (3)RUN, (4)JOG ");
    switch(scanner.next()){
        case"1" :
                mode = Mode.WALKING;
            break;
        case"2":
                mode = Mode.SWIMMING;
            break;
        case"3":
                mode = Mode.RUNNING;
            break;
        case"4":
                mode = Mode.JOGGING;
            break;
        }
    
    
    System.out.print("you have burned this much calories : Type [1] confirm" );
        
    switch (scanner.next()){
        case"1":
                calculateBurnedCaloriesByAthlete();
            break;
        }
    
    // Activity activityInfo = new Activity (distance,  duration,  mode);
    // activities.add(activityInfo);
    }
    
public void listActivities() {
        for (Activity activities : activities){
            System.out.println(activities);
        }
    }
    
public void listActivitiesByAthlete(Athlete athlete) {
        //Gotta figure out the method
    }
    
public void calculateDistanceByAthlete(Athlete athlete) { //double
        // return athlete.getTotalDistance(); (since i put void in the getTotalDistance method, it doesn't work)
    }
    
public void calculateBurnedCaloriesByAthlete() { //double
        int duration = 30;
        if (duration < 30 ){
            System.out.println("You burned around 150 to 300 calories");
        }
        if (duration > 30 ){
            System.out.println("You burned around 300 to 800 calories");
        }
    }
    
public ArrayList<Equipment> getEquipmentList() {
        return equipment;
    }
}
