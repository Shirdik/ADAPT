package login.auth.Models;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CategoryTest {
    @Test
    public void testSetCategory() {
        Category category = new Category("Category");
        category.setCategory("Category");
        assertEquals("Category", category.getCategory());
    }

    @Test
    public void testSetCategory2() {
        Category category = new Category("Category");
        category.setCategory("Category");
        assertEquals("Category", category.getCategory());
    }
}

