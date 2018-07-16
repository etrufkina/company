package business;

/**
 * Created by Lena on 11.07.2018.
 */
public class Manager {
    private String       fullname;   // полное имя
    private int          experience; // опыт работы (лет)
    private int          age;        // возраст (лет!!!)
    private float        salary;     // текущая заработная плата (в у.е.!!!)
    private Programmer   lead_developer;  // Объект тип Programmer - элитный разработчик в команде
    private Programmer   senior_developer;// Объект тип Programmer - ведущий (senior) разработчик в команде
    private Programmer   junior_developer;// Объект тип Programmer - младший (junior) разработчик в команде
    private Tester       quality_guy;     // Объект тип Tester - тестировщик в команде
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

    public Programmer getLead_developer() {
        return lead_developer;
    }

    public void setLead_developer(Programmer lead_developer) {
        this.lead_developer = lead_developer;
    }

    public Programmer getSenior_developer() {
        return senior_developer;
    }

    public void setSenior_developer(Programmer senior_developer) {
        this.senior_developer = senior_developer;
    }

    public Programmer getJunior_developer() {
        return junior_developer;
    }

    public void setJunior_developer(Programmer junior_developer) {
        this.junior_developer = junior_developer;
    }

    public Tester getQuality_guy() {
        return quality_guy;
    }

    public void setQuality_guy(Tester quality_guy) {
        this.quality_guy = quality_guy;
    }


    public Manager(String Fullname, int Experience, int Age, float Salary,
                   Programmer Lead_developer, Programmer Senior_developer, Programmer Junior_developer, Tester Quality_guy)
    {
        this.fullname = Fullname;
        this.experience = Experience;
        this.age = Age;
        this.salary = Salary;
        this.lead_developer = Lead_developer;
        this.senior_developer = Senior_developer;
        this.junior_developer = Junior_developer;
        this.quality_guy = Quality_guy;
    }
    
    public void hireSeniorDeveloper(Programmer senior){
    	this.senior_developer = senior;
    }
    public void fireSeniorDeveloper(){
    	this.senior_developer = null;
    }
    public void hireJuniorDeveloper(Programmer junior){
    	this.junior_developer = junior;
    }
    public void fireJuniorDeveloper(){
    	this.junior_developer = null;
    }
    public void hireLead_developer(Programmer lead){
        this.lead_developer = lead;
    }
    public void fireLead_developer(){
        this.lead_developer = null;
    }
    public void hireQuality_guy(Tester tester){
        this.quality_guy = tester;
    }
    public void fireQuality_guy(){
        this.quality_guy = null;
    }

    @Override
    public String toString(){
        return String.format("\nInformation about the manager: \nfullname: %s\nexperience: %d\nage: %d"
                        + "\nsalary: %s\n\nlead developer in the manager team: %s \nsenior developer in the manager team: %s " +
                        "\njunior developer in the manager team: %s \nquality guy in the manager team: %s \n",
                fullname, experience, age, salary, lead_developer, senior_developer, junior_developer, quality_guy);
    }

    // объявить метод incrementSalary() который каждый раз, когда он применяется, увеличивает заработную плату на 15%.
    float incrementSalary() {
        return  salary = (float) (salary + salary*0.15);
    }

    float managerSalaryForThreeYear(){
        return (float) (salary * 3 + salary * ((experience + 3) * 0.02));
    }

    String displayManager(){
        return fullname + "\t\t" + experience + "\t\t\t" + age + "\t\t\t" +  salary + "\n";
    }
}
