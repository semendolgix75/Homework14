public class Hufflepuff extends Hogwarts {       //Пуффендуя трудолюбивы, верны, честны
    private int hardworking;
    private int loyal;
    private int honest;

    public Hufflepuff(String faculty, String name, int conjurePower, int transgressOnLength, int hardworking, int loyal, int honest) {
        super(faculty, name, conjurePower, transgressOnLength);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    @Override
    public String toString() {
        return "Студент факультета " + getFaculty() + "  " + getName() + " Навыки: " + super.toString() +
                "трудолюбие=" + hardworking +
                ", верность=" + loyal +
                ", честь=" + honest +
                "} ";
    }

    public int getHardworking() {
        return hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public int getHonest() {
        return honest;
    }

    //    Реализуйте 4 метода, по одному для каждого факультета, которые сравнивают между собой двух учеников одного факультета
//    по свойствам. Чтобы сравнить учеников, нужно сложить баллы по каждому свойству, которое присуще ученику данного факультета.
//    Тот ученик, у которого сумма свойств больше, считается лучшим учеником.
//    Метод должен выводить в консоль результат сравнения учеников.
    public static void comparisonProperties(Hufflepuff student1, Hufflepuff student2) {
        int sumStudent1 = student1.getHardworking() + student1.getLoyal() + student1.getHonest();
        int sumStudent2 = student2.getHardworking() + student2.getLoyal() + student2.getHonest();
        if (sumStudent1 > sumStudent2) {
            System.out.println(student1.getName() + " лучший " + student1.getFaculty() + ", чем " + student2.getName());
        } else if (sumStudent2 > sumStudent1) {
            System.out.println(student2.getName() + " лучший " + student1.getFaculty() + ", чем " + student1.getName());
        } else {
            System.out.println(" Силы равны ");
        }
    }
}
