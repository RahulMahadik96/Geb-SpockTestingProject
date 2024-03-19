package GebAndSpockFramework

import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.firefox.FirefoxDriver

waiting{
    timeout = 2
    retryInterval = 0.5
    includeCausezInMessage = true

    present{
        slow {
            timeout = 20
            retryInterval = 1
        }
        verySlow{timeout = 50 }
    }
}
atCheckWaiting = "slow"
atCheckWaiting = true

driver = {new ChromeDriver()}

environments {
    /*this environment section is used through command line in that case format would be
    -Dgeb.env = <drivername>
    if we are going to chrome then it will be
    -Dgeb.env = chrome
     */
    chrome{
        driver = {new ChromeDriver()}

    }
    firefox{
        driver = {new FirefoxDriver()}

    }
}
//baseUrl = "https://www.abodeqa.com"
baseUrl = "https://jqueryui.com/"
reportsDit = "./target/report"