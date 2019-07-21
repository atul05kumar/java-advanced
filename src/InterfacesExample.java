public class InterfacesExample  implements ProvideFeatures {

    public void InterfacesDemo() {

        ProvideFeatures p;
        p = new InterfacesExample();
        System.out.println();
        p.print();
        p.show();

       /*Static method defined in interface can be used as is and we need to create a instance of the interface*/
       ProvideFeatures.printStatic();

    }

    @Override
    public void show() {
        System.out.println("Class : Interfaces:show");
    }
}

interface ProvideFeatures {
    /*By Default, visibility of methods in interface are public abstract, hence we do not need to write it explicitly*/
    void show();

    /*Starting Java 8, we can provide a default implementation of the method
    * If the implementation is provided here, then we need not to override it again in implementor class.
    * This also creates a problem, where a implementor class implements two interfaces having same signature.
    * If such ambiguity arises, then we must override and define our implementation in the class.
    * We must write default key word, if we are defining the method in interface itself.
    **/
    default void print() {
        System.out.println("Interface : ProvideFeatures:print");
    }

    /*Starting Java 8, we can define static methods as well in interface which can be directly called even before instantiating the object of interface*/
    static void printStatic() {
        System.out.println("Interface : Static : ProvideFeatures:printStatic");
    }
}
