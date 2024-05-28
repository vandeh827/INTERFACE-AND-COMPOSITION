public class RAM {
    String name = "DR4";

    @Override
    public String toString() {
        return "RAM{" +
                "name='" + name + '\'' +
                ", realspeed=" + realspeed +
                ", writespeed=" + writespeed +
                '}';
    }

    int realspeed = 3;

    float writespeed = 15;
}
