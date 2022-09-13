public class Main {
    public static void main(String[] args) {
        GryffindorStudent hp = new GryffindorStudent("Гарри Поттер", 67, 67, 60, 57, 63);
        GryffindorStudent gGrey = new GryffindorStudent("Гермиона Грейнджер", 75, 55, 37, 50, 47);
        GryffindorStudent rw = new GryffindorStudent("Рон Уизли", 45, 34, 34, 70, 43);

        HufflepuffStudent zs = new HufflepuffStudent("Захария Смит", 54, 46, 46, 46, 57);
        HufflepuffStudent sd = new HufflepuffStudent("Седрик Диггори", 75, 37, 32, 34, 32);
        HufflepuffStudent jff = new HufflepuffStudent("Джастин Финч-Флетчли", 46, 19, 63, 61, 53);

        RavenclawStudent jj = new RavenclawStudent("Чжоу Чанг", 39, 54, 51, 51, 46);
        RavenclawStudent pp = new RavenclawStudent("Падма Патил", 69, 61, 49, 52, 34);
        RavenclawStudent mb = new RavenclawStudent("Маркус Белби", 57, 48, 54, 53, 51);

        SlytherinStudent dm = new SlytherinStudent("Драко Малфой", 65, 37, 70, 62, 65, 56);
        SlytherinStudent gm = new SlytherinStudent("Грэхэм Монтегю", 35, 29, 16, 46, 31, 41);
        SlytherinStudent gGoil = new SlytherinStudent("Грегори Гойл", 38, 25, 15, 51, 23, 23);

        hp.betterThan(gGrey);
        hp.betterThan(dm);
        zs.betterThan(sd);
        jj.betterThan(mb);
        dm.betterThan(gm);
        System.out.println();

        Hogwarts[] hogwarts = {hp, gGrey, rw, zs, sd, jff, jj, pp, mb, dm, gm, gGoil};
        for (Hogwarts student : hogwarts) {
            student.printStudentCharacteristic();
        }
    }
}