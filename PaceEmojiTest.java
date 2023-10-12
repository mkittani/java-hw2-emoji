import java.awt.*;
import javax.swing.*;
public class PaceEmojiTest{
	public static void main (String args[]){
		PaceEmoji panel =new PaceEmoji();
		JFrame test=new JFrame();
		test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		test.add(panel);
		test.setSize(400,400);
		test.setVisible(true);

	}
}
public class PaceEmoji extends JPanel{
	public void paint(Graphics g){
		Graphics2D g1 =(Graphics2D)g;
		g1.setColor(Color.black);
		g1.fillRect(10,10,350,350);
		g1.setColor(new Color(170,127,234,255));
		g1.fillRect(110,290,180,15);
		g1.setStroke(new BasicStroke(3));
		g1.fillRect(110,110,180,180);
		g1.setColor(Color.black);

		//eyes
		g1.fillRect(140,170,30,55);
		g1.fillRect(230,170,30,55);

		//stairs above eyes

		g1.fillRect(110,80,15,30);
		g1.fillRect(95,110,15,30);
		g1.fillRect(110,125,15,15);
		g1.fillRect(110,110,30,15);

		g1.fillRect(290,110,15,45);
		g1.fillRect(275,125,15,15);
		g1.fillRect(260,110,45,15);

		//hands
		g1.setColor(new Color(170,127,234,255));
		g1.fillRect(80,210,30,15);
		g1.fillRect(65,125,15,85);
		g1.fillRect(290,210,30,15);
		g1.fillRect(320,125,15,85);

		//above stairs
		g1.fillRect(95,95,15,30);
		g1.fillRect(95,95,30,15);
		g1.fillRect(290,95,15,30);
		g1.fillRect(275,95,30,15);
		g1.fillRect(110,65,15,15);
		g1.fillRect(275,65,15,15);
		
	
		//eyebrows
		g1.fillRect(150,80,15,30);
		g1.fillRect(235,80,15,30);

		//boxes down
		g1.setColor(Color.black);
		g1.fillRect(175,255,50,15);
		g1.fillRect(175,255,15,30);
		g1.fillRect(125,255,15,30);
		g1.fillRect(225,255,15,30);
		g1.fillRect(260,255,15,30);
		g1.fillRect(125,285,65,15);
		g1.fillRect(225,285,50,15);
		g1.fillRect(95,255,45,15);
		g1.fillRect(260,255,45,15);
		g1.fillRect(10,300,400,40);
		g1.fillRect(10,270,115,30);
		g1.fillRect(260,270,115,30);

		g1.setColor(Color.white);
		g1.fillRect(190,270,35,35);
		g1.fillRect(180,65,40,30);
		g1.fillRect(140,50,120,15);
		g1.fillRect(10,10,400,40);
		g1.fillRect(10,50,85,30);
		g1.fillRect(305,50,85,30);
		g1.fillRect(10,80,70,30);
		g1.fillRect(320,80,70,30);
		g1.fillRect(10,10,40,400);
		g1.fillRect(350,10,40,400);

		g1.fillRect(10,225,55,15);
		g1.fillRect(10,240,85,100);

		g1.fillRect(335,225,55,15);
		g1.fillRect(305,240,85,100);
		g1.fillRect(10,270,115,15);
		g1.fillRect(275,270,115,15);
		g1.fillRect(10,305,400,90);
		g1.setColor(Color.black);
		g1.fillRect(95,285,45,45);
		g1.fillRect(260,285,45,45);
		g1.setColor(new Color(170,127,234,255));
		g1.fillRect(110,300,15,15);
		g1.fillRect(275,300,15,15);

	}
}