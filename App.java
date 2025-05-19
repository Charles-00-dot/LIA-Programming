import java.util.ArrayList;
import java.util.Scanner;
/**
 * This is the main menu of the entire app.
 *
 * @author (Charles)
 * @version (2025-05-18)
 */
public class App
{
    private ArrayList<Athlete> athletes;
    private static ArrayList<Activity> activities;
    private ArrayList<Equipment> equipment;
    private double distance = 0;
    
public static void main(String[] args){
        new App();
    }

    
/**
 * 
 */public App(){
        athletes = new ArrayList<Athlete>();
        activities = new ArrayList<Activity>();
        equipment = new ArrayList<Equipment>();
        printWelcome();
    }
    
/**
 * It allows you to interact with the main menu.
 * 
 */public void printWelcome(){
         Scanner sc = new Scanner(System.in);
         System.out.println("Welcome to AmazingApp");
         System.out.println("What do you want: (1)SignUp,(2) ListOfAtletes, (3)ListOfActivities, (4)Quit");
         switch(sc.next()){
          case "1":
            userSignUp();
                 break;
          case "2":
            numberOfUser();
            listAthletes();
                 break;
          case "4":
            closing();
                break;
         }
}
    
/**
 * It allows you to Sign in to the App.
 */public void userSignUp() {
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
    
/**
 * It gives you the amount of users within the app.
 */public void numberOfUser(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(athletes.size());
    }
     

/**
 * It gives you the names of the users.
 */public void listAthletes() {
    Scanner scanner = new Scanner(System.in);
    for (Athlete athlete : athletes) {
            System.out.println(athlete.getName());
        }
    System.out.print("Press 1 to retry"
    );
    switch(scanner.next()){
        case "1":
            retry();
            break;
    }
}
    

/**
 * It gives to the acces to create your own regular activity.
 */public void createActivity() { 
    double caloriesBurned;
    double distance;
    double duration;
    Mode mode;
    
    Scanner scanner = new Scanner(System.in);
    System.out.print("distance traveled: ");
    distance = scanner.nextDouble();
    scanner.nextLine();
    System.out.print("Time traveled: ");
    duration = scanner.nextDouble();
    scanner.nextLine();
    System.out.print("which activity: (1)WALK, (2)SWIM, (3)RUN, (4)JOG ");
    mode = null;
    
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
    
    
    System.out.print("you have burned this much calories : Type [1] to confirm" );
      
    switch (scanner.next()){
        case "1":
                calculateBurnedCaloriesByAthlete(mode,distance);
            break;
        }
    scanner.nextLine();
    Activity activityInfo = new Activity (/*athlete*/ distance,  duration,  mode);
    activities.add(activityInfo);
    
    System.out.print("Press 1 to retry"
    );
    switch(scanner.next()){
        case "1":
            retry();
            break;
    }
 }
 
 /**
  * Allows you to go back to main menu.
  */public void retry(){
    Scanner scanner = new Scanner(System.in);
    System.out.print("What would you like to do again : sign up another user(1), ListOfAtletes(2), ListOfActivities(3), ListOfPowered(4), Quit(5)");
    
    switch (scanner.next()){
        case "1":
            userSignUp();
            break;
        case "2":
            numberOfUser();
            listAthletes();
            break;
        case "3":
            listActivities();
            break;
        case "4":
            PoweredAct.ListOfPowered();
        case "5":
            closing();
            break;
    }
 }
    

/**
 * It gives you all the activities that was done by the athletes.
 */public void listActivities() {
    for (Activity activities : activities){
            System.out.println(activities);
        }
    Scanner scanner = new Scanner(System.in);
    System.out.print("Press 1 to retry"
    );
    switch(scanner.next()){
        case "1":
            retry();
            break;
    }
 }
    
public void listActivitiesByAthlete(Athlete athlete) {
        
}
    
public void calculateDistanceByAthlete(Athlete athlete) { 
        
   }
    
/**
 * Calculation of the Calories.
 * 
 */public void calculateBurnedCaloriesByAthlete(Mode mode, double distance) { 
        switch(mode){
            case WALKING:
                System.out.print(distance * 10);
                break;
            case RUNNING:
                System.out.print(distance * 30);
                break;
            case JOGGING:
                System.out.print(distance * 20);
                break;
            case SWIMMING:
                System.out.print(distance * 50);
                break;
        }
    }

/**
 * It closes the app.
 */public void closing(){
    Scanner scanner = new Scanner(System.in);
    scanner.close();
}
    
/**
 * 
 */public ArrayList<Equipment> getEquipmentList() {
        return equipment;
    }
}
