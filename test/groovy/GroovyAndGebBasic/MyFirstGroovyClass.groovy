package GroovyAndGebBasic

class MyFirstGroovyClass {

           private name
           def arrayOne=new String[3]
           def arrayList=new ArrayList<String>();

           HashMap<Character,Integer> hm=[:];

           def setName(def name){
               char var1='B'
               int num1=4;
               this.name=name
               arrayOne.putAt(0,"Suraj")
               arrayOne[1]="Kiran"
               arrayOne[2]=name
               hm.put('A',2)
               hm.put(var1,num1)
               println(hm)

           }

           def printName() {

               for(Map.Entry temp:hm.entrySet()){

                   print("Key is: ")
                   print(temp.getKey())
                   println()
                   print("Value is: ")
                   print(temp.getValue())
                   println()
               }

               println"This is method"
               println("User Name is: $name")
               println("List of users in Array are Following")
               for(def temp:arrayOne){
                   println(temp)
                   arrayList.add(temp)
                   arrayList.push(temp)

               }
               arrayList.putAt(2,"Sham")
               println(arrayList)

           }

    static main(args){
        MyFirstGroovyClass obj=new MyFirstGroovyClass();
        obj.setName("Rahul")
        obj.printName()
    }
}
