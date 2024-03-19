package GroovyAndGebBasic
import org.junit.*
class JUnit_AnnAss {

       @BeforeClass
       static void setUp(){
           println("This is BeforeClass")
       }

            @Before
             void launchWUApp(){
               println("This is BeforeTest")
             }
                   @Test
                   void wuRegistrationTest(){
                        println("This is Registration Test method")
                        String result="Western "
                        Assert.assertEquals("StepFail: Unable to Registration ",result,"Western Union")


                   }

                 @Test
                  void wuLoginTest(){
                       println("This is Login Test method")
                       String result="Western Union"
                       Assert.assertEquals("StepFail: Login ",result,"Western Union")
                 }


           @After
             void goOnWUHome(){
               println("This is AfterTest")
           }

      @AfterClass
      static void closeBrowser(){
          println("This is AfterClass")
      }


}
