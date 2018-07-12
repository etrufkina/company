package business;

/**
 * Created by Lena on 11.07.2018.
 */
public class Programmer {
    public String       fullname;   // полное имя
    public int          experience; // опыт работы (лет)
    public int          age;        // возраст (лет!!!)
    public float        salary;     // текущая заработная плата (в у.е.!!!)
    public String       technology; // название языка программирования, которым владеет (например, Java, Python,...)
    // добавить конструктор и методы, указанные выше

    public Programmer(String Fullname, int Experience, int Age, float Salary, String Technology){
        this.fullname = Fullname;
        this.experience = Experience;
        this.age = Age;
        this.salary = Salary;
        this.technology = Technology;
    }

    @Override
    public String toString(){
        return "\nСправка о директоре: " + "\nполное имя: " + fullname + "\nопыт работы: " + experience + "\nвозраст: "
                + age + "\nтекущая заработная плата: " + salary+ "\nязыка программирования: " + technology;
    }
}
