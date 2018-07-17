package house;

/**
 * Created by Lena on 17.07.2018.
 */
public class Dog {
    public String name;   // кличка
    public float    weight; // вес (граммы)
    public float    age;    // возраст (дни!!!)
    // добавить конструктор и методы, указанные выше

    public Dog(String Name, int Weight, float Age){
        this.name = Name;
        this.weight = Weight;
        this.age = Age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public float getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

//    объявить метод eat(quantity) который получит значение количества пищи в граммах, предлагаемой щенку.
// Этот метод будет увеличивать вес щенка на 1% от потребляемого количества пищи и повышать возраст на 1 день при каждом вызове.
    public float eat(float quantity) {
//        Owner d = new Owner(),
              Owner  f = new Owner();
              quantity = f.getFood();
          weight = (weight + quantity);
          age += 1;
        return + weight +   age;
    }

    @Override
    public String toString(){
        return "\n" + name + " весит " + weight +  "kg, возраст " + age + " год. \n";
    }
}
