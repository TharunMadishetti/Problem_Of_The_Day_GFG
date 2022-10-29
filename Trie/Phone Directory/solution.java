// Problem link: https://practice.geeksforgeeks.org/problems/phone-directory4628/1
class TrieNode {
    char ch;
    TrieNode[] n;
    boolean end;

    public TrieNode(char c) {
        ch = c;
        n = new TrieNode[26];
        end = false;
    }
}

class Trie {
    TrieNode r;

    public Trie(String[] c) {
        r = new TrieNode('*');
        for (int i = 0; i < c.length; i++) {
            insert(c[i]);
        }
    }

    public TrieNode handleQuery(String s) {
        int i = 0;
        if (s.length() == 0)
            return null;
        TrieNode cur = r;
        if (cur.n[s.charAt(0) - 'a'] == null)
            return null;
        while (i < s.length() && cur.n[s.charAt(i) - 'a'] != null) {
            cur = cur.n[s.charAt(i) - 'a'];
            i++;
        }
        if (i == s.length())
            return cur;
        return null;
    }

    public ArrayList<String> getString(TrieNode c, String s) {
        ArrayList<String> l = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            if (c.n[i] != null) {
                if (c.n[i].end)
                    l.add(s + (char) (i + 'a'));
                l.addAll(getString(c.n[i], s + (char) (i + 'a')));
            }
        }
        return l;
    }

    public void insert(String s) {
        int i = 0;
        TrieNode cur = r;
        while (i < s.length()) {
            if (cur.n[s.charAt(i) - 'a'] == null) {
                cur.n[s.charAt(i) - 'a'] = new TrieNode(s.charAt(i));
                if (i == s.length() - 1)
                    cur.n[s.charAt(i) - 'a'].end = true;
                cur = cur.n[s.charAt(i) - 'a'];
            } else {
                if (i == s.length() - 1)
                    cur.n[s.charAt(i) - 'a'].end = true;
                cur = cur.n[s.charAt(i) - 'a'];
            }
            i++;
        }
    }
}

class Solution{
    static ArrayList<ArrayList<String>> displayContacts(int n, String c[], String s) {
        // code here
        ArrayList<ArrayList<String>> l = new ArrayList<>();
        Trie t = new Trie(c);
        TrieNode node;
        // if (node != null)
        // l.add(t.getString(node, "geei"));
        node = t.handleQuery(s.substring(0, 1));
        if (node != null)
            l.add(t.getString(node, s.substring(0, 1)));
        else {
            ArrayList<String> ll = new ArrayList<>();
            ll.add("0");
            l.add(ll);
        }
        ArrayList<String> prev = l.get(0);
        for (int i = 2; i <= s.length(); i++) {
            ArrayList<String> cur = new ArrayList<>();
            for (String str : prev) {
                if (str.startsWith(s.substring(0, i)))
                    cur.add(str);
            }
            if(cur.size()==0)
            cur.add("0");
            l.add(cur);
            prev = cur;
        }
        return l;
    }
}
