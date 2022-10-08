
//User function Template for Java

class Solution {
    static int countOfSubstrings(String s, int k) {
        HashMap<Character, Integer> h = new HashMap<>();
        int ans = 0, i = 0;
        while (i < k)
            h.put(s.charAt(i), h.getOrDefault(s.charAt(i++), 0) + 1);
        while (i < s.length()) {
            if (h.size() == k - 1)
                ans++;
            // System.out.println(h);
            h.put(s.charAt(i - k), h.get(s.charAt(i - k)) - 1);
            if (h.get(s.charAt(i - k)) == 0)
                h.remove(s.charAt(i - k));
            h.put(s.charAt(i), h.getOrDefault(s.charAt(i), 0) + 1);
            i++;
        }
        if (h.size() == k - 1)
            ans++;
        return ans;
    }
};
