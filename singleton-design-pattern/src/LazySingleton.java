import java.io.Serializable;

public class LazySingleton implements Serializable {

    /*
    But this implementation is not thread safe it can be used
    in not-multi thread applications.
     */

    private static LazySingleton instance = null;

    private LazySingleton(){}

    public static LazySingleton getInstance(){
        if(instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }

    public void showMsg(){
        System.out.println("From LazySingleton class.");
    }
}
