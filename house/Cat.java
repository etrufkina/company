package house;

/**
 * Created by md_etrufkina on 18.07.2018.
 */
public class Cat {
		private String name;   // кличка
		private float    weight; // вес (граммы)
		private int    age;    // возраст (дни!!!)
		// добавить конструктор и методы, указанные выше

		public Cat(String Name, int Weight, int Age){
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

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

//объявить метод eat(quantity) который получит значение количества пищи в граммах, предлагаемой щенку.
// Этот метод будет увеличивать вес щенка на 1% от потребляемого количества пищи и повышать возраст на 1 день при каждом вызове.
		public void eat(float quantity) {
			weight = (weight + quantity*0.01f);
			age++;
		}

		@Override
		public String toString(){
			return "\n" + name + " весит " + String.format("%.1f", weight/1000) +  " kg, возраст " +(int) (Math.ceil(age/365)) + " год. \n";
		}
	}

