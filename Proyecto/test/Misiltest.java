import Objetos.Misil;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class Misiltest {
    private Misil misil;
    public Misiltest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        misil = new Misil();
    }
    
    @After
    public void tearDown() {
    }
    @Test
    public void TestchekeaObjetivoMisil() throws Exception {
        System.out.println("se lanza");
        //assertNotNull(misil.checkearObjectivo((float) 10,10));
        assertTrue(misil.checkearObjectivo((float) 10,10));
    }
    @Test
    public void Misil() throws Exception {
        System.out.println("se lanza");
        
    }

}
