import org.junit.jupiter.api.Test;
import java.io.*;
import java.util.stream.Collectors;
import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorIT {
    @Test
    void testIntegration_Addition() throws Exception {
        executeTest("5"+System.lineSeparator()+"+"+System.lineSeparator()+"3"+System.lineSeparator()+"no"+System.lineSeparator()+"", "运算结果：8.0");
    }

    @Test
    void testIntegration_Subtraction() throws Exception {
        executeTest("5"+System.lineSeparator()+"-"+System.lineSeparator()+"-3"+System.lineSeparator()+"no"+System.lineSeparator()+"", "运算结果：8.0");
    }

    @Test
    void testIntegration_Multiplication() throws Exception {
        executeTest("-5"+System.lineSeparator()+"*"+System.lineSeparator()+"-3"+System.lineSeparator()+"no"+System.lineSeparator()+"", "运算结果：15.0");
    }

    @Test
    void testIntegration_Division() throws Exception {
        executeTest("5"+System.lineSeparator()+"/"+System.lineSeparator()+"2"+System.lineSeparator()+"no"+System.lineSeparator()+"", "运算结果：2.5");
    }

    @Test
    void testIntegration_DivisionByZero() throws Exception {
        executeTest("5"+System.lineSeparator()+"/"+System.lineSeparator()+"0"+System.lineSeparator()+"no"+System.lineSeparator()+"", "除数不能为0！");
    }

    private String executeTest(String input, String expectedOutput) throws Exception {
        ProcessBuilder pb = new ProcessBuilder("java", "-jar", "SimpleCalculator.jar");

        Process proc = null;
        try {
            proc = pb.start();
        } catch (IOException e) {
            throw new Exception("Error starting the subprocess", e);
        }

        try (OutputStream stdin = proc.getOutputStream();
             BufferedReader stdOutput = new BufferedReader(new InputStreamReader(proc.getInputStream()));
             BufferedReader stdError = new BufferedReader(new InputStreamReader(proc.getErrorStream()))) {

            stdin.write(input.getBytes());
            stdin.flush();

            String actualOutput = stdOutput.lines().collect(Collectors.joining(System.lineSeparator()));
            String error = stdError.lines().collect(Collectors.joining(System.lineSeparator()));

            assertEquals(expectedOutput, actualOutput);

            return error;
        }
    }
}