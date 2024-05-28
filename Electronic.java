public interface Electronic {

    boolean onoroff = false;

    boolean on();

    boolean off();


    default  void electronic(){
        if (onoroff){
            System.out.println("Default Status is off");
        }
    }

}
