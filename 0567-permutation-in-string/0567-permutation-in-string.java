class Solution {
    boolean isfreqsame(HashMap<Character, Integer> map, HashMap<Character, Integer> mp){
        return map.equals(mp);
    }
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i=0; i<s1.length(); i++) {
            map.put(s1.charAt(i),map.getOrDefault(s1.charAt(i), 0) + 1);;
        }

        for (int i=0; i<s2.length(); i++) { //eidbaooo
            int window = 0;
            int index=i; //index=e
            HashMap<Character, Integer> mp = new HashMap<>();
            while (window<s1.length()  && index < s2.length()) {
                //window<2 && index < s2.length()
                mp.put(s2.charAt(index),mp.getOrDefault(s2.charAt(index), 0) + 1 ); //e
                index++; //i
                window++; //1
            }
            if (isfreqsame(map,mp)){
            return true;
        }
        }
        return false;

        

    }
}