/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg353.lab.pkg4;

import java.util.HashMap;

/**
 *
 * @author jasonsnare
 */
public abstract class Gate {

    public static HashMap<String, Boolean> map = new HashMap<>();

    public abstract boolean eval();
}
