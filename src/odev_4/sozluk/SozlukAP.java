/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package odev_4.sozluk;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Aedamantium
 */
public class SozlukAP {
    
    
    
    void TlisteyeAt(ArrayList<String> list){
        try {
            BufferedReader t = new BufferedReader(new FileReader("tureng.txt"));
            String c = t.readLine();
            while(c != null){
                list.add(c);
                c = t.readLine();
            }
            t.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Sozluk.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Sozluk.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 
    void ElisteyeAt(ArrayList<String> list){
        try {
            BufferedReader e = new BufferedReader(new FileReader("engtur.txt"));
            String x = e.readLine();
            while(x != null){
                list.add(x);
                x = e.readLine();
            }
            e.close();
            
        } catch (FileNotFoundException ex) {
                Logger.getLogger(Sozluk.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
                Logger.getLogger(Sozluk.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    boolean gecerliMiT(String kelime){
        boolean gecerliMi = true;
        Pattern p = Pattern.compile("[^A-Za-zşığüçöŞÇÖİĞÜ ]");
        Matcher m = p.matcher(kelime);
        if (m.find()) {
            gecerliMi = false;
        }
        return gecerliMi;
    }
    boolean gecerliMiE(String kelime){
        boolean gecerliMi = true;
        Pattern p = Pattern.compile("[^A-Za-z ]");
        Matcher m = p.matcher(kelime);
        if (m.find()) {
            gecerliMi = false;
        }
        return gecerliMi;
    }
    void dosyayiKapat(){
        try {
            BufferedReader t = new BufferedReader(new FileReader("tureng.txt"));
            t.close();            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SozlukAP.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(SozlukAP.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
}
