class Solution {
    public int thirdMax(int[] nums) {
        // Initialize three variables for the top 3 distinct max values
        long a = Long.MIN_VALUE, b = Long.MIN_VALUE, c = Long.MIN_VALUE;
        
        // Use a set to keep track of distinct values
        Set<Long> seen = new HashSet<>();
        
        // Iterate over the array
        for (int num : nums) {
            // Convert to long to handle Integer.MIN_VALUE properly
            long value = (long) num;
            
            // Skip if the number has already been seen
            if (seen.contains(value)) continue;
            
            // Add the number to the set of seen numbers
            seen.add(value);
            
            // Update the top 3 max values
            if (value > a) {
                c = b;
                b = a;
                a = value;
            } else if (value > b) {
                c = b;
                b = value;
            } else if (value > c) {
                c = value;
            }
        }
        
        // If we found at least 3 distinct numbers, return the third largest
        if (seen.size() >= 3) {
            return (int) c;
        }
        
        // Otherwise, return the largest number
        return (int) a;
    }
}
