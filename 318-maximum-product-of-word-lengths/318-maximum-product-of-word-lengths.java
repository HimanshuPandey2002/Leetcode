class Solution {
    public int maxProduct(String[] words) {
        int res = 0, max = (1 << 26) - 1;
        int mask[] = new int[words.length];

        for(int i = 0; i < words.length; i++)
            for(char c : words[i].toCharArray()){
                mask[i] |= (1 << (c - 'a'));
                if(mask[i] == max) break;
            }

        for(int i = 0; i < words.length - 1; i++){
            if(mask[i] == max) continue;//pruning
            for(int j = i + 1; j < words.length; j++)
                if((mask[i] & mask[j]) == 0)
                    res = Math.max(res, words[i].length() * words[j].length());
        }
        return res;
    }
}