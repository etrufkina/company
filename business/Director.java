package business;
import java.lang.String;
/**
 * Created by Lena on 11.07.2018.
 */
public class Director {
    public String   fullname;   // полное имя
    public int      experience; // опыт работы (лет)
    public int      age;        // возраст (лет!!!)
    public float    salary;     // текущая заработная плата (в у.е.!!!)
    public Manager  helper;     // Объект тип Manager - это основной помощник менеджера (правая рука)
    // добавить конструктор и методы, указанные выше
//    public String text;
    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public Manager getHelper() {
        return helper;
    }

    public void setHelper(Manager helper) {
        this.helper = helper;
    }
//    необходимо объявить конструктор с параметрами для всех свойств, присутствующих в Классе
    public Director(String Fullname, int Experience, int Age, float Salary, Manager Helper){
        this.fullname = Fullname;
        this.experience = Experience;
        this.age = Age;
        this.salary = Salary;
        this.helper = Helper;
    }

    @Override
    public String toString(){
        return "\nСправка о директоре: " + "\nполное имя: " + fullname + "\nопыт работы: " + experience + "\nвозраст: "
                + age + "\nтекущая заработная плата: " + salary+ "\nосновной помощник менеджера: " + helper;
    }

    // объявить метод incrementSalary() который каждый раз, когда он применяется, увеличивает заработную плату на 20%.
    int incrementSalary() {
//        double percentage = salary*0.2;
        return (int) (salary = (float) (salary + salary*0.2));
    }
}
