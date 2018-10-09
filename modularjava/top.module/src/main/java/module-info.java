module topmodule {

    requires middlemodule;

    requires java.base;     // for IntelliJ: step into with Ctrl + Alt + B to see what is defined in 'base' module
                            // base module is implicitly added always
}