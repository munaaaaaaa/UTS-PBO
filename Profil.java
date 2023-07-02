/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

//package com.mycompany.profil;

import javax.swing.*;
import java.awt.*;

public class Profil {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("PROFIL MAHASISWA");
        frame.setBounds(500, 500, 500, 300);
        JLabel label1 = new JLabel("NIM                      : 001");
        label1.setBounds(200, 50, 200, 25);
        frame.add(label1);
        JLabel label2 = new JLabel("Nama                  : NURUL");
        label2.setBounds(200, 80, 200, 25);
        frame.add(label2);
        JLabel label3 = new JLabel("Prodi                   : S1 RPL");
        label3.setBounds(200, 110, 200, 25);
        frame.add(label3);
        JLabel label4 = new JLabel("Tempat Lahir    : Pekalongan");
        label4.setBounds(200, 140, 200, 25);
        frame.add(label4);
        JLabel label5 = new JLabel("Tanggal Lahir    : 22 Mei 1985");
        label5.setBounds(200, 170, 200, 25);
        frame.add(label5);
        JLabel label6 = new JLabel("Jenis Kelamin   : Perempuan");
        label6.setBounds(200, 200, 200, 25);
        frame.add(label6);


        Container c = frame.getContentPane(); //Gets the content layer
        JLabel label = new JLabel(); //JLabel Creation
        label.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\Lenovo\\IdeaProjects\\Profil\\src\\itesa-removebg-preview.png").getImage().getScaledInstance(150,150,Image.SCALE_DEFAULT))); //Sets the image to be displayed as an icon
        c.add(label); //Adds objects to the container
        frame.setVisible(true); // Exhibit the frame
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
