class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> str=new ArrayList<>();
        String prev="";
        for(String word:words){
            char[] c=word.toCharArray();
            Arrays.sort(c);
            String string=new String(c);
            if(!string.equals(prev)){
                str.add(word);
                prev=string;
            }
        }
        return str;
    }
}