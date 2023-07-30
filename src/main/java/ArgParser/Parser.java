package ArgParser;

import java.util.Arrays;
import java.util.List;

public class Parser {

    void parseArg(String[] args) {
        List<Schema> schemaList = List.of(new Logger(), new Port(), new Directory());
        for (int i = 0; i < args.length; i++) {
            for (int j = 0; j < schemaList.size(); j++) {
                if (schemaList.get(j).flag.equals(args[i])) {

                }
            }
            switch (args[i]) {
                case "-l" -> {

                }
                case "-p" -> {
                    Port port = new Port();
                    port.value = args[i + 1].matches("\\d+") ? Integer.valueOf(args[i + 1]) : port.value;
                    ;
                    System.out.println(port);
                }
                case "-d" -> {
                    Directory directory = new Directory();
                    directory.value = args[i + 1].matches("/.+") ? args[i + 1] : directory.value;
                    System.out.println(directory);
                }
            }
        }
    }
}
