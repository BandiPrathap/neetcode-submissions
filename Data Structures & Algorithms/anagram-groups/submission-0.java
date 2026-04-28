class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> gws =  new HashMap<>();

        for(String s:strs){
            char[] ch = s.toCharArray();
            Arrays.sort(ch);

            String sort_s = new String(ch);

            gws.putIfAbsent(sort_s, new ArrayList<>());
            gws.get(sort_s).add(s);
        }

        return new ArrayList<>(gws.values());
    }
}