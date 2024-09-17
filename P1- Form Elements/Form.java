import java.awt.*;

public class Form {
	public static void main(String args[])
	{
		Frame f1 = new Frame("Student Registartion Form");
		
		Label title, fname, lname, email, mob, address, city, pin, state;
		
		
		/*<<<<<<<<<<<<<<<<<<<		        Label start		>>>>>>>>>>>>>>>>>>>*/ 
		title = new Label("Student Registration Form.");
		fname = new Label("First Name:");
		lname = new Label("Last Name:");
		email = new Label("E-mail:");
		mob = new Label("Mobile No.:");
		address = new Label("Address:");
		city = new Label("City:");
		pin = new Label("PIN:");
		state = new Label("State:");
		
		f1.add(title);
		title.setBounds(200,30,200,20);
		f1.add(fname);
		fname.setBounds(40,100,100,10);
		f1.add(lname);
		lname.setBounds(40,150,100,10);
		f1.add(email);
		email.setBounds(40,200,100,10);
		f1.add(mob);
		mob.setBounds(40,250,200,10);
		f1.add(address);
		address.setBounds(40,300,100,10);
		f1.add(city);
		city.setBounds(40,450,100,20);
		f1.add(pin);
		pin.setBounds(40,500,100,20);
		f1.add(state);
		state.setBounds(40,550,100,20);
		
		/*<<<<<<<<<<<<<<<<<<<		         Label End		>>>>>>>>>>>>>>>>>>>*/
		
		
		/*<<<<<<<<<<<<<<<<<<<		         TextField start		>>>>>>>>>>>>>>>>>>>*/
		
		TextField  t_fname, t_lname, t_email, t_mob, t_city, t_pin, t_state;
		
		t_fname = new TextField("Abhishek");
		t_lname = new TextField("Patil");
		t_email = new TextField("abhishek.patil8118@gmail.com");
		t_mob = new TextField("9307489954");
		t_city = new TextField("Kolhapur");
		t_pin = new TextField("416219");
		t_state = new TextField("Maharashtra");
		
		TextArea t_address = new TextArea("Kagal, Kolhapur",5,30);
		
		f1.add(t_fname);
		t_fname.setBounds(300,100,200,20);
		f1.add(t_lname);
		t_lname.setBounds(300,150,200,20);
		f1.add(t_email);
		t_email.setBounds(300,200,200,20);
		f1.add(t_mob);
		t_mob.setBounds(300,250,200,20);
		f1.add(t_address);
		t_address.setBounds(300,300,200,100);
		f1.add(t_city);
		t_city.setBounds(300,450,200,20);
		f1.add(t_pin);
		t_pin.setBounds(300,500,200,20);
		f1.add(t_state);
		t_state.setBounds(300,550,200,20);
		
		/*<<<<<<<<<<<<<<<<<<<		         TextField End		>>>>>>>>>>>>>>>>>>>*/
		
		Button b1 = new Button("Submit");
		f1.add(b1);
		b1.setBounds(40,600,80,20);
		
		f1.setSize(800,700);
		f1.setLayout(null);
		f1.setVisible(true);
	}
}
