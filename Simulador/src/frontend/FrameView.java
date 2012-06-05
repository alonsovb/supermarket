package frontend;

import backend.main.ControllerThread;
import backend.supermercado.Comprador;
import backend.supermercado.Controlador;
import java.awt.*;
import java.awt.geom.Rectangle2D;
import javax.swing.DefaultListModel;
import javax.swing.UIManager;

public class FrameView extends javax.swing.JFrame {

    ControllerThread thread;
    boolean threadRunning = false;
    private Controlador control;
    boolean dibujarCantidadProductos = false;

    public FrameView() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ex) {
            return;
        }
        initComponents();
        Canvas c = new Canvas();
        this.add(c);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelEstadísticas = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        list = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textCarritos = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        textCanastas = new javax.swing.JTextField();
        buttonIniciar = new javax.swing.JButton();
        sliderCompradoresTurno = new javax.swing.JSlider();
        sliderSleepTime = new javax.swing.JSlider();
        jLabel4 = new javax.swing.JLabel();
        checkCantidadProductos = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Markt");
        setMinimumSize(new java.awt.Dimension(555, 361));

        panelEstadísticas.setBackground(new java.awt.Color(255, 255, 255));
        panelEstadísticas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jScrollPane1.setViewportView(list);

        jLabel1.setText("Compradores por turno:");

        jLabel2.setText("Carritos");

        textCarritos.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        textCarritos.setText("35");

        jLabel3.setText("Canastas");

        textCanastas.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        textCanastas.setText("40");

        buttonIniciar.setText("Iniciar");
        buttonIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonIniciarActionPerformed(evt);
            }
        });

        sliderCompradoresTurno.setBackground(new java.awt.Color(255, 255, 255));
        sliderCompradoresTurno.setMaximum(10);
        sliderCompradoresTurno.setPaintLabels(true);
        sliderCompradoresTurno.setPaintTicks(true);
        sliderCompradoresTurno.setSnapToTicks(true);
        sliderCompradoresTurno.setValue(1);
        sliderCompradoresTurno.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderCompradoresTurnoStateChanged(evt);
            }
        });

        sliderSleepTime.setBackground(new java.awt.Color(255, 255, 255));
        sliderSleepTime.setForeground(new java.awt.Color(255, 255, 255));
        sliderSleepTime.setMaximum(2000);
        sliderSleepTime.setMinimum(50);
        sliderSleepTime.setPaintTicks(true);
        sliderSleepTime.setSnapToTicks(true);
        sliderSleepTime.setValue(150);
        sliderSleepTime.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderSleepTimeStateChanged(evt);
            }
        });

        jLabel4.setText("Intervalo de turno (50 a 2000 ms):");

        checkCantidadProductos.setBackground(new java.awt.Color(255, 255, 255));
        checkCantidadProductos.setText("Mostrar productos (reduce rendimiento)");
        checkCantidadProductos.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                checkCantidadProductosStateChanged(evt);
            }
        });

        javax.swing.GroupLayout panelEstadísticasLayout = new javax.swing.GroupLayout(panelEstadísticas);
        panelEstadísticas.setLayout(panelEstadísticasLayout);
        panelEstadísticasLayout.setHorizontalGroup(
            panelEstadísticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEstadísticasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEstadísticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sliderCompradoresTurno, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                    .addComponent(buttonIniciar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                    .addGroup(panelEstadísticasLayout.createSequentialGroup()
                        .addGroup(panelEstadísticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelEstadísticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textCarritos, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                            .addComponent(textCanastas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)))
                    .addComponent(sliderSleepTime, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                    .addComponent(checkCantidadProductos))
                .addContainerGap())
        );
        panelEstadísticasLayout.setVerticalGroup(
            panelEstadísticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEstadísticasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sliderCompradoresTurno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEstadísticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textCarritos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEstadísticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(textCanastas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkCantidadProductos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sliderSleepTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(434, Short.MAX_VALUE)
                .addComponent(panelEstadísticas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelEstadísticas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-689)/2, (screenSize.height-547)/2, 689, 547);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonIniciarActionPerformed
        if (threadRunning) {
            // Detener el hilo de control
            thread.setActive(false);
            this.buttonIniciar.setText("Iniciar");
            threadRunning = false;
        } else {
            // Detener el hilo de control
            int compradores, carritos, canastas;
            compradores = sliderCompradoresTurno.getValue();
            carritos = Integer.valueOf(textCarritos.getText());
            canastas = Integer.valueOf(textCanastas.getText());
            thread = new ControllerThread(this, compradores, carritos, canastas);
            thread.start();
            this.buttonIniciar.setText("Detener");
            threadRunning = true;
        }
    }//GEN-LAST:event_buttonIniciarActionPerformed

    private void sliderCompradoresTurnoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderCompradoresTurnoStateChanged
        if (control != null) {
            // Modificar la cantidad de compradores por turno
            control.setGeneradorComprador(sliderCompradoresTurno.getValue());
        }
    }//GEN-LAST:event_sliderCompradoresTurnoStateChanged

    private void sliderSleepTimeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderSleepTimeStateChanged
        if (control != null) {
            thread.setSleepTime(sliderSleepTime.getValue());
        }
    }//GEN-LAST:event_sliderSleepTimeStateChanged

    private void checkCantidadProductosStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_checkCantidadProductosStateChanged
        dibujarCantidadProductos = checkCantidadProductos.isSelected();
    }//GEN-LAST:event_checkCantidadProductosStateChanged

    public void showStatistics(Controlador control) {
        DefaultListModel dlm = new DefaultListModel();
        dlm.addElement("Tiempos de espera por caja:");
        for (int i = 0; i < control.getCajas().length; i++) {
            String texto = "Caja " + (i + 1) + ": " + control.getTiempoPromedio(i);
            dlm.addElement(texto);
        }
        dlm.addElement("Carritos restantes: " + control.getTotalCarritos());
        dlm.addElement("Canastas restantes: " + control.getTotalCanastas());
        dlm.addElement("Total de compradores: " + control.getCompradores());
        dlm.addElement("Total de productos: " + control.getProductos());
        dlm.addElement("Total de dinero: " + control.getDinero());


        list.setModel(dlm);
        this.repaint();
    }

    @Override
    public void paint(Graphics screen) {
        super.paint(screen);
        Graphics2D graphics = (Graphics2D) screen;
        graphics.setColor(new Color(255, 255, 255));

        int height = this.getHeight();
        int width = this.getWidth() - panelEstadísticas.getWidth();
        graphics.fillRect(0, 0, width, height);

        if (this.control != null) {
            int cajas = control.getCajas().length;
            for (int i = 0; i < cajas; i++) {
                if (control.getCajas()[i].getMaxArticulosPersona() <= 10) {
                    graphics.setColor(new Color(200, 120, 120));
                } else {
                    graphics.setColor(new Color(47, 99, 200));
                }
                graphics.setStroke(new BasicStroke(2));
                graphics.drawRect(10 + (i * (width - 10) / cajas), 45, width / cajas, 20);

                int j = 0;

                for (Comprador c = control.getCajas()[i].primero; c != null; c = c.getSiguiente()) {
                    if (j < 10) {
                        graphics.setColor(new Color(j * 25, 255 - (j * 25), 0));
                    } else {
                        graphics.setColor(new Color(255, 0, 0));
                    }
                    int x = 15 + (i * (width - 10) / cajas), y = 70 + (j * 25);
                    graphics.fillOval(x, y, 20, 20);
                    if (dibujarCantidadProductos) {
                        graphics.setColor(Color.WHITE);
                        graphics.drawString(String.valueOf(c.getContenedor().getTotalProductos()),
                                x + 3, y + 15);
                    }
                    j++;

                }
            }
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonIniciar;
    private javax.swing.JCheckBox checkCantidadProductos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList list;
    private javax.swing.JPanel panelEstadísticas;
    private javax.swing.JSlider sliderCompradoresTurno;
    private javax.swing.JSlider sliderSleepTime;
    private javax.swing.JTextField textCanastas;
    private javax.swing.JTextField textCarritos;
    // End of variables declaration//GEN-END:variables

    public void setControl(Controlador control) {
        this.control = control;
    }
}
