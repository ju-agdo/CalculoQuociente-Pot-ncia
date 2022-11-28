// Salvar como Programa04.java
import javax.swing.*;

class Programa04
{
public static void main (String entrada[])
{

// Declaração de variáveis
int n1,n2,div;
double pot;
String msg="";

// Estrada de Dados
n1=
Integer.parseInt(JOptionPane.showInputDialog ("Digite um número inteiro"));
n2=
Integer.parseInt(JOptionPane.showInputDialog("Digite outro número inteiro"));

//processamento
div = (int)n1/(int)n2;
pot = Math.pow(n1,n2);
//Saída de resultados
msg= msg+ "O quociente da divisão de " + n1 + " por " + n2 + " = " + div + " \n ";
msg = msg + "Potência de " + n1 + " por " + n2 + " = " + pot + " \n ";
JOptionPane.showMessageDialog(null,msg);

System.exit(0);

}
}

