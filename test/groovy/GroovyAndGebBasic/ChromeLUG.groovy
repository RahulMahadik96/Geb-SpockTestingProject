import geb.Browser
import io.github.bonigarcia.wdm.WebDriverManager
import org.openqa.selenium.WebElement

import java.time.Duration


def driver= WebDriverManager.chromedriver().create()
driver.manage().window().maximize()
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10))
def browser =new Browser(driver : driver)

browser.go("https://www.westernunion.com/us/en/home.html")

def title=browser.getTitle()
println("Title of browser is: $title")

def element= browser.$("span[class*='wu-icon__lg d-L-flex icon-F09-Cross-Remove-Close-Cancel-NoCircle-30px']")
def isDisplay=element.isDisplayed();
println(isDisplay)
if(isDisplay) {
    element.click()
}

browser.$("a[id='wu-mobile-login-button'] span").click()
println("Successfully executed script ")

browser.quit()


//waiting{
//    timeout=2
//    retryInterval=0.5
//
//    preset{
//        slow{ timeout=20
//         retryInterval=1
//        }
//        verySlow{ timeout=50}
//    }
//}