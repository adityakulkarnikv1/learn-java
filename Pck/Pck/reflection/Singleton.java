package reflection;
public class Singleton {
    static class SingletonHolder {
        static final Singleton SINGLETON = new Singleton();
    }

    private Singleton() {
        System.out.println("new Singleton()");
    }

    public static Singleton getSingleton() {
    	System.out.println("SingletonHolder.SINGLETON="+SingletonHolder.SINGLETON);
        return SingletonHolder.SINGLETON;
    }

    public static void main(String[] args) {
        System.out.println("main() started.");
        getSingleton();
        getSingleton();
        getSingleton();
        Singleton SINGLETON1 = new Singleton();
        Singleton SINGLETON2 = new Singleton();
        System.out.println("SINGLETON1="+SINGLETON1);
        System.out.println("SINGLETON2="+SINGLETON2);
    }
}