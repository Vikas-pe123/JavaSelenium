package StringProgram;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class AdditionOfIndividualNumberInString {
public static void main(String[] args) {

	LocalDateTime currentdatetime=LocalDateTime.now();
    DateTimeFormatter f= DateTimeFormatter.ofPattern("dd-MM-yyyy HH:ss:mm");
    System.out.println(currentdatetime.format(f));

 }
}
