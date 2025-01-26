/*
 *Write a JAVA program that accepts any number of integer values from the user using command line arguments 
 * and returs the largest value among them. If no valid integers are provided, the program should print 
 * an appropriate error message.
*/
class Assignment_8 // Real class name: LargestInteger
{
    public static void main(String[] args) 
    {
        //int largest = Integer.MIN_VALUE;
	    int largest = 4;
        boolean hasValidInteger = false;

        for (String arg : args) 
        {
            try 
            {
                int number = Integer.parseInt(arg);
                //largest = Math.max(largest, number);
		        if(number > largest)
			        largest = number;
                hasValidInteger = true;
            } 
            catch (NumberFormatException e) 
            {
                System.err.println("Error: Invalid input: " + arg);
            }
        }

        if (hasValidInteger) 
        {
            System.out.println("The largest integer is: " + largest);
        } 
        else 
        {
            System.out.println("Error: No valid integers were provided.");
        }
    }
}