package cn.happymaya.ndp.principle.lod;

/**
 * 钱包
 */
public class Wallet {
    private float value;

    public float getTotalMoney() {
        return value;
    }

    public void setTotalValue(float value) {
        this.value = value;
    }

    public void addMoney(float deposit) {
        value = value + deposit;
    }

    public void subtractMoney(float debit) {
        value = value - debit;
    }
}
