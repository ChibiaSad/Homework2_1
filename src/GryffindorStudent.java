public class GryffindorStudent extends Hogwarts {
    private final int nobility;
    private final int honor;
    private final int bravery;

    public GryffindorStudent(String name, int magicPower, int transgressionDistance, int nobility, int honor, int bravery) {
        super(name, magicPower, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public void betterThan(GryffindorStudent student) {
        int thisSum = this.nobility + this.bravery + this.honor;
        int thatSum = student.bravery + student.nobility + student.honor;
        if (thisSum > thatSum) {
            System.out.println(this.getName() + " лучший Гриффиндорец, чем " + student.getName());
        } else if (thisSum < thatSum) {
            System.out.println(student.getName() + " лучший Гриффиндорец, чем " + this.getName());
        } else {
            System.out.println(this.getName() + " и " + student.getName() + " равны по личным качествам");
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nnobility " + nobility +
                "\nhonor " + honor +
                "\nbravery " + bravery;
    }
}
