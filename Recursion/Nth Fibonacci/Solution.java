class Solution {
    public int fib(int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        return calculateNumber(map, n);
    }

    private int calculateNumber(HashMap<Integer, Integer> map, int n){
        if(n==0 || n==1) return n;
        int key = n;
        if(map.containsKey(key)){
            return map.get(key);
        }
        int preOne = calculateNumber(map, n-1);
        int preTwo = calculateNumber(map, n-2);

        int result = preOne+preTwo;
        map.put(key, result);
        return result;
    }
}
