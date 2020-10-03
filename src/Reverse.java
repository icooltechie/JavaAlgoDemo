
public class Reverse {

	/**
	 * 
	 * Swaps 'words' in v (text separated by spaces) unless
	 * 
	 * the swapped version is identical - in which case it returns null
	 * 
	 */
	public static String reverseWords(String v) {
		
		/*
		 * if(v == null || v.isEmpty() || !v.contains(" ")) return v;
		 */
		String[] strings = v.split("\\s+");
		String result = "";
		for (String string : strings) {
			result = string + " " + result;
		}
		result=result.trim();
	
		if (result.equals(v))
			return null;
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(reverseWords("A B C"));
	}

}
