package edu.gatech.oad.antlab.person;

/**
 *  A simple class for person 5
 *  returns their name and a
 *  modified string 
 *  
 *  @author Jontae Greene
 *  @version 1.2
 */
public class Person5 {
  /** Holds the persons real name */
  private String name;
  	/**
	 * The constructor, takes in the persons
	 * name
	 * @param pname the person's real name
	 */
  public Person5(String pname) {
    name = pname;
  }
  	/**
	 * This method should take the string
	 * input and return its characters rotated
	 * 2 positions.
	 * given "gtg123b" it should return
	 * "g123bgt".
	 *
	 * @param input the string to be modified
	 * @return the modified string
	 */
	private String calc(String input) {
		String formattedInput = "";
		char[] conversionArray = input.toCharArray();
		char[] formattedArray = new char[conversionArray.length];
		for (int i = 0; i < conversionArray.length; i++) {
			if (i - 2 == -2) {
				formattedArray[conversionArray.length - 2] = conversionArray[i];
			} else if (i - 2 == -1) {
				formattedArray[conversionArray.length - 1] = conversionArray[i];
			} else {
				formattedArray[i - 2] = conversionArray[i];
			}
		}
		for (char c : formattedArray) {
			formattedInput += Character.toString(c);
		}
	  return formatedInput;
	}
	
	/**
	 * Return a string rep of this object
	 * that varies with an input string
	 *
	 * @param input the varying string
	 * @return the string representing the 
	 *         object
	 */
	public String toString(String input) {
	  return name + calc(input);
	}

}
