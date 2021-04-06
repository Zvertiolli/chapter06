package version7X7;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DotCom {
    List<Integer> integerList = new ArrayList<>();
    String name;
    Random random = new Random();
    String result = "Мимо";



    public void setName(String name) {
        this.name = name;
    }

    public void setIntegerList() {
        int address = random.nextInt(4);
        for (int i = 0; i < 3; i++) {
            this.integerList.add(address + i);
        }
    }

    public String checking(String user) {
        result = "Мимо";
        for (int i = 0; i < this.integerList.size(); i++) {
            if (this.integerList.get(i) == Integer.parseInt(user)) {
                this.integerList.remove(i);
                result = "Попал";
                break;
            }

        } if (this.integerList.isEmpty()) {

            result = "Потопил" ;
        }

        return result;
    }
}
