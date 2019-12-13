/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg353.lab.pkg4;

/**
 *
 * @author jasonsnare
 */
public class NotGate extends Gate {

    final private Gate a;

    public NotGate(Gate a) {
        this.a = a;
    }

    public boolean eval() {
        return !a.eval();
    }
}
