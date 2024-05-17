package enumeration.test.ex2;

public enum HttpStatus {
    OK(200, "OK"),
    BAD_REQUEST(400, "Bad Request"),
    NOT_FOUND(404, "Not Found"),
    INTERNAL_SERVER_ERROR(500, "Internal Server Error");

    private final int code;
    private final String message;

    HttpStatus(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public boolean isSuccess() {
        return code >= 200 && code < 300;
    }

    public static HttpStatus findByCode(int httpCodeInput) {
        if (httpCodeInput >= 200 && httpCodeInput < 300)
            httpCodeInput = 200;
        for (HttpStatus status : values()) {
            if (status.getCode() == httpCodeInput) {
                return status;
            }
        }
        return null;
    }
}
