package SP2.Lab1;

public class Pair {
    private final int key;
    private final String value;

    Pair(int key, String value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return
                key + " = "

                        + value;
    }
}
