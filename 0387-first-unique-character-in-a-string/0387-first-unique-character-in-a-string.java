class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer>charcount=new HashMap<>();
        for(char c:s.toCharArray()){
            charcount.put(c,charcount.getOrDefault(c,0)+1);
        }
        for(int i=0;i<s.length();i++){
           if(charcount.get(s.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }
}