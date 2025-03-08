import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class collection_prac {
    public static void main(String a[]) {
        Collection<Integer> nums = new ArrayList<Integer>();// collection work not with index values
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        System.out.println(nums);
        for (int n : nums) {
            System.out.println(n);
        }
        List<Integer> nub = new ArrayList<Integer>();
        nub.add(2);
        nub.add(2);
        nub.add(7);
        nub.add(20);
        nub.add(21);
        nub.add(22);

        System.out.println(nub);
        System.out.println(nub.get(2));
        System.out.println(nub.indexOf(20));

        Set<Integer> s = new HashSet<Integer>();
        Set<Integer> s1 = new TreeSet<Integer>();
        s.add(2);
        s.add(2);
        s.add(8);
        s.add(5);
        s.add(2);
        s1.add(5);
        s1.add(78);
        System.out.println(s);
        System.out.println(s1);
    }

}
