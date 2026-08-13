class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        List<List<String>> ans = new ArrayList<>();

        for (String s: strs) {
            String word = s;
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            if (map.containsKey(key)) {
                map.get(key).add(word);
            }
            else{
                List<String> list = new ArrayList<>();
            list.add(word);
            map.put(key, list);

            }
            
        }
        for (List<String> list : map.values()) {
            ans.add(list);
        }

        return ans;
    }
}