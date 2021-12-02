package calculadoraiu;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Toolkit;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.KeyStroke;

public class Calculadora extends javax.swing.JFrame {

    //Acá importamos Script Manager de JavaScript Agarra el motor de JavaScript 
    ScriptEngineManager sem = new ScriptEngineManager();
    ScriptEngine se = sem.getEngineByName("JavaScript");

    public Calculadora() {
        initComponents();
        setLocationRelativeTo(null); //aparece en el centro el programa
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imágenes/icon_calcu.png")));
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        texOperación = new javax.swing.JLabel();
        textoResultado = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        botonC = new javax.swing.JButton();
        botonPorc = new javax.swing.JButton();
        botonSiete = new javax.swing.JButton();
        botonCE = new javax.swing.JButton();
        botonDiv = new javax.swing.JButton();
        botonMulti = new javax.swing.JButton();
        botonNueve = new javax.swing.JButton();
        botonOcho = new javax.swing.JButton();
        botonUno = new javax.swing.JButton();
        botonCero = new javax.swing.JButton();
        botonTres = new javax.swing.JButton();
        botonDos = new javax.swing.JButton();
        botonCuatro = new javax.swing.JButton();
        botonRest = new javax.swing.JButton();
        botonSeis = new javax.swing.JButton();
        botonCinco = new javax.swing.JButton();
        botonSuma = new javax.swing.JButton();
        botonIgual = new javax.swing.JButton();
        botonPunto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                formKeyReleased(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(244, 253, 251));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        texOperación.setFont(new java.awt.Font("Meiryo UI", 1, 18)); // NOI18N
        texOperación.setForeground(new java.awt.Color(106, 114, 120));
        texOperación.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(texOperación, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 308, 60));

        textoResultado.setFont(new java.awt.Font("Meiryo UI", 1, 48)); // NOI18N
        textoResultado.setForeground(new java.awt.Color(106, 114, 120));
        textoResultado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(textoResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 102, 320, 100));

        jButton1.setBackground(new java.awt.Color(244, 253, 251));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/darkmode_1.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 70, 30));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 0));
        jLabel2.setText(".");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 50, 30));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 51));
        jLabel3.setText(".");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 50, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 200));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonC.setFont(new java.awt.Font("Meiryo", 1, 24)); // NOI18N
        botonC.setForeground(new java.awt.Color(106, 114, 120));
        botonC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/boton calculadora.png"))); // NOI18N
        botonC.setText("C");
        botonC.setBorderPainted(false);
        botonC.setContentAreaFilled(false);
        botonC.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botonC.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonC.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/boton calculadora.png"))); // NOI18N
        botonC.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/boton calculadora cuando presione.png"))); // NOI18N
        botonC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCActionPerformed(evt);
            }
        });
        jPanel2.add(botonC, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 50, 50));

        botonPorc.setFont(new java.awt.Font("Meiryo", 1, 14)); // NOI18N
        botonPorc.setForeground(new java.awt.Color(106, 114, 120));
        botonPorc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/boton calculadora.png"))); // NOI18N
        botonPorc.setText("%");
        botonPorc.setBorderPainted(false);
        botonPorc.setContentAreaFilled(false);
        botonPorc.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botonPorc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonPorc.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/boton calculadora.png"))); // NOI18N
        botonPorc.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/boton calculadora cuando presione.png"))); // NOI18N
        botonPorc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPorcActionPerformed(evt);
            }
        });
        jPanel2.add(botonPorc, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 50, 50));

        botonSiete.setFont(new java.awt.Font("Meiryo", 1, 24)); // NOI18N
        botonSiete.setForeground(new java.awt.Color(106, 114, 120));
        botonSiete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/boton calculadora.png"))); // NOI18N
        botonSiete.setText("7");
        botonSiete.setBorderPainted(false);
        botonSiete.setContentAreaFilled(false);
        botonSiete.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botonSiete.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonSiete.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/boton calculadora.png"))); // NOI18N
        botonSiete.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/boton calculadora cuando presione.png"))); // NOI18N
        botonSiete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSieteActionPerformed(evt);
            }
        });
        jPanel2.add(botonSiete, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 50, 50));

        botonCE.setFont(new java.awt.Font("Meiryo", 1, 14)); // NOI18N
        botonCE.setForeground(new java.awt.Color(106, 114, 120));
        botonCE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/boton calculadora.png"))); // NOI18N
        botonCE.setText("CE");
        botonCE.setBorderPainted(false);
        botonCE.setContentAreaFilled(false);
        botonCE.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botonCE.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonCE.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/boton calculadora.png"))); // NOI18N
        botonCE.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/boton calculadora cuando presione.png"))); // NOI18N
        botonCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCEActionPerformed(evt);
            }
        });
        botonCE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                teclado(evt);
            }
        });
        jPanel2.add(botonCE, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 50, 50));

        botonDiv.setFont(new java.awt.Font("Meiryo", 1, 24)); // NOI18N
        botonDiv.setForeground(new java.awt.Color(106, 114, 120));
        botonDiv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/boton calculadora.png"))); // NOI18N
        botonDiv.setText("/");
        botonDiv.setBorderPainted(false);
        botonDiv.setContentAreaFilled(false);
        botonDiv.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botonDiv.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonDiv.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/boton calculadora.png"))); // NOI18N
        botonDiv.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/boton calculadora cuando presione.png"))); // NOI18N
        botonDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDivActionPerformed(evt);
            }
        });
        jPanel2.add(botonDiv, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 50, 50));

        botonMulti.setFont(new java.awt.Font("Meiryo", 1, 24)); // NOI18N
        botonMulti.setForeground(new java.awt.Color(106, 114, 120));
        botonMulti.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/boton calculadora.png"))); // NOI18N
        botonMulti.setText("x");
        botonMulti.setBorderPainted(false);
        botonMulti.setContentAreaFilled(false);
        botonMulti.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botonMulti.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonMulti.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/boton calculadora.png"))); // NOI18N
        botonMulti.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/boton calculadora cuando presione.png"))); // NOI18N
        botonMulti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMultiActionPerformed(evt);
            }
        });
        jPanel2.add(botonMulti, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 50, 50));

        botonNueve.setFont(new java.awt.Font("Meiryo", 1, 24)); // NOI18N
        botonNueve.setForeground(new java.awt.Color(106, 114, 120));
        botonNueve.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/boton calculadora.png"))); // NOI18N
        botonNueve.setText("9");
        botonNueve.setBorderPainted(false);
        botonNueve.setContentAreaFilled(false);
        botonNueve.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botonNueve.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonNueve.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/boton calculadora.png"))); // NOI18N
        botonNueve.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/boton calculadora cuando presione.png"))); // NOI18N
        botonNueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNueveActionPerformed(evt);
            }
        });
        jPanel2.add(botonNueve, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 50, 50));

        botonOcho.setFont(new java.awt.Font("Meiryo", 1, 24)); // NOI18N
        botonOcho.setForeground(new java.awt.Color(106, 114, 120));
        botonOcho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/boton calculadora.png"))); // NOI18N
        botonOcho.setText("8");
        botonOcho.setBorderPainted(false);
        botonOcho.setContentAreaFilled(false);
        botonOcho.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botonOcho.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonOcho.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/boton calculadora.png"))); // NOI18N
        botonOcho.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/boton calculadora cuando presione.png"))); // NOI18N
        botonOcho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonOchoActionPerformed(evt);
            }
        });
        jPanel2.add(botonOcho, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 50, 50));

        botonUno.setFont(new java.awt.Font("Meiryo", 1, 24)); // NOI18N
        botonUno.setForeground(new java.awt.Color(106, 114, 120));
        botonUno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/boton calculadora.png"))); // NOI18N
        botonUno.setText("1");
        botonUno.setBorderPainted(false);
        botonUno.setContentAreaFilled(false);
        botonUno.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botonUno.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonUno.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/boton calculadora.png"))); // NOI18N
        botonUno.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/boton calculadora cuando presione.png"))); // NOI18N
        botonUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonUnoActionPerformed(evt);
            }
        });
        jPanel2.add(botonUno, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 50, 50));

        botonCero.setFont(new java.awt.Font("Meiryo", 0, 24)); // NOI18N
        botonCero.setForeground(new java.awt.Color(106, 114, 120));
        botonCero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/boton calculadora.png"))); // NOI18N
        botonCero.setText("0");
        botonCero.setBorderPainted(false);
        botonCero.setContentAreaFilled(false);
        botonCero.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botonCero.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonCero.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/boton calculadora.png"))); // NOI18N
        botonCero.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/boton calculadora cuando presione.png"))); // NOI18N
        botonCero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCeroActionPerformed(evt);
            }
        });
        botonCero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                botonCeroKeyPressed(evt);
            }
        });
        jPanel2.add(botonCero, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 50, 50));

        botonTres.setFont(new java.awt.Font("Meiryo", 1, 24)); // NOI18N
        botonTres.setForeground(new java.awt.Color(106, 114, 120));
        botonTres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/boton calculadora.png"))); // NOI18N
        botonTres.setText("3");
        botonTres.setBorderPainted(false);
        botonTres.setContentAreaFilled(false);
        botonTres.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botonTres.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonTres.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/boton calculadora.png"))); // NOI18N
        botonTres.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/boton calculadora cuando presione.png"))); // NOI18N
        botonTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonTresActionPerformed(evt);
            }
        });
        jPanel2.add(botonTres, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 50, 50));

        botonDos.setFont(new java.awt.Font("Meiryo", 1, 24)); // NOI18N
        botonDos.setForeground(new java.awt.Color(106, 114, 120));
        botonDos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/boton calculadora.png"))); // NOI18N
        botonDos.setText("2");
        botonDos.setBorderPainted(false);
        botonDos.setContentAreaFilled(false);
        botonDos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botonDos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonDos.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/boton calculadora.png"))); // NOI18N
        botonDos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/boton calculadora cuando presione.png"))); // NOI18N
        botonDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDosActionPerformed(evt);
            }
        });
        jPanel2.add(botonDos, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 50, 50));

        botonCuatro.setFont(new java.awt.Font("Meiryo", 1, 24)); // NOI18N
        botonCuatro.setForeground(new java.awt.Color(106, 114, 120));
        botonCuatro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/boton calculadora.png"))); // NOI18N
        botonCuatro.setText("4");
        botonCuatro.setBorderPainted(false);
        botonCuatro.setContentAreaFilled(false);
        botonCuatro.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botonCuatro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonCuatro.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/boton calculadora.png"))); // NOI18N
        botonCuatro.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/boton calculadora cuando presione.png"))); // NOI18N
        botonCuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCuatroActionPerformed(evt);
            }
        });
        jPanel2.add(botonCuatro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 50, 50));

        botonRest.setFont(new java.awt.Font("Meiryo", 1, 24)); // NOI18N
        botonRest.setForeground(new java.awt.Color(106, 114, 120));
        botonRest.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/boton calculadora.png"))); // NOI18N
        botonRest.setText("-");
        botonRest.setBorderPainted(false);
        botonRest.setContentAreaFilled(false);
        botonRest.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botonRest.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonRest.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/boton calculadora.png"))); // NOI18N
        botonRest.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/boton calculadora cuando presione.png"))); // NOI18N
        botonRest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRestActionPerformed(evt);
            }
        });
        jPanel2.add(botonRest, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 50, 50));

        botonSeis.setFont(new java.awt.Font("Meiryo", 1, 24)); // NOI18N
        botonSeis.setForeground(new java.awt.Color(106, 114, 120));
        botonSeis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/boton calculadora.png"))); // NOI18N
        botonSeis.setText("6");
        botonSeis.setBorderPainted(false);
        botonSeis.setContentAreaFilled(false);
        botonSeis.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botonSeis.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonSeis.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/boton calculadora.png"))); // NOI18N
        botonSeis.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/boton calculadora cuando presione.png"))); // NOI18N
        botonSeis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSeisActionPerformed(evt);
            }
        });
        jPanel2.add(botonSeis, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 50, 50));

        botonCinco.setFont(new java.awt.Font("Meiryo", 1, 24)); // NOI18N
        botonCinco.setForeground(new java.awt.Color(106, 114, 120));
        botonCinco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/boton calculadora.png"))); // NOI18N
        botonCinco.setText("5");
        botonCinco.setBorderPainted(false);
        botonCinco.setContentAreaFilled(false);
        botonCinco.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botonCinco.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonCinco.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/boton calculadora.png"))); // NOI18N
        botonCinco.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/boton calculadora cuando presione.png"))); // NOI18N
        botonCinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCincoActionPerformed(evt);
            }
        });
        jPanel2.add(botonCinco, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 50, 50));

        botonSuma.setFont(new java.awt.Font("Meiryo", 1, 24)); // NOI18N
        botonSuma.setForeground(new java.awt.Color(106, 114, 120));
        botonSuma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/boton calculadora.png"))); // NOI18N
        botonSuma.setText("+");
        botonSuma.setBorderPainted(false);
        botonSuma.setContentAreaFilled(false);
        botonSuma.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botonSuma.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonSuma.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/boton calculadora.png"))); // NOI18N
        botonSuma.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/boton calculadora cuando presione.png"))); // NOI18N
        botonSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSumaActionPerformed(evt);
            }
        });
        jPanel2.add(botonSuma, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 50, 50));

        botonIgual.setFont(new java.awt.Font("Meiryo", 1, 24)); // NOI18N
        botonIgual.setForeground(new java.awt.Color(255, 255, 255));
        botonIgual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/boton2.png"))); // NOI18N
        botonIgual.setText("=");
        botonIgual.setBorderPainted(false);
        botonIgual.setContentAreaFilled(false);
        botonIgual.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botonIgual.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonIgual.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/boton calculadora.png"))); // NOI18N
        botonIgual.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/boton calculadora cuando presione.png"))); // NOI18N
        botonIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIgualActionPerformed(evt);
            }
        });
        jPanel2.add(botonIgual, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 50, 50));

        botonPunto.setFont(new java.awt.Font("Meiryo", 1, 14)); // NOI18N
        botonPunto.setForeground(new java.awt.Color(106, 114, 120));
        botonPunto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/boton calculadora.png"))); // NOI18N
        botonPunto.setText(".");
        botonPunto.setBorderPainted(false);
        botonPunto.setContentAreaFilled(false);
        botonPunto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botonPunto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonPunto.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/boton calculadora.png"))); // NOI18N
        botonPunto.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/boton calculadora cuando presione.png"))); // NOI18N
        botonPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPuntoActionPerformed(evt);
            }
        });
        jPanel2.add(botonPunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 50, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 320, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCEActionPerformed
        String texto = texOperación.getText().substring(0, texOperación.getText().length() - 1);//Para ir borrando desde donde empieza hasta su longitud menos 1
        texOperación.setText(texto);
        botonIgual.doClick();
    }//GEN-LAST:event_botonCEActionPerformed

    private void botonPorcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPorcActionPerformed
        addNumer("%");//vamos llenando los números

    }//GEN-LAST:event_botonPorcActionPerformed

    private void botonNueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNueveActionPerformed
        addNumer("9");
        botonIgual.doClick();
    }//GEN-LAST:event_botonNueveActionPerformed

    private void botonCincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCincoActionPerformed
        addNumer("5");
        botonIgual.doClick();
    }//GEN-LAST:event_botonCincoActionPerformed

    private void botonSeisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSeisActionPerformed
        addNumer("6");
        botonIgual.doClick();
    }//GEN-LAST:event_botonSeisActionPerformed

    private void botonTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonTresActionPerformed
        addNumer("3");
        botonIgual.doClick();
    }//GEN-LAST:event_botonTresActionPerformed

    private void botonCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCActionPerformed
        texOperación.setText(" "); //Acá lo que hacemos es dar el efecto de borrado Por el boton C
        textoResultado.setText("0");

    }//GEN-LAST:event_botonCActionPerformed

    private void botonOchoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonOchoActionPerformed
        addNumer("8");
        botonIgual.doClick();
    }//GEN-LAST:event_botonOchoActionPerformed

    private void botonSieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSieteActionPerformed
        addNumer("7");
        botonIgual.doClick();
    }//GEN-LAST:event_botonSieteActionPerformed

    private void botonCuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCuatroActionPerformed
        addNumer("4");
        botonIgual.doClick();
    }//GEN-LAST:event_botonCuatroActionPerformed

    private void botonDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDosActionPerformed
        addNumer("2");
        botonIgual.doClick();
    }//GEN-LAST:event_botonDosActionPerformed

    private void botonUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonUnoActionPerformed
        addNumer("1");
        botonIgual.doClick();
    }//GEN-LAST:event_botonUnoActionPerformed

    private void botonCeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCeroActionPerformed
       
        addNumer("0");
        botonIgual.doClick();
    }//GEN-LAST:event_botonCeroActionPerformed

    private void botonDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDivActionPerformed
        addNumer("/");

    }//GEN-LAST:event_botonDivActionPerformed

    private void botonMultiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMultiActionPerformed
        addNumer("*");

    }//GEN-LAST:event_botonMultiActionPerformed

    private void botonRestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRestActionPerformed
        addNumer("-");

    }//GEN-LAST:event_botonRestActionPerformed

    private void botonSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSumaActionPerformed
        addNumer("+");

    }//GEN-LAST:event_botonSumaActionPerformed

    private void botonPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPuntoActionPerformed
        addNumer(".");
        botonIgual.doClick();//Con doClick lo que hacemos es que se coloque el igual sin necesidad de presionarlo
    }//GEN-LAST:event_botonPuntoActionPerformed

    private void botonIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIgualActionPerformed
        try {
            String resultado = se.eval(texOperación.getText()).toString(); //Gracias al motor de JavaScript 
            textoResultado.setText(resultado);
        } catch (Exception e) {
            // botonC.doClick();

        }

    }//GEN-LAST:event_botonIgualActionPerformed
    boolean modoOscuro=false;//Para activar y desactivar el modoOscuro
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(!modoOscuro){
        jPanel1.setBackground(Color.decode("#212b41"));//Al presional el boton se va a cambiar el color del background
        jPanel2.setBackground(Color.decode("#2e3951"));
        texOperación.setForeground(Color.decode("#0db387"));
        textoResultado.setForeground(Color.decode("#0db387"));
        cambiarColorBn1(botonDiv);
        cambiarColorBn1(botonCE);
        cambiarColorBn1(botonC);
        cambiarColorBn1(botonSuma);
        cambiarColorBn1(botonRest);
        cambiarColorBn1(botonMulti);
        cambiarColorBn1(botonPorc);

        cambiarColorBn2(botonUno);
        cambiarColorBn2(botonDos);
        cambiarColorBn2(botonTres);
        cambiarColorBn2(botonCuatro);
        cambiarColorBn2(botonCinco);
        cambiarColorBn2(botonSeis);
        cambiarColorBn2(botonSiete);
        cambiarColorBn2(botonOcho);
        cambiarColorBn2(botonNueve);
        cambiarColorBn2(botonCero);
        cambiarColorBn2(botonPunto);
        jButton1.setIcon(new ImageIcon(getClass().getResource("/Imágenes/darkmode_2.png")));
        botonIgual.setIcon(new ImageIcon(getClass().getResource("/Imágenes/boton_calculadora6.png"))); //para el igual
        botonIgual.setPressedIcon(new ImageIcon(getClass().getResource("/Imágenes/boton_calculadora6.png")));
        botonIgual.setRolloverIcon(new ImageIcon(getClass().getResource("/Imágenes/btn3_pressed_dark.png")));
        botonIgual.setForeground(Color.decode("#4b5954"));
        modoOscuro=true;
        } else {
            Calculadora frame=new Calculadora();
            this.dispose();//que se cierre
            frame.setVisible(true);
        }
        

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        this.dispose(); //Para cerrar la app
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        this.setState(Frame.ICONIFIED); //Para minimizar
    }//GEN-LAST:event_jLabel2MouseClicked

    private void teclado(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_teclado
        // TODO add your handling code here:
        
        
        
    }//GEN-LAST:event_teclado

    private void formKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyReleased
        // TODO add your handling code here:
      
           
    }//GEN-LAST:event_formKeyReleased
    
    private void botonCeroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_botonCeroKeyPressed
        // TODO add your handling code here:
        

        
    }//GEN-LAST:event_botonCeroKeyPressed
    
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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    public void cambiarColorBn1(JButton btn) {
        btn.setIcon(new ImageIcon(getClass().getResource("/Imágenes/btn1_pressed_dark.png"))); //Para que los botones también tengan otros colores
        btn.setPressedIcon(new ImageIcon(getClass().getResource("/Imágenes/btn1_pressed_dark.png")));
        btn.setRolloverIcon(new ImageIcon(getClass().getResource("/Imágenes/btn1_dark.png")));

        btn.setForeground(Color.decode("#0db387"));

    }

    public void cambiarColorBn2(JButton btn) {
        btn.setIcon(new ImageIcon(getClass().getResource("/Imágenes/1boton_dark.png"))); //Para que los botones también tengan otros colores
        btn.setPressedIcon(new ImageIcon(getClass().getResource("/Imágenes/btn1_dark.png")));
        btn.setRolloverIcon(new ImageIcon(getClass().getResource("/Imágenes/btn1_pressed_dark.png")));

        btn.setForeground(Color.decode("#f8fefc"));

    }

    public void addNumer(String digito) {
        //Este método sirve para ir añadiendo números a la pantalla
        texOperación.setText(texOperación.getText() + digito); //A través de texOperación.getText()+digito me va a permitir agregar lo que ya tengo con otro más 777 por ej

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonC;
    private javax.swing.JButton botonCE;
    private javax.swing.JButton botonCero;
    private javax.swing.JButton botonCinco;
    private javax.swing.JButton botonCuatro;
    private javax.swing.JButton botonDiv;
    private javax.swing.JButton botonDos;
    private javax.swing.JButton botonIgual;
    private javax.swing.JButton botonMulti;
    private javax.swing.JButton botonNueve;
    private javax.swing.JButton botonOcho;
    private javax.swing.JButton botonPorc;
    private javax.swing.JButton botonPunto;
    private javax.swing.JButton botonRest;
    private javax.swing.JButton botonSeis;
    private javax.swing.JButton botonSiete;
    private javax.swing.JButton botonSuma;
    private javax.swing.JButton botonTres;
    private javax.swing.JButton botonUno;
    private javax.swing.JButton jButton1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel texOperación;
    private javax.swing.JLabel textoResultado;
    // End of variables declaration//GEN-END:variables
}
