/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author Pocho
 */
public class frmLogIn extends javax.swing.JDialog {

    /**
     * Creates new form LogIn
     */
    public frmLogIn(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        txtUser.setBorder(javax.swing.BorderFactory.createCompoundBorder(txtUser.getBorder(),javax.swing.BorderFactory.createEmptyBorder(5, 8, 5, 5)));
        txtPass.setBorder(javax.swing.BorderFactory.createCompoundBorder(txtPass.getBorder(),javax.swing.BorderFactory.createEmptyBorder(5, 8, 5, 5)));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        userImg = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        txtPass = new javax.swing.JPasswordField();
        comboNivel = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 500));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(userImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 160, 160));

        txtUser.setBackground(new java.awt.Color(64, 224, 208));
        txtUser.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 22)); // NOI18N
        txtUser.setForeground(new java.awt.Color(47, 79, 79));
        txtUser.setBorder(null);
        txtUser.setMargin(new java.awt.Insets(2, 4, 2, 2));
        getContentPane().add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 219, 300, 50));

        txtPass.setBackground(new java.awt.Color(64, 224, 208));
        txtPass.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtPass.setForeground(new java.awt.Color(47, 79, 79));
        txtPass.setAlignmentX(0.0F);
        txtPass.setBorder(null);
        txtPass.setMargin(new java.awt.Insets(2, 4, 2, 2));
        getContentPane().add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 291, 300, 50));

        comboNivel.setBackground(new java.awt.Color(32, 178, 170));
        comboNivel.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 22)); // NOI18N
        comboNivel.setForeground(new java.awt.Color(47, 79, 79));
        comboNivel.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ADMINISTRADOR", "USUARIO", "DESARROLLADOR" }));
        comboNivel.setAlignmentX(1.0F);
        comboNivel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(comboNivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 362, 300, 50));

        jButton1.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/login/btnInN.png"))); // NOI18N
        jButton1.setText("Ingresar     ");
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setFocusPainted(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setIconTextGap(6);
        jButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/login/btnInP.png"))); // NOI18N
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/login/btnInH.png"))); // NOI18N
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 440, 150, 50));

        jButton2.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 16)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/login/btnOutN.png"))); // NOI18N
        jButton2.setText("    Salir");
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setFocusPainted(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/login/btnOutP.png"))); // NOI18N
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/login/btnOutH.png"))); // NOI18N
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 150, 50));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/login/LogIn.png"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox comboNivel;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUser;
    private javax.swing.JLabel userImg;
    // End of variables declaration//GEN-END:variables
}
