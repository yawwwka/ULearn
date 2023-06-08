import java.util.*;

public class Main {
    public static void main(String[] args) {
        //TODO напишите консольное приложение для взаимодействия с телефонной книгой
        PhoneBook book = new PhoneBook();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (book.isLong(input)) {
            if (book.checkNumber(input)) {
                System.out.println(book.getNumbersName(input));
            } else {
                System.out.printf("Такого номера нет в телефонной книге.\nВведите имя абонента для номера \"%s\": ", input);
                book.addContact(input, scanner.nextLine());
            }
        } else if (input.equals("LIST")) {
            System.out.println(book.getAllContacts());
        } else {
            if (!book.checkName(input)) {
                System.out.printf("Такого имени в телефонной книге нет.\nВведите номер телефона для абонента \"%s\": ", input);
                book.addContact(scanner.nextLine(), input);
            } else {
                System.out.println(book.phonesToString(book.getPhonesByName(input)));
            }
        }
    }
}

class PhoneBook {
    Map<String, HashSet<String>> bookMap = new HashMap<>();

    public void addContact(String phone, String name) {
        //TODO проверьте корректность формата имени и телефона
        // если такой номер уже есть в списке, то перезаписать имя абонента
        if (bookMap.get(name) == null) {
            HashSet<String> temp = new HashSet<>(Collections.singleton(phone));
            bookMap.put(name, temp);
        } else {
            HashSet<String> temp = bookMap.get(name);
            temp.add(phone);
            bookMap.put(name, temp);
        }
    }

    public boolean checkName(String name) {
        for (String a : bookMap.keySet()) {
            if (name.equals(a)) return true;
        }
        return false;
    }

    public StringBuilder phonesToString(Set<String> numbers) {
        StringBuilder sb = new StringBuilder();
        for (String s : numbers) {
            sb.append(s).append(" ");
        }
        sb.deleteCharAt(sb.lastIndexOf(" "));
        return sb;
    }

    public Set<String> getPhonesByName(String name) {
        //TODO по имени вернуть список номеров
        return bookMap.get(name);
    }

    public boolean isLong(String s) {
        try {
            Long.parseLong(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public boolean checkNumber(String phone) {
        for (String a : bookMap.keySet()) {
            for (String b : bookMap.get(a)) {
                if (b.equals(phone)) return true;
            }
        }
        return false;
    }

    public String getNumbersName(String phone) {
        for (String a : bookMap.keySet()) {
            for (String b : bookMap.get(a)) {
                if (b.equals(phone)) return a;
            }
        }
        return "";
    }

    public StringBuilder getAllContacts() {
        StringBuilder sb = new StringBuilder();
        for (String a : bookMap.keySet()) {
            sb.append(a).append(" -");
            for (String b : bookMap.get(a)) {
                sb.append(" ").append(b).append(",");
            }
            sb.deleteCharAt(sb.lastIndexOf(","));
            sb.append("\n");
        }
        return sb;
    }
}