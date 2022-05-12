//LeetCode 438
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        int cntMatch = 0;
        int[] pMap = new int[256];
        for (char c : p.toCharArray()) {
            pMap[c]++;
        }
        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            //System.out.printf("right = %d \n", right);
            //System.out.printf("left = %d \n", left);
            
            char sChar = s.charAt(right);
            //System.out.printf("sChar at right= %s \n", sChar);
            //System.out.printf("countMatch = %d \n", cntMatch);
            //System.out.printf("pMap[sChar] at right = %d \n", pMap[sChar]);
            
            pMap[sChar]--;
            //System.out.printf("pMap[sChar] at right = %d \n", pMap[sChar]);
            if (pMap[sChar] + 1 > 0) {
                cntMatch++;
            }
            //System.out.printf("countMatch = %d \n", cntMatch);
            while (cntMatch == p.length()) {
                //System.out.println("get in");
                if (right - left + 1 == p.length()) {
                    result.add(left);
                }
                sChar = s.charAt(left);
                //System.out.printf("sChar at left= %s \n", sChar);
                //System.out.printf("pMap[sChar] at left = %d \n", pMap[sChar]);
                pMap[sChar]++;
                //System.out.printf("pMap[sChar] at left = %d \n", pMap[sChar]);
                if (pMap[sChar] - 1 >= 0) {
                    cntMatch--;
                }
                left++;
            }
            //System.out.printf("countMatch = %d \n", cntMatch);
            //System.out.printf("left = %d \n", left);
            //System.out.println();
        }
        return result;
    }
}
