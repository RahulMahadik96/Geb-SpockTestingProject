package keyboardOperation_MouseOperation

import geb.Page

class DragAndDrop extends Page {
    static url ="/droppable"
    static content = {
//        adding navigator
        draggable {$("#draggable")}
        droppable {$("#droppable")}
//        parent of locator
        iframeElement {$("#content iframe")}
    }
    def drageElement(){
        withFrame(iframeElement){
            interact {
                dragAndDrop(draggable,droppable)
            }
        }
    }
}