import java.util.*;
/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int MinIndex = Integer.MAX_VALUE; 
        for (int j = 0; j < mountainArr.length(); j++) {
            if (mountainArr.get(j) == target) {
                MinIndex = Math.min(j, MinIndex); 
            }
        }
        return MinIndex == Integer.MAX_VALUE ? -1 : MinIndex; 
        
    }
}
