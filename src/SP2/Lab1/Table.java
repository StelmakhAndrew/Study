package SP2.Lab1;

import java.util.ArrayList;

public class Table {


    private ArrayList<String> table;
    private ArrayList<Pair> coincidence = new ArrayList<>();
    private int large = 0;
    private int size = 0;
    private String lastKey = "";
    private int countEnter = 0;

    Table(int size) {
        if (size < 0) throw new NegativeArraySizeException("Negative size");
        this.size = size;
        table = new ArrayList<>(size);
        table.add("GARAnt");
       table.add("Patriot");
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("BOX \n");

        for (String elem : table) {
            result.append("{").append(elem).append("}").append('\n');
        }
        return result.toString();

    }

    public void putElement(String elem) {
        table.add(elem);
    }


    public String returne(String key){
        Pair pair = choiceElem(key);
        if (pair.getKey()==0) return "No match";
        else return ""+ pair.getValue() + " - " + pair.getKey();
    }

    public Pair choiceElem(String key){
        if (key.equals(lastKey)){
            countEnter++;
            if (countEnter == coincidence.size()) countEnter =0;
            lastKey = key;
            return coincidence.get(countEnter);
        }
        else {
            countEnter = 0;
            lastKey = key;
            large = 0;
            coincidence.clear();
            compare(key);
            return coincidence.get(countEnter);
        }
    }

    private void allСoincidence(int count , String value) {
        if (count == large) {
            coincidence.add(new Pair(count,value));
        }
        if (count > large) {
            large = count;
            coincidence.clear();
            coincidence.add(new Pair(count,value));
        }
    }

    private void compare(String key) {
        char[] keyArray = key.toCharArray();
        int max = 0;
        for (String value : table) {
            max = 0;
            int count = 0;
            int k = 0;
            for (; k < key.length(); ) {
                char[] valueArray = value.toCharArray();
                for (int j = 0; j < valueArray.length; j++) {
                    {
                        if (k >= key.length()) break;
                        char ke = keyArray[k];
                        char va = valueArray[j];
                        if (ke == va) {
                            count++;
                            k++;
                            if (k == key.length()) {
                                if (count > max) max = count;
                            }

                        } else {
                            if (count > max) max = count;
                            if (count != 0) {
                                j = j + 1 - count;
                                if (j < 0) j = 0;
                                k--;
                            }
                            if (count > max) max = count;
                            count = 0;
                        }
                    }
                }
                k++;
            }
            allСoincidence(max, value);
        }

    }
}
