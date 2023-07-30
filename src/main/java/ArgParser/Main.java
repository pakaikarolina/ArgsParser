package ArgParser;

import org.example.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(args));
        Parser parser = new Parser();
        parser.parseArg(args);
        int[] n = new int[]{-1, -5, 3, 2, 1};
        System.out.println(LeetCode.solution(n));
    }

}
