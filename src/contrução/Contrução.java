package contrução;

import javax.swing.JOptionPane;
import contrução.materiais.comuns;
import contrução.materiais.eletricos;
import contrução.materiais.hidraulicos;

public class Contrução {

    public static void main(String[] args) {

        comuns materialC = new comuns();
        eletricos eletrica = new eletricos();
        hidraulicos materiaisH = new hidraulicos();

        double m2=0;
        do{
         m2 = Double.parseDouble(JOptionPane.showInputDialog("quantos metros quadrados vc quer a sua casa?"));
         if(m2<=0){
             System.out.println("por favor incira um valor valido");}
        }while(m2<=0);
        
        
        materialC.setM2(m2);
        materialC.quantidadeMateriais();//quantidades de materiais tem que vir primeiro
        System.out.println("\n");
        materialC.fazerorçamento();

        JOptionPane.showMessageDialog(null, "agora vamos para a parte eletrica");
        System.out.println("\n\n");
        System.out.println("ELETRICA");
        eletrica.setM2(m2);
        eletrica.quantidadeMateriais();
        System.out.println("\n");
        eletrica.fazerorçamento();

        JOptionPane.showMessageDialog(null, "agora vamos para a parte Hidraulica");
        System.out.println("\n\n");
        System.out.println("HIDRAULICA");
        materiaisH.setM2(m2);
        materiaisH.quantidadeMateriais();
        System.out.println("\n");
        materiaisH.fazerorçamento();
        //tratamento de exeções
       
         }
    }
        

