package com.algorithm.mybasestruct;

/**
 * Created by jWX640680 on 2019/3/22.
 */
public class MyArray {
    private int[] data;
    private int size;

    public MyArray(int capacity){
        data = new int[capacity];
        this.size = 0;
    }
    public MyArray(){
        this(20);
    }

    public int getSize(){
        return size;
    }
    public int getCapacity(){
        return data.length;
    }
    public void addlast(int e){
        if (getSize() == getCapacity()){
            resize(2*getCapacity());
        }
        this.data[size] = e;
        this.size++;
    }


    private void resize(int capacity){
        int[] temp = new int[capacity];
        for (int i = 0; i < this.size; i++) {
            temp[i] = this.data[i];
        }
        this.data = temp;
    }
}
