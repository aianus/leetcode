#include <vector>
#include <limits>
#include <iostream>

using namespace std;

class Solution {
public:
    long adjustment_factor = numeric_limits<int>::max();    
    
    inline size_t intToIndex(long num) {
        return num + adjustment_factor;
    }
    
    int longestConsecutive(vector<int>& nums) {
        if (nums.size() == 0) {
            return 0;
        }
        
        int smallestInt = nums[0];
        int largestInt = nums[0];
        
        for (auto it = nums.begin(); it != nums.end(); it++) {
            smallestInt = *it < smallestInt ? *it : smallestInt;
            largestInt = *it > largestInt ? *it : largestInt;
        }
        adjustment_factor = 0 - smallestInt;
        
        vector<bool> *bitSet = new vector<bool>(largestInt - smallestInt + 1, false);
        
        for (auto it = nums.begin(); it != nums.end(); it++) {
            bitSet->at(intToIndex(*it)) = true;
        }
        
        unsigned int maxRun = 0;
        unsigned int currentRun = 0;
        for (auto it = bitSet->begin(); it != bitSet->end(); it++) {
            if (*it) {
                currentRun++;
            } else if (currentRun > 0) {
                maxRun = currentRun > maxRun ? currentRun : maxRun;
                currentRun = 0;
            }
        }
        
        return maxRun;
    }
};

int main(int argc, char **argv) {
  int input[] = {100, 4, 200, 1, 3, 2};

  vector<int> inputVector(input, input + 6);

  cout << Solution().longestConsecutive(inputVector);
}
