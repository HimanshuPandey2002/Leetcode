class Solution {
public:
    bool searchMatrix(vector<vector<int>>& mat, int target) {
        if(!mat.size()) return false;
        int m=mat[0].size();
        int n=mat.size();
        int lo=0;
        int hi=(m*n)-1;
        
        while(lo <= hi){
            int mid = (lo + (hi - lo)/2);
            if(mat[mid / m][mid % m] == target) return true;
            if(mat[mid / m][mid % m] < target) lo = mid+1;
            else hi = mid-1;
        }
        return false;
    }
};