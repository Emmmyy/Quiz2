import java.io.IOException;
import java.util.Arrays;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;


public class Main {
    private String example;

    public static void ReadMethod(String[] args) throws IOException {
        {
            List<String> listOfStrings = new ArrayList<String>();

            BufferedReader bf = new BufferedReader(new FileReader("file.txt"));

            String line = bf.readLine();

            try {
                while (line != null) {
                    listOfStrings.add(line);
                    line = bf.readLine();
                }

                bf.close();

                String[] array
                        = listOfStrings.toArray(new String[0]);

                for (String str : array) {
                    System.out.println(str);
                }
            } catch (NumberFormatException e) {
                throw new NumberFormatException();
            }
        }

    }

    public static void sumMethod(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int sum = Arrays.stream(nums).sum();
        System.out.println(sum);
    }
}