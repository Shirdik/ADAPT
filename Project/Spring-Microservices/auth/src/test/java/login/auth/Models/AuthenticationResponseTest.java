package login.auth.Models;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AuthenticationResponseTest {
    @Test
    public void testSetRole() {
        AuthenticationResponse authenticationResponse = new AuthenticationResponse("janedoe", "Response", "Jwt", "Role");
        authenticationResponse.setRole("Role");
        assertEquals("Role", authenticationResponse.getRole());
    }

    @Test
    public void testSetRole2() {
        AuthenticationResponse authenticationResponse = new AuthenticationResponse("janedoe", "Response", "Jwt", "Role");
        authenticationResponse.setRole("Role");
        assertEquals("Role", authenticationResponse.getRole());
    }

    @Test
    public void testSetUsername() {
        AuthenticationResponse authenticationResponse = new AuthenticationResponse("janedoe", "Response", "Jwt", "Role");
        authenticationResponse.setUsername("janedoe");
        assertEquals("janedoe", authenticationResponse.getUsername());
    }

    @Test
    public void testSetUsername2() {
        AuthenticationResponse authenticationResponse = new AuthenticationResponse("janedoe", "Response", "Jwt", "Role");
        authenticationResponse.setUsername("janedoe");
        assertEquals("janedoe", authenticationResponse.getUsername());
    }

    @Test
    public void testSetResponse() {
        AuthenticationResponse authenticationResponse = new AuthenticationResponse("janedoe", "Response", "Jwt", "Role");
        authenticationResponse.setResponse("Response");
        assertEquals("Response", authenticationResponse.getResponse());
    }

    @Test
    public void testSetResponse2() {
        AuthenticationResponse authenticationResponse = new AuthenticationResponse("janedoe", "Response", "Jwt", "Role");
        authenticationResponse.setResponse("Response");
        assertEquals("Response", authenticationResponse.getResponse());
    }

    @Test
    public void testSetJwt() {
        AuthenticationResponse authenticationResponse = new AuthenticationResponse("janedoe", "Response", "Jwt", "Role");
        authenticationResponse.setJwt("Jwt");
        assertEquals("Jwt", authenticationResponse.getJwt());
    }

    @Test
    public void testSetJwt2() {
        AuthenticationResponse authenticationResponse = new AuthenticationResponse("janedoe", "Response", "Jwt", "Role");
        authenticationResponse.setJwt("Jwt");
        assertEquals("Jwt", authenticationResponse.getJwt());
    }
}

