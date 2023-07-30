package ArgParser;

public abstract class Schema<T> implements Argument{
    String flag;
    T value;
    public Schema() {
    }

    @Override
    public String toString() {
        return "Schema " +
                "flag is " + flag + '\'' +
                ", value is " + value + '\'';
    }

}
