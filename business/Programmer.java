package business;

/**
 * Created by Lena on 11.07.2018.
 */
public class Programmer {
    private String       fullname;   // полное имя
    private int          experience; // опыт работы (лет)
    private int          age;        // возраст (лет!!!)
    private float        salary;     // текущая заработная плата (в у.е.!!!)
    private String       technology; // название языка программирования, которым владеет (например, Java, Python,...)
    // добавить конструктор и методы, указанные выше

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

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    public Programmer(String Fullname, int Experience, int Age, float Salary, String Technology){
        this.fullname = Fullname;
        this.experience = Experience;
        this.age = Age;
        this.salary = Salary;
        this.technology = Technology;
    }

    @Override
    public String toString(){
        return "\nInformation about the programmer : " + "\nfullname: " + fullname + "\nexperience: " + experience + "\nage: "
                + age + "\nsalary: " + salary+ "\ntechnology: " + technology+ "\n";
    }

    // объявить метод incrementSalary() который каждый раз, когда он применяется, увеличивает заработную плату на 15%.
    float incrementSalary() {
        return  salary = (float) (salary + salary*0.05 + salary*experience*0.01);
    }

    float programmerSalaryForThreeYear(){
        return (float) (salary * 3 + salary * ((experience + 3) * 0.01));
    }

    String displayProgrammer(){
        return fullname + "\t\t" + experience + "\t\t\t" + age + "\t\t\t" +  salary + "\n";
    }
    String displayLeadDeveloper(){
        return fullname + "\t\t\t" + experience + "\t\t\t" + age + "\t\t\t" +  salary + "\n";
    }
}
