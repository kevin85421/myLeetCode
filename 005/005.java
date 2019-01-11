class Solution {
    public String longestPalindrome(String s) {
        char[] array = new char[2*s.length() + 1];
        int [] longests = new int[2*s.length() + 1];
        array[2*s.length()] = '*';
        for(int i = 0; i < s.length(); i++) {
            array[2*i+1] = s.charAt(i);
            array[2*i] = '*';
        }
        Map<String,Integer> map = new HashMap<>();
        int ansIndex = 0;
        for(int i = 0; i < array.length; i++) {
            longests[i] = longestPalindromeAtIndex(i, array);
            if(longests[i] >= longests[ansIndex]){
                ansIndex = i;
            }
        }
        
        
        char[] substr = new char[longests[ansIndex]]; 
        for(int i = ansIndex - (longests[ansIndex]-1); i <= ansIndex +(longests[ansIndex]-1); i += 2){
            int j = (i - (ansIndex - (longests[ansIndex]-1)))/2;
            substr[j] = array[i];
        }
        
        String ans = new String(substr); 
        
        return ans;
    }
    
    public int longestPalindromeAtIndex(int index, char string []) {
        int LongestLength = 1;
        for(int i = 1; (index - i >= 0) && (index + i < string.length) ; i++){
            if(string[index - i] == string[index + i])
                LongestLength += 2;
            else
                break;
        } 
        
        return (LongestLength - 1)/2;
    }
}
