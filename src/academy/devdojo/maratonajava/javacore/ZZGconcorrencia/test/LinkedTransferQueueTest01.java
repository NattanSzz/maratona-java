package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.test;

import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TransferQueue;

public class LinkedTransferQueueTest01 {
    public static void main(String[] args) throws InterruptedException {
        TransferQueue<Object> tq = new LinkedTransferQueue<>();
        System.out.println(tq.add("Willian"));
        System.out.println(tq.offer("Willian"));
        System.out.println(tq.offer("Willian", 10, TimeUnit.SECONDS));
        tq.put("devdojo");
    }
}
