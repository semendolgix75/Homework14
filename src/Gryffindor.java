public class Gryffindor extends Hogwarts {      //Гриффиндорцам присущи благородство, честь и храбрость.
    private int nobility;
    private int honor;
    private int bravery;

    @Override
    public String toString() {
        return "Студент факультета " + getFaculty() + "  " + getName() + " Навыки: " + super.toString() +
                "благородство=" + nobility +
                ", честь=" + honor +
                ", храбрость=" + bravery +
                "} ";
    }

    public Gryffindor(String faculty, String name, int conjurePower, int transgressOnLength, int nobility, int honor, int bravery) {
        super(faculty, name, conjurePower, transgressOnLength);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    //    Реализуйте 4 метода, по одному для каждого факультета, которые сравнивают между собой двух учеников одного факультета
//    по свойствам. Чтобы сравнить учеников, нужно сложить баллы по каждому свойству, которое присуще ученику данного факультета.
//    Тот ученик, у которого сумма свойств больше, считается лучшим учеником.
//    Метод должен выводить в консоль результат сравнения учеников.
    public static void comparisonProperties(Gryffindor student1, Gryffindor student2) {
        int sumStudent1 = student1.getNobility() + student1.getHonor() + student1.getBravery();
        int sumStudent2 = student2.getNobility() + student2.getHonor() + student2.getBravery();
        if (sumStudent1 > sumStudent2) {
            System.out.println(student1.getName() + " лучший " + student1.getFaculty() + ", чем " + student2.getName());
        } else if (sumStudent2 > sumStudent1) {
            System.out.println(student2.getName() + " лучший " + student1.getFaculty() + ", чем " + student1.getName());
        } else {
            System.out.println(" Силы равны ");
        }
    }
}
