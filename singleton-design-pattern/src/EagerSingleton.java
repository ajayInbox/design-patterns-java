public class EagerSingleton {

    /*
    This is eager instantiation of singleton
    when JVM load class it will create object irrespective if it
    is being used or not

    drawback: object is there even if there is no usecase.
     */

    private static final EagerSingleton instance = new EagerSingleton();

    private EagerSingleton(){};

    public static EagerSingleton getInstance(){
        return instance;
    }

    public void showMsg(){
        System.out.println("From EagerSingleton class.");
    }
}
