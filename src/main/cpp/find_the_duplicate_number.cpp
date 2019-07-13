#include <vector>
#include <iostream>

using namespace std;

class Solution {
public:
    int findDuplicate(vector<int>& nums) {
        int N = nums.size() - 1;
        int xorThing = expectedXor(N);

        for (int i = 0; i <= nums.size(); ++i) {
            xorThing ^= i;
        }

        // dup xor missing1
        // dup xor missing1 xor dup2 xor missing2 = missing1 xor missing2
    }

    int expectedXor(int n) {
        int derp = 0;
        for (int i = 0; i <= n; ++i) {
            derp ^= i;
        }
        return derp;
    }
};

int main(int argc, char **argv) {
    int input[] = {1,3,4,2,2};
    vector<int> inputV(input, input + 5);

    cout << "wtf" << endl;
    cout << (2 ^ 2) << endl;
    cout << (4 ^ 2 ^ 2) << endl;
    cout << (3 ^ 4 ^ 2 ^ 2) << endl;
    cout << (1 ^ 3 ^ 4 ^ 2 ^ 2) << endl;

    cout << Solution().findDuplicate(inputV) << endl;
}


// dup xor missing1
// dup xor missing1 xor dup2 xor missing2 = missing1 xor missing2

// dup ^ n xor missing1 xor missing2 xor ...
