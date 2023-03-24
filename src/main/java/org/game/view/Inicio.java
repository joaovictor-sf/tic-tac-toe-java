package org.game.view;

import org.game.model.Player;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Inicio extends JFrame implements ActionListener {
    Player player1;
    Player player2;
    JLabel titulo;
    TextField escolherNome;
    TextField escolherNome2;
    JPanel espacoTitulo;
    JPanel areaTexto1;
    JPanel areaTexto2;
    JButton confirmar;

    public Inicio(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Jogo da Velha");
        this.setLayout(null);
        this.setSize(400,500);
        this.setResizable(false);
        this.getContentPane().setBackground(Color.white);

        titulo = new JLabel();
        titulo.setText("Tic-Tac-Toe");
        titulo.setFont(new Font("MV Boli",Font.PLAIN,40));

        espacoTitulo = new JPanel();
        espacoTitulo.setBounds(50, 80, 250, 80);
        espacoTitulo.setBackground(Color.white);
        espacoTitulo.add(titulo);

        player1 = new Player("player 1", 0);
        player2 = new Player("player 2", 0);

        escolherNome = new TextField();
        escolherNome.setFont(new Font("Consolas", Font.PLAIN,14));
        escolherNome.setText(player1.getNome());

        escolherNome2 = new TextField();
        escolherNome2.setFont(new Font("Consolas", Font.PLAIN,14));
        escolherNome2.setText(player2.getNome());

        areaTexto1 = new JPanel();
        areaTexto1.setBounds(20, 250, 100, 30);
        areaTexto1.setBackground(Color.white);
        areaTexto1.add(escolherNome);

        areaTexto2 = new JPanel();
        areaTexto2.setBounds(260, 250, 100, 30);
        areaTexto2.setBackground(Color.white);
        areaTexto2.add(escolherNome2);

        confirmar = new JButton();
        confirmar.setBounds(145, 400, 100, 50);
        confirmar.addActionListener(this);
        confirmar.setText("Confirmar");
        confirmar.setFocusable(false);

        this.add(espacoTitulo);
        this.add(areaTexto1);
        this.add(areaTexto2);
        this.add(confirmar);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == confirmar){
            System.out.println("teste");
        }
    }
}
