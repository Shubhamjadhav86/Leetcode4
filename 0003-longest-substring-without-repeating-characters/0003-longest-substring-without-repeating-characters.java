class Solution {
    public static int lengthOfLongestSubstring(String s) {
        // declare maxLen
        // declare start
        int maxLen = 0;
        int start = 0;
        int[] lastIndex = new int[128]; // For ASCII characters
        for (int i = 0; i < 128; i++) lastIndex[i] = -1;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (lastIndex[c] >= start) {
                start = lastIndex[c] + 1;
            }
            lastIndex[c] = i;
            maxLen = Math.max(maxLen, i - start + 1);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
