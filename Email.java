public final class Email {

    private final String value;

    public Email(String value) {

        if (value == null || !value.contains("@")) {
            throw new IllegalArgumentException("Email invalide : doit contenir '@' et ne pas être null.");
        }

        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value;
    }
}
