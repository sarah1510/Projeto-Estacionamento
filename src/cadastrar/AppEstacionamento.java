package cadastrar;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.UIManager.LookAndFeelInfo;

import ui.FrameEstacionamento;

public class AppEstacionamento {

	public static void main(String[] args) {
					
		try {
			
			for(LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
			if("Nimbus".equals(info.getName())){
				UIManager.setLookAndFeel(info.getClassName());
			}
			}
			
		} catch (UnsupportedLookAndFeelException e) {
			
		} catch (ClassNotFoundException e) {
		
		} catch (InstantiationException e) {
		
		} catch (IllegalAccessException e) {
		
		}
		
		
		FrameEstacionamento telaCadastro = new FrameEstacionamento();
		telaCadastro.criarTela();

	}
	
	
	
	
	

}
