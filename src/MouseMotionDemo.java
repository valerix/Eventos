import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;


public class MouseMotionDemo extends JFrame implements MouseMotionListener, MouseListener, KeyListener{
	
	private int _x;
	private int _y;
	
	private int xClik;
	private int yClik;

	public MouseMotionDemo(){
		this.setSize(800,600);
		this.setTitle("Mouse Motion Listener");
		this.addMouseMotionListener(this);
		this.addMouseListener(this);
		this.setVisible(true);
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
			//System.out.println("x:"+e.getXOnScreen());
			//System.out.println("y:"+e.getYOnScreen());
		this._x=e.getX();
		this._y=e.getY();
		
		this.repaint();
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("x:"+e.getXOnScreen());
		//System.out.println("y:"+e.getYOnScreen());
	}
	
	public void paint(Graphics g){
		Graphics2D g2=(Graphics2D) g;
		
		g2.drawLine(this.xClik, this.yClik, this._x, this._y);
	}

	//////////////////////////////////////////////////////////////7
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		this.xClik=e.getX();
		this.yClik=e.getY();
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	//////////////////////////////////////////////////////////////////

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	

	

}
