package deals.rewardsmanager.Controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RewardsControllerTest {
    @Test
    public void testHome() {
        assertEquals("<h1>Welcome to Rewards-Manager!</h1>", (new RewardsController()).home());
    }

    @Test
    public void testUser() {
        assertEquals("<h1>Welcome to Rewards-Manager user!</h1>", (new RewardsController()).user());
    }

    @Test
    public void testAdmin() {
        assertEquals("<h1>Welcome to Rewards-Manager admin!</h1>", (new RewardsController()).admin());
    }
}

