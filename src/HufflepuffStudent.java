public class HufflepuffStudent extends Hogwarts {
    private final int industriousness;
    private final int loyalty;
    private final int honesty;

    public HufflepuffStudent(String name, int magicPower, int transgressionDistance, int industriousness, int loyalty, int honesty) {
        super(name, magicPower, transgressionDistance);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public void betterThan(HufflepuffStudent student) {
        int thisSum = this.industriousness + this.loyalty + this.honesty;
        int thatSum = student.industriousness + student.loyalty + student.honesty;
        if (thisSum > thatSum) {
            System.out.println(this.getName() + " лучший Пуффендуец, чем " + student.getName());
        } else if (thisSum < thatSum) {
            System.out.println(student.getName() + " лучший Пуффендуец, чем " + this.getName());
        } else {
            System.out.println(this.getName() + " и " + student.getName() + " равны по личным качествам");
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nindustriousness " + industriousness +
                "\nloyalty " + loyalty +
                "\nhonesty " + honesty;
    }
}
