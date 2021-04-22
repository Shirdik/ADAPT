package deals.dealsmanager.Models;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.util.HashSet;

import org.junit.jupiter.api.Test;

public class DealsModelTest {
    @Test
    public void testAddUsername() {
        // TODO: This test is incomplete.
        //   Reason: No meaningful assertions found.
        //   To help Diffblue Cover to find assertions, please add getters to the
        //   class under test that return fields written by the method under test.
        //   See https://diff.blue/R004

        (new DealsModel()).addUsername("janedoe");
    }

    @Test
    public void testAddUsername2() {
        DealsModel dealsModel = new DealsModel();
        dealsModel.setUsernames(new HashSet<String>());
        dealsModel.addUsername("janedoe");
        assertEquals(1, dealsModel.getUsernames().size());
    }

    @Test
    public void testConstructor() {
        DealsModel actualDealsModel = new DealsModel();
        assertNull(actualDealsModel.getCategory());
        assertNull(actualDealsModel.getTitle());
        assertEquals(0.0, actualDealsModel.getRewards());
        assertNull(actualDealsModel.getLink());
        assertNull(actualDealsModel.getImageurl());
        assertNull(actualDealsModel.getDescription());
        assertNull(actualDealsModel.getDealCode());
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

