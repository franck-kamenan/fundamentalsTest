package be.intecbrussel.the_notebook.app;

import be.intecbrussel.the_notebook.entities.animal_entities.Carnivore;
import be.intecbrussel.the_notebook.entities.animal_entities.Herbivore;
import be.intecbrussel.the_notebook.entities.animal_entities.Omnivore;
import be.intecbrussel.the_notebook.entities.plant_entities.Bush;
import be.intecbrussel.the_notebook.entities.plant_entities.Flower;
import be.intecbrussel.the_notebook.entities.plant_entities.Tree;
import be.intecbrussel.the_notebook.entities.plant_entities.Weed;
import be.intecbrussel.the_notebook.service.ForestNoteBook;

public class NatureApp
{
    public static void main(String[] args)
    {
        ForestNoteBook myForestNoteBook = new ForestNoteBook();

        Tree myTree = new Tree("MyTreeName");
        Tree myOtherTree = new Tree("MyOtherTreeName");
        Flower myFlower = new Flower("MyFlowerName");
        Weed myWeed = new Weed("MyWeedName");
        Bush myBush = new Bush("MyBushName");

        Herbivore myHerbivore = new Herbivore("MyHerbivoreName");
        Herbivore myOtherHerbivore = new Herbivore("MyOtherHerbivoreName");
        Herbivore myThirdHerbivore = new Herbivore("MyThirdHerbivoreName");
        Carnivore myCarnivore = new Carnivore("MyCarnivoreName");
        Carnivore myOtherCarnivore = new Carnivore("MyOtherCarnivoreName");
        Carnivore myThirdCarnivore = new Carnivore("MyThirdCarnivoreName");
        Omnivore myOmnivore = new Omnivore("MyOmnivoreName");
        Omnivore myOtherOmnivore = new Omnivore("MyOtherOmnivoreName");
        Omnivore myThirdOmnivore = new Omnivore("MyThirdOmnivoreName");

        System.out.println(myTree.getName() + ", " + myOtherTree.getName() + ", " + myFlower.getName() + ", " + myWeed.getName()
                + ", " + myBush.getName()+ ", " + myHerbivore.getName()+ ", " + myOtherHerbivore.getName()+ ", " + myThirdHerbivore.getName()
                + ", " + myCarnivore.getName()+ ", " + myOtherCarnivore.getName()+ ", " + myThirdCarnivore.getName()
                +", " + myOmnivore.getName()+ ", " + myOtherOmnivore.getName()+ ", " + myThirdOmnivore.getName());
    }
}
