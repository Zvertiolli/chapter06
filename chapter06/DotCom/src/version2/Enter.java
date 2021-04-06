package version2;

import java.util.Scanner;

public class Enter {
    Scanner scanner = new Scanner(System.in);

    public Enter() {
    }

    String enterWord(){
        String line = scanner.nextLine();
        if (line.equals("")){
            System.out.println("Некорректный ввод");
        }
        return line;
    }
}
