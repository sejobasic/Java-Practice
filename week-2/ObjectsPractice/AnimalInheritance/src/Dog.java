public class Dog implements MakeNoise {
    private int walkDistancePref;
    private int age;

    private String name;

    public Dog(int walkDistancePref, int age, String name) {
        this.walkDistancePref = walkDistancePref;
        this.age = age;
        this.name = name;
    }

    public void makeNoise() {
        System.out.println("BARK BARK BARK!");
    }

    public int getWalkDistancePref() {
        return walkDistancePref;
    }

    public void setWalkDistancePref(int walkDistancePref) {
        this.walkDistancePref = walkDistancePref;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void bark() {
        System.out.println("Bark!");
    }

}
