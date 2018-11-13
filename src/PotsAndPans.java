import javafx.scene.paint.Color;

public class PotsAndPans extends KitchenUtensils {

    private boolean haveHandle = true;
    private boolean wowEffect = true;


    public PotsAndPans(String toolName, Color color, int numOfUses, double lenght, boolean broken, boolean haveHandle, boolean wowEffect) {
        super(toolName, color, numOfUses, lenght, broken);
        this.haveHandle = haveHandle;
        this.wowEffect = wowEffect;
    }


    public boolean isHaveHandle() {
        return haveHandle;
    }

    public void setHaveHandle(boolean haveHandle) {
        this.haveHandle = haveHandle;
    }

    public boolean isWowEffect() {
        return wowEffect;
    }

    public void setWowEffect(boolean wowEffect) {
        this.wowEffect = wowEffect;
    }
}
