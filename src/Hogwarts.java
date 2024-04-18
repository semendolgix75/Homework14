public class Hogwarts {             //все ученики школы Хогвартс умеют колдовать с мощностью в сколько-то баллов
    // и могут трансгрессировать на какое-то расстояние.
    private String name;
    private String faculty;
    private int conjurePower;
    private int transgressOnLength;

    @Override
    public String toString() {
        return "Студент " + name + "колдовать с мощностью=" + conjurePower +
                ", трансгрессировать на какое-то расстояние=" + transgressOnLength + " ";
    }
    public Hogwarts(String name, String faculty, int conjurePower, int transgressOnLength) {
        this.name = name;
        this.faculty = faculty;
        this.conjurePower = conjurePower;
        this.transgressOnLength = transgressOnLength;
    }

    //    Реализуйте метод, который сравнивает двух любых учеников Хогвартса по силе магии и расстоянию трансгрессии,
//    и выводит в консоль сравнительную оценку между двумя учениками.
    public static void comparisonPropertiesHogwarts(Hogwarts student1, Hogwarts student2) {
        if (student1.getConjurePower() > student2.getConjurePower()) {
            System.out.println(student1.getName() + " обладает бОльшей мощностью магии, чем " + student2.getName());
        } else if (student1.getConjurePower() < student2.getConjurePower()) {
            System.out.println(student2.getName() + "обладает бОльшей мощностью магии, чем " + student1.getName());
        } else {
            System.out.println(" Силы мощности равны ");
        }
        if (student1.getTransgressOnLength() > student2.getTransgressOnLength()) {
            System.out.println(student1.getName() + "трансгрессировать на большее расстояние, чем " + student2.getName());
        } else if (student1.getTransgressOnLength() < student2.getTransgressOnLength()) {
            System.out.println(student2.getName() + "трансгрессировать на большее расстояние, чем " + student1.getName());
        } else {
            System.out.println(" Силы равны ");
        }
    }

    public int getConjurePower() {
        return conjurePower;
    }

    public int getTransgressOnLength() {
        return transgressOnLength;
    }

    public String getName() {
        return name;
    }

    public String getFaculty() {
        return faculty;
    }
}
