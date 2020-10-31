package com.acierto.java11.nio;

import java.nio.file.Path;

public class NioOnlyOneRootRelativizeExample {
    public static void main(String[] args) {
        Path path1 = Path.of("/a/b");
        Path path2 = Path.of("a/b");
        System.out.println(path1.relativize(path2));
    }
}
