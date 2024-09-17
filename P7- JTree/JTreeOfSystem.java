import java.awt.*;
import javax.swing.*;
import javax.swing.tree.*;

public class JTreeOfSystem {
	public static void main(String args[])
	{
		JFrame f1 =  new JFrame("Abhishek Patil");
		
		DefaultMutableTreeNode root = new DefaultMutableTreeNode("My PC");
		
		DefaultMutableTreeNode c =new DefaultMutableTreeNode("Local Disk(C:)");
		root.add(c);
		
		DefaultMutableTreeNode intel =new DefaultMutableTreeNode("Intel)");
		c.add(intel);
		DefaultMutableTreeNode windows =new DefaultMutableTreeNode("Windows");
		c.add(windows);
		DefaultMutableTreeNode users =new DefaultMutableTreeNode("Users)");
		c.add(users);	
		DefaultMutableTreeNode pfiles =new DefaultMutableTreeNode("Program Files");
		c.add(pfiles);
		
		DefaultMutableTreeNode d = new DefaultMutableTreeNode("Local Disk(D:)");
		root.add(d);
		
		DefaultMutableTreeNode f = new DefaultMutableTreeNode("Local Disk(F:)");
		root.add(f);
		
		DefaultMutableTreeNode g = new DefaultMutableTreeNode("Local Disk(G:)");
		root.add(g);
		
		DefaultMutableTreeNode h = new DefaultMutableTreeNode("Local Disk(H:)");
		root.add(h);
		
		JTree tree = new JTree(root);
		f1.add(tree);
		
		f1.setSize(660,500);
		f1.setLayout(new FlowLayout());
		f1.setVisible(true);
	}

}
