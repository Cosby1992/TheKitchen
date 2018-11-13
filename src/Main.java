import javafx.scene.paint.Color;

public class Main {

    public static void main(String[] args) {

        KitchenUtensils kniv = new KitchenUtensils("Kniv", Color.color(1,0,0,1), 0, 25, false);

        KitchenUtensils piskeris = new KitchenUtensils();

        PotsAndPans pan = new PotsAndPans("Pande", Color.color(0,1,0,1), 5, 28, false,true, true);

        System.out.println("Let's take a look on some tools");

        System.out.println("Does kniv fit in the dishwasher? " + kniv.fitsInDishwasher());
        System.out.println("Is kniv usable as a weapon? " + kniv.useableAsWeapon());

        System.out.println("\n" + piskeris.toString());

        System.out.println("Does the pan has a wow effect? " + pan.isWowEffect());

        System.out.println("\nLets brake something...");
        System.out.println("Times the kniv has been used " + kniv.getNumOfUses() + " and is it broken? " + kniv.isBroken());
        kniv.useTool();
        System.out.println("Times the kniv has been used " + kniv.getNumOfUses() + " and is it broken? " + kniv.isBroken());

        kniv.setNumOfUses(25);

        System.out.println("Times the kniv has been used " + kniv.getNumOfUses() + " and is it broken? " + kniv.isBroken());

        System.out.println("Can i use the kniv now? ");
        kniv.useTool();

        System.out.println("\nNow lets fix it! ");
        kniv.fixTool();

        System.out.println("Can i use the kniv now? ");
        kniv.useTool();

        System.out.println("Times the kniv has been used " + kniv.getNumOfUses() + " and is it broken? " + kniv.isBroken());


        int x = pan.getNumOfUses();
        System.out.println("The pan has been used " + x + " times");

        pan.useTool();
        pan.useTool();
        pan.useTool();
        pan.useTool();
        pan.useTool();
        pan.useTool();

        x = pan.getNumOfUses();
        System.out.println("The pan has been used " + x + " times");






    }
}
