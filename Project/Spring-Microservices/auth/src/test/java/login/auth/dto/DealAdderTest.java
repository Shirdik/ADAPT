package login.auth.dto;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DealAdderTest {
    @Test
    public void testSetUsername() {
        DealAdder dealAdder = new DealAdder("janedoe", "Deal Code");
        dealAdder.setUsername("janedoe");
        assertEquals("janedoe", dealAdder.getUsername());
    }

    @Test
    public void testSetDealCode() {
        DealAdder dealAdder = new DealAdder("janedoe", "Deal Code");
        dealAdder.setDealCode("Deal Code");
        assertEquals("Deal Code", dealAdder.getDealCode());
    }
}

