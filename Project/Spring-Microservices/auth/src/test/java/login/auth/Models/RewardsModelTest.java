package login.auth.Models;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RewardsModelTest {
    @Test
    public void testSetUsername() {
        RewardsModel rewardsModel = new RewardsModel("janedoe", 10.0);
        rewardsModel.setUsername("janedoe");
        assertEquals("janedoe", rewardsModel.getUsername());
    }

    @Test
    public void testSetUsername2() {
        RewardsModel rewardsModel = new RewardsModel("janedoe", 10.0);
        rewardsModel.setUsername("janedoe");
        assertEquals("janedoe", rewardsModel.getUsername());
    }

    @Test
    public void testSetRewards() {
        RewardsModel rewardsModel = new RewardsModel("janedoe", 10.0);
        rewardsModel.setRewards(10.0);
        assertEquals(10.0, rewardsModel.getRewards());
    }

    @Test
    public void testSetRewards2() {
        RewardsModel rewardsModel = new RewardsModel("janedoe", 10.0);
        rewardsModel.setRewards(10.0);
        assertEquals(10.0, rewardsModel.getRewards());
    }
}

