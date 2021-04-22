package login.auth.Controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AuthControllerTest {
    @Test
    public void testHome() {
        assertEquals("<h1>Welcome to Auth-Application!</h1>", (new AuthController()).home());
    }

    @Test
    public void testUser() {
        assertEquals("<h1>Welcome to Auth-Application user!</h1>", (new AuthController()).user());
    }

    @Test
    public void testAdmin() {
        assertEquals("<h1>Welcome to Auth-Application admin!</h1>", (new AuthController()).admin());
    }
}

