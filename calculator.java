package appiumcalculator;
import java.net.URL;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		static AppiumDriver<MobileElement> driver;

		public static void main(String[] args) {

			try {

				opCalculator();
			} catch (Exception exp) {
				System.out.println(exp.getCause());
				System.out.println(exp.getMessage());

				exp.printStackTrace();

			}
			// TODO Auto-generated method stub

		}

		public static void opCalculator() throws Exception {

			DesiredCapabilities ca = new DesiredCapabilities();

			ca.setCapability("deviceName", "Symphony_Z12");
			ca.setCapability("udid", "YOF031010588");
			ca.setCapability("platformName", "Android");
			ca.setCapability("PlatformVersion", "9.0");

			ca.setCapability("appPackage", "com.google.android.calculator");
			ca.setCapability("appactivity", "com.android.calculator2.calculator");

			URL url = new URL("http://127.0.0.1:4723/wd/hub");

			driver = new AppiumDriver<MobileElement>(url, ca);

			System.out.println("Application Started.....");

		}

	}
}


