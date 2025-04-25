import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FInfoTest {

    @Test
    void testGetPrice() {
        int[][] roomArray = {{0, 1}, {1, 0}};
        FInfo fInfo = new FInfo(roomArray);
        assertEquals(40000, fInfo.getPrice());
    }

    @Test
    void testGetBill() {
        int[][] roomArray = {{0, 1}, {1, 0}};
        FInfo fInfo = new FInfo(roomArray);
        assertEquals("400", fInfo.getBill());
    }

    @Test
    void testConstructorWithNullRoomArray() {
        int[][] roomArray = null;
        FInfo fInfo = new FInfo(roomArray);
        assertNull(fInfo.getRooms()); 
    }


    @Test
    void testConstructorWithEmptyRoomArray() {
        int[][] roomArray = new int[0][0];
        FInfo fInfo = new FInfo(roomArray);
        assertEquals(0, fInfo.getRooms().length);
    }

    @Test
    void testConstructorWithNonEmptyRoomArray() {
        int[][] roomArray = {{1, 2}, {3, 4}};
        FInfo fInfo = new FInfo(roomArray);
        assertArrayEquals(roomArray, fInfo.getRooms());
    }

    @Test
    void testConstructorWithRaggedRoomArray() {
        int[][] roomArray = {{1, 2}, {3}};
        FInfo fInfo = new FInfo(roomArray);
        assertArrayEquals(roomArray, fInfo.getRooms());

    }


}
