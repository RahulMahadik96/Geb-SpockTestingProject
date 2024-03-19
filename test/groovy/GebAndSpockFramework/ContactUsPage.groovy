package Pages

import geb.Page

class ContactUsPages extends Page{
//    static url https://www.abodeqa.com/contact-us/
    static url = "/contact-us/"
//    current url = baseURL +static url
//    at checker
    static at = {
        title == "Contact Us | Abode QA"
//        $("h1.page-title").isDisplayed()
    }
    static  content = {
//        <navigator name><options map><actual navigator>
        nameField(wait: true) { $("input.g1280-name")}
        emailField(wait: true){$("input.g1280-email") }
        commentField(wait: true){$("#contact-form-comment-g1281-comment") }
        submitButton(wait: true) { $("button.pushbutton-wide")}
//        options map
        /*
        wait = true define in geb config wait till element appear otherwise throw exception
        required : true  /that navigator is available
        cache :true - have memory of the navigator,increase performance of code
         */
    }
    def "enter name"(nameString){
        nameField.value(nameString)

        assert nameField.value()==nameString
    }
    def "enter email"(emailString){
        emailField.value(emailString)
        assert emailField.value()==emailString
    }
    def "enter comment"(comment){
        commentField.value(comment)
    }
    def "enter submit"(){
        submitButton.click()
    }
}