package login.auth.Models;

public class AuthenticationResponse {

    private String response;

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    @Override
    public String toString() {
        return "AuthenticationResponse [response=" + response + "]";
    }

    public AuthenticationResponse(String response) {
        this.response = response;
    }

    public AuthenticationResponse() {
    }

}
