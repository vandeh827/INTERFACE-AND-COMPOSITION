public class Storage {

    String type = "SSD";

    @Override
    public String toString() {
        return "Storage{" +
                "type='" + type + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", capacity=" + capacity +
                '}';
    }

    String manufacturer = "Samsung";

    int capacity = 512;
}
