package bean;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.UIManager;





public class IndexaaDAO extends ConnectionProvider {

	
	
	public static int Subscribe(IndexaaBean u){  
		int status=0;  
		try{  
			Connection con=getCon(); 
		PreparedStatement ps=con.prepareStatement("insert into example(E_Email_ID) values(?)");  
		ps.setString(1,u.getE_Email_ID());  
		
		status=ps.executeUpdate();  
		
		}catch(Exception e){}  
		      
		return status;  
		} 
	
	
	public static int Subscribes(IndexaaBean u){  
		int status=0;  
		try{  
			Connection con=getCon(); 
		PreparedStatement ps=con.prepareStatement("insert into example(E_Email_ID) values(?)");  
		ps.setString(1,u.getE_Email_ID());  
		
		status=ps.executeUpdate();
		UIManager UI=new UIManager();
		 UI.put("OptionPane.background", Color.white);
		 UI.put("Panel.background", Color.white);

		 
		if(status==0) {
			JOptionPane.showMessageDialog(null," not Saved Successfully","SetColor",JOptionPane.INFORMATION_MESSAGE);

		}
		else {
			JOptionPane.showMessageDialog(null," Saved Successfully","SetColor",JOptionPane.INFORMATION_MESSAGE);

			
		}
		
		}catch(Exception e){}  
		      
		return status;  
		} 
	
	
	
}
