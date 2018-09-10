package SP2.Lab1;

import java.util.ArrayList;

public class Table {


    ArrayList<String> table;

    public Table(int size) {
        if (size < 0) throw new NegativeArraySizeException("Negative size");
        table = new ArrayList<>(size);
        table.add("GARAnt");
//        table.add("Patriot");
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (String elem : table) {
            result.append(elem).append('\n');
        }
        return result.toString();

    }

    public void putElement(String elem) {
        table.add(elem);
    }


    public int compare(String key) {
        char[] keyArray = key.toCharArray();
        int max = 0;
        int count = 0;
        int k = 0;
        for (String value : table) {

        for (int i = 0; k < key.length(); i++) {
                char[] valueArray = value.toCharArray();
                for (int j = 0; j < valueArray.length ; j++) {
                    {
                        char ke = keyArray[k];
                        char va = valueArray[j];
                        if (ke == va) {
                            count++;
                            k++;
                            if(k==key.length()){if (count > max) max = count;}
                            if (count == keyArray.length) return count;
                        } else {
                            if (count > max) max = count;
                            if (count != 0) {
                                j = j +1  - count;
                                if (j<0 )j=0;
                                k--;
                            }
                            if (count > max) max = count;
                            count = 0;
                        }
                    }
                }
                k++;
            }
        }
        return max;
    }
}
