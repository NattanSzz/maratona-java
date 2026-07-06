package academy.devdojo.maratonajava.javacore.ZZFthreads.test;

import academy.devdojo.maratonajava.javacore.ZZFthreads.dominio.Account;

public class ThreadAccountTest01 implements Runnable {
    private Account account = new Account();
    public static void main(String[] args) {
        ThreadAccountTest01 trhreadAccountTest = new ThreadAccountTest01();
        Thread t1 = new Thread(trhreadAccountTest, "Hestia");
        Thread t2 = new Thread(trhreadAccountTest, "Bell Cranel");
        t1.start();
        t2.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            withdrawal(10);
            if(account.getBalance() < 0) {
                System.out.println("FODEO");
            }
        }
    }

    private synchronized void withdrawal(int amount) {
        if(account.getBalance() >= amount){
            System.out.println(Thread.currentThread().getName() + " está indo sacar dinheiro");
            account.withdrawal(amount);
            System.out.println(Thread.currentThread().getName() + " completou o saque. Valor da conta: " + account.getBalance());
        }else{
            System.out.println("Sem dinheiro para " + Thread.currentThread().getName() + " efetuar o saque " + account.getBalance());
        }
    }
}
