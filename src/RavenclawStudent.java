public class RavenclawStudent extends Hogwarts {
    private final int mind;
    private final int wit;
    private final int creation;

    public RavenclawStudent(String name, int magicPower, int transgressionDistance, int mind, int wit, int creation) {
        super(name, magicPower, transgressionDistance);
        this.mind = mind;
        this.wit = wit;
        this.creation = creation;
    }

    public void betterThan(RavenclawStudent student) {
        int thisSum = this.mind + this.wit + this.creation;
        int thatSum = student.mind + student.creation + student.wit;
        if (thisSum > thatSum) {
            System.out.println(this.getName() + " лучший Когтевранец, чем " + student.getName());
        } else if (thisSum < thatSum) {
            System.out.println(student.getName() + " лучший Когтевранец, чем " + this.getName());
        } else {
            System.out.println(this.getName() + " и " + student.getName() + " равны по личным качествам");
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nmind " + mind +
                "\nwit " + wit +
                "\ncreation " + creation;
    }
}
