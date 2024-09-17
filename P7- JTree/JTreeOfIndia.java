import java.awt.*;
import javax.swing.*;
import javax.swing.tree.*;

public class JTreeOfIndia {
	public static void main(String args[])
	{
		JFrame f1 = new JFrame("Abhishek Patil");
		DefaultMutableTreeNode root = new DefaultMutableTreeNode("India");
		
		DefaultMutableTreeNode 	maha = new DefaultMutableTreeNode("Maharashtra");
		root.add(maha);
		
		DefaultMutableTreeNode mumbai = new DefaultMutableTreeNode("Mumbai");
		maha.add(mumbai);
		DefaultMutableTreeNode pune = new DefaultMutableTreeNode("Pune");
		maha.add(pune);
		DefaultMutableTreeNode nashik = new DefaultMutableTreeNode("Nashik");
		maha.add(nashik);
		DefaultMutableTreeNode nagpur = new DefaultMutableTreeNode("Nagpur");
		maha.add(nagpur);
		
		DefaultMutableTreeNode guj  = new DefaultMutableTreeNode("Gujrat");
		root.add(guj);
		
		JTree tree = new JTree(root);
		f1.add(tree);
		
		f1.setSize(600,500);
		f1.setLayout(new FlowLayout());
		f1.setVisible(true);
	}

}
