package com.company;
public class Main {

    public static void main(String[] args) {
        Animal[] animals = {new Shark(), new Turtle(), new Eagle()};
        for (Animal a : animals) {
            if (a instanceof Shark){
                ((Shark) a).attack();
                if (a.getClass().getName().equals("com.company.Shark")){
                    ((Shark) a).attack();
                    System.out.println("---------------------");
                }
            }
        }
        for (Animal b : animals) {
            if (b instanceof Turtle) {
                ((Turtle) b).swim();
                if (b.getClass().getName().equals("com.company.Turtle")){
                    ((Turtle) b).swim();
                    System.out.println("-----------------------");
                }
            }
        }
        for (Animal c : animals) {
            if (c instanceof Eagle){
                ((Eagle) c).fly();
                if (c.getClass().getName().equals("com.company.Eagle")){
                    ((Eagle) c).fly();
                }
            }
        }


    }
}
