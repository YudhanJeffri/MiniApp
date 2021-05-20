/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learn;

import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author ASUS
 */
public class myFunc {
    public ImageIcon resizePic(String picPath,byte[] BLOBpic, int wdth, int hgt){
        ImageIcon myImg;
        if (picPath != null) {
            
            myImg = new ImageIcon(picPath);
        } else {
            myImg = new ImageIcon(BLOBpic);
        }
        
        Image img = myImg.getImage().getScaledInstance(wdth, hgt, Image.SCALE_SMOOTH);
        ImageIcon myPicture = new ImageIcon(img);
        return myPicture;
    }
    public String browseImage(JLabel lbl){
        String path = "";
        JFileChooser filec = new JFileChooser();
        filec.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images","jpg","png","gif");
        filec.addChoosableFileFilter(filter);
        
        int filestate = filec.showSaveDialog(null);
        if (filestate == JFileChooser.APPROVE_OPTION) {
            File selectedfile =  filec.getSelectedFile();
            path = selectedfile.getAbsolutePath();
            //imagePth = path;
            lbl.setIcon(resizePic(path,null, lbl.getWidth(),lbl.getHeight()));
            
        } else if(filestate == JFileChooser.CANCEL_OPTION) {
            System.out.println("No Image Selected");
        }
        
        return path;
    }
}
