package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Membership member = new Membership("Max");
        Membership member2 = new Membership("Kani","Gold");

        System.out.println(member2.getSummary());
        System.out.println(member.getSummary());
    }
}
