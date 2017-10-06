/*
 * ChannelGameServerGUI.java
 *
 * This file is part of a tutorial on making a chat application using Flash
 * for the clients and Java for the multi-client server.
 * 
 * View the tutorial at http://www.broculos.net/
 */

package ChannelServer;

import java.util.*;

/**
 * A GUI for the LoginServer providing debugging information.
 *
 * @author Nuno Freitas (nunofreitas@gmail.com)
 */
public class ChannelGameServerGUI extends javax.swing.JFrame {
    protected ChannelServer server;
    protected Timer timer;
    
    /**
     * Creates a new instance of ChannelGameServerGUI.
     *
     * @param server the chat server
     */
    public ChannelGameServerGUI(ChannelServer server) {
        initComponents();
        this.server = server;
        this.timer = new Timer();
        this.timer.schedule(new UpdateClientCountTask(), 1000, 1000);
    }
    
    /**
     * Writes a message to the text area of the form. 
     *
     * @param msg the message to be written.
     */
    public void write(String msg) {
        try {
            this.debugTextArea.getDocument().insertString(0, msg + "\n", null);
        }
        catch (Exception e) {            
        }
    }


    public void setClientCount(String msg) {
        try {
            this.clientCountLabel.setText(msg);
        }
        catch (Exception e) {
        }
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        clientCountLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        debugTextArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        clientCountLabel.setText("0 clients");

        debugTextArea.setColumns(20);
        debugTextArea.setEditable(false);
        debugTextArea.setLineWrap(true);
        debugTextArea.setRows(5);
        debugTextArea.setPreferredSize(new java.awt.Dimension(200, 100));
        jScrollPane1.setViewportView(debugTextArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
                    .addComponent(clientCountLabel))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(clientCountLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel clientCountLabel;
    private javax.swing.JTextArea debugTextArea;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
    
}
