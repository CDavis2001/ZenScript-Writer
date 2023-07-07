/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ZenScriptWriter;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;

/**
 *
 * @author C Davis
 */
public class Recipe extends javax.swing.JFrame {

    private ArrayList<JTextField> inputs;
    private String mod;
    private String machine;
    /**
     * Creates new form Recipe
     * @param mod
     * @param machine
     */
    public Recipe(String mod, String machine) {
        initComponents();
        ArrayList<String> arguments = ModMachines.argumentLookUp(mod, machine);
        this.inputs = new ArrayList<>();
        this.mod = mod;
        this.machine = machine;
        for (String argument : arguments) {
            JTextField txtfield = new JTextField();
            txtfield.setText(argument);
            txtfield.addFocusListener(new FocusAdapter() {
                public void focusGained(FocusEvent fEvt) {
                JTextField tField = (JTextField)fEvt.getSource();
                tField.selectAll();
  }
});
            pnlInputs.add(txtfield);
            pnlInputs.revalidate();
            pnlInputs.repaint();
            inputs.add(txtfield);
        }
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlInputs = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnCreateRecipe = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnlInputs.setLayout(new java.awt.GridLayout(5, 2));

        btnCreateRecipe.setLabel("Write Recipe");
        btnCreateRecipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateRecipeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(183, Short.MAX_VALUE)
                .addComponent(btnCreateRecipe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(159, 159, 159))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(btnCreateRecipe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlInputs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlInputs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 306, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateRecipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateRecipeActionPerformed
        BufferedWriter writer = null;
        try {
            String output = "mods.";
            switch (this.mod) {
                case "Tech Reborn" -> {
                    output += "techreborn.";
                }
            }   switch(this.machine) {
                case "Alloy Smelter" -> {
                    output += "alloySmelter";
                }
            }   output += ".addRecipe(";
            for (JTextField input : this.inputs) {
                output += input.getText();
                output += ",";
            }   output = output.substring(0, output.length() - 1);
            output += ");\n";
            writer = new BufferedWriter(new FileWriter("recipes.zs", true));
            writer.append(output);
            writer.close();
            this.dispose();
        } catch (IOException ex) {
            Logger.getLogger(Recipe.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                writer.close();
            } catch (IOException ex) {
                Logger.getLogger(Recipe.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnCreateRecipeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btnCreateRecipe;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel pnlInputs;
    // End of variables declaration//GEN-END:variables
}