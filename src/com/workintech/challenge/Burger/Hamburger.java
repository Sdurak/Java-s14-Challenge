package com.workintech.challenge.Burger;


public class Hamburger implements Addable {
    private BreadRollType breadRollType;
    private String meat;
    private double price;
    private String name;
    private Addition addition1;

    private Addition addition2;

    private Addition addition3;

    private Addition addition4;

    public Hamburger(String name, double price, BreadRollType breadRollType) {
        this.name = name;
        this.breadRollType = breadRollType;
        this.price = price;
        this.meat = "Normal";
    }

    public String getName() {
        return name;
    }

    public BreadRollType getBreadRollType() {
        return breadRollType;
    }

    public String getMeat() {
        return meat;
    }

    public double getPrice() {
        return price;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

//    public void addHamburgerAddition1(String addition, double price) { //bunlar
//        this.addition1Name=addition1Name;
//        this.addition1Price=price;
//    }
//    public void addHamburgerAddition2(String name, double price) {
//        this.addition2Name=addition2Name;
//        this.addition2Price=price;
//    }
//    public void addHamburgerAddition3(String name, double price) {
//        this.addition3Name=addition3Name;
//        this.addition3Price=price;
//    }
//    public void addHamburgerAddition4(String name, double price) {
//        this.addition4Name=addition4Name;
//        this.addition4Price=price;
//    }

    //bu kadar tekrar varsa bu istenilen bir dizayn değildir.

    @Override
    public void addAddition(String additionName, double price) {
        if (addition1 == null) {
            this.addition1 = new Addition(additionName, price);
        } else if (addition2 == null) {
            this.addition2 = new Addition(additionName, price);
        } else if (addition3 == null) {
            this.addition3 = new Addition(additionName, price);
        } else if (addition4 == null) {
            this.addition4 = new Addition(additionName, price);
        } else {
            System.out.println("Burger is full");
        }
    }
    public String itemize() {
        StringBuilder builder = new StringBuilder();
        builder.append("Name: " + name + "\n");
        builder.append("Meat: " + meat + "\n");
        builder.append("BreadRollType: " + breadRollType + "\n");

        if (addition1 != null) {
            builder.append("Addition1: " + addition1.getAdditionName() + "\n");
            price = price + addition1.getAdditionPrice();
        }
        if (addition2 != null) {
            builder.append("Addition2: " + addition2.getAdditionName() + "\n");
            price = price + addition2.getAdditionPrice();
        }
        if (addition3 != null) {
            builder.append("Addition3: " + addition3.getAdditionName() + "\n");
            price = price + addition3.getAdditionPrice();
        }
        if (addition4 != null) {
            builder.append("Addition4: " + addition4.getAdditionName() + "\n");
            price = price + addition4.getAdditionPrice();
        }

        return builder.toString();
    }

        public double itemizeHamburger () { //toplam ücreti döndüğü için void değil double
            String explanation = itemize();
            System.out.println(explanation);

            System.out.println("Price: " + getPrice());
            System.out.println("------------------------");
            return getPrice();
        }





}
