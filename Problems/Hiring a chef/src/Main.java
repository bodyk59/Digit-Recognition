import java.util.Scanner;

/**
 * @author Bogdan Kurchak
 */
class Chef {
    private String firstName;
    private int yearsOld;
    private String stageOfEducation;
    private int yearsOfExperience;
    private String cuisinePreference;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getYearsOld() {
        return yearsOld;
    }

    public void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    public String getStageOfEducation() {
        return stageOfEducation;
    }

    public void setStageOfEducation(String stageOfEducation) {
        this.stageOfEducation = stageOfEducation;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getCuisinePreference() {
        return cuisinePreference;
    }

    public void setCuisinePreference(String cuisinePreference) {
        this.cuisinePreference = cuisinePreference;
    }

    public void success(String firstName) {
        System.out.printf("The form for %s is completed", firstName);
    }
}

class Main {
    public static void main(String[] args) {
        Chef chef = new Chef();
        Scanner scanner = new Scanner(System.in);

        chef.setFirstName(scanner.next());
        chef.setYearsOld(scanner.nextInt());
        chef.setStageOfEducation(scanner.next());
        chef.setYearsOfExperience(scanner.nextInt());
        chef.setCuisinePreference(scanner.next());

        chef.success(chef.getFirstName());
    }
}
