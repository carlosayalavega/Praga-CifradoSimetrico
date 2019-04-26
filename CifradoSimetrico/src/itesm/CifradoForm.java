package itesm;

import java.util.*;
import javax.swing.JOptionPane;

public class CifradoForm extends javax.swing.JFrame {

    public CifradoForm() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        textoACifrar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        claveLlave1 = new javax.swing.JTextField();
        cifrarButton = new javax.swing.JButton();
        limpiarButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        textoADescifrar = new javax.swing.JTextField();
        descifrarButton = new javax.swing.JButton();
        limpiarButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        cifradoText = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        descifradoText = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Texto a cifrar");

        jLabel2.setText("Clave / Llave");

        cifrarButton.setText("Cifrar");
        cifrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cifrarButtonActionPerformed(evt);
            }
        });

        limpiarButton.setText("Limpiar");
        limpiarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarButtonActionPerformed(evt);
            }
        });

        jLabel3.setText("Texto a descifrar");

        descifrarButton.setText("Descifrar");
        descifrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descifrarButtonActionPerformed(evt);
            }
        });

        limpiarButton1.setText("Limpiar");
        limpiarButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarButton1ActionPerformed(evt);
            }
        });

        cifradoText.setColumns(20);
        cifradoText.setRows(5);
        jScrollPane1.setViewportView(cifradoText);

        descifradoText.setColumns(20);
        descifradoText.setRows(5);
        jScrollPane2.setViewportView(descifradoText);

        jLabel5.setText("Texto cifrado:");

        jLabel6.setText("Texto descifrado:");

        jLabel4.setText("Fernando García Quijano - A01337375");

        jLabel7.setText("Ricardo Raúl Salcedo Trejo - A01337828");

        jLabel8.setText("Pablo Enríquez Escamilla - A01336386");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cifrarButton)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(limpiarButton)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1)
                                .addGap(23, 23, 23))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(descifrarButton)
                                .addGap(18, 18, 18)
                                .addComponent(limpiarButton1))
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2))
                            .addComponent(claveLlave1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textoACifrar, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textoADescifrar, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8)
                                .addGap(0, 78, Short.MAX_VALUE)))
                        .addGap(23, 23, 23))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textoACifrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(claveLlave1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cifrarButton)
                    .addComponent(limpiarButton))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel5)))
                .addGap(29, 29, 29)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textoADescifrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(descifrarButton)
                    .addComponent(limpiarButton1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel6)))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    String sustitucionInput;
    int n;
    String key;
    StringBuffer sustitucionOutput;
    String transposicionInput;
    StringBuffer transposicionOutput;
    String enc;
    int[] encriptado;
    
    private void cifrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cifrarButtonActionPerformed
        // TODO add your handling code here:
        try{
            
            sustitucionInput = textoACifrar.getText();
            n = 4;
            key = claveLlave1.getText();
            
            // Sustitucion cifrado
            sustitucionOutput = new StringBuffer();
            sustitucionInput = sustitucionInput.toUpperCase();
            for(int i=0 ; i<sustitucionInput.length() ; i++) {
                char c = sustitucionInput.charAt(i);
                sustitucionOutput.append((char) (c+5));
            }
            System.out.println("\nSustitucion (suma) texto:");
            System.out.println(sustitucionOutput);

            // Transposicion cifrado
            transposicionInput = sustitucionOutput.toString();
            int modulo;
            if((modulo = transposicionInput.length()%n) != 0) {
                modulo = n-modulo;
                // ‘modulo’ es ahora el num de espacios blancos rellenos (sera X) que se le appenderan
                for(int a = modulo; a != 0; a--) {
                    transposicionInput += "/";
                }
            }
            transposicionOutput = new StringBuffer();
            System.out.println("\nTransposicion Matriz:");
            for(int i=0 ; i<n ; i++) {
                for(int j=0 ; j<transposicionInput.length()/n ; j++) {
                    char c = transposicionInput.charAt(i+(j*n));
                    System.out.print(c);
                    transposicionOutput.append(c);
                }
                System.out.println();
            }
            System.out.println("\nTexto final transposicion cifrado:");
            System.out.println(transposicionOutput);

            //Vigenère cifrado
            System.out.println("\nVegenère cifrado");
            enc = cifrar(transposicionOutput.toString(), key);
            System.out.println(enc);

            //XOR cifrado
            System.out.println("\nXOR cifrado");
            StringBuffer finalEncriptadoOutput = new StringBuffer();
            encriptado = cifrarXOR(enc,key);
            for(int i = 0; i < encriptado.length; i++){
                System.out.printf("%d,", encriptado[i]);
                finalEncriptadoOutput.append(encriptado[i]+",");
            } 
            System.out.println("");
            
            cifradoText.setText(finalEncriptadoOutput.toString());
            textoADescifrar.setText(finalEncriptadoOutput.toString());

            }catch(Exception e){
                JOptionPane.showMessageDialog(this, "Mal ingreso cifrar", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
    }//GEN-LAST:event_cifrarButtonActionPerformed

    private void limpiarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarButtonActionPerformed
        // TODO add your handling code here:
        textoACifrar.setText("");
        claveLlave1.setText("");
        cifradoText.setText("");
    }//GEN-LAST:event_limpiarButtonActionPerformed

    private void descifrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descifrarButtonActionPerformed
        // TODO add your handling code here:
        try{
            
            //XOR descifrado
            System.out.println("\nXOR descifrado");
            String xorDescifrado = descifrarXOR(encriptado,key);
            System.out.println(xorDescifrado);

            //Vegenère descifrado
            System.out.println("\nVegenère descifrado");
            String vigenereDescifrado = descifrar(xorDescifrado, key);
            System.out.println(vigenereDescifrado);

            // Transposicion descifrado
            System.out.println("\nTransposicion descifrado");
//            transposicionOutput.delete(0, transposicionOutput.length());
//            transposicionOutput.append(vigenereDescifrado);
            n = vigenereDescifrado.length()/n;
            StringBuffer transposicionTextoSimple = new StringBuffer();
            for(int i=0 ; i<n ; i++) {
                for(int j=0 ; j<vigenereDescifrado.length()/n ; j++) {
                    char c = vigenereDescifrado.charAt(i+(j*n));
                    transposicionTextoSimple.append(c);
                }
            }

            // Sustitucion descifrado
            System.out.println("\nSustitucion descifrado");
            StringBuffer textoSimple = new StringBuffer();
            for(int i=0 ; i<transposicionTextoSimple.length() ; i++) {
                char c = transposicionTextoSimple.charAt(i);
                textoSimple.append((char) (c-5));
            }

            System.out.println("\nTexto = resultado descifrado:");
            System.out.println(textoSimple);
            
            descifradoText.setText(textoSimple.toString());
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Mal ingreso descifrado", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
    }//GEN-LAST:event_descifrarButtonActionPerformed

    private void limpiarButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarButton1ActionPerformed
        // TODO add your handling code here:
        textoADescifrar.setText("");
        descifradoText.setText("");
    }//GEN-LAST:event_limpiarButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(CifradoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CifradoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CifradoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CifradoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CifradoForm().setVisible(true);
            }
        });
    }
    
    //Método Vigenere
    private static String cifrar(String texto, final String key) {
        String res = "";
//        text = text.toUpperCase();
        for (int i = 0, j = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            int vigenere = key.charAt(i % key.length()) - 32;
            int sum = c - 32 + vigenere;
            res += (char) (sum % 95 + 32);
//            if (c < 'A' || c > 'Z') continue;
//            res += (char)((c + key.charAt(j) - 2 * 'A') % 26 + 'A');
//            j = ++j % key.length();
        }
        return res;
    }
 
    private static String descifrar(String texto, final String key) {
        String res = "";
//        text = text.toUpperCase();
        for (int i = 0, j = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            int vigenere = key.charAt(i % key.length()) - 32;
            int sum = c - 32 + (95 - vigenere);
            res += (char) (sum % 95 + 32);
//            if (c < 'A' || c > 'Z') continue;
//            res += (char)((c - key.charAt(j) + 26) % 26 + 'A');
//            j = ++j % key.length();
        }
        return res;
    }
    
    //Método XOR
    private static int[] cifrarXOR(String texto, String key) {
        int[] salida = new int[texto.length()];
        for(int i = 0; i < texto.length(); i++) {
            int o = (Integer.valueOf(texto.charAt(i)) ^ Integer.valueOf(key.charAt(i % (key.length() - 1)))) + '0';
            salida[i] = o;
        }
        return salida;        
    }

    private static String descifrarXOR(int[] entrada, String key) {
        String salida = "";        
        for(int i = 0; i < entrada.length; i++) {
            salida += (char) ((entrada[i] - 48) ^ (int) key.charAt(i % (key.length() - 1)));
        }
        return salida;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea cifradoText;
    private javax.swing.JButton cifrarButton;
    private javax.swing.JTextField claveLlave1;
    private javax.swing.JTextArea descifradoText;
    private javax.swing.JButton descifrarButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton limpiarButton;
    private javax.swing.JButton limpiarButton1;
    private javax.swing.JTextField textoACifrar;
    private javax.swing.JTextField textoADescifrar;
    // End of variables declaration//GEN-END:variables
}
