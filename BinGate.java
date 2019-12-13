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
public class BinGate extends Gate {

    final private int op;
    final private Gate a, b;
    final public static int AND = 0, NAND = 1, OR = 2, NOR = 3, XNOR = 4, XOR = 5;

    public BinGate(int op, Gate a, Gate b) {
        this.op = op;
        this.a = a;
        this.b = b;
    }

    public boolean eval() {
        switch (op) {
            case AND:
                return a.eval() && b.eval();
            case NAND:
                return !(a.eval() && b.eval());
            case OR:
                return a.eval() || b.eval();
            case NOR:
                return !(a.eval() || b.eval());
            case XNOR:
                return a.eval() == b.eval();
            case XOR:
                return !(a.eval() == b.eval());
            default:
                return false;
        }
    }
}
