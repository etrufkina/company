package business;

import com.sun.javafx.binding.StringFormatter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lena on 15.07.2018.
 */
public class SoftwareCompany {
    private static String       name;   // полное название компании
    private static int          year;   // год основания
    private static float        salary_budget;     // бюджет, выделенный под заработную плату сотрудников


    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        SoftwareCompany.name = name; // в статических методах нельзя использовать this ?
    }

    public static int getYear() {
        return year;
    }

    public static void setYear(int year) {
        SoftwareCompany.year = year;
    }

    public static float getSalary_budget() {
        return salary_budget;
    }

    public static void setSalary_budget(float salary_budget) {
        SoftwareCompany.salary_budget = salary_budget;
    }

    private static class Address {
        // здесь необходимо указать адрес данной компании (страна,город,улица,номер)
        private String country;
        private String city;
        private String street;
        private  int houseNumber;

        public Address(String country, String city, String street, int houseNumber){
            this.country = country;
            this.city = city;
            this.street = street;
            this.houseNumber = houseNumber;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getStreet() {
            return street;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public int getHouseNumber() {
            return houseNumber;
        }

        public void setHouseNumber(int houseNumber) {
            this.houseNumber = houseNumber;
        }

        @Override
        public String toString(){
            return String.format("\nAddress: \ncountry: %s \n city: %s \n street: %s \n house number: %s \n", country, city, street, houseNumber);
        }
    }

    private static class Contacts{
        // здесь необходимо указать контактную информацию компании (телефон, почтовый индекс, электронная почта)
        private int phoneNumber;
        private int postcode;
        private String email;

        public Contacts(int phoneNumber, int postcode, String email){
            this.phoneNumber = phoneNumber;
            this.postcode = postcode;
            this.email = email;
        }

        public int getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(int phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public int getPostcode() {
            return postcode;
        }

        public void setPostcode(int postcode) {
            this.postcode = postcode;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        @Override
        public String toString(){
            return String.format("\nContacts: \nphone number %s \n postcode %s \n email %s \n", postcode, phoneNumber, email);
        }
    }

    // в классе, указанном ниже, добавить сотрудников компании - директора, менеджера и остальных членов команды
    private static class Team{
        Director director;
        Manager manager;
        Programmer   lead_developer;  // Объект тип Programmer - элитный разработчик в команде
        Programmer   senior_developer;// Объект тип Programmer - ведущий (senior) разработчик в команде
        Programmer   junior_developer;// Объект тип Programmer - младший (junior) разработчик в команде
        Tester       quality_guy;     // Объект тип Tester - тестировщик в команде

        public Team(Director director, Manager manager, Programmer lead_developer, Programmer senior_developer, Programmer junior_developer, Tester quality_guy) {
            this.director = director;
            this.manager = manager;
            this.lead_developer = lead_developer;
            this.senior_developer = senior_developer;
            this.junior_developer = junior_developer;
            this.quality_guy = quality_guy;
        }

        @Override
        public String toString(){
            return String.format("\nInformation about the team: \ndirector: %s\nmanager: %s\n" +
                            "lead developer in the manager team: %s \nsenior developer in the manager team: %s " +
                            "\njunior developer in the manager team: %s \nquality guy in the manager team: %s \n",
                    director, manager, lead_developer, senior_developer, junior_developer, quality_guy);
        }
    }

    // добавьте методы, указанные выше
//    объявить метод showMembers() который отобразит всех сотрудников в формате
//    Имя Фамилия      должность   опыт работы   заработная плата
    private static String showMembers(Director director, Manager manager, Programmer lead_developer, Programmer senior_developer, Programmer junior_developer, Tester quality_guy) {
        return "FULLNAME\t\tEXPERIENCE\t\tAGE\t\t\tSALARY\n\n" +
                director.displayDirector() + manager.displayManager() + lead_developer.displayLeadDeveloper() +
                senior_developer.displayProgrammer() + junior_developer.displayProgrammer() + quality_guy.displayTester();
    }

//    объявить метод calculateSalaryBudget() который возвращает значение заработной платы, расчитанной за один год работы,
// принимая во внимание текущий оклад всех сотрудников (заработная плата, записанная в объектах, указана за 1 месяц работы)
    private static float calculateSalaryBudget(Director director, Manager manager, Programmer lead_developer, Programmer senior_developer, Programmer junior_developer, Tester quality_guy){
        return director.getSalary() + manager.getSalary() + lead_developer.getSalary() + senior_developer.getSalary() + junior_developer.getSalary() + quality_guy.getSalary();
    }

    private static float calculateSalaryBudgetForThreeYears(Director director, Manager manager, Programmer lead_developer, Programmer senior_developer, Programmer junior_developer, Tester quality_guy){
        return director.directorSalaryForThreeYear()+ manager.managerSalaryForThreeYear() + lead_developer.programmerSalaryForThreeYear() +
                senior_developer.programmerSalaryForThreeYear() + junior_developer.programmerSalaryForThreeYear() + quality_guy.testerSalaryForThreeYear();
    }



    public static void main(String[] args) {

        Programmer lead_developer = new Programmer("Jora Ivanov", 10,28,1500,"Java");
        Programmer senior_developer = new Programmer("Sergei Nikolaev", 7,33,1300,"Java");
        Programmer junior_developer = new Programmer("Evgenii Noskov", 3,25,900,"Java");
        Tester quality_guy = new Tester("Vasilii Novikov", 2,27,800,"Java");
        Manager manager = new Manager("Petea Vasechkin", 4, 26,1200, lead_developer, senior_developer, junior_developer, quality_guy );
        Director director = new Director("Vasea Pupkin", 6, 32, 2000, manager);
        Team team = new Team(director, manager, manager.getLead_developer(), manager.getSenior_developer(), manager.getJunior_developer(), manager.getQuality_guy());

//        System.out.println(team.toString());

        Contacts contacts = new Contacts(1584756446, 1235, "fsdgfh@skjhdsajk.com");
        Address address = new Address("Moldova", "Kishinev", "Shtefan cel Mare", 22);
        System.out.println(contacts.toString());
        System.out.println(address.toString());

//        рассчитать бюджет заработной платы компании за 1 год и отобразить результат
        System.out.println("The salary budget for one year is: " + calculateSalaryBudget(director, manager, lead_developer, senior_developer, junior_developer, quality_guy) + " euro");

//        рассчитать бюджет заработной платы компании на 3 года и отобразить результат (не забудьте, что заработная плата зависит от опыта, соответственно - опыт увеличивается с каждым годом деятельности!
        System.out.println("The salary budget for three year is: " + calculateSalaryBudgetForThreeYears(director, manager, lead_developer, senior_developer, junior_developer, quality_guy) + " euro");
        System.out.println("Members of the company: \n\n" + showMembers(director, manager, lead_developer, senior_developer, junior_developer, quality_guy));

    }
}
