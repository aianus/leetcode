#include <vector>
#include <algorithm>
#include <iostream>

using namespace std;

class Solution {
public:
  void radixSortUnsigned(vector<int>::iterator begin, vector<int>::iterator end, int offset) {  
    vector<int> off, on;
    off.reserve(end - begin);
    on.reserve(end - begin);

    for (auto it = begin; it != end; it++) {
      if (*it & (1 << offset)) {
        on.push_back(*it);
      } else {
        off.push_back(*it);
      }
    }

    // cout << "OFFSET " << offset << endl;
    // cout << "INPUT SIZE " << (end - begin) << endl;
    // cout << "OFF SIZE " << off.size() << endl;
    // cout << "ON SIZE" << on.size() << endl;

    auto beginSecondHalf = copy(off.begin(), off.end(), begin);
    copy(on.begin(), on.end(), beginSecondHalf);

    off.clear();
    on.clear();
    off.shrink_to_fit();
    on.shrink_to_fit();

    if (offset >= 1) {
      if (beginSecondHalf - begin) {
        radixSortUnsigned(begin, beginSecondHalf, offset - 1);
      }
      if (end - beginSecondHalf) {
        radixSortUnsigned(beginSecondHalf, end, offset - 1);
      }
    }

    return;
  }

  void radixSortSigned(vector<int> &input) {
    vector<int> negative;
    vector<int> positive;

    for (auto num : input) {
      if (num & (1 << 31)) {
        negative.push_back(num ^ (1 << 31));
      } else {
        positive.push_back(num);
      }
    }

    radixSortUnsigned(negative.begin(), negative.end(), 30);
    radixSortUnsigned(positive.begin(), positive.end(), 30);

    for (auto it = negative.begin(); it != negative.end(); it++) {
      *it ^= (1 << 31);
    }

    auto beginSecondHalf = copy(negative.begin(), negative.end(), input.begin());
    copy(positive.begin(), positive.end(), beginSecondHalf);
  }
    
  int longestConsecutive(vector<int>& nums) {
    radixSortSigned(nums);
    
    if (nums.size() == 0) {
      return 0;
    }
    
    int currentRun = 1;
    int maxRun = 1;
    int lastNum = nums[0];
    for (int i = 1; i < nums.size(); i++) {
      if (nums[i] == nums[i-1] + 1) {
        currentRun++;
      } else if (nums[i] == nums[i-1]) {
        // no-op
      } else {
        maxRun = currentRun > maxRun ? currentRun : maxRun;
        currentRun = 1;
      }
    }
    maxRun = currentRun > maxRun ? currentRun : maxRun;
    
    return maxRun;
  }
};


int main(int argc, char **argv) {
  int input[] = {1, 2, 0, 1};
  vector<int> inputV(input, input + 4);

  cout << Solution().longestConsecutive(inputV) << endl;
}
