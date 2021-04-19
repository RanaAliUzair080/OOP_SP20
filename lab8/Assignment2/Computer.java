/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;

/**
 *
 * @author Rana Alie
 */
public class Computer {
    protected String wordSize ;
    protected String memorySize ;
    protected String storageSize ;
    protected String speed ;

    public Computer(String wordSize, String memorySize, String storageSize, String speed) {
        this.wordSize = wordSize;
        this.memorySize = memorySize;
        this.storageSize = storageSize;
        this.speed = speed;
    }

    public Computer() {
        this.memorySize = "00";
        this.speed = "00";
        this.storageSize = "00";
        this.wordSize = "00";
    }

    public String getWordSize() {
        return wordSize;
    }

    public void setWordSize(String wordSize) {
        this.wordSize = wordSize;
    }

    public String getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(String memorySize) {
        this.memorySize = memorySize;
    }

    public String getStorageSize() {
        return storageSize;
    }

    public void setStorageSize(String storageSize) {
        this.storageSize = storageSize;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }
    
    public void display(){
        System.out.println("Word Size : " + wordSize);
        System.out.println("Memory Size : " + memorySize);
        System.out.println("Storage Size : " + storageSize);
        System.out.println("Speed :" + speed);
    }
}
