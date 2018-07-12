package business;

/**
 * Created by Lena on 11.07.2018.
 */
public class Manager {
    public String       fullname;   // полное имя
    public int          experience; // опыт работы (лет)
    public int          age;        // возраст (лет!!!)
    public float        salary;     // текущая заработная плата (в у.е.!!!)
//    public Programmer   lead_developer;  // Объект тип Programmer - элитный разработчик в команде
//    public Programmer   senior_developer;// Объект тип Programmer - ведущий (senior) разработчик в команде
//    public Programmer   junior_developer;// Объект тип Programmer - младший (junior) разработчик в команде
//    public Tester       quality_guy;     // Объект тип Tester - тестировщик в команде
    // добавить конструктор и методы, указанные выше


    public Manager(String Fullname, int Experience, int Age, float Salary)
//                   Programmer Lead_developer, Programmer Senior_developer, Programmer Junior_developer)
    {
        this.fullname = Fullname;
        this.experience = Experience;
        this.age = Age;
        this.salary = Salary;
//        this.lead_developer = Lead_developer;
//        this.senior_developer = Senior_developer;
//        this.junior_developer = Junior_developer;
    }

    @Override
    public String toString(){
        return String.format("\nСправка о менеджере: \nполное имя: %s\nопыт работы: %d\nвозраст: %d\nтекущая заработная плата: %s\n", fullname, experience, age, salary);
    }
}
