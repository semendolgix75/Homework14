public class Ravenclaw extends Hogwarts {        //Когтевранцы умны, мудры, остроумны и полны творчества

    private int smart;
    private int wise;
    private int witty;
    private int creativity;

    public Ravenclaw(String faculty, String name, int conjurePower, int transgressOnLength, int smart, int wise, int witty, int creativity) {
        super(faculty, name, conjurePower, transgressOnLength);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creativity = creativity;
    }

    public int getSmart() {
        return smart;
    }

    public int getWise() {
        return wise;
    }

    public int getWitty() {
        return witty;
    }

    public int getCreativity() {
        return creativity;
    }

    @Override
    public String toString() {
        return "Студент факультета " + getFaculty() + "  " + getName() + " Навыки: {" + super.toString() +
                "Ум=" + smart +
                ", мудрость=" + wise +
                ", остроумие=" + witty +
                ", творчество=" + creativity +
                "} ";
    }

    //    Реализуйте 4 метода, по одному для каждого факультета, которые сравнивают между собой двух учеников одного факультета
//    по свойствам. Чтобы сравнить учеников, нужно сложить баллы по каждому свойству, которое присуще ученику данного факультета.
//    Тот ученик, у которого сумма свойств больше, считается лучшим учеником.
//    Метод должен выводить в консоль результат сравнения учеников.
    public static void comparisonProperties(Ravenclaw student1, Ravenclaw student2) {
        int sumStudent1 = student1.getSmart() + student1.getWise() + student1.getWitty() + student1.getCreativity();
        int sumStudent2 = student2.getSmart() + student2.getWise() + student2.getWitty() + student2.getCreativity();
        if (sumStudent1 > sumStudent2) {
            System.out.println(student1.getName() + " лучший " + student1.getFaculty() + ", чем " + student2.getName());
        } else if (sumStudent2 > sumStudent1) {
            System.out.println(student2.getName() + " лучший " + student1.getFaculty() + ", чем " + student1.getName());
        } else {
            System.out.println(" Силы равны ");
        }
    }
}
