package Singleton;

/*  Singleton apressado.
    autor: Carlos Eduardo

 */
public class SingletonEager {
    private  static SingletonEager instancia = new SingletonEager();

    private SingletonEager() {
        super();
    }
    public static SingletonEager getInstancia(){
        return instancia;

    }
}
