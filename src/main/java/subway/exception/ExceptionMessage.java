package subway.exception;

public enum ExceptionMessage {
    OUT_OF_COMMAND_NUMBER("선택할 수 없는 기능입니다."),
    ALREADY_REGISTER_STATION("이미 등록된 역 이름입니다.");


    public static final String ERROR_MESSAGE = "[ERROR] %s";
    private final String message;

    ExceptionMessage(String message, Object... replaces) {
        this.message = String.format(ERROR_MESSAGE, String.format(message, replaces));
    }

    public String getMessage() {
        return message;
    }
}
