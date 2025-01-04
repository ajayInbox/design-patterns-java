import java.io.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        LazySingleton lazySingleton = LazySingleton.getInstance();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("object.obj"));
        objectOutputStream.writeObject(lazySingleton);
        objectOutputStream.close();
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("object.obj"));
        LazySingleton deserializedLazy = (LazySingleton) objectInputStream.readObject();
        objectInputStream.close();
        System.out.println("Object 1 :" + lazySingleton.hashCode());
        System.out.println("Object 2 :" + deserializedLazy.hashCode());

        SerializeSIngleton serializeSIngleton = SerializeSIngleton.getInstance();
        ObjectOutputStream objectOutputStream1 = new ObjectOutputStream(new FileOutputStream("object1.obj"));
        objectOutputStream1.writeObject(serializeSIngleton);
        objectOutputStream.close();
        ObjectInputStream objectInputStream1 = new ObjectInputStream(new FileInputStream("object1.obj"));
        SerializeSIngleton readObject = (SerializeSIngleton) objectInputStream1.readObject();
        objectInputStream.close();
        System.out.println("Object 1 :" + serializeSIngleton.hashCode());
        System.out.println("Object 2 :" + readObject.hashCode());
    }
}