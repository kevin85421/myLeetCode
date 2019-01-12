class Solution {
    public int romanToInt(String s) {
        int [] array = new int[s.length()];
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'I')
                array[i] = 1;
            else if(s.charAt(i) == 'V')
                array[i] = 5;
            else if(s.charAt(i) == 'X')
                array[i] = 10;
            else if(s.charAt(i) == 'L')
                array[i] = 50;
            else if(s.charAt(i) == 'C')
                array[i] = 100;
            else if(s.charAt(i) == 'D')
                array[i] = 500;
            else if(s.charAt(i) == 'M')
                array[i] = 1000;
        }
        int ans = array[array.length - 1];
        for(int i = 0; i < array.length - 1; i++) {
            if(array[i] >= array[i+1])
                ans += array[i];
            else
                ans -= array[i];
        }
        return ans;
    }
}
