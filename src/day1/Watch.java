package day1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Watch extends JFrame{
	   
	   Watch(){
	      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      Container container = getContentPane();
	      container.setBackground(Color.blue);
	      
	      container.add(new Clockable(), BorderLayout.CENTER);
	      setSize(500,200);  
	      setVisible(true);
	   }
	   
	   class Clockable extends JLabel  implements Runnable{

	      public Clockable() {
	         setText(makeTime());
	         setFont(new Font("���ü",Font.ITALIC,100));
	         setForeground(Color.WHITE);
	         setBackground(Color.BLUE);
	         setHorizontalAlignment(JLabel.CENTER);
	         
	         Thread tr = new Thread(Clockable.this);
	         tr.start();
	      }      
	      public String makeTime() {
	          Calendar now = Calendar.getInstance();
	          int year = now.get(Calendar.YEAR);
	          int month = now.get(Calendar.MONTH)+1;
	          int time = now.get(Calendar.HOUR_OF_DAY);
	          int min  = now.get(Calendar.MINUTE);
	          int second = now.get(Calendar.SECOND);
	          
	          String timeText = Integer.toString(year);
	          timeText = timeText.concat("년 ");
	          timeText = timeText.concat(Integer.toString(month));
	          timeText = timeText.concat("월 ");
	          timeText = timeText.concat(Integer.toString(time));
	          timeText = timeText.concat(":");
	          timeText = timeText.concat(Integer.toString(min));
	          timeText = timeText.concat(":");
	          timeText = timeText.concat(Integer.toString(second));
	          
	          return timeText;
	       }
	      
	      @Override
	      public void run() {
	         while(true) {
	            setText(makeTime());
	            try {
	               Thread.sleep(1000);
	            } catch (Exception e) {
	               return;
	            }
	         }   
	      }
	   }
	   
	   public static void main(String[] args) {
	      new Watch();
	   }
	   
	}





