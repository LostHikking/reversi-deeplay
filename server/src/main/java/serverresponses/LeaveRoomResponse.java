package serverresponses;

public class LeaveRoomResponse implements Response {
    protected final String command = "LEAVEROOM";
    private String status;
    private String message;

    public LeaveRoomResponse(String status, String message) {
        this.message = message;
        this.status = status;
    }

    public String getStatus() {

        return status;
    }
    public String getMessage() {

        return message;
    }

}
