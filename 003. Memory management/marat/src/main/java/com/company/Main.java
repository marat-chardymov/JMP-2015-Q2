package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nobody on 01.06.2015.
 */
public class Main {
    public static void main(String[] args) {
        if (args[0].equals("stack")) {
            takeTheStack();
        } else if (args[0].equals("memory")) {
            takeTheMemory();
        } else if (args[0].equals("perm")) {
            takePermGen("I AM THE LAW");
        }
    }


    private static void takeTheStack() {
        takeTheStack();
    }

    private static void takeTheMemory() {
        List objects = new ArrayList();
        while (true) {
            Object obj = new Object();
            objects.add(obj);
        }
    }

    // works only on java 6
    private static void takePermGen(String str) {
        takePermGen((str + str).intern());
    }
}
