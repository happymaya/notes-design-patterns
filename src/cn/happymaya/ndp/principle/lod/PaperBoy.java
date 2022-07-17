package cn.happymaya.ndp.principle.lod;

/**
 * 收银员
 */
public class PaperBoy {
    public void charge(Customer myCustomer, float payment) {
        payment = 2f;
        Wallet theWallet = myCustomer.getWallet();
        if (theWallet.getTotalMoney() > payment) {
            theWallet.subtractMoney(payment);
        } else {
            //钱不够的处理
        }
    }
}
