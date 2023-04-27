/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.banco;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class Banco {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        Scanner t2 = new Scanner(System.in);

        int continuar = 0, resposta;

        while (continuar != 7) {

            JOptionPane.showMessageDialog(null, "\nBem vindo ao Banco!\n");
            System.out.println("\nQual operação deseja fazer?\n 1 - Cadastro\n 2 - Verificar usuário\n 3 - Depósito\n 4 - Saque\n 5 - Alterar dados\n 6 - Verificar saldo\n 7 - Sair\n");
            resposta = t.nextInt();

            switch (resposta) {
                case 1 -> {
                
                }

                case 2 -> {
                
                }

                case 3 -> {
                
                }

                case 4 -> {
                
                }

                case 5 -> {
               
                }

                case 6 -> {
                
                }

                case 7 -> continuar = 7;
                
                default -> JOptionPane.showMessageDialog(null, "\nObrigado por utilizar nosso banco, até logo!\n");
            }

        }
    }
}
