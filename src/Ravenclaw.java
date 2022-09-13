public class Ravenclaw extends Hogwarts {
    private final int mind;
    private final int wit;
    private final int creation;

    public Ravenclaw(String name, int magicPower, int transgressionDistance, int mind, int wit, int creation) {
        super(name, magicPower, transgressionDistance);
        this.mind = mind;
        this.wit = wit;
        this.creation = creation;
    }

    @Override
    public void betterThan(Hogwarts student){
        if(student instanceof Ravenclaw){
            Ravenclaw pers = (Ravenclaw) student;
            int thisSum = this.mind + this.wit + this.creation;
            int thatSum = pers.mind + pers.creation + pers.wit;
            if(thisSum > thatSum){
                System.out.println(this.getName() + " лучший Когтевранец, чем " + pers.getName());
            } else if(thisSum < thatSum){
                System.out.println(pers.getName() + " лучший Когтевранец, чем " + this.getName());
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
                "\nmind " + mind +
                "\nwit " + wit +
                "\ncreation " + creation;
    }
}
