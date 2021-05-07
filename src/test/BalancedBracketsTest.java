package test;

//import org.junit.Before;
import org.junit.Before;
import org.junit.Test;
import main.BonusBinarySearch;
import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    public int[] array = {1, 2, 3, 4, 5, 6, 8, 9, 10, 15};
    //                    0  1  2  3  4  5  6  7  8  9

//    @Before
//    public void createArray() {
//        int[] array = {1, 2, 3, 4, 5, 6, 8, 8, 9, 10};
//    }

//    @Test
//    public void TestBemptyTest() {
//        assertEquals(true, true);
//    }
//
    @Test
    public void TestHas10True() {
        assertEquals(8,BonusBinarySearch.binarySearch(array, 10),.01);
    }

    @Test
    public void TestHas5True() {
        assertEquals(4,BonusBinarySearch.binarySearch(array, 5),.01);
    }

    @Test
    public void TestHas1True() {
        assertEquals(0,BonusBinarySearch.binarySearch(array, 1),.01);
    }

    @Test
    public void TestMissing7True() {   //  return -1
        assertEquals(-1,BonusBinarySearch.binarySearch(array, 7),.01);

    }

    @Test
    public void TestMissing11True() {   //  return -1
        assertEquals(-1,BonusBinarySearch.binarySearch(array, 11),.01);

    }

    @Test
    public void TestMissing0True() {   //  return -1
        assertEquals(-1,BonusBinarySearch.binarySearch(array, 0),.01);

    }

    @Test
    public void TestMissing100True() {   //  return -1
        assertEquals(-1,BonusBinarySearch.binarySearch(array, 100),.01);

    }

}
