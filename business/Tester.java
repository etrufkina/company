package business;

/**
 * Created by Lena on 15.07.2018.
 */
public class Tester {
    private String       fullname;   // полное имя
    private int          experience; // опыт работы (лет)
    private int          age;        // возраст (лет!!!)
    private float        salary;     // текущая заработная плата (в у.е.!!!)
    private String       technology; // название языка программирования, которым владеет (например Java, Python,...)
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

    public Tester(String Fullname, int Experience, int Age, float Salary, String Technology){
        this.fullname = Fullname;
        this.experience = Experience;
        this.age = Age;
        this.salary = Salary;
        this.technology = Technology;
    }

    @Override
    public String toString(){
        return "\nInformation about the tester: " + "\nfullname: " + fullname + "\nexperience: " + experience + "\nage: "
                + age + "\nsalary: " + salary+ "\ntechnology : " + technology+ "\n";
    }

    // объявить метод incrementSalary() который каждый раз, когда он применяется,
    // увеличивает заработную плату на 3% + 0.5% за каждый год опыта работы в данной области.
    float incrementSalary() {
        return  salary = (float) (salary + salary*0.03 + experience*0.005);
    }

    float testerSalaryForThreeYear(){
        return (float) (salary * 3 + salary * (experience + 3) * 0.005);
    }

    String displayTester(){
        return fullname + "\t\t" + experience + "\t\t\t" + age + "\t\t\t" +  salary + "\n";
    }
}
