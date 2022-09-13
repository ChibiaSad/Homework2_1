public class Hogwarts {
    private final String name;
    private final int magicPower;
    private final int transgressionDistance;

    public Hogwarts(String name, int magicPower, int transgressionDistance) {
        this.name = name;
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }

    public String getName() {
        return name;
    }

    public void printStudentCharacteristic(){
        System.out.println(this);
        System.out.println();
    }

    public void betterThan(Hogwarts student){
        int thisSum = this.magicPower + this.transgressionDistance;
        int thatSum = student.magicPower + student.transgressionDistance;
        if(thisSum > thatSum){
            System.out.println(this.name + " обладает большей мощностью магии, чем " + student.getName());
        } else if(thisSum < thatSum){
            System.out.println(student.getName() + " обладает большей мощностью магии, чем " + this.name);
        } else {
            System.out.println(this.getName() + " и " + student.getName() + " равны по силе");
        }
    }

    @Override
    public String toString() {
        return "Faculty " + this.getClass().getName() + ": " + name +
                "\nmagic power " + magicPower +
                "\ndistance of transgression " + transgressionDistance;
    }
}
