package org.example.logging;

public class FileLogger implements Logger{

    @Override
    public void log(String data) {
        System.out.println(data + " logged to file");
    }
}
