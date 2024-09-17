import java.awt.*;
import javax.swing.*;
import javax.swing.tree.*;

public class JTreeInSwing {
	public static void main(String args[])
	{
		JFrame f1 = new JFrame();
		
		DefaultMutableTreeNode root = new DefaultMutableTreeNode("Government Polytechnic, Karad"); 
		
		DefaultMutableTreeNode fy = new DefaultMutableTreeNode("First Year");
		DefaultMutableTreeNode sy = new DefaultMutableTreeNode("Second Year");
		DefaultMutableTreeNode ty = new DefaultMutableTreeNode("Third Year");
		
		DefaultMutableTreeNode co = new DefaultMutableTreeNode("Computer");
		root.add(co);
		co.add(fy);
		co.add(sy);
		co.add(ty);
		
		DefaultMutableTreeNode me = new DefaultMutableTreeNode("Mechanical");
		root.add(me);
		
		DefaultMutableTreeNode ce = new DefaultMutableTreeNode("Civil");
		root.add(ce);
		
		JTree tree = new JTree(root);
		f1.add(tree);
		
		f1.setSize(600,500);
		f1.setLayout(new FlowLayout());
		f1.setVisible(true);
	}
}
