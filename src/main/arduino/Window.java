package main.arduino;

import main.panamahitek.PanamaHitek_Arduino;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Antony García Gonzáles, from Panama Hitek Creative Team
 *
 * Este ejemplo le da dfuncionalidad a un sencillo ejemplo para encender o
 * apagar un LED conectado a Arduino al presionar uno de los dos botones de la
 * interfaz gráfica.
 */
public class Window extends javax.swing.JFrame {
//Se instancia la Librería Arduino

    PanamaHitek_Arduino Arduino = new PanamaHitek_Arduino();
    Controls c = new Controls();

    public Window() {

        initComponents();

        getPorts();

        //Se inicia la conexión con Arduino para transmisión de datos
    }

    public void getPorts() {
        jComboBoxPorts.removeAllItems();
        if (Arduino.getPortsAvailable() > 0) {
            Arduino.getSerialPorts().forEach(i -> jComboBoxPorts.addItem(i));
            jButtonConectar.setEnabled(true);
            jButtonConectar.setBackground(new Color(255, 255, 255));
        } else {
            jButtonConectar.setEnabled(false);
            jButtonConectar.setBackground(new Color(204, 204, 204));
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButtonSecuencia1 = new javax.swing.JButton();
        jButtonSecuencia2 = new javax.swing.JButton();
        jButtonSecuencia3 = new javax.swing.JButton();
        jButtonSecuencia4 = new javax.swing.JButton();
        jButtonSecuencia5 = new javax.swing.JButton();
        jButtonSecuencia6 = new javax.swing.JButton();
        jButtonSecuencia7 = new javax.swing.JButton();
        jButtonSecuencia8 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jComboBoxPorts = new javax.swing.JComboBox();
        jButtonRefresh = new javax.swing.JButton();
        jButtonConectar = new javax.swing.JButton();
        jLabelPH = new javax.swing.JLabel();
        jLabelPH1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LEDCube 4x4x4");
        setBackground(new java.awt.Color(51, 51, 51));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel1MouseMoved(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButtonSecuencia1.setBackground(new java.awt.Color(204, 204, 204));
        jButtonSecuencia1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jButtonSecuencia1.setForeground(new java.awt.Color(255, 102, 0));
        jButtonSecuencia1.setText("Secuencia I");
        jButtonSecuencia1.setEnabled(false);
        jButtonSecuencia1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSecuencia1ActionPerformed(evt);
            }
        });

        jButtonSecuencia2.setBackground(new java.awt.Color(204, 204, 204));
        jButtonSecuencia2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jButtonSecuencia2.setForeground(new java.awt.Color(255, 102, 0));
        jButtonSecuencia2.setText("Secuencia II");
        jButtonSecuencia2.setEnabled(false);
        jButtonSecuencia2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSecuencia2ActionPerformed(evt);
            }
        });

        jButtonSecuencia3.setBackground(new java.awt.Color(204, 204, 204));
        jButtonSecuencia3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jButtonSecuencia3.setForeground(new java.awt.Color(255, 102, 0));
        jButtonSecuencia3.setText("Secuencia IV");
        jButtonSecuencia3.setEnabled(false);
        jButtonSecuencia3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSecuencia3ActionPerformed(evt);
            }
        });

        jButtonSecuencia4.setBackground(new java.awt.Color(204, 204, 204));
        jButtonSecuencia4.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jButtonSecuencia4.setForeground(new java.awt.Color(255, 102, 0));
        jButtonSecuencia4.setText("Secuencia III");
        jButtonSecuencia4.setEnabled(false);
        jButtonSecuencia4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSecuencia4ActionPerformed(evt);
            }
        });

        jButtonSecuencia5.setBackground(new java.awt.Color(204, 204, 204));
        jButtonSecuencia5.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jButtonSecuencia5.setForeground(new java.awt.Color(255, 102, 0));
        jButtonSecuencia5.setText("Secuencia V");
        jButtonSecuencia5.setEnabled(false);
        jButtonSecuencia5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSecuencia5ActionPerformed(evt);
            }
        });

        jButtonSecuencia6.setBackground(new java.awt.Color(204, 204, 204));
        jButtonSecuencia6.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jButtonSecuencia6.setForeground(new java.awt.Color(255, 102, 0));
        jButtonSecuencia6.setText("Secuencia VI");
        jButtonSecuencia6.setEnabled(false);
        jButtonSecuencia6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSecuencia6ActionPerformed(evt);
            }
        });

        jButtonSecuencia7.setBackground(new java.awt.Color(204, 204, 204));
        jButtonSecuencia7.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jButtonSecuencia7.setForeground(new java.awt.Color(255, 102, 0));
        jButtonSecuencia7.setText("Secuencia VII");
        jButtonSecuencia7.setEnabled(false);
        jButtonSecuencia7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSecuencia7ActionPerformed(evt);
            }
        });

        jButtonSecuencia8.setBackground(new java.awt.Color(204, 204, 204));
        jButtonSecuencia8.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jButtonSecuencia8.setForeground(new java.awt.Color(255, 102, 0));
        jButtonSecuencia8.setText("Secuencia VIII");
        jButtonSecuencia8.setEnabled(false);
        jButtonSecuencia8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSecuencia8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButtonSecuencia2, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                    .addComponent(jButtonSecuencia1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonSecuencia3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSecuencia4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonSecuencia6, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                    .addComponent(jButtonSecuencia5, javax.swing.GroupLayout.PREFERRED_SIZE, 156, Short.MAX_VALUE))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonSecuencia7, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSecuencia8, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSecuencia1)
                    .addComponent(jButtonSecuencia4)
                    .addComponent(jButtonSecuencia5)
                    .addComponent(jButtonSecuencia7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSecuencia2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonSecuencia3)
                    .addComponent(jButtonSecuencia6)
                    .addComponent(jButtonSecuencia8))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jComboBoxPorts.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        jButtonRefresh.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/refreshicon.png"))); // NOI18N
        jButtonRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRefreshActionPerformed(evt);
            }
        });

        jButtonConectar.setBackground(new java.awt.Color(255, 255, 255));
        jButtonConectar.setFont(new java.awt.Font("Century Gothic", 1, 17)); // NOI18N
        jButtonConectar.setForeground(new java.awt.Color(0, 153, 204));
        jButtonConectar.setText("Conectar");
        jButtonConectar.setEnabled(false);
        jButtonConectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConectarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jComboBoxPorts, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonConectar, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(jComboBoxPorts))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(jButtonConectar)
                .addContainerGap())
        );

        jLabelPH.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabelPH.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPH.setText("66.02 Laboratorio | FIUBA");
        jLabelPH.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabelPHMouseMoved(evt);
            }
        });
        jLabelPH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelPHMouseClicked(evt);
            }
        });

        jLabelPH1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabelPH1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPH1.setText("LEDCube 4x4x4");
        jLabelPH1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabelPH1MouseMoved(evt);
            }
        });
        jLabelPH1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelPH1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabelPH))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelPH1)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 24, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(212, 212, 212)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelPH1)
                .addGap(13, 13, 13)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jLabelPH)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    private void jPanel1MouseMoved(java.awt.event.MouseEvent evt) {                                   
        jLabelPH.setForeground(Color.white);
    }                                  

    private void jLabelPH1MouseClicked(java.awt.event.MouseEvent evt) {                                       
        // TODO add your handling code here:
    }                                      

    private void jLabelPH1MouseMoved(java.awt.event.MouseEvent evt) {                                     
        // TODO add your handling code here:
    }                                    

    private void jLabelPHMouseClicked(java.awt.event.MouseEvent evt) {                                      
        Acerca a = new Acerca();
        a.setVisible(true);
        a.setLocationRelativeTo(null);
    }                                     

    private void jLabelPHMouseMoved(java.awt.event.MouseEvent evt) {                                    
        jLabelPH.setForeground(new Color(255, 204, 51));
    }                                   

    private void jButtonConectarActionPerformed(java.awt.event.ActionEvent evt) {                                                

        if (jButtonConectar.getText().equals("Desconectar")) {
            try {
                Arduino.killArduinoConnection();
                jButtonConectar.setText("Conectar");
                c.disableButton(jButtonSecuencia1);
                c.disableButton(jButtonSecuencia2);
                c.disableButton(jButtonSecuencia3);
                c.disableButton(jButtonSecuencia4);
                c.disableButton(jButtonSecuencia5);
                c.disableButton(jButtonSecuencia6);
                c.disableButton(jButtonSecuencia7);
                c.disableButton(jButtonSecuencia8);
                c.enableConnectionPanel(jButtonRefresh, jComboBoxPorts);
            } catch (Exception ex) {
                Logger.getLogger(Window.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {

            try {
                Arduino.arduinoTX(jComboBoxPorts.getSelectedItem().toString(), 9600);
                jButtonConectar.setText("Desconectar");
                c.enableButton(jButtonSecuencia1);
                c.enableButton(jButtonSecuencia2);
                c.enableButton(jButtonSecuencia3);
                c.enableButton(jButtonSecuencia4);
                c.enableButton(jButtonSecuencia5);
                c.enableButton(jButtonSecuencia6);
                c.enableButton(jButtonSecuencia7);
                c.enableButton(jButtonSecuencia8);
                c.disableConnectionPanel(jButtonRefresh, jComboBoxPorts);
            } catch (Exception ex) {
                Logger.getLogger(Window.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }                                               

    private void jButtonRefreshActionPerformed(java.awt.event.ActionEvent evt) {                                               

        getPorts();

    }                                              

    private void jButtonSecuencia2ActionPerformed(java.awt.event.ActionEvent evt) {                                                  

        //Se modifica la interface gráfica del botón precionado
        c.enableButton(jButtonSecuencia1);
        c.enableButton(jButtonSecuencia3);
        c.enableButton(jButtonSecuencia4);
        c.enableButton(jButtonSecuencia5);
        c.enableButton(jButtonSecuencia6);
        c.enableButton(jButtonSecuencia7);
        c.enableButton(jButtonSecuencia8);
        c.disableButton(jButtonSecuencia2);
        //Se envía un -2- para prender el LED
        try {
            Arduino.sendData("2");
        } catch (Exception ex) {
            Logger.getLogger(Window.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                                 

    private void jButtonSecuencia1ActionPerformed(java.awt.event.ActionEvent evt) {                                                  

        //Se modifica la interface gráfica del botón precionado
        c.enableButton(jButtonSecuencia2);
        c.enableButton(jButtonSecuencia3);
        c.enableButton(jButtonSecuencia4);
        c.enableButton(jButtonSecuencia5);
        c.enableButton(jButtonSecuencia6);
        c.enableButton(jButtonSecuencia7);
        c.enableButton(jButtonSecuencia8);
        c.disableButton(jButtonSecuencia1);
        //Se envían un -1- para encender el LED
        try {
            Arduino.sendData("1");
        } catch (Exception ex) {
            Logger.getLogger(Window.class.getName()).log(Level.SEVERE, null, ex);
        }

    }                                                 

    private void jButtonSecuencia3ActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        //Se modifica la interface gráfica del botón precionado
        c.enableButton(jButtonSecuencia1);
        c.enableButton(jButtonSecuencia2);
        c.enableButton(jButtonSecuencia4);
        c.enableButton(jButtonSecuencia5);
        c.enableButton(jButtonSecuencia6);
        c.enableButton(jButtonSecuencia7);
        c.enableButton(jButtonSecuencia8);
        c.disableButton(jButtonSecuencia3);
        //Se envían un -3- para encender el LED
        try {
            Arduino.sendData("3");
        } catch (Exception ex) {
            Logger.getLogger(Window.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                                 

    private void jButtonSecuencia4ActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        //Se modifica la interface gráfica del botón precionado
        c.enableButton(jButtonSecuencia1);
        c.enableButton(jButtonSecuencia2);
        c.enableButton(jButtonSecuencia3);
        c.enableButton(jButtonSecuencia5);
        c.enableButton(jButtonSecuencia6);
        c.enableButton(jButtonSecuencia7);
        c.enableButton(jButtonSecuencia8);
        c.disableButton(jButtonSecuencia4);
        //Se envían un -4- para encender el LED
        try {
            Arduino.sendData("4");
        } catch (Exception ex) {
            Logger.getLogger(Window.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                                 

    private void jButtonSecuencia5ActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        //Se modifica la interface gráfica del botón precionado
        c.enableButton(jButtonSecuencia1);
        c.enableButton(jButtonSecuencia2);
        c.enableButton(jButtonSecuencia3);
        c.enableButton(jButtonSecuencia4);
        c.enableButton(jButtonSecuencia6);
        c.enableButton(jButtonSecuencia7);
        c.enableButton(jButtonSecuencia8);
        c.disableButton(jButtonSecuencia5);
        //Se envían un -5- para encender el LED
        try {
            Arduino.sendData("5");
        } catch (Exception ex) {
            Logger.getLogger(Window.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                                 

    private void jButtonSecuencia6ActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        //Se modifica la interface gráfica del botón precionado
        c.enableButton(jButtonSecuencia1);
        c.enableButton(jButtonSecuencia2);
        c.enableButton(jButtonSecuencia3);        
        c.enableButton(jButtonSecuencia4);
        c.enableButton(jButtonSecuencia5);
        c.enableButton(jButtonSecuencia7);
        c.enableButton(jButtonSecuencia8);
        c.disableButton(jButtonSecuencia6);
        //Se envían un -6- para encender el LED
        try {
            Arduino.sendData("6");
        } catch (Exception ex) {
            Logger.getLogger(Window.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                                 

    private void jButtonSecuencia7ActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        //Se modifica la interface gráfica del botón precionado
        c.enableButton(jButtonSecuencia1);
        c.enableButton(jButtonSecuencia2);
        c.enableButton(jButtonSecuencia3);
        c.enableButton(jButtonSecuencia4);
        c.enableButton(jButtonSecuencia5);
        c.enableButton(jButtonSecuencia6);
        c.enableButton(jButtonSecuencia8);
        c.disableButton(jButtonSecuencia7);
        //Se envían un -7- para encender el LED
        try {
            Arduino.sendData("7");
        } catch (Exception ex) {
            Logger.getLogger(Window.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                                 

    private void jButtonSecuencia8ActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        //Se modifica la interface gráfica del botón precionado
        c.enableButton(jButtonSecuencia1);
        c.enableButton(jButtonSecuencia2);
        c.enableButton(jButtonSecuencia3);
        c.enableButton(jButtonSecuencia4);
        c.enableButton(jButtonSecuencia5);
        c.enableButton(jButtonSecuencia6);
        c.enableButton(jButtonSecuencia7);
        c.disableButton(jButtonSecuencia8);
        //Se envían un -8- para encender el LED
        try {
            Arduino.sendData("8");
        } catch (Exception ex) {
            Logger.getLogger(Window.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Window().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify                     
    private javax.swing.JButton jButtonConectar;
    private javax.swing.JButton jButtonRefresh;
    private javax.swing.JButton jButtonSecuencia1;
    private javax.swing.JButton jButtonSecuencia2;
    private javax.swing.JButton jButtonSecuencia3;
    private javax.swing.JButton jButtonSecuencia4;
    private javax.swing.JButton jButtonSecuencia5;
    private javax.swing.JButton jButtonSecuencia6;
    private javax.swing.JButton jButtonSecuencia7;
    private javax.swing.JButton jButtonSecuencia8;
    private javax.swing.JComboBox jComboBoxPorts;
    private javax.swing.JLabel jLabelPH;
    private javax.swing.JLabel jLabelPH1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration                   
}
