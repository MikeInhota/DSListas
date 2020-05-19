
package lista1;

import javax.swing.JOptionPane;

public class Ex01 {
    public static void main(String[] args) {
        
    // O ideal seria um vetor de objetos!
        double a1nota1 = 0.0, a1nota2 = 0.0, a1media = 0.0;
        double a2nota1 = 0.0, a2nota2 = 0.0, a2media = 0.0;
        double a3nota1 = 0.0, a3nota2 = 0.0, a3media = 0.0;
        double a4nota1 = 0.0, a4nota2 = 0.0, a4media = 0.0;
        double a5nota1 = 0.0, a5nota2 = 0.0, a5media = 0.0;
        double a6nota1 = 0.0, a6nota2 = 0.0, a6media = 0.0;
        
        String aux = "";
        
    //Aluno 01
        aux = JOptionPane.showInputDialog(null, "Insira a nota 1", "Aluno 1 de 6!", 1);
            aux = aux.replace(',', '.');
            a1nota1 = Double.parseDouble(aux);
        aux = JOptionPane.showInputDialog(null, "Insira a nota 2", "Aluno 1 de 6!", 1);
            aux = aux.replace(',', '.');
            a1nota2 = Double.parseDouble(aux);
    //Aluno 02
        aux = JOptionPane.showInputDialog(null, "Insira a nota 1", "Aluno 2 de 6!", 1);
            aux = aux.replace(',', '.');
            a2nota1 = Double.parseDouble(aux);
        aux = JOptionPane.showInputDialog(null, "Insira a nota 2", "Aluno 2 de 6!", 1);
            aux = aux.replace(',', '.');
            a2nota2 = Double.parseDouble(aux);
    //Aluno 03
        aux = JOptionPane.showInputDialog(null, "Insira a nota 1", "Aluno 3 de 6!", 1);
            aux = aux.replace(',', '.');
            a3nota1 = Double.parseDouble(aux);
        aux = JOptionPane.showInputDialog(null, "Insira a nota 2", "Aluno 3 de 6!", 1);
            aux = aux.replace(',', '.');
            a3nota2 = Double.parseDouble(aux);
    //Aluno 04
        aux = JOptionPane.showInputDialog(null, "Insira a nota 1", "Aluno 4 de 6!", 1);
            aux = aux.replace(',', '.');
            a4nota1 = Double.parseDouble(aux);
        aux = JOptionPane.showInputDialog(null, "Insira a nota 2", "Aluno 4 de 6!", 1);
            aux = aux.replace(',', '.');
            a4nota2 = Double.parseDouble(aux);
    //Aluno 05
        aux = JOptionPane.showInputDialog(null, "Insira a nota 1", "Aluno 5 de 6!", 1);
            aux = aux.replace(',', '.');
            a5nota1 = Double.parseDouble(aux);
        aux = JOptionPane.showInputDialog(null, "Insira a nota 2", "Aluno 5 de 6!", 1);
            aux = aux.replace(',', '.');
            a5nota2 = Double.parseDouble(aux);
    //Aluno 06
        aux = JOptionPane.showInputDialog(null, "Insira a nota 1", "Aluno 6 de 6!", 1);
            aux = aux.replace(',', '.');
            a6nota1 = Double.parseDouble(aux);
        aux = JOptionPane.showInputDialog(null, "Insira a nota 2", "Aluno 6 de 6!", 1);
            aux = aux.replace(',', '.');
            a6nota2 = Double.parseDouble(aux);
        
        a1media = (a1nota1 + a1nota2)/2;
        a2media = (a2nota1 + a2nota2)/2;
        a3media = (a3nota1 + a3nota2)/2;
        a4media = (a4nota1 + a4nota2)/2;
        a5media = (a5nota1 + a5nota2)/2;
        a6media = (a6nota1 + a6nota2)/2;
        
    }
}
