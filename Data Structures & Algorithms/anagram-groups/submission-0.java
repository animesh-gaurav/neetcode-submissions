class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

       List<List<String>> result = new ArrayList<>();
        Map<String, List<Integer>> map = new HashMap<>();
        for(int i=0;i<strs.length;i++) {
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            List<Integer> list = new ArrayList<>();
            list.add(i);
            if (map.containsKey(key)) {
                List<Integer> posList = map.get(key);
                posList.add(i);
                map.put(key, posList);
            } else {
                map.put(key, list);
            }
        }
            for(Map.Entry<String, List<Integer>> entry :  map.entrySet()){
                List<Integer> intList = map.get(entry.getKey());
                List<String> stringList = new ArrayList<>();
                intList.stream().forEach(index -> {stringList.add(strs[index]);});
                result.add(stringList);
            }
        return result;
}
}
