class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        int[] max = new int[26]; 
        for (String B : words2) {
            int[] bcount = countfreq(B);
            for (int i = 0; i < 26; i++) {
                max[i] = Math.max(max[i], bcount[i]);
            }
        }
        List<String> res = new ArrayList<>(); 
        for (String A : words1) {
            int[] acount = countfreq(A);
            boolean isUniversal = true;
            for (int i = 0; i < 26; ++i) {
                if (acount[i] < max[i]) {
                    isUniversal = false;
                    break;
                }
            }
            if (isUniversal) {
                res.add(A);
            }
        }
        return res;
    }
    public int[] countfreq(String word) {
        int[] count = new int[26];
        for (char c : word.toCharArray()) { // Fixed variable name
            count[c - 'a']++;
        }
        return count;
    }
}