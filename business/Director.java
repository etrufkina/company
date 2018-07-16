package business;
import java.lang.String;
/**
 * Created by Lena on 11.07.2018.
 */
public class Director {
    private String   fullname;   // полное имя
    private int      experience; // опыт работы (лет)
    private int      age;        // возраст (лет!!!)
    private float    salary;     // текущая заработная плата (в у.е.!!!)
    private Manager  helper;     // Объект тип Manager - это основной помощник менеджера (правая рука)


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

    public void setExperience(int experience) throws Exception{
    	if(experience>=0){
    		this.experience = experience;
    	}else{
    		throw new Exception("Experience can't be less then 0");
    	}
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
        return "\nInformation about the director: " + "\nfullname: " + fullname + "\nexperience: " + experience + "\nage: "
                + age + "\nsalary: " + salary+ "\nmain helper: " + helper + "\n";
    }

    // объявить метод incrementSalary() который каждый раз, когда он применяется, увеличивает заработную плату на 20%.
    float incrementSalary() {
        return salary = (float) (salary + salary*0.2);
    }

    float directorSalaryForThreeYear(){
        return (float) (salary * 3 + salary * ((experience + 3) * 0.03));
    }

    String displayDirector(){
        return fullname + "\t\t" + experience + "\t\t\t" + age + "\t\t\t" +  salary + "\n";
    }
}
