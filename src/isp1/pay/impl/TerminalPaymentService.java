package isp1.pay.impl;

import isp1.pay.Payable;
import isp1.pay.PhonePayAble;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Collection;

public class TerminalPaymentService implements Payable {

    @Override
    public void payWebMoney(int amount) {
        System.out.printf("Terminal pay by web money %d\n", amount);
    }

    @Override
    public void payCreditCard(int amount) {
        System.out.printf("Terminal pay by credit card %d\n", amount);
    }

}
