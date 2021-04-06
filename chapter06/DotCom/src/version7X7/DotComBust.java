package version7X7;

import java.util.ArrayList;
import java.util.List;

public class DotComBust {

    static int countGuesses = 0;
    static List<DotCom> dotComList = new ArrayList<>();
    static Enter enter = new Enter();

    public static void main(String[] args) {

DotComBust dotComBust =new DotComBust();
        setUpGame(dotComList, enter);
        startPlaying(dotComList, enter);

    }

    private static void startPlaying(List<DotCom> dotComList, Enter enter) {

        while (!dotComList.isEmpty()) {
            String user = getUserInput(enter);
            checkingUserGuess( user);
        }
    }

    private static String getUserInput(Enter enter) {
        String user;
        System.out.println("Введите число: ");
        user = enter.enterWord();
        return user;
    }

    private static void checkingUserGuess( String user) {
        countGuesses++;
        for (DotCom dotCom : dotComList) {
            String checking = dotCom.checking(user);
            if ("Попал".equals(checking)) {
                System.out.println("Попал");
                break;
            } else if ("Потопил".equals(checking)) {
                finishGame(dotComList, countGuesses, dotCom);
                break;
            } else if ("Мимо".equals(checking)) {
                System.out.println("Мимо");
                break;
            }
        }
    }

    private static void finishGame(List<DotCom> dotComList, int countGuesses, DotCom dotCom) {
        System.out.println("Сайт \"" + dotCom.name +
                "\" потоплен на " + countGuesses + " попытке!");
        dotComList.remove(dotCom);
    }

    private static void setUpGame(List<DotCom> dotComList, Enter enter) {
        for (int i = 0; i < 1; i++) {
            dotComList.add(i, new DotCom());
            System.out.println("Задайте имя сайта");
            dotComList.get(i).setName(enter.enterWord());
            dotComList.get(i).setIntegerList();
        }
    }

}
