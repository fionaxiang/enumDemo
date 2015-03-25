import javax.swing.JOptionPane;

public class enumDemo {
	enum Monthoption{January, Februray, March,April, May, June,July, August, September, October, November, December}
	 
	  public static void main(String[] arg){
		  Monthoption[] choices ={Monthoption.January, Monthoption.Februray,Monthoption. March,Monthoption.April, 
				  Monthoption.May, Monthoption.June,Monthoption.July, Monthoption.August, Monthoption.September,Monthoption. October, Monthoption.November,Monthoption. December};
		  
		
		 Monthoption select =(Monthoption)JOptionPane.showInputDialog(		 null, "Select the month.","Month option", JOptionPane.INFORMATION_MESSAGE,null, choices,choices[11]);
		
        
        Boolean continueLoop=true; 				 
	while(select!=null){
	System.out.println(select);
		
	
	switch(select){
		case January: JOptionPane.showMessageDialog(null, "Do you want to build a snow man"); break;
		case Februray: JOptionPane.showMessageDialog(null, "Do you want to build a snow man"); break;
		case December: JOptionPane.showMessageDialog(null, "Do you want to build a snow man"); break;
		case March: JOptionPane.showMessageDialog(null, "Happy Spring days!"); break;
		case April: JOptionPane.showMessageDialog(null, "Happy Spring days!"); break;
		case May: JOptionPane.showMessageDialog(null, "Happy Spring days!"); break;
		case June: JOptionPane.showMessageDialog(null, "It's summer time"); break;
		case July: JOptionPane.showMessageDialog(null, "It's summer time"); break;
		case August: JOptionPane.showMessageDialog(null, "It's summer time"); break;
		case September:JOptionPane.showMessageDialog(null,"Welcome to the foliage season!");break;
		case October:JOptionPane.showMessageDialog(null,"Welcome to the foliage season!");break;
		case November:JOptionPane.showMessageDialog(null,"Welcome to the foliage season!");break;
		default:
			JOptionPane.showMessageDialog(null,"wrong message");break;

		}
        
select=(Monthoption)JOptionPane.showInputDialog(null, "Select the month.","Month option", JOptionPane.INFORMATION_MESSAGE,null, choices,choices[11]);
              
	}
	System.out.println("Good bye");
}
}