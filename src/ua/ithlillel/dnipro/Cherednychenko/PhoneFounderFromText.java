package ua.ithlillel.dnipro.Cherednychenko;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;


public class PhoneFounderFromText {
    private String text;

    public PhoneFounderFromText(String text) {
        this.text = text;
    }

    public Set<String> getAllPhonesNumbersFromText() {

        String[] textArray = text.replaceAll("[\\s\\+\\-\\(\\),.]+", "")
                .replaceAll("[A-Za-z]+", " ")
                .split(" ");

        Set<String> phoneNumbersSet = Arrays.stream(textArray)
                .filter(arrayPart ->
                        ((arrayPart.contains("0") && arrayPart.length()-arrayPart.indexOf("0") == 10)
                                || (arrayPart.contains("8") && arrayPart.length()-arrayPart.indexOf("8") == 11)
                                || (arrayPart.contains("3") && arrayPart.length()-arrayPart.indexOf("3") == 12)))
                .map(arrayPart -> String.format("+%s %s %s %s",
                        38,
                        arrayPart.substring((arrayPart.length() - 10), (arrayPart.length() - 7)),
                        arrayPart.substring((arrayPart.length() - 7), (arrayPart.length() - 4)),
                        arrayPart.substring((arrayPart.length() - 4))))
                .collect(Collectors.toSet());
        return phoneNumbersSet;
    }

    public void showAllPhoneNumbers(Set<String> phonesSet) {
        phonesSet.stream()
                .sorted()
                .forEach(phone-> System.out.println(phone));
            }
}
