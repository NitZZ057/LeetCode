class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();

        while(true){
            set.add(n);
            n = addDigitSquare(n);

            if(n==1) return true;

            if(set.contains(n)) return false;
        }
    }

    public int addDigitSquare(int n){
        int sum = 0;

        while(n!=0){
            int x = n%10;
            n = n/10;

            sum += (x*x);
        }

        return sum;
    }
}