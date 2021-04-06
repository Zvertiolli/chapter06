package version1;

import java.util.Arrays;
import java.util.Random;

public class SimpleDotCom {
    int[] dotCom;
    Random random = new Random();
    int shot;
    int countPop = 0;
    String result = "Мимо";


    public String checking(String user) {
        result = "Мимо";

        shot = Integer.parseInt(user);
        for (int j = 0; j < dotCom.length; j++) {

            if (dotCom[j] == shot) {
                dotCom = deleteElement();
                result = "Попал";
                countPop++;
                break;
            }
        }
        if (dotCom.length == 0) {
            result = "Утопил";
        }
        return result;
    }

    private int[] deleteElement() {
        int[] temp = new int[dotCom.length - 1];
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
        this.dotCom = new int[]{address, address + 1, address + 2};
    }

    @Override
    public String toString() {
        return "version2.SimpleDotCom{" +
                "dotCom=" + Arrays.toString(dotCom) +
                '}';
    }
}
