public class SlytherinStudent extends Hogwarts {
    private final int ambition;
    private final int determination;
    private final int cunning;
    private final int lustForPower;

    public SlytherinStudent(String name, int magicPower, int transgressionDistance, int ambition, int determination, int cunning, int lustForPower) {
        super(name, magicPower, transgressionDistance);
        this.ambition = ambition;
        this.determination = determination;
        this.cunning = cunning;
        this.lustForPower = lustForPower;
    }

    public void betterThan(SlytherinStudent student) {
        int thisSum = this.ambition + this.determination + this.cunning + this.lustForPower;
        int thatSum = student.ambition + student.determination + student.cunning + student.lustForPower;
        if (thisSum > thatSum) {
            System.out.println(this.getName() + " лучший Слизеринец, чем " + student.getName());
        } else if (thisSum < thatSum) {
            System.out.println(student.getName() + " лучший Слизеринец, чем " + this.getName());
        } else {
            System.out.println(this.getName() + " и " + student.getName() + " равны по личным качествам");
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nambition " + ambition +
                "\ndetermination " + determination +
                "\ncunning " + cunning +
                "\nlust for power " + lustForPower;
    }
}
