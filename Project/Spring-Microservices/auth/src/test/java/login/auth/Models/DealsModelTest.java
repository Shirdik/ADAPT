package login.auth.Models;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.util.HashSet;

import org.junit.jupiter.api.Test;

public class DealsModelTest {
    @Test
    public void testAddUsername() {
        DealsModel dealsModel = new DealsModel();
        dealsModel.setUsernames(new HashSet<String>());
        dealsModel.addUsername("janedoe");
        dealsModel.addUsername("janedoe");
        assertEquals(1, dealsModel.getUsernames().size());
    }

    @Test
    public void testSetTitle() {
        DealsModel dealsModel = new DealsModel();
        dealsModel.setTitle("Dr");
        assertEquals("Dr", dealsModel.getTitle());
    }

    @Test
    public void testSetDescription() {
        DealsModel dealsModel = new DealsModel();
        dealsModel.setDescription("The characteristics of someone or something");
        assertEquals("The characteristics of someone or something", dealsModel.getDescription());
    }

    @Test
    public void testSetImageurl() {
        DealsModel dealsModel = new DealsModel();
        dealsModel.setImageurl("https://example.org/example");
        assertEquals("https://example.org/example", dealsModel.getImageurl());
    }

    @Test
    public void testSetLink() {
        DealsModel dealsModel = new DealsModel();
        dealsModel.setLink("Link");
        assertEquals("Link", dealsModel.getLink());
    }

    @Test
    public void testSetRewards() {
        DealsModel dealsModel = new DealsModel();
        dealsModel.setRewards(10.0);
        assertEquals(10.0, dealsModel.getRewards());
    }

    @Test
    public void testSetDealCode() {
        DealsModel dealsModel = new DealsModel();
        dealsModel.setDealCode("Deal Code");
        assertEquals("Deal Code", dealsModel.getDealCode());
    }

    @Test
    public void testSetUsernames() {
        DealsModel dealsModel = new DealsModel();
        HashSet<String> stringSet = new HashSet<String>();
        dealsModel.setUsernames(stringSet);
        assertSame(stringSet, dealsModel.getUsernames());
    }

    @Test
    public void testSetCategory() {
        DealsModel dealsModel = new DealsModel();
        dealsModel.setCategory("Category");
        assertEquals("Category", dealsModel.getCategory());
    }
}

