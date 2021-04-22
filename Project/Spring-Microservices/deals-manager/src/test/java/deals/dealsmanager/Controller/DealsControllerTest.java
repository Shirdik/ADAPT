package deals.dealsmanager.Controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DealsControllerTest {
    @Test
    public void testHome() {
        assertEquals("<h1>Welcome to Deals-Manager!</h1>", (new DealsController()).home());
    }

    @Test
    public void testUser() {
        assertEquals("<h1>Welcome to Deals-Manager user!</h1>", (new DealsController()).user());
    }

    @Test
    public void testAdmin() {
        assertEquals("<h1>Welcome to Deals-Manager admin!</h1>", (new DealsController()).admin());
    }
}

