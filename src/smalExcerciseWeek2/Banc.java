package smalExcerciseWeek2;

public class Banc {
    private int saldo;

    public Banc( int myMoney){
        saldo = myMoney;
    }
    public void printSaldo(){
        System.out.println("Your saldo is: " + saldo + " sek.");
    }

    public int getSaldo() {
        return saldo;
    }


    public void addAmount(int money){
        saldo += money;
    }

    public void withdrowAmount(int money){
        if(saldo<money){
            System.out.println("You do not have enough money on your account ");
        }else{
            saldo -=money;
        }

    }





}
