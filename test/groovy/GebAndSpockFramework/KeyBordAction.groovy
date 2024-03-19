package keyboardOperation_MouseOperation

import geb.Page
import org.openqa.selenium.Keys

class keyboardAction extends Page{
    static url = "https://abodeqa.com/contact-us/"
    static content = {
        name {$("#g1280-name")}
        email {$("#g1280-email")}
        websiteURL {$("#g1280-website")}
        comment {$("#contact-form-comment-g1280-comment")}
        submit{$("button",text:"Submit")}

    }
    static at = {
        title=="Contact Us | Abode QA"
    }
    def fillForm(){
        name.value "Abodeqa"
        email.value "xyz.com"
        websiteURL.value "https://abodeqa.com"
//ctrl +A
        interact {
            keyDown(Keys.CONTROL)
            sendKeys("A")

        }
//        ctrl+C
        interact {
            keyDown(Keys.CONTROL)
            sendKeys("C")
        }
        comment.click()
        interact {
            keyDown(Keys.CONTROL)
            sendKeys("V")
        }
        submit.click()
    }

}