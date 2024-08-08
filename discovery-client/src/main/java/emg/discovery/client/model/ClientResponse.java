package emg.discovery.client.model;

public record ClientResponse(
        String getResponse,
        String postResponse
) {
    public static ClientResponse of(String getResponse, String postResponse) {
        return new ClientResponse(getResponse, postResponse);
    }
}
