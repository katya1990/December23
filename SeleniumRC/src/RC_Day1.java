import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;

@SuppressWarnings("deprecation")
public class RC_Day1 {

	public static void main(String[] args) {
		Selenium selenium = new DefaultSelenium("localhost", 4444,"*firefox","http://gmail.com");
		selenium.start();
		selenium.open("/");
		selenium.windowMaximize();
		selenium.windowFocus();
		System.out.println(selenium.getTitle());
	}

}
