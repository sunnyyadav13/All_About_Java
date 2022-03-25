package udemyCourse.JuniorJavaDeveloper.PasswordValidator;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PasswordValidator {
    public static void main(String [] args) {
        String fileName = "E:\\Study folder\\Screenshots\\JOB\\JavaCode\\Upload\\udemyCourse\\JuniorJavaDeveloper\\PasswordValidator\\Password.csv";
        String password = null;
        String numbers = "1234567890";
        String letters = "abcdefghijklmnopqrstuvwxyz";

        do {
            try {
                BufferedReader reader = new BufferedReader(new FileReader(fileName));
                password = reader.readLine();

                while (password != null) {
                    System.out.println(password);
                    try {
                        if (!password.matches(".*[0-9].*")) {
                            throw new hasNumber(password);
                        }
                        if (!password.matches(".*[a-zA-Z]+.*")    ) {
                            throw new hasLetter(password);
                        }
                        if (!password.matches(".*[!@#].*")) {
                            throw new hasSpecialCharacters(password);
                        }
                    } catch (hasNumber e) {
                        e.printStackTrace();
                    } catch (hasLetter e) {
                        e.printStackTrace();
                    } catch (hasSpecialCharacters e) {
                        e.printStackTrace();
                    }
                    password = reader.readLine();
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } while (password != null);
    }
}

class hasNumber extends Exception {
    String password = null;
    public hasNumber(String password) {
        this.password = password;
    }
    public String toString() {
        return "Password does not contain a number" + password;
    }
}

class hasLetter extends Exception {
    String password = null;
    public hasLetter(String password) {
        this.password = password;
    }
    public String toString() {
        return "Password does not contain a letter" + password;
    }
}

class hasSpecialCharacters extends Exception {
    String password = null;
    public hasSpecialCharacters(String password) {
        this.password = password;
    }
    public String toString() {
        return "Password does not contain a special character" + password;
    }
}
