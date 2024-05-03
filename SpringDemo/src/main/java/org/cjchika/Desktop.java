package org.cjchika;

public class Desktop implements Computer{
    @Override
    public void compile() {
        System.out.println("Compiling using desktop...");
    }
}
