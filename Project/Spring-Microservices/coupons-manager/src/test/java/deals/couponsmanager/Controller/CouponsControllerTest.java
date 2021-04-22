package deals.couponsmanager.Controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CouponsControllerTest {
    @Test
    public void testHome() {
        assertEquals("<h1>Welcome to Coupons-Manager!</h1>", (new CouponsController()).home());
    }

    @Test
    public void testUser() {
        assertEquals("<h1>Welcome to Coupons-Manager user!</h1>", (new CouponsController()).user());
    }

    @Test
    public void testAdmin() {
        assertEquals("<h1>Welcome to Coupons-Manager admin!</h1>", (new CouponsController()).admin());
    }
}

