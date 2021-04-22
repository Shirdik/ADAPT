package deals.couponsmanager.dto;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RewardsRequestTest {
    @Test
    public void testSetUsername() {
        RewardsRequest rewardsRequest = new RewardsRequest("janedoe", 10.0);
        rewardsRequest.setUsername("janedoe");
        assertEquals("janedoe", rewardsRequest.getUsername());
    }

    @Test
    public void testSetRewards() {
        RewardsRequest rewardsRequest = new RewardsRequest("janedoe", 10.0);
        rewardsRequest.setRewards(10.0);
        assertEquals(10.0, rewardsRequest.getRewards());
    }
}

