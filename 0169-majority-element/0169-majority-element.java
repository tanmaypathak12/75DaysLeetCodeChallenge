	import java.util.HashMap;

    	 

         	public class Solution {

            	    public int majorityElement(int[] nums) {

                    	        HashMap<Integer, Integer> counter = new HashMap<>();

                                	 

                                     	        for (int num : nums) {

                                                	            counter.put(num, counter.getOrDefault(num, 0) + 1);

                                                                	        }

                                                                            	 

                                                                                 	        int maxCount = -1;

                                                                                            	        int ans = -1;

                                                                                                        	 

                                                                                                             	        for (int key : counter.keySet()) {

                                                                                                                        	            if (counter.get(key) > maxCount) {

                                                                                                                                        	                maxCount = counter.get(key);

                                                                                                                                                            	                ans = key;

                                                                                                                                                                                	            }

                                                                                                                                                                                                	        }

                                                                                                                                                                                                            	 

                                                                                                                                                                                                                 	        return ans;

                                                                                                                                                                                                                            	    }

                                                                                                                                                                                                                                    	}