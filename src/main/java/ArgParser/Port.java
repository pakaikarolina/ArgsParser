package ArgParser;

public class Port extends Schema<Integer> {


    public Port(int value) {
        this.flag = "-p";
        this.value = value;
    }

    public Port() {
        this.flag = "-p";
        this.value = 0;
    }

    @Override
    public String toString() {
        return "Port: " +
                "flag is " + flag +
                ", value is " + value;
    }

    @Override
    public void parseValue(String value) {

    }
}
