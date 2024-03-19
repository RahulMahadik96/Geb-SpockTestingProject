package GebAndSpockFramework

import geb.Browser
import io.github.bonigarcia.wdm.WebDriverManager
import org.junit.*

import java.time.Duration

 class GebWithJunit01 {
    static def browser
    static def userName
    static def pass

       @BeforeClass
       static void setUpBrowser(){
           println("This is BeforeClass")
           def driver= WebDriverManager.firefoxdriver().create()
           driver.manage().window().maximize()
           driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10))
           browser =new Browser(driver : driver)
           browser.go("https://www.westernunion.com/us/en/home.html")

       }

        @Before
        void launchWUApp(){

            def title=browser.getTitle()
            println("Title of browser is: $title")
            Assert.assertEquals("StepFail: Unable to load Western Union app","Send and Track Money Online Now | Western Union",title)

            def element= browser.$("span[class*='wu-icon__lg d-L-flex icon-F09-Cross-Remove-Close-Cancel-NoCircle-30px']")
            boolean isDisplay=element.isDisplayed()
            if(isDisplay) {
                element.click()
            }

        }
                  @Test()
                  void wuRegistrationTest(){

                      browser.$("li[id='sign-up-nav-item'] a[amplitude-id='menu-signup']").click()

                      /*browser.$("input#txtEmailAddr").value("mahadikra38@gmail.com")
                       browser.$("input#textbox-password").value("Rahul@1996")
                       browser.$("button#button-continue").click

                      def aRACElement=browser.$("img[alt='icon-close-gray']")
                      boolean isAlreadyRAC= aRACElement.isDisplayed()
                      aRACElement.click()
                      println("Is Already account: $isAlreadyRAC")*/

                     println("Registration Test")
                  }

                @Test()
                void wuLoginTest(){

                    browser.$("a[id='wu-mobile-login-button'] span").click()
                    boolean isPresent=  browser.$("h1[translate='login.pagetitle']").isDisplayed()
                    Assert.assertTrue("StepFail: We are not on the Login page",isPresent)
                    println("StepPass: we are on the Login page")
                    Thread.sleep(3000)

                    browser.$("input#txtEmailAddr").value("mahadikra38@gmail.com")
                    browser.$("input#txtKey").value("Rahul")
                    browser.$("button#button-continue").click()

                    def logOutElement=browser.$("div[class*='hidden-xs hidden-sm wu-user-loggedin'] a")
                    def isVisible= logOutElement.isDisplayed()
                    if(isVisible){
                         logOutElement.click()
                    }

                }


        @After
        void goOnWUHome(){
            Thread.sleep(5000)
            browser.$("img[src*='/content/dam/wu/logo']").click()
            println("We are on the Main page ready to Login or Register")

        }

      @AfterClass
      static void closeBrowser(){
          browser.quit()
          println("Browser Successfully closed")
      }
}
