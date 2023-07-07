/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ZenScriptWriter;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author C Davis
 */
public class ModMachines {
    public static String[] getMachines(String mod) {
        ArrayList<String> machines = new ArrayList<>();
        switch (mod) {
            case "Thermal Expansion" -> {
                String[] thermalMachines = {"Centrifugal Separator", "Compactor", "Fractionating Still", "Induction Smelter", "Magma Crucible", "Redstone Furnace", "Pulverizer", "Sawmill"};
                machines.addAll(Arrays.asList(thermalMachines));
            }
            case "Tech Reborn" -> {
                String[] techRebornMachines = {"Alloy Smelter", "Assembling Machine", "Centrifuge", "Chemical Reactor", "Compressor", "Distillation Tower", "Extractor", "Thermal Generator", "Gas Generator", "Semifluid Generator", "Diesel Generator", "Plasma Generator", "Fluid Replicator", "Grinder", "Implosion Compressor", "Blast Furnace", "Electrolyzer", "Industrial Grinder", "Industrial Sawmill", "Plate Bending Machines", "Rolling Machines", "Solid Canning Machine", "Vacuum Freezer", "Wire Mill"};
                machines.addAll(Arrays.asList(techRebornMachines));
            }

                
                
        }
        
        String[] temp = new String[machines.size()];
        for (int i = 0; i < machines.size()-1; i++) {
            temp[i] = machines.get(i);
        }
        return temp;
    }
    
    public static ArrayList<String> argumentLookUp(String mod, String machine){
        ArrayList<String> arguments = new ArrayList<>();
        switch (mod) {
            case "Tech Reborn" -> {
                switch (machine) {
                    case "Alloy Smelter" -> {
                        arguments.add("Item Output");
                        arguments.add("Item Input 1");
                        arguments.add("Item Input 2");
                        arguments.add("Time in Ticks");
                        arguments.add("Power in EU (1EU = 4RF)");
                        return arguments;
                    }
                }
            }
        }
        return null;
    }
}
