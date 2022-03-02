/*

Program: MetricConverstion.java          Last Date of this Revision: feb 8, 2019

Purpose: An application that converts a user entered number into any metric or imperial unit they want

Author: Max Piercey, 
School: CHHS
Course: Computer Programming 30


*/





public class MetricConverstion extends javax.swing.JFrame {

	public MetricConverstion() {
        initComponents();
    }

	
	
	
	
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfin = new javax.swing.JTextField();
        metin = new javax.swing.JComboBox<>();
        inin = new javax.swing.JComboBox<>();
        outFeild = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Number to convert");

        jLabel2.setText("Intial unit ");

        jLabel3.setText("Final unit ");

        tfin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfinActionPerformed(evt);
            }
        });

        metin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Inches", "Feet", "Yards", "Miles", "Centimeters", "Meters", "Kilometers" }));
        metin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                metinActionPerformed(evt);
            }
        });

        inin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Inches", "Feet", "Yards", "Miles", "Centimeters", "Meters", "Kilometers" }));
        inin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ininActionPerformed(evt);
            }
        });

        outFeild.setText("your converted number will apear here");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 184, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfin)
                            .addComponent(metin, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(inin, 0, 159, Short.MAX_VALUE)))
                    .addComponent(outFeild))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(metin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(inin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(outFeild, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    private void ininActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
         Object second = inin.getSelectedItem();
        Object first = metin.getSelectedItem();
        String secondUnits = second.toString();
        String firstUnits = first.toString();
     System.out.println(secondUnits);
        
    }                                    

    private void metinActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
        
        Object second = inin.getSelectedItem();
        Object first = metin.getSelectedItem();
        String secondUnits = second.toString();
        String firstUnits = first.toString();
        
        System.out.println(firstUnits);
        
        
        
        
    }                                     

    private void tfinActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        
        Object second = inin.getSelectedItem();
        Object first = metin.getSelectedItem();
        String secondUnits = second.toString();
        String firstUnits = first.toString();  // beocmes the stinge of the name of the selection ( your can case strings with switch statments) 
        
        double workNum ;
        
        String userin;
        userin = tfin.getText();
        workNum = Integer.parseInt(userin);
        System.out.println(userin);
        
        String outNum = "" ;
        
        
        
        switch (firstUnits) {
        case "Centimeters":
            switch (secondUnits) {
                case "Centimeters":
                    outFeild.setText(userin+ " Centimeters");
                    break;
                case "Meters": 
                    workNum = workNum / 100;
                    outNum = String.valueOf(workNum);
                    outFeild.setText(outNum + " Meters"); 
                    break;
                case "Kilometers": 
                    workNum = workNum / 100 / 1000;
                    outNum = String.valueOf(workNum);
                    outFeild.setText(outNum + " Kilometers"); 
                    break;
                case "Inches": 
                    workNum = workNum / 2.54;
                    outNum = String.valueOf(workNum);
                    outFeild.setText(outNum + " Inches"); 
                    break;
                case "Feet": 
                    workNum = workNum / 30.48;
                    outNum = String.valueOf(workNum);
                    outFeild.setText(outNum + " Feet"); 
                    break;
                case "Yards": 
                    workNum = workNum / 91.44;
                    outNum = String.valueOf(workNum);
                    outFeild.setText(outNum + " Yards"); 
                    break;
                case "Miles": 
                    workNum = workNum / 160934;
                    outNum = String.valueOf(workNum);
                    outFeild.setText(outNum + " Miles"); 
                    break;
            }
            break;
        case "Meters": 
            switch (secondUnits) {
                case "Centimeters": 
                    workNum = workNum * 100;
                    outNum = String.valueOf(workNum);
                    outFeild.setText(outNum + " Centimeters"); 
                    break;
                case "Meters": 
                    outFeild.setText(userin + " Meters"); 
                    break;
                case "Kilometers": 
                    workNum = workNum / 1000;
                    outNum = String.valueOf(workNum);
                    outFeild.setText(outNum + " Kilometers"); 
                    break;
                case "Inches": 
                    workNum = workNum * 39.37;
                    outNum = String.valueOf(workNum);
                    outFeild.setText(outNum + " Inches"); 
                    break;
                case "Feet": 
                    workNum = workNum * 3.281;
                    outNum = String.valueOf(workNum);
                    outFeild.setText(outNum + " Feet"); 
                    break;
                case "Yards": 
                    workNum = workNum * 1.094;
                    outNum = String.valueOf(workNum);
                    outFeild.setText(outNum + " Yards"); 
                    break;
                case "Miles": 
                    workNum = workNum / 1609;
                    outNum = String.valueOf(workNum);
                    outFeild.setText(outNum + " Miles"); 
                    break;
            }
            break;
        case "Kilometers": 
            switch (secondUnits) {
                case "Centimeters": 
                    workNum = workNum * 100 * 1000;
                    outNum = String.valueOf(workNum);
                    outFeild.setText(outNum + "Kilometers"); 
                    break;
                case "Meters": 
                    workNum = workNum * 1000;
                    outNum = String.valueOf(workNum);
                    outFeild.setText(outNum + " Meters"); 
                    break;
                case "Kilometers":
                    outFeild.setText(userin + " Kilometers"); 
                    break;
                case "Inches": 
                    workNum = workNum * 39370;
                    outNum = String.valueOf(workNum);
                    outFeild.setText(outNum + " Inches"); 
                    break;
                case "Feet": 
                    workNum = workNum * 3281;
                    outNum = String.valueOf(workNum);
                    outFeild.setText(outNum + " Feet"); 
                    break;
                case "Yards": 
                    workNum = workNum * 1094;
                    outNum = String.valueOf(workNum);
                    outFeild.setText(outNum + " Yards"); 
                    break;
                case "Miles": 
                    workNum = workNum / 1.609;
                    outNum = String.valueOf(workNum);
                    outFeild.setText(outNum + " Miles"); 
                    break;
            }
            break;
        case "Inches": 
            switch (secondUnits) {
                case "Centimeters": 
                    workNum = workNum * 2.54;
                    outNum = String.valueOf(workNum);
                    outFeild.setText(outNum + " Centimeters"); 
                    break;
                case "Meters": 
                    workNum = workNum / 39.37;
                    outNum = String.valueOf(workNum);
                    outFeild.setText(outNum+ " Meters"); 
                    break;
                case "Kilometers": 
                    workNum = workNum / 39370;
                    outNum = String.valueOf(workNum);
                    outFeild.setText(outNum + " Kilometers"); 
                    break;
                case "Inches":
                    outFeild.setText(userin + " Inches");
                    break;
                case "Feet": 
                    workNum = workNum / 2.54;
                    outNum = String.valueOf(workNum);
                    outFeild.setText(outNum + " Feet"); 
                    break;
                case "Yards": 
                    workNum = workNum / 36;
                    outNum = String.valueOf(workNum);
                    outFeild.setText(outNum + " Yards"); 
                    break;
                case "Miles": 
                    workNum = workNum / 63360;
                    outNum = String.valueOf(workNum);
                    outFeild.setText(outNum + " Miles"); 
                    break;
            }
            break;
        case "Feet": 
            switch (secondUnits) {
                case "Centimeters": 
                    workNum = workNum * 30.48;
                    outNum = String.valueOf(workNum);
                    outFeild.setText(outNum + " Centimeters"); 
                    break;
                case "Meters": 
                    workNum = workNum / 3.281;
                    outNum = String.valueOf(workNum);
                    outFeild.setText(outNum + " Meters"); 
                    break;
                case "Kilometers": 
                    workNum = workNum / 3281;
                    outNum = String.valueOf(workNum);
                    outFeild.setText(outNum + " Kilometers"); 
                    break;
                case "Inches": 
                    workNum = workNum * 12;
                    outNum = String.valueOf(workNum);
                    outFeild.setText(outNum + " Inches"); 
                    break;
                case "Feet":
                    outFeild.setText(userin);
                    break;
                case "Yards": 
                    workNum = workNum / 3;
                    outNum = String.valueOf(workNum);
                    outFeild.setText(outNum + " Yards"); 
                    break;
                case "Miles": 
                    workNum = workNum / 5280;
                    outNum = String.valueOf(workNum);
                    outFeild.setText(outNum + " Miles"); 
                    break;
            }
            break;
        case "Yards": 
            switch (secondUnits) {
                case "Centimeters": 
                    workNum = workNum * 91.44;
                    outNum = String.valueOf(workNum);
                    outFeild.setText(outNum + " Centimeters"); 
                    break;
                case "Meters": 
                    workNum = workNum / 1.094;
                    outNum = String.valueOf(workNum);
                    outFeild.setText(outNum + " Meters"); 
                    break;
                case "Kilometers": 
                    workNum = workNum / 1094;
                    outNum = String.valueOf(workNum);
                    outFeild.setText(outNum + " Kilometers"); 
                    break;
                case "Inches": 
                    workNum = workNum / 36;
                    outNum = String.valueOf(workNum);
                    outFeild.setText(outNum + " Inches"); 
                    break;
                case "Feet": 
                    workNum = workNum / 3;
                    outNum = String.valueOf(workNum);
                    outFeild.setText(outNum + " Feet"); 
                    break;
                case "Yards":
                    outFeild.setText(userin + " Yards"); 
                    break;
                case "Miles": 
                    workNum = workNum / 1760;
                    outNum = String.valueOf(workNum);
                    outFeild.setText(outNum + " Miles"); 
                    break;
            }
            break;
        case "Miles": 
            switch (secondUnits) {
                case "Centimeters": 
                    workNum = workNum * 160934;
                    outNum = String.valueOf(workNum);
                    outFeild.setText(outNum + " Centimeters"); 
                    break;
                case "Meters": 
                    workNum = workNum * 1609;
                    outNum = String.valueOf(workNum);
                    outFeild.setText(outNum + " Meters"); 
                    break;
                case "Kilometers": 
                    workNum = workNum * 1.609;
                    outNum = String.valueOf(workNum);
                    outFeild.setText(outNum + " Kilometers"); 
                    break;
                case "Inches": 
                    workNum = workNum * 63360;
                    outNum = String.valueOf(workNum);
                    outFeild.setText(outNum + " Inches"); 
                    break;
                case "Feet": 
                    workNum = workNum * 5280;
                    outNum = String.valueOf(workNum);
                    outFeild.setText(outNum + " Feet"); 
                    break;
                case "Yards": 
                    workNum = workNum * 1760;
                    outNum = String.valueOf(workNum);
                    outFeild.setText(outNum + " Yards"); 
                    break;
                case "Miles":
                    outFeild.setText(userin + " Miles"); 
                    break;
            }
            break;
    }

        
        
    }                                    

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MetricConverstion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MetricConverstion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MetricConverstion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MetricConverstion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MetricConverstion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JComboBox<String> inin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JComboBox<String> metin;
    private javax.swing.JTextField outFeild;
    private javax.swing.JTextField tfin;
    // End of variables declaration                   
}



	
	

