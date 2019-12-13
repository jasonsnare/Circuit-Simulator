/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg353.lab.pkg4;

import java.util.HashMap;
import java.util.*;

public class Lab4 {

    public static HashMap<String, Gate> map1 = new HashMap<>();

    public static void initHM() {
        for (int i = 1; i <= 4; i++) {
            map1.put("S" + i, new SwitchLight("S" + i));
            Gate.map.put("S" + i, false);
            map1.put("L" + i, new SwitchLight("L" + i));
            Gate.map.put("L" + i, false);
        }
    }

    public static void parse(String s) {
        String[] lines = s.toUpperCase().trim().split("\\s*\\n\\s*");
        for (String line : lines) {
            final String[] args = line.split("\\s+");
            switch (args[0]) {
                case "AND":
                    BinGate gate1 = new BinGate(BinGate.AND, map1.get(args[2]), map1.get(args[3]));
                    map1.put(args[1], gate1);
                    Gate.map.put(args[1], gate1.eval());
                    break;
                case "NAND":
                    BinGate gate2 = new BinGate(BinGate.NAND, map1.get(args[2]), map1.get(args[3]));
                    map1.put(args[1], gate2);
                    Gate.map.put(args[1], gate2.eval());
                    break;
                case "OR":
                    BinGate gate3 = new BinGate(BinGate.OR, map1.get(args[2]), map1.get(args[3]));
                    map1.put(args[1], gate3);
                    Gate.map.put(args[1], gate3.eval());
                    break;
                case "NOR":
                    BinGate gate4 = new BinGate(BinGate.NOR, map1.get(args[2]), map1.get(args[3]));
                    map1.put(args[1], gate4);
                    Gate.map.put(args[1], gate4.eval());
                    break;
                case "XNOR":
                    BinGate gate5 = new BinGate(BinGate.XNOR, map1.get(args[2]), map1.get(args[3]));
                    map1.put(args[1], gate5);
                    Gate.map.put(args[1], gate5.eval());
                    break;
                case "XOR":
                    BinGate gate6 = new BinGate(BinGate.XOR, map1.get(args[2]), map1.get(args[3]));
                    map1.put(args[1], gate6);
                    Gate.map.put(args[1], gate6.eval());
                    break;
                case "NOT":
                    NotGate gate7 = new NotGate(map1.get(args[2]));
                    map1.put(args[1], gate7);
                    Gate.map.put(args[1], gate7.eval());
                    break;
                default:
                    System.out.println("Invalid Input. Required: Operation, Target, Source 1, (Source 2).");
            }
        }
    }

    public static void flip() {
        Scanner scnr = new Scanner(System.in);
        for (int i = 1; i <= 4; i++) {
            System.out.println("Enter value (on/off) of switch " + i + ":");
            String s = scnr.next();
            s = s.toUpperCase().trim();
            String hash = "S" + i;
            if ("ON".equals(s)) {
                Gate.map.put(hash, true);
            } else {
                Gate.map.put(hash, false);
            }
        }
    }

    public static void print() {
        if (Gate.map.get("L1")) {
            System.out.println("L1: ON");
        } else {
            System.out.println("L1: OFF");
        }
        if (Gate.map.get("L2")) {
            System.out.println("L2: ON");
        } else {
            System.out.println("L2: OFF");
        }
        if (Gate.map.get("L3")) {
            System.out.println("L3: ON");
        } else {
            System.out.println("L3: OFF");
        }
        if (Gate.map.get("L4")) {
            System.out.println("L4: ON");
        } else {
            System.out.println("L4: OFF");
        }
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        initHM();
        flip();
        System.out.println("Build circuits. Enter 'done' when finished.");
        String input = scnr.nextLine();
        input = input.toUpperCase().trim();
        while (!(input.equals("DONE"))) {
            parse(input);
            input = scnr.nextLine();
            input = input.toUpperCase().trim();
        }
        print();
    }
}
