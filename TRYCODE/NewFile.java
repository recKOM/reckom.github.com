package myown;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class Newfile{
public static void main(String[] args) {
	// TODO Auto-generated method stub
   
	Copy file=new Copy();
    file.setTitle("A NEW FILE");
    file.setBounds(250, 250, 200, 100);
    
}
}
@SuppressWarnings("serial")
class Copy extends JFrame{
	JButton location;
	JButton submit;
	JTextField number;
	//JTextField name;
	JTextField tim;
	JFileChooser choose;
	ActionListener listener;
	ActionListener submi;
	ActionListener numbe;
	//ActionListener nam;
	JLabel label;
	public Copy(){
		init();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	void init(){
		setLayout(new FlowLayout());
	//	listener=new FileChooser();
		submi=new creater();
		numbe=new numberer();
	//	nam=new namer();
	//	location=new JButton("LOCATION");
		submit=new JButton("SUBMIT");
		number=new JTextField(3);
		tim=new JTextField(3);
	//	name=new JTextField(30);
		choose=new JFileChooser();
		submit.addActionListener(submi);
		number.addActionListener(numbe);
	//	name.addActionListener(nam);
	//	add(location);
		add(number);
		add(tim);
	//	add(name);
		add(submit);
	}
	
 //class FileChooser implements ActionListener{
//	@Override
//	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
//		Into state=choose.showOpenDialog(this);
//		if(state==JFileChooser.APPROVE_OPTION){		
//		}
//	}	
//}
 class numberer implements ActionListener{
   public void setJTextFieldone(JTextField t){
	   number=t;
   }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	 
 }
//class namer implements ActionListener{
// public void setJTextFieldtwo(JTextField n){
	// name=n;
// }
//	@Override
//	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
//	}
	
//}
class creater  implements ActionListener{
	File file;
	 public void setJTextFieldone(JTextField t){
		   number=t;
	   }
//	  public void setJTextFieldtwo(JTextField n){
//			 name=n;
//		 }
	  public void setJTextFieldthree(JTextField m){
		  tim=m;
	  }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int times=Integer.parseInt(number.getText());
	//	int tims=Integer.parseInt(tim.getText());
		String tims=tim.getText();
		if(tims!=""){
	//	String names=name.getText();
		//	int ti=Integer.parseInt(tims);
		int state=choose.showSaveDialog(null);
		if(state==JFileChooser.APPROVE_OPTION){
			try{
				File dir=choose.getCurrentDirectory();
				File fil=choose.getSelectedFile();
				String dirs=choose.getCurrentDirectory().getName();
				String fils=choose.getSelectedFile().getName();
				if(fils.contains(".")){
				//	if(!dir.exists()){
						for(int i=0;i<times;i++){
							String s[]=fils.split("\\.");
							file=new File(dir,s[0]+(i+tims)+"."+s[1]);
							file.createNewFile();
						}
				//	}else{
				//		System.out.print("THERE IT TS!!!");
						//JOptionPane.showMessageDialog(this, "THERE IT IS!!", "MESSAGE",JOptionPane.WARNING_MESSAGE);
				  //  }
				}else{
					for(int i=0;i<times;i++){
						file=new File(dir,fils+(i+1));
						file.mkdir();
					}
						
					}
					
				
			}catch(Exception exp){
				
			}
			}
		}else{
			//JOptionPane.showMessageDialog(this, "THERE IT IS!!", "MESSAGE",JOptionPane.WARNING_MESSAGE);
			int state=choose.showSaveDialog(null);
			if(state==JFileChooser.APPROVE_OPTION){
				try{
					File dir=choose.getCurrentDirectory();
					File fil=choose.getSelectedFile();
					String dirs=choose.getCurrentDirectory().getName();
					String fils=choose.getSelectedFile().getName();
					if(fils.contains(".")){
					//	if(!dir.exists()){
							for(int i=0;i<times;i++){
								//String s[]=fils.split("\\.");
								file=new File(dir,fils);
								file.createNewFile();
							}
					//	}else{
					//		System.out.print("THERE IT TS!!!");
							//JOptionPane.showMessageDialog(this, "THERE IT IS!!", "MESSAGE",JOptionPane.WARNING_MESSAGE);
					  //  }
					}else{
						for(int i=0;i<times;i++){
							file=new File(dir,fils);
							file.mkdir();
						}
							
						}
						
					
				}catch(Exception exp){
					
				}
				}
		}
	}
	
	
}
}



