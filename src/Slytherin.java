public class Slytherin extends Hogwarts {
    private final int ambition;
    private final int determination;
    private final int cunning;
    private final int lustForPower;

    public Slytherin(String name, int magicPower, int transgressionDistance, int ambition, int determination, int cunning, int lustForPower) {
        super(name, magicPower, transgressionDistance);
        this.ambition = ambition;
        this.determination = determination;
        this.cunning = cunning;
        this.lustForPower = lustForPower;
    }

    @Override
    public void betterThan(Hogwarts student){
        if(student instanceof Slytherin){
            Slytherin pers = (Slytherin) student;
            int thisSum = this.ambition + this.determination + this.cunning + this.lustForPower;
            int thatSum = pers.ambition + pers.determination + pers.cunning + pers.lustForPower;
            if(thisSum > thatSum){
                System.out.println(this.getName() + " лучший Слизеринец, чем " + pers.getName());
            } else if (thisSum < thatSum){
                System.out.println(pers.getName() + " лучший Слизеринец, чем " + this.getName());
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
                "\nambition " + ambition +
                "\ndetermination " + determination +
                "\ncunning " + cunning +
                "\nlust for power " + lustForPower;
    }
}
