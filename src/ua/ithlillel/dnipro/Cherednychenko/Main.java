package ua.ithlillel.dnipro.Cherednychenko;

public class Main {

    public static void main(String[] args) {


        String textForChecking = "The self-study lessons in this section are written and organised according to 380931111111 " +
                "the levels of the Common European + 380 93 222 22 22 Framework of Reference + 38093 222 22 22" +
                "for languages (CEFR). + 3 8 (095)  333-33-33 There are different types of texts +38 (095)  333-33-33  and interactive exercises that practise " +
                "the reading skills you need to do well in your studies, " +
                "to get ahead at work and + 38 (095)  444-4444 to communicate in English in your free time.\n" +
                "\n" + "Take our free online English test to find out + 38 (096) 55-55-555 which level to choose. Select your level, " +
                "from beginner (CEFR level A1) 8(096) 666 6666 to advanced (CEFR level C1), " +
                "and improve your reading skills at your own speed, whenever (097) 77 77 777 it's convenient 10.130.24.1 for 098 888 8888 you.";

        PhoneFounderFromText phoneFounderFromText = new PhoneFounderFromText(textForChecking);

        phoneFounderFromText.showAllPhoneNumbers(phoneFounderFromText.getAllPhonesNumbersFromText());

    }
}
