package tests;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import model.Managing_bus;
import model.BusTicketCalculations;
public class BusTest {
    
    
    Managing_bus b;
    BusTicketCalculations bc;
    
    public BusTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() throws Exception {
        b=new Managing_bus();
        bc= new BusTicketCalculations();
    }
    
    
    @After
    public void tearDown() {
    }
    
     @Test
    public void TestaddUser(){
      assertEquals("Asif", b.addNewUser("Asif"));
    }
    
    @Test
    public void TestdeleteUser(){
      assertEquals("Asif", b.deleteUser("Asif"));
    }
    
    @Test
    public void TestgetUser(){
      assertEquals("Asif", b.getUser("Asif"));
    }
    
    @Test
    public void TestgetBusDetials(){
      assertEquals("You got Mercedes and your seat no. is : 4", b.getBusDetials("Mercedes", 4));
    }
    
    @Test
    public void TestBusTicketCalculations(){
      assertEquals(425, BusTicketCalculations.getTicketPrice(170),425);
    }
    
}
