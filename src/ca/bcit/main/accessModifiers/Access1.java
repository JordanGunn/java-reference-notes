package ca.bcit.main.accessModifiers;

public class Access1 {
    // 4 types of java access modifiers
    // DEFAULT, public, private, protected

    // ===============================

    // DEFAULT: No restrictions to access between files
    // all files have total access to data, but ONLY IN THE SAME PACKAGE

    int hours = 3;
    int minutes = 47;

    // ===============================

    // PUBLIC: Same as default, except explicitly stated via
    // public keyword and shared beyond packages

    public int pHours = 3;
    public int pMinutes = 47;

    // ===============================

    // PRIVATE: keeps data private to only this file
    // cannot be accessed from other files

    private final int prHours = 3;
    private final int prMinutes = 47;

    // ===============================

    // PROTECTED:
    // 1. Access variables and methods from within the same package
    // 2. Access variables and methods outside of the package if and only if
    //    the class is a child of the parent with the original method or variable
    private final int proHours = 3;
    private final int proMinutes = 47;

    public int getHours() {
        return hours;
    }
}
