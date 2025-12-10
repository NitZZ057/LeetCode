import java.util.*;

public class Solution {
    public int thirdMax(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());

        for (int num : nums) {
            set.add(num);
        }

        if (set.size() < 3) {
            return set.first();
        }

        Iterator<Integer> iterator = set.iterator();
        int count = 0;
        int thirdMax = 0;
        
        // Iterate to the third largest element
        while (iterator.hasNext()) {
            thirdMax = iterator.next();
            count++;
            if (count == 3) {
                break;
            }
        }

        return thirdMax;
    }
}
