//LeetCode 49 
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0) {
            return new ArrayList<List<String>>();
        }
        HashMap<String, List<String>> map = new HashMap<>();
        for(String s : strs) {
            char c[] = s.toCharArray();
            Arrays.sort(c);
            String grpStr = String.valueOf(c);
            if(!map.containsKey(grpStr)) {
                map.put(grpStr, new ArrayList<>());
            }
            map.get(grpStr).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
