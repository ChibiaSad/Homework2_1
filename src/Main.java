public class Main {
    public static void main(String[] args) {
        Gryffindor hp = new Gryffindor("Гарри Поттер", 67, 67, 60, 57, 63);
        Gryffindor gGrey = new Gryffindor("Гермиона Грейнджер", 75, 55, 37, 50, 47);
        Gryffindor rw = new Gryffindor("Рон Уизли", 45, 34, 34, 70, 43);

        Hufflepuff zs = new Hufflepuff("Захария Смит", 54, 46, 46, 46, 57);
        Hufflepuff sd = new Hufflepuff("Седрик Диггори", 75, 37, 32, 34, 32);
        Hufflepuff jff = new Hufflepuff("Джастин Финч-Флетчли", 46, 19, 63, 61, 53);

        Ravenclaw jj = new Ravenclaw("Чжоу Чанг", 39, 54, 51, 51, 46);
        Ravenclaw pp = new Ravenclaw("Падма Патил", 69, 61, 49, 52, 34);
        Ravenclaw mb = new Ravenclaw("Маркус Белби", 57, 48, 54, 53, 51);

        Slytherin dm = new Slytherin("Драко Малфой", 65, 37, 70, 62, 65, 56);
        Slytherin gm = new Slytherin("Грэхэм Монтегю", 35, 29, 16, 46, 31, 41);
        Slytherin gGoil = new Slytherin("Грегори Гойл", 38, 25, 15, 51, 23, 23);

        hp.betterThan(gGrey);
        hp.betterThan(dm);
        zs.betterThan(sd);
        System.out.println();

        Hogwarts[] hogwarts = {hp, gGrey, rw, zs, sd, jff, jj, pp, mb, dm, gm, gGoil};
        for (Hogwarts student : hogwarts) {
            student.printStudentCharacteristic();
        }
    }
}