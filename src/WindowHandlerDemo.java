import java.awt.Component;

import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static java.awt.event.InputEvent.*;


public class WindowHandlerDemo extends JFrame implements WindowListener{
	
	

	public WindowHandlerDemo(){
		this.setSize(500,500);
		this.setTitle("Ventana");
		this.addWindowListener(this);
		this.enableEvents(WINDOW_EVENT_MASK);
		this.setVisible(true);
	}
	
	@Override
	protected void processWindowEvent(WindowEvent e){
		if(e.getID()==WindowEvent.WINDOW_CLOSING){
			if(JOptionPane.showConfirmDialog(this, "¿Decea cerrar?","Titulo",JOptionPane.YES_NO_CANCEL_OPTION)==0){
				dispose();
				System.exit(0);
			}
		}
	}
	
	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("windowActivate");
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("windowClosed");
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("windowClosing");
		/*Component frame = null;
		int n=JOptionPane.showConfirmDialog(frame, "¿Desea cerrar la ventana?", "An Inane question",JOptionPane.YES_NO_OPTION);
		if(n==JOptionPane.YES_OPTION){
		System.exit(0);
		}else{
			
			int m = JOptionPane.showConfirmDialog(frame, "¿Seguro?", "An Inane question",JOptionPane.YES_NO_OPTION);
		}*/
	
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("windowDeactivated");
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("windowDeiconified");
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("windowIconified");
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("windowOpened");
	}

	

}
