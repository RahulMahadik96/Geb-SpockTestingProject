package GroovyAndGebBasic

class ReadFileinGroovy {

    static main(args){

        def file1=new File("testFil.txt")
        def file2=new File("writeFile.txt")

        println(file1.text)
       println(file1.readLines()[0])
        println(file1.readLines()[1])
        file2.write(file1.readLines()[0])
        file2<< file1.text
    }
}
