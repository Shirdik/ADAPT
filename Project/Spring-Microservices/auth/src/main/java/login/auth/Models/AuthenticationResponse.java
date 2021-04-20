package login.auth.Models;

public class AuthenticationResponse {

    private String response;
    private String jwt;

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public String getJwt() {
        return jwt;
    }

    public void setJwt(String jwt) {
        this.jwt = jwt;
    }

    public AuthenticationResponse(String response, String jwt) {
        this.response = response;
        this.jwt = jwt;
    }

    public AuthenticationResponse() {
    }

}
