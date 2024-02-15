package practice.test;

public class GroupWork {

	/**
	 * Extracts the value of a url's query parameter given a url. Note: A url can
	 * contain a list of key-value pairs in the format
	 * {@literal https://www.domain.com/page?key1=value1&key2=value2}
	 * 
	 * Assumes that there is only one {@literal ?} in the url String and the
	 * key-value pairs are always separated by {@literal &}. A key might be present
	 * but not have a value such as in:
	 * {@literal https://www.domain.com/page?key1=&key2=value2} in which case an
	 * empty String is returned.
	 * 
	 * @param url a url containing query parameters
	 * @param key the name of the url's query parameter to grab the value from
	 * @return String containing the value or null if the key is not present.
	 * 
	 * @author Team _____________
	 * 
	 * @throws NullPointerException     if the url or key are null
	 * @throws IllegalArgumentException the key is empty, the key handed in contains
	 *                                  an illegal character Illegal characters are:
	 *                                  {@literal ";", "/", "?", ":", "@", "&", "=", "+", ",", and "$"}
	 */
	public static String getQueryParameterValue(String url, String key) {
		return null;
	}
	
	/**
	 * Method that takes in a string and changes the capitalization to be title-case as defined 
	 * <a href="https://apastyle.apa.org/style-grammar-guidelines/capitalization/title-case">here</a>
	 * In title case, major words are capitalized, and minor words (3 letters or less) are lower-cased.
	 * 
	 * Title case, capitalizes the following words in a title or heading:
	 * - the first word of the title or heading, even if it is a minor word such as “The” or “A”
	 * - the first word of a subtitle
	 * - the first word after a colon, em dash, or end punctuation in a heading
	 * - major words, including the second part of hyphenated major words 
	 *   (e.g., “Self-Report,” not “Self-report”)
	 * - words of four letters or more (e.g., “With,” “Between,” “From”)
	 * 
	 * Lowercase only minor words that are three letters or fewer in a title or heading 
	 * (except the first word in a title or subtitle or the first word after a colon, em dash, 
	 * or end punctuation in a heading)
	 * - short conjunctions (e.g., “and,” “as,” “but,” “for,” “if,” “nor,” “or,” “so,” “yet”)
	 * - articles (“a,” “an,” “the”)
	 * - short prepositions (e.g., “as,” “at,” “by,” “for,” “in,” “of,” “off,” “on,” “per,” “to,” “up,” “via”)
	 * 
	 * @author Team _______________
	 * 
	 * @param rawString 
	 * @return The original string with the capitalization changed to title-case 
	 * 
	 * @throws IllegalArgumentException if str is null
	 */
	public static String titleCase(String str) {
		if (str == null || str.trim().length() == 0) {
			return "";
		}
		
		String rawString = str;
		
		String[] strArr = {"and", "as", "but", "for", "if", "nor", "or", "so", "yet",
						   "a", "an", "the",
						   "as", "at", "by", "in", "of", "off", "on", "per", "to", "up", "via"};
		String[] splitString = rawString.split(" ");
		
		for(int i = 0; i < splitString.length; i++) {
			String firstLetter = splitString[i].substring(0, 1).toUpperCase();
			String restOfWord = splitString[i].substring(1, splitString[i].length()).toLowerCase();
			splitString[i] = firstLetter + restOfWord;
			
			for(String lowerCaseWord : strArr) {
				if(splitString[i].equalsIgnoreCase(lowerCaseWord)) {
					splitString[i] = splitString[i].toLowerCase();
				}
			}
		}
		
		rawString = "";
		for(String word : splitString) {
			rawString = rawString + word + " ";
		}
		rawString = rawString.trim();
		
		splitString = rawString.split("-");
		for(int i = 0; i < splitString.length; i++) {
			String firstLetter = splitString[i].substring(0, 1).toUpperCase();
			String restOfWord = splitString[i].substring(1, splitString[i].length());
			splitString[i] = firstLetter + restOfWord;
		}
		
		rawString = "";
		for(String word : splitString) {
			rawString = rawString + word + "-";
		}
		rawString = rawString.substring(0, rawString.length()-1);
		
		//COLON
		splitString = rawString.split(": ");
		for(int i = 0; i < splitString.length; i++) {
			String firstLetter = splitString[i].substring(0, 1).toUpperCase();
			String restOfWord = splitString[i].substring(1, splitString[i].length());
			splitString[i] = firstLetter + restOfWord;
		}
		
		rawString = "";
		for(String word : splitString) {
			rawString = rawString + word + ": ";
		}
		rawString = rawString.substring(0, rawString.length()-2);
		
		return rawString;
	}
}
