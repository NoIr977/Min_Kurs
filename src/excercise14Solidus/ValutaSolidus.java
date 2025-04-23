package excercise14Solidus;

import java.util.Objects;

public class ValutaSolidus {
    private String solidus;
    private int loginCount = 0;
    private String merch = "normal";
    public ValutaSolidus(String solidus){
        this.solidus = solidus;
    }

    public String getValutaSolidus(){return solidus;
    }
    public void setMerch(String merch) {
        if(Objects.equals(merch,"Hoodie" ) || Objects.equals(merch, "t-shirt") || Objects.equals(merch, "Stickers"))
        {
            this.merch = merch;
        }
    }
    public void login(){
        loginCount++;
        if(loginCount==20){
            merch = "Hoodie";
        }if(loginCount==15){
            merch = "t-shirt";
        }if(loginCount==5) {
            merch = "Stickers";
        }
    }
    public String getMerch() {
        return merch;
    }
}
