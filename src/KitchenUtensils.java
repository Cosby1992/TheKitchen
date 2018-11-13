import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;

import static javafx.scene.paint.Color.BLACK;
import static javafx.scene.paint.Color.valueOf;

public class KitchenUtensils implements ToolInterface {


    //Variable
    private String toolName = "Piskeris";
    private Color color = new Color(0,0,0,1);
    private int numOfUses = 0;
    private double lenght = 20;
    private boolean broken = false;


    //no-arg constructor
    public KitchenUtensils() {
    }


    //Constructor taking 2 parameters "name" and double lenght
    public KitchenUtensils(String toolName, double lenght) {
        this.toolName = toolName;
        this.lenght = lenght;
    }


    //Constructor taking all variables as parameters
    public KitchenUtensils(String toolName, Color color, int numOfUses, double lenght, boolean broken) {
        this.toolName = toolName;
        this.color = color;
        this.numOfUses = numOfUses;
        this.lenght = lenght;
        this.broken = broken;
    }

    //Methods

    //use kitchen tool

    public void useTool(){

        if(getNumOfUses()<20 && isBroken()==false) {
            numOfUses++;
        }
        else{
            System.out.println("Sorry, " + getToolName() + " is unfortunately broken :(");
        }
    }

    public void fixTool(){

        if(getNumOfUses()>0 || isBroken()==true) {
            setBroken(false);
            setNumOfUses(0);
            System.out.println("Your tool is now in perfect condition");
        }
        else{
            System.out.println("Your tool is already in mint condition :)");
        }
    }

    public boolean useableAsWeapon(){

        if(getToolName().equalsIgnoreCase("kniv") && getLenght()>7 || getToolName().equalsIgnoreCase("kagerulle") && getLenght()>15 || getToolName().equalsIgnoreCase("gaffel") && getLenght()>10 ){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean fitsInDishwasher(){
        if(getLenght()<22){
            return true;
        }
        else{
            return false;
        }

    }

    @Override
    public String toString(){

        return "Tool name = " + getToolName() + "\nTool Color = " + getColor().toString() + "\nTool used " + getNumOfUses() + " times\nTool length = " + getLenght() + "\nTool broken = " + isBroken();
    }


    @Override
    public void muchWow() {
        System.out.println("Much WOW!");
    }

    @Override
    public boolean uGotBeef() {
        return true;
    }

    //Getters and setters
    public String getToolName() {
        return toolName;
    }

    public void setToolName(String toolName) {
        this.toolName = toolName;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getNumOfUses() {
        return numOfUses;
    }

    public void setNumOfUses(int numOfUses) {
        this.numOfUses = numOfUses;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public boolean isBroken() {
        return broken;
    }

    public void setBroken(boolean broken) {
        this.broken = broken;
    }
}
