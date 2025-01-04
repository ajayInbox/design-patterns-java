public class MultiThreadSingleton {

    /*
    this impl will work for multithreaded applications.
    getInstance() method has synchronized block so only accessible with
    one thread at a time.
     */

    private static MultiThreadSingleton instance = null;

    private MultiThreadSingleton(){};

    public static MultiThreadSingleton getInstance(){

        //if instance is null then it will go in this block
        if(instance == null){
            synchronized (MultiThreadSingleton.class) {

                // second time null check ensure that if first thread executed
                // this block then instance is already created so second thread
                // come to this block and check if instance is null if not then no need
                // to create just return existing one.
                if(instance == null){
                    instance = new MultiThreadSingleton();
                }
            }
        }
        return instance;
    }

    public void showMsg(){
        System.out.println("From MultiThreadSingleton class.");
    }
}
