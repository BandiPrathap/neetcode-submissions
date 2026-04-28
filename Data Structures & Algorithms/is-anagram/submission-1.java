class Solution {

    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()) return false;

        if(s.equals(t)) return true;

        HashMap<Character,Integer> sf = new HashMap<>();
        HashMap<Character,Integer> tf = new HashMap<>();

        for(int i=0;i<s.length();i++){
            sf.put(s.charAt(i), sf.getOrDefault(s.charAt(i), 0) + 1);
            tf.put(t.charAt(i), tf.getOrDefault(t.charAt(i), 0) + 1);
        }

        return tf.equals(sf);

    }
}
