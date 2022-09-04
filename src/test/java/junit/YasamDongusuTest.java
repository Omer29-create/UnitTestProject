package junit;

import org.junit.*;

public class YasamDongusuTest {

    @BeforeClass
    public static void beforeCls() {
        System.out.println("Her test sinifi icin öncesi");
    }

    @AfterClass
    public static void afterCls() {
        System.out.println("Her test sinifi icin sonrasi");
    }

    @Before
    public void setUp() throws Exception {
        System.out.println("Method öncesi");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("Method sonrasi");
    }

    @Test
    public void testHelloWorld() throws Exception {
        System.out.println("Test Hello World 1");
    }

    @Test
    public void testHelloWorld2() throws Exception {
        System.out.println("Test Hello World 2");
    }


}
