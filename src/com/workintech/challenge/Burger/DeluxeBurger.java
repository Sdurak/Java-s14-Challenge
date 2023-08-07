package com.workintech.challenge.Burger;

public class DeluxeBurger extends Hamburger {

    private String drink;
    private String cips;
//    public DeluxeBurger(String name, String meat, double price, String breadRollType,String drink,String cips) {
//        super(name, meat, 19.1, breadRollType);
//        this.drink=drink;
//        this.cips=cips;
//    }
public DeluxeBurger() {
    super("DeluxeBurger", 19.1, BreadRollType.DOUBLE_BURGER);
    super.setMeat("Double");
}

    @Override
    public void addAddition(String additionName, double price) {
        System.out.println("Deluxe Burger için malzeme eklenemez");
    }

//    @Override
//    public void addHamburgerAddition2(String name, double price) {
//        System.out.println("Deluxe burgere malzeme eklenemez.");
//    }
//
//    @Override
//    public void addHamburgerAddition3(String name, double price) {
//        System.out.println("Deluxe burgere malzeme eklenemez.");
//    }
//
//    @Override
//    public void addHamburgerAddition4(String name, double price) {
//        System.out.println("Deluxe burgere malzeme eklenemez.");
//    }
}
