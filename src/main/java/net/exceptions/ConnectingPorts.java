package net.exceptions;


import java.io.IOException;

class PortConnector {

    public PortConnector(int port) throws IOException{
        if (Math.random() > 0.5) {
            throw new IOException();
        }

        throw new RuntimeException();
    }
}


public class ConnectingPorts {

    public static void main(String[] args) throws IOException {
        try {
            PortConnector pc = new PortConnector(10);
        } catch (RuntimeException re) {
            re.printStackTrace();
            System.out.println("This will print");
        }
    }
}