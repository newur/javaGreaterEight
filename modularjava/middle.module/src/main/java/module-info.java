module middlemodule {
    exports com.kn.middle;

    requires transitive bottommodule;   // the 'transitive' makes bottom module available to top module

    // there is also 'open .. to ' / 'opens ... to' to allow reflective access to other modules
}