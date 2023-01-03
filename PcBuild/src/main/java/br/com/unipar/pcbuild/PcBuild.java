package br.com.unipar.pcbuild;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class PcBuild {

    
    static int contadorId = 0;
    
    public static void main(String[] args) {
        createAndShowGUI();
    }

    private static void createAndShowGUI() {
        JFrame janelaPrincipal = new JFrame("Menu PAV");
        janelaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janelaPrincipal.setLocationRelativeTo(null);

        janelaPrincipal.setJMenuBar(createMenuBar());

        janelaPrincipal.setSize(450, 300);
        janelaPrincipal.setVisible(true);
    }

    private static JMenuBar createMenuBar() {
        JMenuBar menuBar = new JMenuBar();

        JMenu menuCadastro = new JMenu("Cadastro");
        menuBar.add(menuCadastro);

        JMenuItem telaPeca = new JMenuItem("Peca");
        telaPeca.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new CadastroPeca();
            }
        });
        
        JMenuItem telaPc = new JMenuItem("Computador");
        telaPc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new CadastroPc();
            }
        });
        menuCadastro.add(telaPeca);
        menuCadastro.add(telaPc);
        
        JMenu menuLista = new JMenu("Listar");
        menuBar.add(menuLista);

        JMenuItem telaListPc = new JMenuItem("Listar Computadores");
        telaListPc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ListPc();
            }
        });
        
        JMenuItem telaListPeca = new JMenuItem("Listar Peças");
        telaListPeca.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ListPeca();
            }
        });
        
        menuLista.add(telaListPc);
        menuLista.add(telaListPeca);
        
        return menuBar;
    }
    
}
