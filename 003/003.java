class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0)
            return 0;
        int ans = 1;
        int start = 0;
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c) && map.get(c) >= start)
                start = map.get(c) + 1;
            else
                ans = Math.max(ans, i - start + 1);
            map.put(c,i);
        }
        
        return ans;
    }
}
