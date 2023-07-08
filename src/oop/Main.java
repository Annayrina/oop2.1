package oop;

public class Main {
    public static void main(String[] args) {
        FacultyGriffindor harryPotter = new FacultyGriffindor("Гарри Поттер",
                90,
                25,
                98,
                99,
                89);
        FacultyGriffindor ronWeasley = new FacultyGriffindor("Рон Уизли",
                75,
                20,
                75,
                84,
                45);
        FacultyGriffindor hermioneGranger = new FacultyGriffindor("Гермиона Грейнджер",
                89,
                20,
                84,
                96,
                80);
        FacultyHufflepuff cedricDiggory = new FacultyHufflepuff("Седрик Диггори",
                66,
                25,
                100,
                100,
                85);
        FacultyHufflepuff justinFinchFletchley = new FacultyHufflepuff("Джастин Финч-Флетчли",
                30,
                10,
                70,
                15,
                80);
        FacultyHufflepuff zachariasSmith = new FacultyHufflepuff("Захария Смит",
                15,
                20,
                48,
                45,
                80);
        FacultySlytherin dracoMalfoy = new FacultySlytherin("Драко Малфой",
                20,
                15,
                17,
                24,
                16,
                40,
                89);
        FacultySlytherin grahamMontague = new FacultySlytherin("Грэхэм Монтегю",
                70,
                75,
                24,
                44,
                5,
                24,
                56);
        FacultySlytherin gregoryGoyle = new FacultySlytherin("Грегори Гойл",
                55,
                50,
                52,
                54,
                50,
                56,
                78);
        FacultyRavenclaw choChang = new FacultyRavenclaw("Чжоу Чанг",
                65,
                54,
                54,
                54,
                56);
        FacultyRavenclaw padmaPatil = new FacultyRavenclaw("Падма Патил",
                60,
                50,
                54,
                59,
                57);
        FacultyRavenclaw marcusBelby = new FacultyRavenclaw("Маркус Белби",
                70,
                55,
                60,
                55,
                45);
        System.out.println(harryPotter);
        System.out.println(hermioneGranger);
        System.out.println(ronWeasley);
        System.out.println(cedricDiggory);
        System.out.println(justinFinchFletchley);
        System.out.println(zachariasSmith);
        System.out.println(dracoMalfoy);
        System.out.println(gregoryGoyle);
        System.out.println(choChang);
        System.out.println(padmaPatil);
        System.out.println(marcusBelby);
        System.out.println(grahamMontague);
        hermioneGranger.printCompare(harryPotter);
        hermioneGranger.printCompare(dracoMalfoy);
        dracoMalfoy.printCompare(harryPotter);
        cedricDiggory.printCompare(justinFinchFletchley);
    }
}