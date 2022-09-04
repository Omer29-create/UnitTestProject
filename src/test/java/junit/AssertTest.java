package junit;


import org.junit.Assert;
import org.junit.Test;

public class AssertTest {

    @Test
    public void testAssertions() throws Exception {

        // Dummy d1 = new Dummy(5);
        // Dummy d2 = new Dummy(5);

        // Assert.assertEquals("d1 d2'ye esit olmaliydi can", d1, d2);

        // Assert.assertNull(d1);
        // Assert.assertNotNull(d1);
        // Assert.assertTrue(d1 == null);


        String[] arr1 = new String[]{"1", "2", "3"};
        String[] arr2 = new String[]{"1", "2"};

        Assert.assertArrayEquals(arr1,arr2);

    }

    private static class Dummy {

        private int id;

        public int getId() {
            return id;
        }

        public Dummy(int id) {
            this.id = id;
        }

        @Override
        public boolean equals(Object obj) {
            return this.id == ((Dummy) obj).getId();
        }
    }
}
