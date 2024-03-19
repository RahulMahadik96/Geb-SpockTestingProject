
import spock.lang.Specification

class BlocksEg extends Specification{
    def "Feature method without explicit block"(){
        setup:
//        setup method executed when feature method executed
        def a=5
        def b = 6
        def sum

        when:
        sum = a+b
        println(sum)

        then:
        sum == 11

        when:
        def list = []
        list.add(3)
        list.add(4)
        println list.get(5)

        then:
        thrown(IndexOutOfBoundsException)
        println "finally we have thrown exception"
        list.size()==2

        expect:
        Math.max(2,3)==3

        cleanup:
//        get executed once feature execution ends
        println("we are line")

/*def setup() {} run before every feature method
def cleanup() {} run after ievery feature method
def setupSpec() {} run before the first feazture method

Extension/annotation
@ignore
@ignorerest
@timeout
@issues

 */
    }
}