package App;


import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dell
 */
public class Quiz_Menu extends Details {
public static String topic;
    /**
     * Creates new form Quiz_Menu
     */
    public Quiz_Menu() {
        initComponents();
        usernameLabel.setText(""+usernameGlobal);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        bodyPanel = new javax.swing.JPanel();
        topPanel = new javax.swing.JPanel();
        userIcon = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();
        userPanel = new javax.swing.JPanel();
        analyticsLabel = new javax.swing.JLabel();
        analyticsSeperator = new javax.swing.JSeparator();
        rJava = new javax.swing.JRadioButton();
        rHtml = new javax.swing.JRadioButton();
        rMysql = new javax.swing.JRadioButton();
        bottomPanel = new javax.swing.JPanel();
        startQuizBtn = new javax.swing.JPanel();
        startQuizLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Page");
        setBounds(new java.awt.Rectangle(500, 200, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        bodyPanel.setBackground(new java.awt.Color(34, 43, 53));
        bodyPanel.setMinimumSize(new java.awt.Dimension(459, 478));

        topPanel.setBackground(new java.awt.Color(34, 43, 53));

        userIcon.setFont(userIcon.getFont().deriveFont(userIcon.getFont().getSize()+5f));
        userIcon.setForeground(new java.awt.Color(242, 242, 242));
        userIcon.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        userIcon.setText("👤");

        usernameLabel.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        usernameLabel.setForeground(new java.awt.Color(242, 242, 242));
        usernameLabel.setText("Username");
        usernameLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        usernameLabel.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout topPanelLayout = new javax.swing.GroupLayout(topPanel);
        topPanel.setLayout(topPanelLayout);
        topPanelLayout.setHorizontalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(userIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        topPanelLayout.setVerticalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(usernameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(userIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        mainPanel.setBackground(new java.awt.Color(34, 43, 53));
        mainPanel.setMinimumSize(new java.awt.Dimension(500, 350));
        mainPanel.setPreferredSize(new java.awt.Dimension(999, 500));
        mainPanel.setLayout(new java.awt.BorderLayout());

        userPanel.setBackground(new java.awt.Color(60, 63, 66));
        userPanel.setForeground(new java.awt.Color(242, 242, 242));

        analyticsLabel.setBackground(new java.awt.Color(60, 63, 66));
        analyticsLabel.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        analyticsLabel.setForeground(new java.awt.Color(242, 242, 242));
        analyticsLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        analyticsLabel.setText("QUIZ TOPIC");
        analyticsLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        analyticsLabel.setMaximumSize(new java.awt.Dimension(104, 29));
        analyticsLabel.setMinimumSize(new java.awt.Dimension(104, 29));

        analyticsSeperator.setBackground(new java.awt.Color(0, 0, 1));
        analyticsSeperator.setForeground(new java.awt.Color(0, 0, 1));

        rJava.setBackground(new java.awt.Color(60, 63, 66));
        buttonGroup1.add(rJava);
        rJava.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        rJava.setForeground(new java.awt.Color(242, 242, 242));
        rJava.setText("JAVA");

        rHtml.setBackground(new java.awt.Color(60, 63, 66));
        buttonGroup1.add(rHtml);
        rHtml.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        rHtml.setForeground(new java.awt.Color(242, 242, 242));
        rHtml.setText("HTML");

        rMysql.setBackground(new java.awt.Color(60, 63, 66));
        buttonGroup1.add(rMysql);
        rMysql.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        rMysql.setForeground(new java.awt.Color(242, 242, 242));
        rMysql.setText("MYSQL");

        javax.swing.GroupLayout userPanelLayout = new javax.swing.GroupLayout(userPanel);
        userPanel.setLayout(userPanelLayout);
        userPanelLayout.setHorizontalGroup(
            userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(analyticsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE)
                    .addComponent(analyticsSeperator)
                    .addComponent(rMysql, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rHtml, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rJava, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        userPanelLayout.setVerticalGroup(
            userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userPanelLayout.createSequentialGroup()
                .addComponent(analyticsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(analyticsSeperator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rJava)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rHtml)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rMysql)
                .addGap(0, 322, Short.MAX_VALUE))
        );

        mainPanel.add(userPanel, java.awt.BorderLayout.PAGE_START);

        bottomPanel.setBackground(new java.awt.Color(34, 43, 53));

        startQuizBtn.setBackground(new java.awt.Color(60, 63, 66));
        startQuizBtn.setForeground(new java.awt.Color(242, 242, 242));
        startQuizBtn.setMaximumSize(new java.awt.Dimension(155, 30));
        startQuizBtn.setMinimumSize(new java.awt.Dimension(155, 30));
        startQuizBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                startQuizBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                startQuizBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                startQuizBtnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                startQuizBtnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                startQuizBtnMouseReleased(evt);
            }
        });

        startQuizLabel.setBackground(new java.awt.Color(242, 242, 242));
        startQuizLabel.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        startQuizLabel.setForeground(new java.awt.Color(242, 242, 242));
        startQuizLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        startQuizLabel.setText("Begin Quiz");

        javax.swing.GroupLayout startQuizBtnLayout = new javax.swing.GroupLayout(startQuizBtn);
        startQuizBtn.setLayout(startQuizBtnLayout);
        startQuizBtnLayout.setHorizontalGroup(
            startQuizBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, startQuizBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(startQuizLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                .addContainerGap())
        );
        startQuizBtnLayout.setVerticalGroup(
            startQuizBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(startQuizBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(startQuizLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout bottomPanelLayout = new javax.swing.GroupLayout(bottomPanel);
        bottomPanel.setLayout(bottomPanelLayout);
        bottomPanelLayout.setHorizontalGroup(
            bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bottomPanelLayout.createSequentialGroup()
                .addContainerGap(280, Short.MAX_VALUE)
                .addComponent(startQuizBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        bottomPanelLayout.setVerticalGroup(
            bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bottomPanelLayout.createSequentialGroup()
                .addComponent(startQuizBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout bodyPanelLayout = new javax.swing.GroupLayout(bodyPanel);
        bodyPanel.setLayout(bodyPanelLayout);
        bodyPanelLayout.setHorizontalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(topPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(bottomPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        bodyPanelLayout.setVerticalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyPanelLayout.createSequentialGroup()
                .addComponent(topPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bottomPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        getContentPane().add(bodyPanel, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void startQuizBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_startQuizBtnMouseClicked
        cS=0;
        if (rJava.isSelected()) {
            topic = "javaquestion";
        } else if (rHtml.isSelected()) {
            topic = "htmlquestion";
        } else if (rMysql.isSelected()) {
            topic = "mysqlquestion";
        }
        if (topic.equals("")) {
            JOptionPane.showMessageDialog(null, "Please Select a subject");
        } else {
            Quiz_Time f = new Quiz_Time();
            f.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_startQuizBtnMouseClicked

    private void startQuizBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_startQuizBtnMouseEntered
        startQuizBtn.setBackground(new java.awt.Color(26, 28, 29));
    }//GEN-LAST:event_startQuizBtnMouseEntered

    private void startQuizBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_startQuizBtnMouseExited
        startQuizBtn.setBackground(new java.awt.Color(60, 63, 66));
    }//GEN-LAST:event_startQuizBtnMouseExited

    private void startQuizBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_startQuizBtnMousePressed
        startQuizBtn.setBackground(new java.awt.Color(17, 18, 19));
    }//GEN-LAST:event_startQuizBtnMousePressed

    private void startQuizBtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_startQuizBtnMouseReleased
        startQuizBtn.setBackground(new java.awt.Color(60, 63, 66));
    }//GEN-LAST:event_startQuizBtnMouseReleased

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
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Quiz_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Quiz_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Quiz_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Quiz_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Quiz_Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel analyticsLabel;
    private javax.swing.JSeparator analyticsSeperator;
    private javax.swing.JPanel bodyPanel;
    private javax.swing.JPanel bottomPanel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JRadioButton rHtml;
    private javax.swing.JRadioButton rJava;
    private javax.swing.JRadioButton rMysql;
    private javax.swing.JPanel startQuizBtn;
    private javax.swing.JLabel startQuizLabel;
    private javax.swing.JPanel topPanel;
    private javax.swing.JLabel userIcon;
    private javax.swing.JPanel userPanel;
    public javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables
}
