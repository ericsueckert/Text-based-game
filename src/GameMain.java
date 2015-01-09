import java.io.*;
import java.util.*;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Potato
 */
public final class GameMain extends javax.swing.JFrame {

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        enterButton = new javax.swing.JButton();
        loadLabel = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        inventoryList = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        textFieldMain = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        newGameButton = new javax.swing.JButton();
        loadButton = new javax.swing.JButton();
        picture = new javax.swing.JLabel();
        itemLabel = new javax.swing.JLabel();
        pickUpButton = new javax.swing.JButton();
        dropItem = new javax.swing.JButton();
        tryAgainButton = new javax.swing.JButton();
        checkpointButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        pastExpo = new javax.swing.JList();

        jDialog1.setResizable(false);
        jDialog1.setSize(new java.awt.Dimension(400, 200));

        enterButton.setText("Enter");
        enterButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                enterFileName(evt);
            }
        });
        enterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterButtonActionPerformed(evt);
            }
        });

        loadLabel.setText("Enter file name");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(loadLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jDialog1Layout.createSequentialGroup()
                        .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(enterButton)))
                .addGap(49, 49, 49))
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(loadLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enterButton))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jScrollPane1.setMaximumSize(new java.awt.Dimension(175, 133));
        jScrollPane1.setMinimumSize(new java.awt.Dimension(175, 133));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(175, 133));

        inventoryList.setVisibleRowCount(0);
        jScrollPane1.setViewportView(inventoryList);

        jLabel1.setText("Inventory");

        textFieldMain.setMaximumSize(new java.awt.Dimension(494, 74));

        jButton1.setText("1");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button1Clicked(evt);
            }
        });

        jButton2.setText("2");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button2Clicked(evt);
            }
        });

        jButton3.setText("3");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button3Clicked(evt);
            }
        });

        newGameButton.setText("New Game");
        newGameButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newGameClicked(evt);
            }
        });
        newGameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newGameButtonActionPerformed(evt);
            }
        });

        loadButton.setText("Load Game");
        loadButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loadGameClick(evt);
            }
        });
        loadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadButtonActionPerformed(evt);
            }
        });

        picture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/e07E3UL.jpg"))); // NOI18N
        picture.setText("jLabel2");
        picture.setPreferredSize(new java.awt.Dimension(449, 361));

        pickUpButton.setText("Pick up");
        pickUpButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pickUpButtonMouseClicked(evt);
            }
        });

        dropItem.setText("Drop");
        dropItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dropItemActionPerformed(evt);
            }
        });

        tryAgainButton.setText("Try Again");
        tryAgainButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tryAgainButtonActionPerformed(evt);
            }
        });

        checkpointButton.setText("Continue from Previous checkpoint");
        checkpointButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                checkPointClicked(evt);
            }
        });

        pastExpo.setBackground(new java.awt.Color(238, 238, 238));
        pastExpo.setForeground(new java.awt.Color(153, 153, 153));
        pastExpo.setToolTipText("");
        pastExpo.setSelectionBackground(new java.awt.Color(238, 238, 238));
        pastExpo.setSelectionForeground(new java.awt.Color(153, 153, 153));
        pastExpo.setVisibleRowCount(3);
        jScrollPane2.setViewportView(pastExpo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(dropItem, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(textFieldMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(newGameButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(loadButton, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tryAgainButton, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 219, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jButton2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jButton3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(pickUpButton, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(checkpointButton)))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(6, 6, 6))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(itemLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(12, 12, 12)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(70, 70, 70)))))
                .addGap(29, 29, 29))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(picture, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(newGameButton)
                            .addComponent(loadButton)
                            .addComponent(tryAgainButton)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textFieldMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pickUpButton, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(itemLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dropItem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(checkpointButton)
                .addGap(18, 18, 18)
                .addComponent(picture, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void enterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enterButtonActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        //will load file when enter is pressed
        enterResponse();
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void newGameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newGameButtonActionPerformed

    }//GEN-LAST:event_newGameButtonActionPerformed

    private void newGameClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newGameClicked
        formatPanel();
        //loads game if new game button is clicked
        run();
    }//GEN-LAST:event_newGameClicked

    private void loadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loadButtonActionPerformed

    private void enterFileName(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enterFileName
        //loads file when enter is clicked
        enterResponse();
    }//GEN-LAST:event_enterFileName

    //If choice 1 is made
    private void button1Clicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button1Clicked
        if (jButton1.isEnabled()) {
            updateExpoList(tree.current);
            if (tree.current.left.needsItem()) {
                removeItem(tree.current.left);
            }
            tree.current = tree.current.left;
            tree.playHelper(jButton1, jButton2, jButton3, textFieldMain, jLabel3,
                    jLabel4, jLabel5, picture, itemLabel, pickUpButton,
                    inventory, tryAgainButton, checkpointButton, jLabel1);
        }
    }//GEN-LAST:event_button1Clicked

    //If choice 2 is made
    private void button2Clicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button2Clicked
        if (jButton2.isEnabled()) {
            updateExpoList(tree.current);
            if (tree.current.center.needsItem()) {
                removeItem(tree.current.center);
            }
            tree.current = tree.current.center;
            tree.playHelper(jButton1, jButton2, jButton3, textFieldMain, jLabel3,
                    jLabel4, jLabel5, picture, itemLabel, pickUpButton,
                    inventory, tryAgainButton, checkpointButton, jLabel1);
        }
    }//GEN-LAST:event_button2Clicked

    //If choice 3 is made
    private void button3Clicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button3Clicked
        if (jButton3.isEnabled()) {
            updateExpoList(tree.current);
            if (tree.current.right.needsItem()) {
                removeItem(tree.current.right);
            }
            tree.current = tree.current.right;
            tree.playHelper(jButton1, jButton2, jButton3, textFieldMain, jLabel3,
                    jLabel4, jLabel5, picture, itemLabel, pickUpButton,
                    inventory, tryAgainButton, checkpointButton, jLabel1);
        }
    }//GEN-LAST:event_button3Clicked

    private void loadGameClick(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loadGameClick
        if (loadButton.isEnabled()) {
            loadLabel.setText("Enter file name");
            //player clicks to load game
            load();
        }
    }//GEN-LAST:event_loadGameClick

    private void pickUpButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pickUpButtonMouseClicked
        //TODO: add code to add to inventory
        if (pickUpButton.isEnabled()) {
            //Displays pick up message
            itemLabel.setText("You have picked up "
                    + tree.current.eventItems.toString() + ".");
            //Add the times picked up to the inventory
            inventory.addAll(tree.current.eventItems);
            //Display items
            updateList(inventoryList, inventory);
            //Clear event items
            tree.current.eventItems.clear();//TODO: change
            //Re updates whether you can proceed with the item you just picked up
            tree.checkForRightItem(pickUpButton, jButton1, jButton2, jButton3,
                    jLabel3, jLabel4, jLabel5, inventory);
            //Disable pick up button
            pickUpButton.setVisible(false);
        }
    }//GEN-LAST:event_pickUpButtonMouseClicked

    private void dropItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dropItemActionPerformed
        if (dropItem.isEnabled()) {
            //Remove item from inventory
            String itemRemoved = model.get(idx).toString();

            inventory.remove(itemRemoved);
            updateList(inventoryList, inventory);
            //Add item to the event
            tree.current.eventItems.add(itemRemoved);
            //Set event's item prompt so when you return the item is there
            tree.current.changeItemPrompt(tree.current.eventItems + " is on the ground.");
            itemLabel.setText(tree.current.getItemPrompt());

            //Update to check whether you can proceed without the item you dropped
            tree.checkForRightItem(pickUpButton, jButton1, jButton2, jButton3,
                    jLabel3, jLabel4, jLabel5, inventory);
            //Disable button
            dropItem.setEnabled(false);
            //Enable pick up of item
            pickUpButton.setVisible(true);
        }
    }//GEN-LAST:event_dropItemActionPerformed

    private void tryAgainButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tryAgainButtonActionPerformed
        formatPanel();
        //reset current at the top of the tree
        enterResponse();
    }//GEN-LAST:event_tryAgainButtonActionPerformed

    private void checkPointClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkPointClicked
        if (checkpointButton.isEnabled()) {
            //Restart from previous checkpoint
            picture.setVisible(false);
            //reload
            tree.resetItems(tree.getLastCheckpoint());
            //reset inventory and node

            inventory.clear();
            tree.current = tree.getLastCheckpoint();
            inventory = new ArrayList<String>(tree.getSavedInventory());
            updateList(inventoryList, inventory);
            tree.playHelper(jButton1, jButton2, jButton3, textFieldMain, jLabel3,
                    jLabel4, jLabel5, picture, itemLabel, pickUpButton, inventory,
                    tryAgainButton, checkpointButton, jLabel1);
        }
    }//GEN-LAST:event_checkPointClicked

    //Other fields
    private final EventTree tree;
    //list for inventory
    protected static DefaultListModel model;
    private static DefaultListModel expoModel;
    public ArrayList<String> inventory;
    //boolean for selectionListener
    private static boolean listenerInitiated = false;
    //index for selection listener
    private static int idx;
    private String filename;

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GameMain().setVisible(true);
            }
        });
    }

    //construct, initialize components, model, scanner, and tree
    public GameMain() {
        model = new DefaultListModel();
        expoModel = new DefaultListModel();
        initComponents();
        tree = new EventTree();
        inventory = new ArrayList<String>();
        formatPanel();
    }

    //Formats the panel for startup
    public void formatPanel() {
        jButton1.setVisible(false);
        jLabel1.setVisible(false);
        jLabel3.setVisible(false);
        jLabel4.setVisible(false);
        jLabel5.setVisible(false);
        jButton3.setVisible(false);
        jButton2.setVisible(false);
        inventoryList.setVisible(false);
        inventoryList.removeAll();
        inventory.clear();
        loadButton.setEnabled(false);
        picture.setVisible(false);
        pickUpButton.setVisible(false);
        dropItem.setVisible(false);
        tryAgainButton.setEnabled(false);
        checkpointButton.setVisible(false);
        pastExpo.setVisible(false);
    }

    //run the game
    private void run() {
        textFieldMain.setText("<html>Welcome to the simple text based game. Press "
                + "load to load a game file.</html>");

        //enables load button after new game is clicked
        loadButton.setEnabled(true);
        //User clicks load
    }

    private void enterResponse() {
        //triggers when "enter" button is clicked on dialogue panel
        filename = jTextField2.getText();

        //try scanning the file
        try {
            Scanner in = new Scanner(new File(filename));
            String verify = in.nextLine();
            //Verifies the text file as a game file
            if (verify.trim().equals("E®i© & ™Å§’S nÆ† 9åm€")) {
                tree.load(in);
            } //if not a game file
            else {
                loadLabel.setText("Not a game file");
                load();
                return;
            }
        } catch (Exception e) {
            e.printStackTrace();
            loadLabel.setText("<html>" + "Error: " + e.getClass().getCanonicalName()
                    + ": " + e.getMessage() + "</html>");
            load();
            return;
        }
        //Dialog box disappears when game is loaded
        jDialog1.setVisible(false);

        //Initalize list
        inventoryList.setVisible(true);
        initializeList(inventoryList);
        dropItem.setVisible(true);
        dropItem.setEnabled(false);

        initializeExpoList(pastExpo);

        //reset current at the top of the tree
        tree.current = tree.getOverallRoot();
        //play one game
        tree.playHelper(jButton1, jButton2, jButton3, textFieldMain, jLabel3,
                jLabel4, jLabel5, picture, itemLabel, pickUpButton, inventory,
                tryAgainButton, checkpointButton, jLabel1);
    }

    //load a game
    private void load() {
        //propmpt for load dialoge box
        jDialog1.setVisible(true);
        //User presses enter button
        //disable button after loading game
        loadButton.setEnabled(false);
    }

    //initialize the list for starting inventory
    public void initializeList(final javax.swing.JList itemList) {
        //sets the model of the jlist to the defaultlistmodel
        itemList.setModel(model);
        //only one item can be selected at once
        model.clear();
        itemList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        //Creates a selection listener if one does not already exist
        if (!listenerInitiated) {
            listenerInitiated = true;
            itemList.addListSelectionListener(new ListSelectionListener() {
                public void valueChanged(ListSelectionEvent lse) {
                    idx = itemList.getSelectedIndex();
                    if (idx != -1) {
                        dropItem.setEnabled(true);
                    }
                }
            });
        }
    }

    //initialize expo list
    public void initializeExpoList(final javax.swing.JList pastExpo) {
        pastExpo.setVisible(true);
        pastExpo.setModel(expoModel);
        expoModel.setSize(3);
        expoModel.clear();
    }

    //update expo list
    public void updateExpoList(EventNode current) {
        String expo = current.getExposition();
        if (expo.length() > 90) {
            expo = expo.substring(0, 88);
            expo += "...";
        }
        if (expoModel.getSize() > 2) {
            expoModel.remove(2);
        }
        expoModel.add(0, expo);
    }

    //updates the list with an item
    public void updateList(javax.swing.JList itemList, ArrayList<String> items) {
        model.clear();
        //adds item to the model, updates the list
        for (String item : items) {
            model.addElement(item);
        }

    }

    //removes item from inventory when required by an event
    private void removeItem(EventNode next) {
        for (String item : next.requiredItems) {
            model.removeElement(item);
            inventory.remove(item);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton checkpointButton;
    private javax.swing.JButton dropItem;
    private javax.swing.JButton enterButton;
    private javax.swing.JList inventoryList;
    private javax.swing.JLabel itemLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton loadButton;
    private javax.swing.JLabel loadLabel;
    private javax.swing.JButton newGameButton;
    private javax.swing.JList pastExpo;
    private javax.swing.JButton pickUpButton;
    private javax.swing.JLabel picture;
    private javax.swing.JLabel textFieldMain;
    private javax.swing.JButton tryAgainButton;
    // End of variables declaration//GEN-END:variables
}
