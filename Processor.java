public class Processor {
    String type = "core i 5";

    @Override
    public String toString() {
        return "Processor{" +
                "type='" + type + '\'' +
                ", numberofcores=" + numberofcores +
                '}';
    }

    int numberofcores = 5;
}
