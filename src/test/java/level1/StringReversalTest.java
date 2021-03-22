package level1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringReversalTest {
    @Test
    public void testReverseString() {
        StringReversal reversal = new StringReversal();
        Assertions.assertEquals("nihcas", reversal.reverse("sachin"));
    }
}