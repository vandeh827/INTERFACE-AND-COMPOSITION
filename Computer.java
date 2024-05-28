public class Computer implements Electronic {

   RAM ram;
   Processor cpu;

    public Computer(Processor cpu, RAM ram, Storage storage) {
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
    }

    Storage storage;

    @Override
    public String toString() {
        return "Computer{" +
                "ram=" + ram +
                ", cpu=" + cpu +
                ", storage=" + storage +
                '}';
    }

    @Override
    public boolean on() {
        return false;
    }

    @Override
    public boolean off() {
        return false;
    }
}
