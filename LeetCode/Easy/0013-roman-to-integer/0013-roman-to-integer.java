class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        int i = 0;

        while (i < s.length()) {
            // Check if we can peek the next character to form pairs like IV, IX, etc.
            if (i + 1 < s.length()) {
                String tmp = "" + s.charAt(i) + s.charAt(i + 1);

                if (tmp.equals("IV")) {
                    sum += 4;
                    i += 2;
                    continue;
                } else if (tmp.equals("IX")) {
                    sum += 9;
                    i += 2;
                    continue;
                } else if (tmp.equals("XL")) {
                    sum += 40;
                    i += 2;
                    continue;
                } else if (tmp.equals("XC")) {
                    sum += 90;
                    i += 2;
                    continue;
                } else if (tmp.equals("CD")) {
                    sum += 400;
                    i += 2;
                    continue;
                } else if (tmp.equals("CM")) {
                    sum += 900;
                    i += 2;
                    continue;
                }
            }

            // If no special pair found, process single character
            switch (s.charAt(i)) {
                case 'I': sum += 1; break;
                case 'V': sum += 5; break;
                case 'X': sum += 10; break;
                case 'L': sum += 50; break;
                case 'C': sum += 100; break;
                case 'D': sum += 500; break;
                case 'M': sum += 1000; break;
            }
            i++;
        }
        return sum;
    }
}