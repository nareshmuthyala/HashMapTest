import java.util.Comparator;

/**
 * Created by Naresh on 22 January 2017.
 */
public class MyComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        String first = (String) o1;
        String second = (String) o2;

        return first.compareTo(second);
    }
}
