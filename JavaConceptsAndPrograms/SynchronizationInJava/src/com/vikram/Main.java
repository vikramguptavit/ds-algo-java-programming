package com.vikram;

public class Main {
    public static void main(String[] args) {
        Balance balance = new Balance();
        Transaction thread0 = new Transaction(balance);
        Transaction thread1 = new Transaction(balance);
        thread0.start();
        thread1.start();
    }
}

class Balance {
    public int totalBal = 100;

    public void addBalance() {
        totalBal = totalBal + 100;
    }

    public void subBalance() {
        totalBal = totalBal - 100;
    }
}

class Transaction extends Thread {
    public Balance curBal;

    public Transaction(Balance bal) {
        this.curBal = bal;
    }

    @Override
    public void run() {
        try{
            switch (currentThread().getName()) {
                case "Thread-0":
                    curBal.addBalance();
                    Thread.sleep(1000);
                    break;
                case "Thread-1":
                    curBal.subBalance();
                    Thread.sleep(1000);
                    break;
            }
            System.out.println(currentThread().getName() + " Balance : " + curBal.totalBal);

        }catch (InterruptedException e){

        }
    }
}