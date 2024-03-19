package GebAndSpockFramework

import org.junit.Ignore
import spock.lang.Specification

class ExtensionExample extends Specification {
//    create feature method
    def "Feature 1"(){
        given:
        println("we are in feature 1")
    }

    @spock.lang.Ignore
    def "Feature 2"(){
        given:
        println("we are in feature 2")
    }
    def "Feature 3"(){
        given:
        println("we are in feature 3")
    }
    def "Feature 4"(){
        given:
        println("we are in feature 4")
    }
    def "Feature 5"(){
        given:
        println("we are in feature 5")
    }
}
/*Extension/annotation
@ignore :ignore that perticulat TC
@ignorerest: ignore rest tc
@timeout: if tc get pass in given second otherwise it will get fail
@issues: facing some issues

 */