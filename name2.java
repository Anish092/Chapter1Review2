import javax.swing.JOptionPane;
public class name2
{
	public static void main(String[] args)
	{
		String name = JOptionPane.showInputDialog("What is your name?");
		System.out.print("Hello, ");
		System.out.print(name);
		System.out.print("!");
		String nametwo = JOptionPane.showInputDialog("My name is Hal! What would you lik me to do?");
		System.out.println(" ");
		System.out.print("I'm sorry, ");
		System.out.print(name);
		System.out.print(". I'm afraid I can't do that.");



    }
}