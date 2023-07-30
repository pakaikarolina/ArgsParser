package ArgParser;

public class Logger extends Schema<Boolean> {

    public Logger() {
        this.flag = "-l";
        this.value = false;
    }

    public Logger(boolean value) {
        this.flag = "-l";
        this.value = value;
    }

    @Override
    public String toString() {
        return "Logger: " +
                "flag is " + flag +
                ", value is " + value;
    }

    @Override
    public void parseValue(String value) {
        Logger logger = new Logger();
    //    logger.value = args[i + 1].matches("true") ? Boolean.valueOf(args[i + 1]) : logger.value;
    }
}
