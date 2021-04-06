package version2;

public class Test {
    public static void main(String[] args) {
        SimpleDotCom simpleDotCom = new SimpleDotCom();
        simpleDotCom.setDotCom();
        String result = "Мимо";
        int countGuesses = 0;
        Enter enter = new Enter();

        while (!result.equals("Утопил")) {
            countGuesses++;
            System.out.print("Введите число   ");
            String user = enter.enterWord();
            if (user.equals("")){
                continue;
            }
            result = simpleDotCom.checking(user);
            System.out.println(result);
        }
        System.out.println("Удалось потопить с " + countGuesses + " попыток");


    }
}
