public class Hufflepuff extends Hogwarts {
    private final int industriousness;
    private final int loyalty;
    private final int honesty;

    public Hufflepuff(String name, int magicPower, int transgressionDistance, int industriousness, int loyalty, int honesty) {
        super(name, magicPower, transgressionDistance);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    @Override
    public void betterThan(Hogwarts student){
        if(student instanceof Hufflepuff){
            Hufflepuff pers = (Hufflepuff) student;
            int thisSum = this.industriousness + this.loyalty + this.honesty;
            int thatSum = pers.industriousness + pers.loyalty + pers.honesty;
            if(thisSum > thatSum){
                System.out.println(this.getName() + " лучший Пуффендуец, чем " + pers.getName());
            } else if(thisSum < thatSum){
                System.out.println(pers.getName() + " лучший Пуффендуец, чем " + this.getName());
            } else {
                System.out.println(this.getName() + " и " + pers.getName() + " равны по личным качествам");
            }
        } else {
            super.betterThan(student);
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
