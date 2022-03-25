package udemyCourse.JuniorJavaDeveloper.CreditCard;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Credit {

    public static void main(String[] args) {
        List<String[]> transactions = new ArrayList<String[]>();
        String filename = "E:\\Study folder\\Screenshots\\JOB\\JavaCode\\Upload\\udemyCourse\\JuniorJavaDeveloper\\CreditCard\\CreditFile.csv";
        String dataRow;

        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));

            while((dataRow = br.readLine()) != null) {
                String[] line = dataRow.split(",");
                transactions.add(line);
            }
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();
        }

        for (String[] transaction : transactions) {

            String date = transaction[0];
            String type = transaction[1];
            String vendor = transaction[2];
            String amount = transaction[3];
            System.out.println(date + " " + type + " " + vendor+ " $" + amount );

            if(type.equalsIgnoreCase("credit")) {
                System.out.println("Add to balance");

            } else if (type.equalsIgnoreCase("debit")) {
                System.out.println("Subtract from balance");
            }
            else{
                System.out.println("Some other transaction");
            }

        }

    }
}
