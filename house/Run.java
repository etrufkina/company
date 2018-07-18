package house;

/**
 * Created by Lena on 11.07.2018.
 */
public class Run {

    public static void main(String[] args) {
//		создать объект тип "Owner" со следующими параметрами fullname: "Ion Petru", age: 365 * 20 (то есть 20 лет), food: 1000 * 80 (то есть 80 kg)
		Owner owner = new Owner("Ion Petru", 365*20 , 1000*80);
//
// создать объект тип "Dog" со следующими параметрами name: "Pistrushka", weight: 1000 * 1 (1 kg), age: 365 * 1.6 (1 год и приблизительно 7 месяцев)
		Dog dog = new Dog("Pistrushka",  1000*1, (int)(365 * 1.6));

//		используя конструкцию while() и комбинацию методов, таких как dog.eat(owner.getFood(200)) смоделировать ситуацию,
// в которой владелец кормит щенка каждый день (один день соответствует одному вызову dog.eat() и,
// соответственно, одной итерации цикла while). Цикл while прерывается, когда заканчиваются запасы пищи владельца.
// При каждой итерации отображается статус владельца и щенка.
//
		int days = 0;
		float weightBefore = dog.getWeight();

		while(owner.getFood()>0){
			dog.eat(owner.getFood(200));
			System.out.println(owner.toString());
			System.out.println(dog.toString());
			days++;
		}

		float dif = (dog.getWeight() - weightBefore)/1000;
		int dogAge = dog.getAge()/1000;
		int ownerAge = owner.getAge()/365;


		System.out.println("на какое количество дней хватит еды щенку? - " + days +
			" \nна сколько килограммов увеличился вес щенка после окончания периода кормления? - " + dif +
		" \nсколько полных лет будет (целое число!!!) владельцу - " + ownerAge +  " и щенку - " + dogAge + " в конце периода кормления?");

// вычислить и ответить на вопросы:
//		на какое количество дней хватит еды щенку?
//			на сколько килограммов увеличился вес щенка после окончания периода кормления?
//			сколько полных лет будет (целое число!!!) владельцу и щенку в конце периода кормления?
    }
}

