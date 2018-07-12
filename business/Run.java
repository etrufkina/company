package business;

/**
 * Created by Lena on 11.07.2018.
 */
public class Run {
    public static void main(String[] args) {
        Programmer progr = new Programmer("Jora Ivanov", 10,28,1500,"Java");
        Manager manager = new Manager("Petea Vasechkin", 4, 26,500);
        Director dir = new Director("Vasea Pupkin", 6, 32, 1000, manager);

        System.out.println(progr.toString());
        System.out.println(manager.toString());
        System.out.println(dir.toString());

        System.out.println(dir.incrementSalary());
    }
}

