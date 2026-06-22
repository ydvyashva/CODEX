class Solution {
public:
    int areaOfMaxDiagonal(vector<vector<int>>& dimensions) {

        long long maxDiag = 0;
        int maxArea = 0;

        for (auto &d : dimensions) {

            long long l = d[0];
            long long w = d[1];

            long long diag = l * l + w * w;
            int area = l * w;

            if (diag > maxDiag) {
                maxDiag = diag;
                maxArea = area;
            }
            else if (diag == maxDiag) {
                maxArea = max(maxArea, area);
            }
        }

        return maxArea;
    }
};