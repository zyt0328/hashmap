//Leetcode 242 有效字母异味词
class Solution {
    public boolean isAnagram(String s, String t) {
        int[] records = new int[26];
        for(char c: s.toCharArray()){
            records[c-'a'] += 1;
        }
        for(char c: t.toCharArray()){
            records[c-'a'] -= 1;
        }
        for(int a: records){
            if( a != 0){
                return false;
            }
        }
        
        
        return true;
    }
}
