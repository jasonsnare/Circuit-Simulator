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
public class SwitchLight extends Gate {

    final private String key;

    public SwitchLight(String key) {
        this.key = key;
    }

    public boolean eval() {
        return map.get(key);
    }
}
