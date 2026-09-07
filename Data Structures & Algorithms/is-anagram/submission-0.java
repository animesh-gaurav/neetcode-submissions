class Solution {
    public static boolean isAnagram(String s, String t) {
        char[] sc = s.toCharArray();
        char[] tc = t.toCharArray();
        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();
        if (sc.length != tc.length) {
            return false;
        }
            for (int i = 0; i < sc.length; i++) {
                sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i), 0) + 1);
                tMap.put(t.charAt(i), tMap.getOrDefault(t.charAt(i), 0) + 1);
            }
        return sMap.equals(tMap);
}
}