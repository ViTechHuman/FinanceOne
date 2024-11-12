/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetoescolar.utils;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author victor.marim
 */
public class LimitaCaracteres extends PlainDocument{
    
    public enum TipoEntrada {
        NUMEROINTEIRO, NUMERODECIMAL, NOME, SENHA;
    };
    
    
    private int qtdeCaracteres;
    private TipoEntrada tpEntrada;

    public LimitaCaracteres(int qtdeCaracteres, TipoEntrada tpEntrada) {
        this.qtdeCaracteres = qtdeCaracteres;
        this.tpEntrada = tpEntrada;
    }

    @Override
    public void insertString(int offs, String string, AttributeSet a) throws BadLocationException {
        if (string == null || getLength() == qtdeCaracteres){
            return;
        }
        
        int totalCarac = getLength() + string.length();
        
        //filtro de caracteres
        String regex = "";
        switch(tpEntrada){
            case NUMEROINTEIRO:regex="[^0-9]";break;
            case NUMERODECIMAL:regex="[^0-9,.]";break;
            case NOME:regex="[^\\p{IsLatin} ]";break;
            case SENHA:regex="[^\\p{IsLatin}][^0-9]";break;

        }
        
        //fazendo a substituição
        string = string.replaceAll(regex, "");
        
        if (totalCarac <= qtdeCaracteres){
        super.insertString(offs, string, a); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        } else {
            String nova = string.substring(0, qtdeCaracteres);
            super.insertString(offs, nova, a); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody

        }
        
    }
    
    
    
    
}
