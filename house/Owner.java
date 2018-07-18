package house;

/**
 * Created by Lena on 17.07.2018.
 */
public class Owner {
    public String fullname;   // полное имя
    public int    age;        // возраст (дни)
    public float    food;       // сколько пищи имеется в наличии (в граммах)
    // добавить конструктор и методы, указанные выше

    public Owner(String Fullname, int Age, int Food){
        this.fullname = Fullname;
        this.age = Age;
        this.food = Food;
    }

    public Owner() {

    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getFood() {
        return food;
    }

    public void setFood(float food) {
        this.food = food;
    }


	public float getFood(float quantity){
    	food = food - quantity;
    	age++;
    	return quantity;
	}

    @Override
    public String toString(){
        return "\n" + fullname + " возраст " + (int)(Math.ceil(age/365)) +  " лет, имеет в наличии " + String.format("%.1f", food/1000) + " kg корма. \n";
    }

}
