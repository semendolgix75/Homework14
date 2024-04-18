public class Slytherin extends Hogwarts {            //Всем ученикам Слизерина присущи хитрость, решительность, амбициозность, находчивость и жажда власти.
    private  String faculty;
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int authority;

    public Slytherin(String faculty,String name,int conjurePower, int transgressOnLength, int cunning, int determination, int ambition, int resourcefulness, int authority) {
        super(name,conjurePower, transgressOnLength);
        this.faculty = faculty;
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.authority = authority;
    }

    public String getFaculty() {
        return faculty;
    }


    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getAuthority() {
        return authority;
    }

    @Override
    public String toString() {
        return "Студент факультета "+faculty+"  "+getName()+ " Навыки: "+super.toString()+
                "хитрость=" + cunning +
                ", решительность=" + determination +
                ", амбициозность=" + ambition +
                ", находчивость=" + resourcefulness +
                ", жажда власти=" + authority +
                "} ";
    }
    //    Реализуйте 4 метода, по одному для каждого факультета, которые сравнивают между собой двух учеников одного факультета
//    по свойствам. Чтобы сравнить учеников, нужно сложить баллы по каждому свойству, которое присуще ученику данного факультета.
//    Тот ученик, у которого сумма свойств больше, считается лучшим учеником.
//    Метод должен выводить в консоль результат сравнения учеников.
    public static void comparisonProperties( Slytherin student1, Slytherin student2) {
        int sumStudent1 = student1.getAmbition() + student1.getDetermination() + student1.getCunning() + student1.getAuthority()
                + student1.getResourcefulness() + student1.getTransgressOnLength() + student1.getConjurePower();
        int sumStudent2 = student2.getAmbition() + student2.getDetermination() + student2.getCunning() + student2.getAuthority()
                + student2.getResourcefulness() + student2.getTransgressOnLength() + student2.getConjurePower();
        if (sumStudent1 > sumStudent2) {
            System.out.println(student1.getName() +" лучший "+student1.faculty+", чем " + student2.getName());
        } else if (sumStudent2 > sumStudent1) {
            System.out.println(student2.getName() +" лучший "+student1.faculty+", чем " + student1.getName());
        } else {
            System.out.println(" Силы равны ");
        }
    }
}
