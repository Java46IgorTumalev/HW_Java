package telran.text;

public class Strings {

	/**
	 *  //
	 * @param str1 ascii string with no repeated symbols
	 * @param str2 ascii string with no repeated symbols
	 * @return array with two numbers
	 *    first - number of the symbols of the str2 that exist in str1 at the same indexes
	 *    second - number of the symbols of the str2 that exist in str1 at different indexes
	 */
		public static int[] deepNoRepeatedCompare(String str1, String str2) {
		//TODO
			//Two implementation hints
			//   first: additional helper array such that array['a'] 
			//          is an index of the symbol 'a' in str1 or -1
			//          example, str1 - "ctab" then array['a'] = 2;
			// ************************************************
			//   second: implementation based on the method indexOf
			int res[] = new int[2];
			implementHelper(str1, str2, res);
			
		return res;
	}
		private static void implementHelper(String str1, String str2, int[] res) {
		int helper[] = new int[127];
		fillInitHelper(helper);
		fillHelperString1(str1, helper);
		fillResult(helper, res, str2);
		
	}
		private static void fillResult(int[] helper, int[] res, String str2) {
			char str2Ar[] = str2.toCharArray();
			for(int i=0; i < str2Ar.length; i++) {
				int index = helper[str2Ar[i]];
				if(index >= 0) {
					res[index == i ? 0 : 1]++;
				}
			}
			
		}
		private static void fillHelperString1(String str1, int[] helper) {
			char str1Ar[] = str1.toCharArray();
			for (int i = 0; i < str1Ar.length; i++) {
				helper[str1Ar[i]] = i;
			}
			
		}
		private static void fillInitHelper(int[] helper) {
			for(int i = 0; i < helper.length; i++) {
				helper[i] = -1;
			}
			
		}
		/**
		 * 
		 * @param str1 English letters (may have repeats)
		 * @param str2 English letters (may have repeats)
		 * @return true if :
		 *     (1) str2 has the same as str1 length
		 *     (2) str2 comprises of all letters from str1
		 */
		public static boolean isAnagram(String str1, String str2) {
			
			if(str1.length() != str2.length()) {
				return false;
			}
			int[] helper = new int[127];
			fillHelperOccurrences(str1, helper);
			return isAnagram(str2, helper);
		}
		private static void fillHelperOccurrences(String str, int[] helper) {
			char[] strAr = str.toCharArray();
			for(int i = 0; i < strAr.length; i++) {
				helper[strAr[i]]++;
			}
			
		}
		private static boolean isAnagram(String str, int[] helper) {
			char[] strAr = str.toCharArray();
			for(int i = 0; i < strAr.length;i++) {
				int count = helper[strAr[i]]--;
				if(count == 0) {
					return false;
				}
			}
			return true;
		}
}
			
		
		 

		 


		
	