package Test


import geb.spock.GebSpec
import spock.lang.Specification
/*implicit calling of browser instance
Created one dependancy jar that is going to have geb+spock ralated stuff in pom file

 */

class GebSpockTestClass  extends GebSpec{
//    specification class was going to have multiple feature methhod
    def "fill contact us form and click submit button"(){
//        feature method have some blocks given ,when,then
        given:
        println("we are in given block")

        when:
//        to call page
        to ContactUsPages
        "enter name"("nameString")
        "enter email"("emailString")
        "enter comment"("comment")
        and:
        "enter submit"()

        then:
//        at method take next page
        at MessageSubmittedPage


    }
}