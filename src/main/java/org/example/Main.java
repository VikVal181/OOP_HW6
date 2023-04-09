package org.example;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ListOfWater listWaters = new ListOfWater();
        listWaters.setListWater(Arrays.asList(
                BottelOfWaterBuilder.getInstance().setName("Sviatoy istochnik").setCost(50).setVolume(2).build(),
                BottelOfWaterBuilder.getInstance().setName("Fruto niania").setCost(80).setVolume(0.5).build(),
                BottelOfWaterBuilder.getInstance().setName("Bon Aqua").setCost(54).setVolume(1).build()));
        GeneralVendingMachine <BottleOfWater> waterMachine = new GeneralVendingMachine<>(listWaters.getListWater());
        System.out.println(waterMachine.getProduct("Bon Aqua"));

        ListOfBeer listBeers = new ListOfBeer();
        listBeers.setListBeer(Arrays.asList(
                BeerBuilder.getInstance().setName("Amstel").setCost(80).setVolume(1).build(),
                BeerBuilder.getInstance().setName("Baltica").setCost(44.5).setVolume(1).build(),
                BeerBuilder.getInstance().setName("Nevskoe").setCost(120.5).setVolume(2).build()));
        GeneralVendingMachine <Beer> beerMachine = new GeneralVendingMachine<>(listBeers.getListBeer());
        System.out.println(beerMachine.getProduct("Baltica"));

        ListOfChips listChips= new ListOfChips();
        listChips.setListChips(Arrays.asList(
                ChipsBuilder.getInstance().setName("Lays").setCost(70).setWeight(100).setFlavor("Onion").build(),
                ChipsBuilder.getInstance().setName("Russkaia Kortoshka").setCost(30).setWeight(150).setFlavor("Chicken").build(),
                ChipsBuilder.getInstance().setName("Pringles").setCost(250).setWeight(200).setFlavor("Pepper").build()));
        GeneralVendingMachine <Chips> chipsMachine = new GeneralVendingMachine<>(listChips.getListChips());
        System.out.println(chipsMachine.getProduct("Pringles"));
    }
}

