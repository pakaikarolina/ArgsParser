package ArgParser;

public class Directory extends Schema<String>{

    public Directory(String value) {
        this.flag = "-d";
        this.value = value;
    }

    public Directory() {
        this.flag = "-d";
        this.value = "";
    }

    @Override
    public String toString() {
        return "Directory : " +
                "flag is " + flag +
                ", value is " + value;
    }

    @Override
    public void parseValue(String value) {

    }
}
