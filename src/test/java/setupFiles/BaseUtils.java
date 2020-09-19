package setupFiles;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.pages.ShopeasyApplication;

import io.github.bonigarcia.wdm.WebDriverManager;
public class BaseUtils {

	private static ShopeasyApplication shopeasy;
	private static Properties config;
	private static String directory;
	/** 
	 * getShopeasy() is getter method of Actions object
	 * @return action object.
	 **/	
	public static ShopeasyApplication getShopeasy()	 {
		return shopeasy; 
	}

	/**************************************************All Set Up Methods below **********************************
	/** 
	 * InitProperties() method to read key, values from the configuration files.
	 * @param toread = Property name to read
	 * @return value of the string to return
	 **/
	public static String InitProperties(String toread) {
		config = readProperties("configuration.properties",File.separator+"Configs");
		String value = config.getProperty(toread);
		return value;
	}
	/** 
	 * getPresentWorkingDir() method to get the Working Directory Path
	 * @param path = User directory path
	 * @return path
	 **/
	public static String getPresentWorkingDir()	throws IOException	{
		String path;
		path = System.getProperty("user.dir");
		return path;
	}
	/** 
	 * getPresentWorkingDir() method to get the Working Directory Path
	 * @param path = User directory path
	 * @return path
	 **/
	public static  Properties readProperties(String Filename, String Folder){
		Properties props = new Properties();
		try {
			File config_file = new File(Folder + File.separator + Filename);
			directory = getPresentWorkingDir();
			config_file = new File(directory + File.separator + Folder + File.separator + Filename);
			if (config_file == null) {
				System.out.println("Couldn't find " + Filename + ", Due to this the rest of the tests will fail");
			}
			props.load(new FileInputStream(config_file));
		} catch (FileNotFoundException e) {
			System.out.println(e.getLocalizedMessage());
		} catch (IOException e) {
			System.out.println(e.getLocalizedMessage());
		}
		return props;
	}

	/**
	 * Prints current time stamp in the format yyyyMMdd_HHmmssSSS
	 * @return String
	 */
	public static String printTime(){
		@SuppressWarnings("unused")
		Calendar cal = Calendar.getInstance();
		String timeStamps = new SimpleDateFormat("yyyyMMdd_HHmmssSSS").format(Calendar.getInstance().getTime());
		return timeStamps;
	}
}
