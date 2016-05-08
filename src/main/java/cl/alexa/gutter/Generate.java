package cl.alexa.gutter;

import com.mifmif.common.regex.Generex;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Generate {
    /**
     * Generate utterances from regex file.
     *
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        final String inFile = "src/main/resources/SampleUtterancesRegex.txt";
        final String outFile = "src/main/resources/SampleUtterances.txt";
        FileUtils.deleteQuietly(new File(outFile));
        final PrintWriter writer = new PrintWriter(Files.newBufferedWriter(Paths.get(outFile)));

        //read file into stream, try-with-resources
        try (Stream<String> stream = Files.lines(Paths.get(inFile))) {
            stream.forEach(line -> new Generex(line).getAllMatchedStrings().forEach(writer::println));
        } catch (IOException e) {
            e.printStackTrace();
        }
        writer.close();
    }
}
