/**
 * 
 * @author Claudia_Padilla
 */

package view;

import util.ColoresComponentesUtil;
import java.awt.Image;
import java.awt.Toolkit;


public class MenuUsuario extends javax.swing.JFrame {

    int xMouse;
    int yMouse;
    private static final Login login = new Login();

  
    
    public MenuUsuario() {
        initComponents();
        configurarComponentes();
    }

    private void configurarComponentes() {
        setBackground(ColoresComponentesUtil.TRANSPARENTE);
        panelMenuUsuario.setBackground(ColoresComponentesUtil.TRANSPARENTE);
        btnCerrar.setBackground(ColoresComponentesUtil.GRIS_OSCURO);
        btnMinimizar.setBackground(ColoresComponentesUtil.GRIS_OSCURO);
        btnReservas.setBackground(ColoresComponentesUtil.GRIS_OSCURO);
        btnBusqueda.setBackground(ColoresComponentesUtil.GRIS_OSCURO);
        btnUsuario.setBackground(ColoresComponentesUtil.GRIS_OSCURO);
        btnRegresar.setBackground(ColoresComponentesUtil.GRIS_OSCURO);
        jLabelBienvenidaUsuario.setText("Bienvenido(a) " + login.getUsuario().getNombreUsuario());
        // esGerente();
        alternarVisualizacionMenu();
    }

  
    /*
    public static boolean esGerente() {
        String categoriaUsuario = "Gerente";
         String categoriaUsuarioActual = login.getUsuario().getCategoriaUsuario();
       return categoriaUsuarioActual.equals(categoriaUsuario);
    }
    */

    /**
     * Muestra los botones que correspondan acorde a la categoría del usuario.
     */
    private void alternarVisualizacionMenu() {
          jLabelTextoUsuario.setVisible(true);
            btnUsuario.setVisible(true);
            /*
        if (esGerente()) {
            jLabelTextoUsuario.setVisible(true);
            btnUsuario.setVisible(true);
        } else {
            jLabelTextoUsuario.setVisible(false);
            btnUsuario.setVisible(false);
        }
            */
    }

    /**
     * Para logo de escritorio.
     */
    @Override
    public Image getIconImage() {
        Image retImage = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("/imagenes/Ha-100px.png"));
        return retImage;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new JPanelTransparente();
        btnCerrar = new javax.swing.JLabel();
        btnMinimizar = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JLabel();
        jLabelBienvenidaUsuario = new javax.swing.JLabel();
        jLabelBannerMenuPrincipal = new javax.swing.JLabel();
        panelMenuUsuario = new javax.swing.JPanel();
        jLabelIconoHotel = new javax.swing.JLabel();
        jLabelTextoReservas = new javax.swing.JLabel();
        btnReservas = new javax.swing.JLabel();
        jLabelTextoUsuario = new javax.swing.JLabel();
        btnBusqueda = new javax.swing.JLabel();
        jLabelTextoBusqueda = new javax.swing.JLabel();
        btnUsuario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);

        panelPrincipal.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panelPrincipalMouseDragged(evt);
            }
        });
        panelPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelPrincipalMousePressed(evt);
            }
        });
        panelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCerrar.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        btnCerrar.setForeground(new java.awt.Color(204, 204, 204));
        btnCerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCerrar.setText("x");
        btnCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCerrar.setOpaque(true);
        btnCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCerrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCerrarMouseExited(evt);
            }
        });
        panelPrincipal.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 0, 60, 30));

        btnMinimizar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnMinimizar.setForeground(new java.awt.Color(204, 204, 204));
        btnMinimizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnMinimizar.setText("-");
        btnMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMinimizar.setOpaque(true);
        btnMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMinimizarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMinimizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMinimizarMouseExited(evt);
            }
        });
        panelPrincipal.add(btnMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 0, 60, 30));

        btnRegresar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/com/alurahotel/imagenes/cerrar-sesion 32-px.png"))); // NOI18N
        btnRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegresar.setOpaque(true);
        btnRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegresarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegresarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegresarMouseExited(evt);
            }
        });
        panelPrincipal.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 500, 60, 40));

        jLabelBienvenidaUsuario.setBackground(new java.awt.Color(12, 138, 199));
        jLabelBienvenidaUsuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelBienvenidaUsuario.setForeground(new java.awt.Color(204, 204, 204));
        jLabelBienvenidaUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelBienvenidaUsuario.setOpaque(true);
        panelPrincipal.add(jLabelBienvenidaUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, 910, 30));

        jLabelBannerMenuPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/com/alurahotel/imagenes/menu-img.png"))); // NOI18N
        panelPrincipal.add(jLabelBannerMenuPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 510));

        panelMenuUsuario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelIconoHotel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelIconoHotel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/com/alurahotel/imagenes/aH-150px.png"))); // NOI18N
        panelMenuUsuario.add(jLabelIconoHotel, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, 180, 170));

        jLabelTextoReservas.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelTextoReservas.setForeground(new java.awt.Color(12, 138, 199));
        jLabelTextoReservas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTextoReservas.setText("Reservas");
        panelMenuUsuario.add(jLabelTextoReservas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 190, 20));

        btnReservas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnReservas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/com/alurahotel/imagenes/reservas.png"))); // NOI18N
        btnReservas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReservas.setOpaque(true);
        btnReservas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReservasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnReservasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnReservasMouseExited(evt);
            }
        });
        panelMenuUsuario.add(btnReservas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 190, 70));

        jLabelTextoUsuario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelTextoUsuario.setForeground(new java.awt.Color(12, 138, 199));
        jLabelTextoUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTextoUsuario.setText("Usuario");
        panelMenuUsuario.add(jLabelTextoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 190, 20));

        btnBusqueda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnBusqueda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/com/alurahotel/imagenes/busqueda.png"))); // NOI18N
        btnBusqueda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBusqueda.setOpaque(true);
        btnBusqueda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBusquedaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBusquedaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBusquedaMouseExited(evt);
            }
        });
        panelMenuUsuario.add(btnBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 190, 70));

        jLabelTextoBusqueda.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelTextoBusqueda.setForeground(new java.awt.Color(12, 138, 199));
        jLabelTextoBusqueda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTextoBusqueda.setText("Búsqueda");
        panelMenuUsuario.add(jLabelTextoBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 190, 20));

        btnUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/com/alurahotel/imagenes/login.png"))); // NOI18N
        btnUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUsuario.setOpaque(true);
        btnUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUsuarioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnUsuarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnUsuarioMouseExited(evt);
            }
        });
        panelMenuUsuario.add(btnUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 190, 70));

        panelPrincipal.add(panelMenuUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 30, 190, 480));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseClicked
        Mensaje.confirmarSalida(evt);
    }//GEN-LAST:event_btnCerrarMouseClicked

    private void btnCerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseEntered
        evt.consume();
        btnCerrar.setBackground(ColoresComponentesUtil.ROJO_OSCURO);
    }//GEN-LAST:event_btnCerrarMouseEntered

    private void btnCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseExited
        evt.consume();
        btnCerrar.setBackground(ColoresComponentesUtil.GRIS_OSCURO);
    }//GEN-LAST:event_btnCerrarMouseExited

    private void btnMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizarMouseClicked
        evt.consume();
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_btnMinimizarMouseClicked

    private void btnMinimizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizarMouseEntered
        evt.consume();
        btnMinimizar.setBackground(ColoresComponentesUtil.GRIS_CLARO);
    }//GEN-LAST:event_btnMinimizarMouseEntered

    private void btnMinimizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizarMouseExited
        evt.consume();
        btnMinimizar.setBackground(ColoresComponentesUtil.GRIS_OSCURO);
    }//GEN-LAST:event_btnMinimizarMouseExited

    private void btnReservasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReservasMouseClicked
        evt.consume();
        this.dispose();
        Reservas reservas = new Reservas();
        reservas.setVisible(true);
    }//GEN-LAST:event_btnReservasMouseClicked

    private void btnReservasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReservasMouseEntered
        evt.consume();
        btnReservas.setBackground(ColoresComponentesUtil.GRIS_CLARO);
    }//GEN-LAST:event_btnReservasMouseEntered

    private void btnReservasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReservasMouseExited
        evt.consume();
        btnReservas.setBackground(ColoresComponentesUtil.GRIS_OSCURO);
    }//GEN-LAST:event_btnReservasMouseExited

    private void panelPrincipalMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelPrincipalMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_panelPrincipalMouseDragged

    private void panelPrincipalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelPrincipalMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_panelPrincipalMousePressed

    private void btnBusquedaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBusquedaMouseClicked
        evt.consume();
        this.dispose();
        Busqueda busqueda = new Busqueda();
        busqueda.setVisible(true);
    }//GEN-LAST:event_btnBusquedaMouseClicked

    private void btnBusquedaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBusquedaMouseEntered
        evt.consume();
        btnBusqueda.setBackground(ColoresComponentesUtil.GRIS_CLARO);
    }//GEN-LAST:event_btnBusquedaMouseEntered

    private void btnBusquedaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBusquedaMouseExited
        evt.consume();
        btnBusqueda.setBackground(ColoresComponentesUtil.GRIS_OSCURO);
    }//GEN-LAST:event_btnBusquedaMouseExited

    private void btnRegresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresarMouseEntered
        evt.consume();
        btnRegresar.setBackground(ColoresComponentesUtil.GRIS_CLARO);
    }//GEN-LAST:event_btnRegresarMouseEntered

    private void btnRegresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresarMouseExited
        evt.consume();
        btnRegresar.setBackground(ColoresComponentesUtil.GRIS_OSCURO);
    }//GEN-LAST:event_btnRegresarMouseExited

    private void btnRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresarMouseClicked
        evt.consume();
        this.dispose();
        MenuPrincipal menuPrincipal = new MenuPrincipal();
        menuPrincipal.setVisible(true);
    }//GEN-LAST:event_btnRegresarMouseClicked

    private void btnUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUsuarioMouseClicked
        evt.consume();
        this.dispose();
        RegistrarUsuario registrarUsuario = new RegistrarUsuario();
        registrarUsuario.setVisible(true);
    }//GEN-LAST:event_btnUsuarioMouseClicked

    private void btnUsuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUsuarioMouseEntered
        evt.consume();
        btnUsuario.setBackground(ColoresComponentesUtil.GRIS_CLARO);
    }//GEN-LAST:event_btnUsuarioMouseEntered

    private void btnUsuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUsuarioMouseExited
        evt.consume();
        btnUsuario.setBackground(ColoresComponentesUtil.GRIS_OSCURO);
    }//GEN-LAST:event_btnUsuarioMouseExited

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MenuUsuario().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnBusqueda;
    private javax.swing.JLabel btnCerrar;
    private javax.swing.JLabel btnMinimizar;
    private javax.swing.JLabel btnRegresar;
    private javax.swing.JLabel btnReservas;
    private javax.swing.JLabel btnUsuario;
    private javax.swing.JLabel jLabelBannerMenuPrincipal;
    private javax.swing.JLabel jLabelBienvenidaUsuario;
    private javax.swing.JLabel jLabelIconoHotel;
    private javax.swing.JLabel jLabelTextoBusqueda;
    private javax.swing.JLabel jLabelTextoReservas;
    private javax.swing.JLabel jLabelTextoUsuario;
    private javax.swing.JPanel panelMenuUsuario;
    private javax.swing.JPanel panelPrincipal;
    // End of variables declaration//GEN-END:variables
}
