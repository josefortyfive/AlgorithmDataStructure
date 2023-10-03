package smallSideProj;

import javax.swing.*;

public class MenuSample {

		JMenu menu, submenu;  
		JMenuItem i1, i2, i3, i4, i5;  
		MenuSample(){  
			JFrame f= new JFrame("Menu and Menu Item Example");  
			JMenuBar mb=new JMenuBar();  
			menu=new JMenu("Menu");  
			submenu = new JMenu("Sub Menu");  
			i1 = new JMenuItem("File");  
			i2 = new JMenuItem("Open");  
			i3 = new JMenuItem("Open with");  
			i4 = new JMenuItem("Options");  
			i5 = new JMenuItem("Exit");  
			menu.add(i1); 
			menu.add(i2); 
			menu.add(i3);  
			submenu.add(i4); 
			submenu.add(i5);  
			menu.add(submenu);  
			mb.add(menu);  
			f.setJMenuBar(mb);  
			f.setSize(400,400);  
			f.setLayout(null);  
			f.setVisible(true);
    }
    
    
    public static void main(String args[]) {
    	new MenuSample();
    }
}
