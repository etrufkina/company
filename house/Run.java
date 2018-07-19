package house;

/**
 * Created by Lena on 11.07.2018.
 */
public class Run {

    public static void main(String[] args) {
//		создать объект тип "Owner" со следующими параметрами fullname: "Ion Petru", age: 365 * 20 (то есть 20 лет), food: 1000 * 80 (то есть 80 kg)
		Owner dogOwner = new Owner("Ion Petru", 365*20 , 1000*80);
		Owner catOwner = new Owner("Frosea Burlakova", 365*26 , 1000*60);
// создать объект тип "Dog" со следующими параметрами name: "Pistrushka", weight: 1000 * 1 (1 kg), age: 365 * 1.6 (1 год и приблизительно 7 месяцев)
		Dog dog = new Dog("Pistrushka",  1000*1f, (int)(365*1.6));
		Cat cat = new Cat("Aliska",  1000*0.8f, (int)(365*1.3));
//		используя конструкцию while() и комбинацию методов, таких как dog.eat(owner.getFood(200)) смоделировать ситуацию,
// в которой владелец кормит щенка каждый день (один день соответствует одному вызову dog.eat() и,
// соответственно, одной итерации цикла while). Цикл while прерывается, когда заканчиваются запасы пищи владельца.
// При каждой итерации отображается статус владельца и щенка.
//
		int dogDays = 0;
		float dogWeightBefore = dog.getWeight();

		while(dogOwner.getFood()>0){
			dog.eat(dogOwner.getFood(200));
			System.out.println(dogOwner.toString());
			System.out.println(dog.toString());
			dogDays++;
		}

		float dogDiff = (dog.getWeight() - dogWeightBefore)/1000;
		int dogAge = dog.getAge()/365;
		int dogOwnerAge = dogOwner.getAge()/365;

		float catWeightBefore = cat.getWeight();
		int catDays = 0;
		while(catOwner.getFood()>0){
			cat.eat(catOwner.getFood(160));
			System.out.println(catOwner.toString());
			System.out.println(cat.toString());
			catDays++;
		}

		float catDiff = (cat.getWeight() - catWeightBefore)/1000;
		int catAge = cat.getAge()/365;
		int catOwnerAge = catOwner.getAge()/365;


		System.out.println("на какое количество дней хватит еды щенку? - " + dogDays +
			" \nна сколько килограммов увеличился вес щенка после окончания периода кормления? - " + String.format("%.1f", dogDiff) +
		" \nсколько полных лет будет (целое число!!!) владельцу - " + dogOwnerAge +  " и щенку - " + dogAge + " в конце периода кормления?\n");

		System.out.println("на какое количество дней хватит еды кошке? - " + catDays +
			" \nна сколько килограммов увеличился вес кошки после окончания периода кормления? - " + String.format("%.1f", catDiff) +
			" \nсколько полных лет будет (целое число!!!) владельцу - " + catOwnerAge +  " и кошке - " + catAge + " в конце периода кормления?");

// вычислить и ответить на вопросы:
//		на какое количество дней хватит еды щенку?
//			на сколько килограммов увеличился вес щенка после окончания периода кормления?
//			сколько полных лет будет (целое число!!!) владельцу и щенку в конце периода кормления?
    }
}

