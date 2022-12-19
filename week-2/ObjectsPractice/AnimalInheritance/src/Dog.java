import java.util.Objects;

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

    @Override
    public String toString() {
        return "Dog{" +
                "walkDistancePref=" + this.walkDistancePref +
                ", age=" + this.age +
                ", name='" + this.name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null) {
            return false;
        }

        if (this.getClass() != obj.getClass()) {
            return false;
        }

        Dog other = (Dog)obj;

        return Objects.equals(this.name, other.name) &&
                Objects.equals(this.age, other.age);
    }
}
