import java.util.Calendar;
public  class User {

    // Незмінні поля
    private String firstName;
    private int birthDay;
    private int birthMonth;
    private int birthYear;
    private String email;
    private String phoneNumber;

    // Змінювані поля
    private String lastName;
    private double weight;
    private String bloodPressure;
    private int stepsPerDay;
    private int age;

    public User(String firstName, int birthDay, int birthMonth, int birthYear, String email, String phoneNumber) {
        this.firstName = firstName;
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
        this.email = email;
        this.phoneNumber = phoneNumber;
        calculateAge();  // Розраховуємо вік при створенні користувача
    }

    private void calculateAge() {
        int currentYear = 2020;
        age = currentYear - birthYear;
    }

    public void printAccountInfo() {
        System.out.println(
                " Ім'я: " + firstName +
                " Прізвище: " + lastName +
                " Вік: " + age +
                " Вага: " + weight + " кг" +
                " Тиск: " + bloodPressure +
                " Кількість кроків за день: " + stepsPerDay +
                " Емейл: " + email +
                " Телефон: " + phoneNumber );
    }

    // Незмінні гетери
    public String getFirstName() {
        return firstName;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public int getBirthMonth() {
        return birthMonth;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public int getAge() {
        return age;
    }
    // Геттер і сеттер для прізвища
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Геттер і сеттер для ваги
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    // Геттер і сеттер для тиску
    public String getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(String bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    // Геттер і сеттер для кількості кроків
    public int getStepsPerDay() {
        return stepsPerDay;
    }

    public void setStepsPerDay(int stepsPerDay) {
        this.stepsPerDay = stepsPerDay;
    }

}
