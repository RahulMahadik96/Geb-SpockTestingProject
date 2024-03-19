import geb.Browser
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.firefox.FirefoxDriver

//def browser = new Browser(driver: new ChromeDriver())
def browser = new Browser(driver: new FirefoxDriver())
browser.go("https://www.google.com")