class Solution {
    public List<Integer> addToArrayForm(int[] num, int K) {
        List<Integer> list = new ArrayList<Integer>();
        
        for (int i = num.length - 1; i >= 0; --i) {
            list.add(0, (num[i] + K) % 10);
            K = (num[i] + K) / 10;
        }
        while (K > 0) {
            list.add(0, K % 10);
            K /= 10;
        }
        return list;
    }
}