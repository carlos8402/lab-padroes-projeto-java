package Singleton;

public class SingletonLazyHolder {

    private static  class InstancerHolder {
        private static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }
       private SingletonLazyHolder() {
          super();
         }

         public  static SingletonLazyHolder getInstancia() {
        return InstancerHolder.instancia;
    }
}
