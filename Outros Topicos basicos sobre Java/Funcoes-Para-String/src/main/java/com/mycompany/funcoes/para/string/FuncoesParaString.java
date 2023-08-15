package com.mycompany.funcoes.para.string;

import javax.swing.JOptionPane;


public class FuncoesParaString {

    public static void main(String[] args) {
        String original = "abcde FGHIJ ABC abc DFEG" ;
        System.out.println(original);
        
        //Convertendo String para minuscula
        String s01 = original.toLowerCase();
        System.out.println(s01);
        
        //Convertendo String para Maiúscula
        String s02 = original.toUpperCase();
        System.out.println(s02);
        
        //Convertendo String para Trim, tira os espacos
        String s03 = original.trim();
        System.out.println(s03);
        
        //Convertendo String para SubString
        String s04 = original.substring(2);
        System.out.println(s04);
        
        //Convertendo String para SubString com 2 argumentos
        String s05 = original.substring(2, 7);
        System.out.println(s05);
        
        //Convertendo String para replace
        String s06 = original.replace('a', 'x');
        System.out.println(s06);
        
        //Convertendo String para replace com SubString
        String s07 = original.replace("abc", "xy");
        System.out.println(s07);
        
        //Convertendo String para indexOF
        int i = original.indexOf("bc");
        System.out.println(i);
        
        //Convertendo String para lastindexOF
        int j = original.lastIndexOf("bc");
        System.out.println(j);
        
        //Operecao Split
        String s = "potato apple lemon";
        
        String[] vect = s.split(" ");
        System.out.println(vect[0]);
        System.out.println(vect[1]);
        System.out.println(vect[2]);
    }
}
