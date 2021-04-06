package deals.couponsmanager.Models;

public class RequestResponse {

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

    public RequestResponse(String response) {
        this.response = response;
    }

    public RequestResponse() {
    }

}
