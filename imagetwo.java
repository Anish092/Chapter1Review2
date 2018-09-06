import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class imagetwo
{
	public static void main(String[] args) throws Exception
	{
		URL imageLocation = new URL(
			"https://codecondo.com/wp-content/uploads/2015/02/Java-Programmers.png");
		JOptionPane.showMessageDialog(null, "What's Up", "Title",
		      JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation));
    }
}