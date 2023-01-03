package br.com.unipar.pcbuild;

import br.com.unipar.pcbuild.models.Peca;
import br.com.unipar.pcbuild.models.PilhaPeca;
import javax.swing.JOptionPane;

public class CadastroPeca extends javax.swing.JFrame {

    public static Peca pecaLista = new Peca();
    public static int aux = CadastroPeca.pecaLista.getListaPecas().size();
    public static PilhaPeca<Peca> pilhaPeca = new PilhaPeca<>(25);

    public CadastroPeca() {
        initComponents();
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        textNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        textTpProduto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        textMarca = new javax.swing.JTextField();
        jSpinnerId = new javax.swing.JSpinner();
        textValue = new javax.swing.JTextField();
        jSpinnerQtnEstoque = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jButton1.setText("Gravar");
        jButton1.setName("btnGravar"); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setText("Id");

        jLabel1.setText("Marca");

        textNome.setName("textNome"); // NOI18N

        jLabel2.setText("Nome");

        jLabel3.setText("Valor");

        textTpProduto.setName("textTpProduto"); // NOI18N

        jLabel4.setText("Tipo do Produto");

        textMarca.setName("textMarca"); // NOI18N

        jSpinnerId.setValue(aux+1);

        textValue.setName("textNome"); // NOI18N

        jSpinnerQtnEstoque.setValue(aux+1);

        jLabel6.setText("Quantidade em Estoque:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textTpProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinnerQtnEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(48, 48, 48)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(textNome, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel5))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jSpinnerId, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(textValue, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(textValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinnerId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinnerQtnEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textTpProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(136, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        validarDados();
        try {
            Peca novaPeca = new Peca(textMarca.getText(), Double.valueOf(textValue.getText()), textNome.getText(), (Integer) jSpinnerId.getValue(), textTpProduto.getText().trim().toUpperCase().replaceAll(" ", "").replaceAll("DE", "").replaceAll("Ã", "A").replaceAll("Ó", "O").replaceAll("Í", "I"),(Integer) jSpinnerQtnEstoque.getValue());
            Boolean aux2 = (textTpProduto.getText().trim().toUpperCase().replaceAll(" ", "").replaceAll(" DE ", "").replaceAll("Ã", "A").replaceAll("Ó", "O").replaceAll("Í", "I").matches("MEMORIA|PLACAVIDEO|PLACAMAE|SSD|HD|GABINETE|PROCESSADOR"));
            Double.isNaN(Double.valueOf(textValue.getText()));
            if(aux2 == false){
                throw new Exception ("ERRO - Valor digitado não é tipo de peca correto(Placa vídeo,Placa mãe,Processador,Gabinete,HD,SSD,Memoria).");
            }
            pilhaPeca.push(novaPeca);
            pecaLista.getListaPecas().add(novaPeca);
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

        textMarca.setText("");
        textValue.setText("");
        textNome.setText("");
        aux = CadastroPeca.pecaLista.getListaPecas().size();
        jSpinnerId.setValue(aux + 1);
        textTpProduto.setText("");
        jSpinnerQtnEstoque.setValue(0);

    }//GEN-LAST:event_jButton1ActionPerformed

    private boolean validarDados() {
        String valida = "";
        //valida = null;
        if (textNome.getText() == null || textNome.getText().isEmpty()) {
            valida += "[ Nome ]";
        }
        if (textMarca.getText() == null || textMarca.getText().isEmpty()) {
            valida += "[ Marca ]";
        }
        if (textTpProduto.getText() == null || textTpProduto.getText().isEmpty()) {
            valida += "[ Tipo do Produto ]";
        }
        if (textValue.getText() == null || textValue.getText().isEmpty()) {
            valida += "[ Valor do Produto ]";
        }
        if (valida != "") {
            JOptionPane.showMessageDialog(null,
                    "Atenção, os campos a seguir são obrigatórios:\n" + valida);
            return false;
        }
        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSpinner jSpinnerId;
    private javax.swing.JSpinner jSpinnerQtnEstoque;
    private javax.swing.JTextField textMarca;
    private javax.swing.JTextField textNome;
    private javax.swing.JTextField textTpProduto;
    private javax.swing.JTextField textValue;
    // End of variables declaration//GEN-END:variables
}
