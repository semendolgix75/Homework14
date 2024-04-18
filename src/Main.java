public class Main {

    public static void main(String[] args) {
        System.out.println("Task1");
        Gryffindor harryPotter = new Gryffindor("Гриффиндор","Гарри Поттер",33, 45, 65, 47, 58);
        Gryffindor hermioneGranger = new Gryffindor("Гриффиндор","Гермиона Грейнджер ",56, 28, 89, 68, 49);
        Gryffindor ronWeasley = new Gryffindor("Гриффиндор","Рон Уизли",76, 65, 23, 68, 49);
        Slytherin dracoMalfoy = new Slytherin("Слизерин","Драко Малфой", 89, 28, 89, 46, 57,74,38);
        Slytherin grahamMontague = new Slytherin("Слизерин","Грэхэм Монтегю", 39, 68, 45, 34, 46,54,69);
        Slytherin gregoryGoyle = new Slytherin("Слизерин","Грегори Гойл",45, 45, 63, 19, 71,67,56);
        Hufflepuff zachariahSmith = new Hufflepuff("Пуффендуй","Захария Смит",74, 12, 59, 39, 56);
        Hufflepuff cedricDiggory = new Hufflepuff("Пуффендуй","Седрик Диггори", 29, 95, 64, 72, 64);
        Hufflepuff justinFinchFletchley = new Hufflepuff("Пуффендуй","Джастин Финч-Флетчли", 71, 86, 57, 71, 73);
        Ravenclaw zhouChang = new Ravenclaw("Когтевран","Чжоу Чанг", 85, 75, 65, 47,41,13);
        Ravenclaw padmaPatil = new Ravenclaw("Когтевран","Падма Патил",  42, 65, 47, 65,25,41);
        Ravenclaw marcusBelby = new Ravenclaw("Когтевран","Маркус Белби",56, 12, 35, 35,93,53);

        System.out.println("Task2");
        descriptionStudent(harryPotter);
        descriptionStudent(marcusBelby);
        descriptionStudent(ronWeasley);
        descriptionStudent(justinFinchFletchley);
        descriptionStudent(zhouChang);
        descriptionStudent(padmaPatil);
        descriptionStudent(cedricDiggory);
        descriptionStudent(gregoryGoyle);

        System.out.println("Task3");
        Slytherin.comparisonProperties(dracoMalfoy,grahamMontague);

        System.out.println("Task4");
        Hogwarts.comparisonPropertiesHogwarts(zachariahSmith, hermioneGranger);


    }
//    Сделайте метод, который выводит на экран описание студента. В описание надо включать качества, которые присущи всем студентам,
//    плюс качества, которые присущи студенту, потому что он учится на конкретном факультете.
    public static void descriptionStudent(Hogwarts student) { //Сделайте метод, который выводит на экран описание студента
        System.out.println(student);
    }


}