package SP2.Lab1;

import java.util.ArrayList;

public class Table {


    private ArrayList<String> table;
    private ArrayList<Integer> coincidence = new ArrayList<>();
    private int large = 0;

    public Table(int size) {
        if (size < 0) throw new NegativeArraySizeException("Negative size");
        table = new ArrayList<>(size);
        table.add("GARAnt");
       table.add("Patriot");
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (String elem : table) {
            result.append("{").append(elem).append("}").append('\n');
        }
        return result.toString();

    }

    public void putElement(String elem) {
        table.add(elem);
    }

    private void allСoincidence(int count) {
        if (count == large) {

            coincidence.add(count);
        }
        if (count > large) {
            large = count;
            coincidence.clear();
            coincidence.add(count);

        }
        System.out.println(coincidence);
    }

    public int compare(String key) {
        char[] keyArray = key.toCharArray();
        int max = 0;
        for (String value : table) {
            max = 0;
            int count = 0;
            int k = 0;


            for (int i = 0; k < key.length(); i++) {
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
                            if (count == keyArray.length) return count;
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
            allСoincidence(max);
        }
        return max;
    }
}
