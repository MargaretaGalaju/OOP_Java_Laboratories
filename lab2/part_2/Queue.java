package OOP.lab2.part_2;

import java.util.ArrayList;
import java.util.List;

public class Queue {
    private boolean hasParam;
    private int maxSize;
    public List list = new ArrayList();

    public Queue(int maxSize) {
        this.maxSize = maxSize;
        this.list = new ArrayList();
        this.hasParam = true;
    }

    public Queue() {
        this.list = new ArrayList();
        this.hasParam = false;
    }

    public void push(int number) {
        this.list.add(number);
    }

    public void pop() {
        this.list.remove(this.list.get(0));
    }

    public String isFull(int length, List list) {
        if (length > list.size() && this.hasParam) {
            return "Is empty";
        } else {
            return length == 0 && !this.hasParam ? "Is empty" : "Is Full";
        }
    }
}
