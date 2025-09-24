class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        String ans  = "";
        boolean flag = false;

        if((numerator < 0 && denominator > 0) || (numerator > 0 && denominator < 0)){
            flag = true;
        }

        long num  = Math.abs((long)numerator);
        long den  = Math.abs((long)denominator);

        System.out.println(num + " " + den);

        long c = num/den;
        ans  = ans + String.valueOf(c);

        long r = num%den;
        if(r!=0){
            ans = ans + ".";
            ans = ans + generateDenominator(r,den);
        }

        return flag ? "-" + ans : ans;
    }

    public String generateDenominator(long n, long denominator){
        Map<Long,Long> list = new HashMap<>();
        String s = "";

        while(n!=0){
            list.put(n,(long)s.length());
            
            n = n * 10;

            while(n < denominator){
                s = s + "0";
                n = n * 10;
            }

            s = s + String.valueOf(n/denominator);
            Long r = n % denominator;

            if(list.containsKey(r)){
                s = s.substring(0,list.get(r).intValue()) + "(" + s.substring(list.get(r).intValue()) + ")";
                return s;
            }

            n = r;
        }

        return s;
    }
}