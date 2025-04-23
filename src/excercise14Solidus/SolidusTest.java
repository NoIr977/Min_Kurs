package excercise14Solidus;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class SolidusTest {
    @Test

    public void testGetMerch(){

        String solidus = "Valuta";

        ValutaSolidus money = new ValutaSolidus(solidus);

        money.setMerch("Valuta");
        assertEquals("Valuta", money.getValutaSolidus());
    }
@Test
    public void testWhatIGets(){
        ValutaSolidus money = new ValutaSolidus("Hoodie");
        for(int i =0; i < 20; i++){
            money.login();
        }
        assertEquals("Hoodie", money.getMerch());
}
@Test
    public void testWillIGetTshir(){
        ValutaSolidus money = new ValutaSolidus("t-shirt");
        for(int i=0; i <16; i++){
            money.login();
        }
        assertEquals("t-shirt",money.getMerch());
}
    @Test
    public void testWillIGetStickers(){
        ValutaSolidus money = new ValutaSolidus("Stickers");
        for(int i=0; i <5; i++){
            money.login();
        }
        assertEquals("Stickers",money.getMerch());
    }
}
