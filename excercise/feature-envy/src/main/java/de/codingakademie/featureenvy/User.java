package de.codingakademie.featureenvy;

public class User {
    private final Wallet wallet = new Wallet();
    private int age;

    User(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public Wallet getWallet() {
        return wallet;
    }

    public String getName() {
        return "anton";
    }
}
