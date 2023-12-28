package Services;

import java.util.List;

import Domain.Product;

public class VendingMachine {
    private Holder hold;
    private CoinDispenser coin;
    private Display disp;
    private List<Product> assort;

    public VendingMachine(Holder hold, CoinDispenser coin, Display disp, List<Product> assort) {
        this.hold = hold;
        this.coin = coin;
        this.disp = disp;
        this.assort = assort;
    }

    public void buyProduct() {

    }

    public void releaseProduct() {

    }

    public Holder getHold() {
        return hold;
    }

    public void setHold(Holder hold) {
        this.hold = hold;
    }

    public CoinDispenser getCoin() {
        return coin;
    }

    public void setCoin(CoinDispenser coin) {
        this.coin = coin;
    }

    public Display getDisp() {
        return disp;
    }

    public void setDisp(Display disp) {
        this.disp = disp;
    }

    public List<Product> getAssort() {
        return assort;
    }

    public void setAssort(List<Product> assort) {
        this.assort = assort;
    }

}