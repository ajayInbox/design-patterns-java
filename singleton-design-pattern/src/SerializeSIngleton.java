import java.io.Serial;
import java.io.Serializable;

public class SerializeSIngleton implements Serializable {

    /*
    if we use object to serialize and deserialize then traditional way
    will not work as for everytime during deserialize it will return
    new object.

     */

    private static SerializeSIngleton instance = null;

    private SerializeSIngleton(){}

    public static SerializeSIngleton getInstance(){
        if(instance == null){
            instance = new SerializeSIngleton();
        }
        return instance;
    }

    public void showMsg(){
        System.out.println("From SerializeSIngleton class.");
    }

    /*
    this method will be responsible for when we deserialize itt will
    return existing object only.
     */
    @Serial
    protected Object readResolve(){
        return instance;
    }


}
