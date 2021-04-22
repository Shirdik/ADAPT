package login.auth.Models;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AuthenticationRequestTest {
    @Test
    public void testSetUsername() {
        AuthenticationRequest authenticationRequest = new AuthenticationRequest("janedoe", "iloveyou", "JaneDoe");
        authenticationRequest.setUsername("janedoe");
        assertEquals("janedoe", authenticationRequest.getUsername());
    }

    @Test
    public void testSetUsername2() {
        AuthenticationRequest authenticationRequest = new AuthenticationRequest("janedoe", "iloveyou", "JaneDoe");
        authenticationRequest.setUsername("janedoe");
        assertEquals("janedoe", authenticationRequest.getUsername());
    }

    @Test
    public void testSetPassword() {
        AuthenticationRequest authenticationRequest = new AuthenticationRequest("janedoe", "iloveyou", "JaneDoe");
        authenticationRequest.setPassword("iloveyou");
        assertEquals("iloveyou", authenticationRequest.getPassword());
    }

    @Test
    public void testSetPassword2() {
        AuthenticationRequest authenticationRequest = new AuthenticationRequest("janedoe", "iloveyou", "JaneDoe");
        authenticationRequest.setPassword("iloveyou");
        assertEquals("iloveyou", authenticationRequest.getPassword());
    }
}

