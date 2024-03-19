import geb.Browser
import org.openqa.selenium.firefox.FirefoxDriver

def browser =new Browser(driver : new FirefoxDriver())

println("Groovy file is running")

browser.go("https://www.westernunion.com/us/en/home.html")

println("Groovy file execution completed")

browser.quit()
