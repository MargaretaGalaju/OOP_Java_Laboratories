package OOP.lab2.part_2;
import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("The maximum number of elements:");
        int maxSizeOfQueue = scanner.nextInt();
        Queue myQueueParams = new Queue(maxSizeOfQueue);
        Queue myQueueNoParams = new Queue();
        myQueueParams.push(5);
        myQueueParams.push(7);
        myQueueParams.push(10);
        myQueueParams.push(4);
        myQueueParams.pop();
        myQueueNoParams.push(1);
        myQueueNoParams.push(2);
        myQueueNoParams.push(10);
        myQueueNoParams.push(50);
        myQueueNoParams.push(25);
        System.out.println("Elements of Queue with Params: " + myQueueParams.list + " " + myQueueParams.isFull(maxSizeOfQueue, myQueueParams.list));
        System.out.println("Elements of Queue with noParams: " + myQueueNoParams.list + " " + myQueueNoParams.isFull(0, myQueueNoParams.list));
    }
}
