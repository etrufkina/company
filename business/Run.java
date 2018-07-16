package business;

/**
 * Created by Lena on 11.07.2018.
 */
public class Run {

    static class Ref<T> {
        private T value;

        public T Ref(T s) {
            return (T) s;
        }

        public T getValue(T value) {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        Programmer progr = new Programmer("Jora Ivanov", 10,28,1500,"Java");
        Programmer lead_developer = new Programmer("Jora Ivanov", 10,28,1500,"Java");
        Programmer senior_developer = new Programmer("Jora Ivanov", 10,28,1500,"Java");
        Programmer junior_developer = new Programmer("Jora Ivanov", 3,25,+3000,"Java");
        Tester quality_guy = new Tester("Jora Ivanov", 10,28,1500,"Java");

        Manager manager = new Manager("Petea Vasechkin", 4, 26,500, lead_developer, senior_developer, junior_developer, quality_guy );

        Director dir = new Director("Vasea Pupkin", 6, 32, 1000, manager);

        Ref r = new Ref();
        System.out.println(r.Ref(2).toString());


        try {
        	dir.setExperience(-2);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
        
        System.out.println(progr.toString());
        System.out.println(manager.toString());
        System.out.println(dir.toString());
        dir.incrementSalary();
        dir.incrementSalary();
//        junior_developer.incrementSalary();
//        junior_developer.incrementSalary();

        System.out.println("\n" + junior_developer.incrementSalary());
    }
}

