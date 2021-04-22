package deals.couponsmanager.dto;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RequestResponseTest {
    @Test
    public void testSetResponse() {
        RequestResponse requestResponse = new RequestResponse("Response");
        requestResponse.setResponse("Response");
        assertEquals("Response", requestResponse.getResponse());
    }

    @Test
    public void testToString() {
        assertEquals("Response [response=Response]", (new RequestResponse("Response")).toString());
    }
}

