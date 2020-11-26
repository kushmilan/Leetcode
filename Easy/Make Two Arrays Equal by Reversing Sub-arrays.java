class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < target.length; i++){
            if(!map.containsKey(target[i])) map.put(target[i], 1);
            else map.put(target[i], map.get(target[i]) + 1);
        }
        for(int i = 0; i < target.length; i++){
            if(!map.containsKey(arr[i])) return false;
            else map.put(arr[i], map.get(arr[i]) - 1);
        }
        for(Map.Entry<Integer, Integer> element : map.entrySet()) if(element.getValue() != 0) return false;
        return true;
    }
}

--------------------------------------------------------------------------------------------------------------------------------