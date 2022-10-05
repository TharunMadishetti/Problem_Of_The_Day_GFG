
//Problem link: https://practice.geeksforgeeks.org/problems/geek-and-strings3030/1
class TrieNode {
    char ch;
    TrieNode[] n;
    int count;

    public TrieNode(char c) {
        ch = c;
        n = new TrieNode[26];
        count = 1;
    }

    public String toString() {
        return count + " " + ch;
    }
}

class Trie {
    TrieNode r;

    public Trie() {
        r = new TrieNode('*');
    }

    public int handleQuery(String s) {
        int i = 0, ans = 0;

        TrieNode cur = r;
        if (cur.n[s.charAt(0) - 'a'] == null)
            return 0;
        while (i < s.length() && cur.n[s.charAt(i) - 'a'] != null) {
            cur = cur.n[s.charAt(i) - 'a'];
            i++;
        }
        return i == s.length() ? cur.count : 0;
    }

    public void insert(String s) {
        int i = 0;
        TrieNode cur = r;
        while (i < s.length()) {
            if (cur.n[s.charAt(i) - 'a'] == null) {
                cur.n[s.charAt(i) - 'a'] = new TrieNode(s.charAt(i));
                cur = cur.n[s.charAt(i) - 'a'];
            } else {
                cur.n[s.charAt(i) - 'a'].count++;
                // System.out.println(s.charAt(i) + " " + cur.n[s.charAt(i) - 'a'].count);
                cur = cur.n[s.charAt(i) - 'a'];
            }
            i++;
        }
    }
}
class Solution{
    static List<Integer> prefixCount(int N, int Q, String s[], String queries[])
    {
        List<Integer> l = new ArrayList<>();
        Trie t = new Trie();
        for (int i = 0; i < s.length; i++)
            t.insert(s[i]);
        for (int i = 0; i < queries.length; i++) {
            l.add(t.handleQuery(queries[i]));
        }
        // System.out.println(l);
        return l;
    }
}
