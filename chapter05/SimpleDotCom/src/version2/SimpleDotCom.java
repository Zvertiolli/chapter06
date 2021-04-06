package version2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class SimpleDotCom {
    ArrayList <Integer>dotCom =new ArrayList<>();
    Random random = new Random();
    int shot;
    int countPop = 0;
    String result = "Мимо";


    public String checking(String user) {
        result = "Мимо";

        shot = Integer.parseInt(user);
        for (int j = 0; j < dotCom.size(); j++) {

            if (dotCom.get(j) == shot) {
                dotCom.remove(j);
                result = "Попал";
                countPop++;
                break;
            }
        }
        if (dotCom.size() == 0) {
            result = "Утопил";
        }
        return result;
    }

    private int[] deleteElement() {
        int[] temp = new int[dotCom.size() - 1];
        int j = 0;
        for (int k : dotCom) {
            if (k != shot) {
                temp[j] = k;
                j++;
            }
        }
        return temp;
    }

    public void setDotCom() {
        int address = random.nextInt(4);
        for (int i = 0; i < 3; i++) {
            dotCom.add(address+i);
        }
    }

    @Override
    public String toString() {
        return "version2.SimpleDotCom{" +
                "dotCom=" + Arrays.toString(new ArrayList[]{dotCom}) +
                '}';
    }
}
