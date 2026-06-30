import java.util.*;
class Solution {
    public int solution(int a, int b, int c, int d) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(a, map.getOrDefault(a, 0) + 1);
        map.put(b, map.getOrDefault(b, 0) + 1);
        map.put(c, map.getOrDefault(c, 0) + 1);
        map.put(d, map.getOrDefault(d, 0) + 1);
        if (map.size() == 1) {
            return 1111 * a;
        }
        if (map.size() == 2) {
            int p = 0, q = 0;
            int cntP = 0, cntQ = 0;

            int idx = 0;
            for (int key : map.keySet()) {
                if (idx == 0) {
                    p = key;
                    cntP = map.get(key);
                } else {
                    q = key;
                    cntQ = map.get(key);
                }
                idx++;
            }
            if (cntP == 3 || cntQ == 3) {
                if (cntQ == 3) {
                    int temp = p;
                    p = q;
                    q = temp;
                }
                return (10 * p + q) * (10 * p + q);
            }
            return (p + q) * Math.abs(p - q);
        }
        if (map.size() == 3) {
            int q = 1, r = 1;
            for (int key : map.keySet()) {
                if (map.get(key) == 1) {
                    q *= key;
                }
            }
            return q;
        }
        return Math.min(Math.min(a, b), Math.min(c, d));
    }
}