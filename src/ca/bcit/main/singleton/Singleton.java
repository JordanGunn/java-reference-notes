package ca.bcit.main.singleton;

public class Singleton {

    // Ensure that a class has only one instance and provide
    // a global point of access to it.

    // Singleton is a way of creating a single object that is shared amongst
    // a bunch of different resources across your application without having
    // to re-create that object or lose any of the info inside of it

    // in essence, there is only ever one type of this object instantiated
    // at a time. All places where the object is used use only one version
    // of the object

    // SINGLETON DISADVANTAGES
    // - Singleton is a global object
    // - Very difficult to test because singleton is needed to anything in application
    // - Creates unnecessary coupling where parts of app are dependent on singleton
    // - **Race condition - Changing parts of the singleton can cause parts of app
    //   to be overwritten or not read correctly, because app is trying to access the same
    //   information at the same time
    // - some people say you should never use a singleton

    // SINGLETON ADVANTAGES
    // - certain sets of small information that needs to be shard throughout your application

    public static void main(String[] args) {

        // using the class from below
        // to instantiate the singleton class:
        A a = A.getInstance();

        // The only way to create an instance of the singleton is
        // by calling the getInstance() method.
        // Even if you call the getInstance() method again, it will return
        // the same instance, restricting the class to only one instantiation
        // of the class.
    }
}

class A {
    // STEPS FOR CREATING A SINGLETON CLASS

    // 1. instantiate object as static
    static A obj = new A();

    // 2. make the constructor private
    private A() {}

    // 3. create a method which will return the current instance
    public static A getInstance() {
        return obj;
    }
}
