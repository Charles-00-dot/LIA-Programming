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
    
    public App(){
        athletes = new ArrayList<Athlete>();
        activities = new ArrayList<Activity>();
        equipment = new ArrayList<Equipment>();
        printWelcome();
    }
    
    public void printWelcome(){
         Scanner sc = new Scanner(System.in);
         System.out.println("Welcome to AmazingApp");
         System.out.println("What do you want");
         System.out.println("SignUp");
         System.out.println("ListOfAthletes");
         switch(sc.next()){
             case "SignUp":
                 userSignUp();
                 break;
            case"ListOfAthletes":
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
    
    gender = null;
        switch (scanner.next()) {
            case "MALE":
                gender = Gender.MALE;
                break;
            case "FEMALE":
                gender = Gender.FEMALE;
                break;
            case "OTHER":
                gender = Gender.OTHER;
                break;
        }

    // System.out.print("Enter gender (MALE, FEMALE, OTHER): ");
    // String genderInput = scanner.nextLine().toUpperCase();
    // gender = Gender.valueOf(genderInput);
    
    Athlete athlete = new Athlete(name, age, gender);
    athletes.add(athlete);
    
    System.out.println("What do want to do next?");
         System.out.println("DoRegularAct");
         System.out.println("DoPoweredAct");
    switch (scanner.next()) {
            case "DoRegularAct":
                createActivity();
                break;
            case "DoPoweredAct":
                PoweredAct.createPoweredAct();
                break;
        }   

    // createAthlete(name, age, gender);
    // System.out.println("Athlete profile created for: " + name);

    // System.out.println("\nCurrent Athletes:");
    // listAthletes();
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
    System.out.print("which activity?");
    switch(scanner.next()){
        case"Walk" :
        mode = Mode.WALKING;
        break;
        case"Swim":
        mode = Mode.SWIMMING;
        break;
        case"Run":
        mode = Mode.RUNNING;
        break;
        case"Jog":
        mode = Mode.JOGGING;
        break;
    }
    System.out.print("you have burned this much calories : ");
    
    // switch (scanner.next()){
        // case"calculate":
        // calculateBurnedCaloriesByAthlete();
        // break;
    // }
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
    
    // public double calculateBurnedCaloriesByAthlete() { //double
         // Mode mode;
        // double multiplier = 70; // default value in "case"  (fallback multiplier in case the mode doesn’t match any of the known options like WALKING, RUNNING, etc.)(70 is just like the average of all)

        // if (mode == Mode.WALKING) multiplier = 50;
        // else if (mode == Mode.RUNNING) multiplier = 80;
        // else if (mode == Mode.SWIMMING) multiplier = 100;
        // else if (mode == Mode.JOGGING) multiplier = 60;
        // return distance * multiplier;
    
    // }
    
    public ArrayList<Equipment> getEquipmentList() {
        return equipment;
    }
}
