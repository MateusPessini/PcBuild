package br.com.unipar.pcbuild;

import br.com.unipar.pcbuild.models.Computador;
import br.com.unipar.pcbuild.models.Peca;
import br.com.unipar.pcbuild.models.PilhaPc;
import javax.swing.JOptionPane;

public class CadastroPc extends javax.swing.JFrame {

    public static Double aux = 0.0;
    public static String aux3 = "";
    public static PilhaPc<Computador> pilhaPc = new PilhaPc<>(25);

    public CadastroPc() {
        initComponents();
        setVisible(true);
        Peca peca1 = new Peca("teste1", 100.0, "Memoria", 1, "MEMORIA",10);
        Peca peca2 = new Peca("teste2", 300.0, "SSD", 2, "SSD",10);
        Peca peca3 = new Peca("teste3", 200.0, "Memoria2", 3, "MEMORIA",10);
        Peca peca4 = new Peca("teste1", 100.0, "Placa video", 1, "PLACAVIDEO",10);
        Peca peca5 = new Peca("teste2", 300.0, "Placa mae", 2, "PLACAMAE",10);
        Peca peca6 = new Peca("teste3", 200.0, "processador", 3, "PROCESSADOR",10);
        Peca peca7 = new Peca("teste3", 200.0, "gabinete", 3, "GABINETE",10);
        Peca peca8 = new Peca("teste3", 100.0, "hd", 3, "HD",10);
        CadastroPeca.pecaLista.getListaPecas().add(peca1);
        CadastroPeca.pecaLista.getListaPecas().add(peca2);
        CadastroPeca.pecaLista.getListaPecas().add(peca3);
        CadastroPeca.pecaLista.getListaPecas().add(peca4);
        CadastroPeca.pecaLista.getListaPecas().add(peca5);
        CadastroPeca.pecaLista.getListaPecas().add(peca6);
        CadastroPeca.pecaLista.getListaPecas().add(peca7);
        CadastroPeca.pecaLista.getListaPecas().add(peca8);
        jComboMemoria.addItem("");
        jComboSsd.addItem("");
        jComboHd.addItem("");
        jComboGabinete.addItem("");
        jComboPlacaVideo.addItem("");
        jComboPlacaMae.addItem("");
        jComboProcessador.addItem("");
        for (int i = 0; i < CadastroPeca.pecaLista.getListaPecas().size(); i++) {
            switch (CadastroPeca.pecaLista.getListaPecas().get(i).getTipoPeca()) {
                case "MEMORIA":
                    jComboMemoria.addItem(CadastroPeca.pecaLista.getListaPecas().get(i).getNome());
                    break;
                case "PLACAMAE":
                    jComboPlacaMae.addItem(CadastroPeca.pecaLista.getListaPecas().get(i).getNome());
                    break;
                case "PLACAVIDEO":
                    jComboPlacaVideo.addItem(CadastroPeca.pecaLista.getListaPecas().get(i).getNome());
                    break;
                case "SSD":
                    jComboSsd.addItem(CadastroPeca.pecaLista.getListaPecas().get(i).getNome());
                    break;
                case "HD":
                    jComboHd.addItem(CadastroPeca.pecaLista.getListaPecas().get(i).getNome());
                    break;
                case "PROCESSADOR":
                    jComboProcessador.addItem(CadastroPeca.pecaLista.getListaPecas().get(i).getNome());
                    break;
                case "GABINETE":
                    jComboGabinete.addItem(CadastroPeca.pecaLista.getListaPecas().get(i).getNome());
                    break;
            }
        }
        jTextValueTotal.setText("0.0");
        jTextValueTotal.setText(aux.toString());
        aux = 0.0;
        jComboSsd.setSelectedItem("");
        jComboHd.setSelectedItem("");
        jComboPlacaMae.setSelectedItem("");
        jComboPlacaVideo.setSelectedItem("");
        jComboMemoria.setSelectedItem("");
        jComboGabinete.setSelectedItem("");
        jComboProcessador.setSelectedItem("");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboMemoria = new javax.swing.JComboBox<>();
        jComboSsd = new javax.swing.JComboBox<>();
        jComboPlacaMae = new javax.swing.JComboBox<>();
        jComboPlacaVideo = new javax.swing.JComboBox<>();
        jComboProcessador = new javax.swing.JComboBox<>();
        jComboHd = new javax.swing.JComboBox<>();
        jComboGabinete = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextValueTotal = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jComboMemoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[0]));
        jComboMemoria.setSelectedItem("                 ");

        jComboSsd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[0]));

        jComboPlacaMae.setModel(new javax.swing.DefaultComboBoxModel<>(new String[0]));

        jComboPlacaVideo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[0]));

        jComboProcessador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[0]));

        jComboHd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[0]));

        jComboGabinete.setModel(new javax.swing.DefaultComboBoxModel<>(new String[0]));

        jLabel1.setText("Memória:");

        jLabel2.setText("Placa Mãe:");

        jLabel3.setText("SSD:");

        jLabel4.setText("Placa Video:");

        jLabel5.setText("Processador:");

        jLabel6.setText("HD:");

        jLabel7.setText("Gabinete:");

        jTextValueTotal.setEditable(false);

        jButton1.setText("Calcular Valor");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Confirmar PC");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTextValueTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                        .addComponent(jLabel2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4)))))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboGabinete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboHd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboProcessador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboPlacaVideo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboPlacaMae, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboSsd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboSsd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboPlacaMae, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jTextValueTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboPlacaVideo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboProcessador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboHd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboGabinete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            if (jComboGabinete.getSelectedItem() == "" || jComboProcessador.getSelectedItem() == "" || jComboMemoria.getSelectedItem() == "" || jComboPlacaVideo.getSelectedItem() == "" || jComboPlacaMae.getSelectedItem() == "" || (jComboHd.getSelectedItem() == "" && jComboSsd.getSelectedItem() == "")) {
                throw new Exception("Erro - Favor inserir as peças faltantes para a confirmação da criação do pc");
            }
            Computador novoPc = new Computador();
            for (int i = 0; i < CadastroPeca.pecaLista.getListaPecas().size(); i++) {
                aux3 = CadastroPeca.pecaLista.getListaPecas().get(i).getNome();
                if (aux3.equals(jComboGabinete.getSelectedItem().toString()) || aux3.equals(jComboHd.getSelectedItem().toString()) || aux3.equals(jComboSsd.getSelectedItem().toString()) || aux3.equals(jComboPlacaMae.getSelectedItem().toString()) || aux3.equals(jComboPlacaVideo.getSelectedItem().toString()) || aux3.equals(jComboProcessador.getSelectedItem().toString()) || aux3.equals(jComboMemoria.getSelectedItem().toString())) {
                    novoPc.getPecas().add(CadastroPeca.pecaLista.getListaPecas().get(i));
                    CadastroPeca.pecaLista.getListaPecas().get(i).diminuiEstoque();
                }
            }
            novoPc.setVlTotal(Double.parseDouble(jTextValueTotal.getText()));
            pilhaPc.push(novoPc);
            JOptionPane.showMessageDialog(null, "Salvamento Concluido!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try {
            if (jComboGabinete.getSelectedItem() == "" || jComboProcessador.getSelectedItem() == "" || jComboMemoria.getSelectedItem() == "" || jComboPlacaVideo.getSelectedItem() == "" || jComboPlacaMae.getSelectedItem() == "" || (jComboHd.getSelectedItem() == "" && jComboSsd.getSelectedItem() == "")) {
                throw new Exception("Erro - Favor inserir as peças faltantes para a confirmação da criação do pc.");
            }
            for (int i = 0; i < CadastroPeca.pecaLista.getListaPecas().size(); i++) {
                aux3 = CadastroPeca.pecaLista.getListaPecas().get(i).getNome();
                if (aux3.equals(jComboGabinete.getSelectedItem().toString()) || aux3.equals(jComboHd.getSelectedItem().toString()) || aux3.equals(jComboSsd.getSelectedItem().toString()) || aux3.equals(jComboPlacaMae.getSelectedItem().toString()) || aux3.equals(jComboPlacaVideo.getSelectedItem().toString()) || aux3.equals(jComboProcessador.getSelectedItem().toString()) || aux3.equals(jComboMemoria.getSelectedItem().toString())) {
                    if(CadastroPeca.pecaLista.getListaPecas().get(i).getQtnEstoque()<=0){
                        throw new Exception("Erro - A peca "+CadastroPeca.pecaLista.getListaPecas().get(i).getNome()+" está fora de estoque, favor escolher outra/o "+CadastroPeca.pecaLista.getListaPecas().get(i).getTipoPeca()+".");
                    }
                    aux = aux + CadastroPeca.pecaLista.getListaPecas().get(i).getValor();
                }
            }
            jTextValueTotal.setText(aux.toString());
            aux = 0.0;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboGabinete;
    private javax.swing.JComboBox<String> jComboHd;
    private javax.swing.JComboBox<String> jComboMemoria;
    private javax.swing.JComboBox<String> jComboPlacaMae;
    private javax.swing.JComboBox<String> jComboPlacaVideo;
    private javax.swing.JComboBox<String> jComboProcessador;
    private javax.swing.JComboBox<String> jComboSsd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextValueTotal;
    // End of variables declaration//GEN-END:variables
}
