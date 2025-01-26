class LargestInteger {
    public static void main(String[] args) {
        // int largest = Integer.MIN_VALUE;
        int largest = 0;
        boolean hasValidInteger = false;

        for (String arg : args) {
            try {
                int number = Integer.parseInt(arg);
                // largest = Math.max(largest, number);
                if (number > largest)
                    largest = number;
                hasValidInteger = true;
            } catch (NumberFormatException e) {
                System.err.println("Error: Invalid input: " + arg);
            }
        }

        if (hasValidInteger) {
            System.out.println("The largest integer is: " + largest);
        } else {
            System.out.println("Error: No valid integers were provided.");
        }
    }
}