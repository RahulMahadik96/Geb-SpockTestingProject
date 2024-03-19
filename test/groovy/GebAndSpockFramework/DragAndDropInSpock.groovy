package keyboardOperation_MouseOperation

import geb.spock.GebSpec

class DragAndDropSpeck extends GebSpec{
    def dragAndDropFeatureMethod(){
        given:
        to DragAndDrop

        when:
        drageElement()

        then:
        println("element id dragged from its position")
    }
}