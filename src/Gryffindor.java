public class Gryffindor extends Hogwarts {
    private final int nobility;
    private final int honor;
    private final int bravery;

    public Gryffindor(String name, int magicPower, int transgressionDistance, int nobility, int honor, int bravery) {
        super(name, magicPower, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    @Override
    public void betterThan(Hogwarts student){
        if(student instanceof Gryffindor){
            Gryffindor pers = (Gryffindor) student;
            int thisSum = this.nobility + this.bravery + this.honor;
            int thatSum = pers.bravery + pers.nobility + pers.honor;
            if(thisSum > thatSum){
                System.out.println(this.getName() + " лучший Гриффиндорец, чем " + pers.getName());
            } else if (thisSum < thatSum){
                System.out.println(pers.getName() + " лучший Гриффиндорец, чем " + this.getName());
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
                "\nnobility " + nobility +
                "\nhonor " + honor +
                "\nbravery " + bravery;
    }
}
