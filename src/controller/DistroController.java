package controller;

import javax.swing.JOptionPane;

public class DistroController {
	public DistroController () {
		super(); 
	}
	
	private String os() {
		String os = System.getProperty("os.name");
	//	System.out.println(os);
		return os; 
	}
	
	public void exibeDistro() {
		if(os().contains("Linux")) {
	 // cat /etc/os-release	
		String os = System.getProperty("cat /etc/os-release");
		System.out.println(os);
		}else{
			JOptionPane.showMessageDialog(null, "O Sistema Operacional atual não é Linux.");
		}

	}
}
