class Solution {
    public int romanToInt(String s) {

        // Step 1: map roman chars to values
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int total = 0;

        // Step 2: loop through each char
        for (int i = 0; i < s.length(); i++) {
            int curr = map.get(s.charAt(i));

            // Step 3: check next char (if exists)
            if (i + 1 < s.length()) {
                int next = map.get(s.charAt(i + 1));

                // If current is smaller than next → subtract
                if (curr < next) {
                    total -= curr;
                    continue;  // skip adding below
                }
            }

            // Step 4: else add it normally
            total += curr;
        }

        return total;
    }
}
