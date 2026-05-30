import java.util.Scanner;
public class Main {
    // Level 1
    public static void levelOne(int[][] twoDArray) {
        // Makes a copy of array so original data is not damaged
        int[][] copyOfArray = new int[twoDArray.length][twoDArray[0].length];
        // Insert values
        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray[i].length; j++) {
                copyOfArray[i][j] = twoDArray[i][j];
            }
        }
        // Loops the rows of the array
        for (int i = 0; i < copyOfArray.length; i++) {
            // Loops the columns of the array
            for (int j = 0; j < copyOfArray[i].length; j++) {
                // If the position is divisible by 5
                if (copyOfArray[i][j] % 5 == 0) {
                    // Divide the value at the position by 5
                    copyOfArray[i][j] = copyOfArray[i][j] / 5;
                }
            }
        }
        System.out.println("Lvl. 1:");
        // Row counter
        int n = 0;
        // Column counter
        int k = 0;
        while (n != twoDArray.length) {
            // Loops the row
            while (k != copyOfArray[n].length) {
                // Prints the value of the position
                System.out.print(copyOfArray[n][k] + " ");
                // Increases column
                k++;
            }
            // Resets column back to 0
            k = 0;
            // Increases row
            n++;
            System.out.println();
        }
        System.out.println();
    }
    // Level 2
    public static void levelTwo(int[][] twoDArray) {
        // Makes a copy of array so original data is not damaged
        int[][] copyOfArray = new int[twoDArray.length][twoDArray[0].length];
        // Insert values
        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray[i].length; j++) {
                copyOfArray[i][j] = twoDArray[i][j];
            }
        }
        String[][] stringTwoDArray = new String[copyOfArray.length][copyOfArray[0].length];
        // Loops through the rows of array
        for (int i = 0; i < copyOfArray.length; i++) {
            // Loops through the columns of the array
            for (int j = 0; j < copyOfArray[0].length; j++) {
                // Converts the value of an array position to a String (to check for same characters)
                String temp = Integer.toString(copyOfArray[i][j]);
                // Tracks if there are repeating characters or not
                boolean isRepeating = true;
                // Loops through the String
                for (int m = 1; m < temp.length(); m++) {
                    // If there's no repeating characters
                    if (temp.charAt(m) != temp.charAt(0)) {
                        isRepeating = false;
                        break;
                    }
                }
                // If isRepeating = true
                if (isRepeating) {
                    // Makes the String only the first character (index 0)
                    stringTwoDArray[i][j] = "" + temp.charAt(0);
                } else {
                    // If there's no repeating characters, set it to the original
                    stringTwoDArray[i][j] = temp;
                }
            }
        }
        System.out.println("Lvl. 2:");
        // Row counter
        int n = 0;
        // Column counter
        int k = 0;
        // Loop through rows
        while (n < stringTwoDArray.length) {
            // Loop through columns
            while (k < stringTwoDArray[n].length) {
                // Print the value of the position
                System.out.print(stringTwoDArray[n][k] + " ");
                // Increase column
                k++;
            }
            // Reset column back to 0
            k = 0;
            // Increase row
            n++;
            // blank line (for readability purposes)
            System.out.println();
        }
        System.out.println();
    }
    // Level 3
    public static void levelThree(int[][] twoDArray) {
        // Makes a copy of array so original data is not damaged
        int[][] copyOfArray = new int[twoDArray.length][twoDArray[0].length];
        // Insert values
        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray[i].length; j++) {
                copyOfArray[i][j] = twoDArray[i][j];
            }
        }
        // String 2D array to store the int 2D array as Strings
        String[][] stringTwoDArray = new String[copyOfArray.length][copyOfArray[0].length];
        // Loop through the rows
        for (int i = 0; i < copyOfArray.length; i++) {
            // Loop through the columns
            for (int j = 0; j < copyOfArray[0].length; j++) {
                // Check if value is even
                if ((copyOfArray[i][j] % 10) % 2 == 0) {
                    // Add 0
                    stringTwoDArray[i][j] = copyOfArray[i][j] + "0";
                } else {
                    // Don't add 0
                    stringTwoDArray[i][j] = copyOfArray[i][j] + "";
                }
            }
        }
        System.out.println("Lvl. 3:");
        // Row counter
        int n = 0;
        // Column counter
        int k = 0;
        // Loop through the row
        while (n < stringTwoDArray.length) {
            // Loop through the column
            while (k < stringTwoDArray[n].length) {
                // Prints the value of the array position
                System.out.print(stringTwoDArray[n][k] + " ");
                // Increase column
                k++;
            }
            // Resets the column back to 0
            k = 0;
            // Increase row
            n++;
            System.out.println();
        }
        System.out.println();
    }
    // Level 4
    public static void levelFour(int[][] twoDArray) {
        // Makes a copy of array so original data is not damaged
        int[][] copyOfArray = new int[twoDArray.length][twoDArray[0].length];
        // Insert values
        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray[i].length; j++) {
                copyOfArray[i][j] = twoDArray[i][j];
            }
        }
        // Loop through the rows
        for (int i = 0; i < copyOfArray.length; i++) {
            // Loop through the columns
            for (int j = 0; j < copyOfArray[0].length; j++) {
                // If value at position is divisible by 3
                if ((copyOfArray[i][j]) % 3 == 0) {
                    // Replace the value with a random integer between 0 through 5
                    copyOfArray[i][j] = (int) (Math.random() * 6);
                }
            }
        }
        System.out.println("Lvl. 4:");
        // Row counter
        int n = 0;
        // Column counter
        int k = 0;
        // Loop through each row
        while (n < copyOfArray.length) {
            // Loop through each column
            while (k < copyOfArray[n].length) {
                // Prints the value of the array position
                System.out.print(copyOfArray[n][k] + " ");
                // Increase column
                k++;
            }
            // Reset column back to 0
            k = 0;
            // Increase row
            n++;
            System.out.println();
        }
        System.out.println();
    }
    // Level 5
    public static void levelFive(int[][] twoDArray) {
        // Makes a copy of array so original data is not damaged
        int[][] copyOfArray = new int[twoDArray.length][twoDArray[0].length];
        // Insert values
        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray[i].length; j++) {
                copyOfArray[i][j] = twoDArray[i][j];
            }
        }
        // Prime number list
        int[] primeList = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 491};
        // Loop through the rows
        for (int i = 0; i < copyOfArray.length; i++) {
            // Loop through the columns
            for (int j = 0; j < copyOfArray[0].length; j++) {
                // Go through the list of prime numbers and see if any value in the array matches it
                for (int prime : primeList) {
                    // If a value is a prime number
                    if ((copyOfArray[i][j]) == prime) {
                        // Divide that value by 2 then add 1
                        copyOfArray[i][j] = ((copyOfArray[i][j]) / 2) + 1;
                    }
                }
            }
        }
        System.out.println("Lvl. 5:");
        // Row counter
        int n = 0;
        // Column counter
        int k = 0;
        // Loop through the rows
        while (n < copyOfArray.length) {
            // Loop through the columns
            while (k < copyOfArray[n].length) {
                // Prints the value of the array position
                System.out.print(copyOfArray[n][k] + " ");
                // Increase column
                k++;
            }
            // Reset column back to 0
            k = 0;
            // Increase row
            n++;
            System.out.println();
        }
        System.out.println();
    }
    // Level 7
    public static void levelSeven(int[][] twoDArray) {
        // Random number
        int randomNum = (int) ((Math.random() * 5) + 1);
        System.out.println("Lvl. 7:");
        // Random number corresponds to level number
        if (randomNum == 1) {
            levelOne(twoDArray);
        } else if (randomNum == 2) {
            levelTwo(twoDArray);
        } else if (randomNum == 3) {
            levelThree(twoDArray);
        } else if (randomNum == 4) {
            levelFour(twoDArray);
        } else if (randomNum == 5) {
            levelFive(twoDArray);
        }
    }
    // Level 8
    public static void levelEight(int[][] twoDArray) {
        // Loops 5 times
        for (int i = 0; i < 5; i++) {
            // Random level: 1 through 5
            int level = (int) (Math.random() * 5) + 1;
            // If random level is 1
            if (level == 1) {
                // Call level one method
                levelOne(twoDArray);
                // If random level is 2
            } else if (level == 2) {
                // Call level two method
                levelTwo(twoDArray);
                // If random level is 3
            } else if (level == 3) {
                // Call level three method
                levelThree(twoDArray);
                // If random level is 4
            } else if (level == 4) {
                // Call level four method
                levelFour(twoDArray);
                // If random level is 5
            } else {
                // Call level five method
                levelFive(twoDArray);
            }
        }
    }
    // Level 9
    public static void levelNine(int[][] twoDArray) {
        // Track how many times a certain level has been used
        int lvl1Count = 0;
        int lvl2Count = 0;
        int lvl3Count = 0;
        int lvl4Count = 0;
        int lvl5Count = 0;
        // Keep finding and calling the random levels until all of them have been called 2 times
        while (lvl1Count < 2 || lvl2Count < 2 || lvl3Count < 2 || lvl4Count < 2 || lvl5Count < 2) {
            // Get a random level: 1 through 5
            int level = (int)(Math.random() * 5) + 1;
            // If level 1 is chosen and hasn't been called 2 times yet
            if (level == 1 && lvl1Count < 2) {
                // Increase level 1 tracker
                lvl1Count++;
                // Call level 1 method
                levelOne(twoDArray);
                // If level 2 is chosen and hasn't been called 2 times yet
            } else if (level == 2 && lvl2Count < 2) {
                // Increase level 2 tracker
                lvl2Count++;
                // Call level 2 method
                levelTwo(twoDArray);
                // If level 3 is chosen and hasn't been called 2 times yet
            } else if (level == 3 && lvl3Count < 2) {
                // Increase level 3 tracker
                lvl3Count++;
                // Call level 3 method
                levelThree(twoDArray);
                // If level 4 is chosen and hasn't been called 2 times yet
            } else if (level == 4 && lvl4Count < 2) {
                // Increase level 4 tracker
                lvl4Count++;
                // Call level 4 method
                levelFour(twoDArray);
                // If level 5 is chosen and hasn't been called 2 times yet
            } else if (level == 5 && lvl5Count < 2) {
                // Increase level 5 tracker
                lvl5Count++;
                // Call level 5 method
                levelFive(twoDArray);
            }
        }
    }
    // Skips spots for lvl 1 that were already changed
    public static void lvl1Locked(int[][] array, boolean[][] isLocked) {
        // Loops through rows
        for (int row = 0; row < array.length; row++) {
            // Loops through columns
            for (int column = 0; column < array[row].length; column++) {
                // Value at position
                int value = array[row][column];
                // Only applied: spot isn't locked and value is divisible by 5
                if (!isLocked[row][column] && value % 5 == 0) {
                    // Divides value by 5
                    value = value / 5;
                    // Locks spot
                    isLocked[row][column] = true;
                }
                // Prints value
                System.out.print(value + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    // Skips spots in lvl 2 that were already changed
    public static void lvl2Locked(int[][] array, boolean[][] isLocked) {
        // Loops through rows
        for (int row = 0; row < array.length; row++) {
            // Loops through columns
            for (int column = 0; column < array[row].length; column++) {
                // Value at position
                int value = array[row][column];
                // int to String conversion
                String spot = String.valueOf(value);
                // Only applied: spot isn't locked and the digits match (ex: 44)
                if (!isLocked[row][column] && (spot.length() == 1 || spot.charAt(0) == spot.charAt(1))) {
                    // Locks the spot
                    isLocked[row][column] = true;
                    // Prints the first character only
                    System.out.print(spot.charAt(0) + " ");
                } else
                    // Prints full value
                    System.out.print(value + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    // Skips the spots in lvl 3 that were already changed
    public static void lvl3Locked(int[][] array, boolean[][] isLocked) {
        // Loops rows
        for (int row = 0; row < array.length; row++) {
            // Loops columns
            for (int column = 0; column < array[row].length; column++) {
                // Value at position
                int value = array[row][column];
                // int to String conversion
                String spot = String.valueOf(value);
                // Only applied: spot isn't locked and even
                if (!isLocked[row][column] && spot.charAt(spot.length() - 1) % 2 == 0) {
                    // Appends 0
                    spot = spot + "0";
                    // Locks the spot so it can't be changed
                    isLocked[row][column] = true;
                }
                // Prints value
                System.out.print(spot + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    // Skips the spots that were changed in lvl 4 already
    public static void lvl4Locked(int[][] array, boolean[][] isLocked) {
        // Loops through the rows
        for (int row = 0; row < array.length; row++) {
            // Loops through the columns
            for (int column = 0; column < array[row].length; column++) {
                // Value of the position
                int value = array[row][column];
                // int to String conversion
                String spot = String.valueOf(value);
                // Only applied: spot isn't locked and divisible by 3
                if (!isLocked[row][column] && value % 3 == 0) {
                    // Replaces it with a random integer from 0 through 5
                    spot = String.valueOf((int)(Math.random() * 6));
                    // Locks the spots so it can't be changed
                    isLocked[row][column] = true;
                }
                // Prints value
                System.out.print(spot + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    // Skips the spots that were changed in lvl 5 already
    public static void lvl5Locked(int[][] array, boolean[][] locked) {
        // Loops rows
        for (int row = 0; row < array.length; row++) {
            // Loops columns
            for (int column = 0; column < array[row].length; column++) {
                // Value at position
                int value = array[row][column];
                // int to String conversion
                String spot = String.valueOf(value);
                boolean isPrime = value > 1;
                // Checks every value from 2 to value / 2
                for (int i = 2; i <= value / 2; i++)
                    // If value divisible by i
                    if (value % i == 0)
                        // not prime
                        isPrime = false;
                // Only applied: spot isn't locked & value is prime
                if (!locked[row][column] && isPrime) {
                    // Replaces it with value / 2 + 1
                    spot = String.valueOf((int)(value / 2) + 1);
                    // Locks the spot so it can't be changed
                    locked[row][column] = true;
                }
                // Prints value
                System.out.print(spot + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    // Level 10
    public static void levelTen(int[][] twoDArray) {
        boolean[][] locked = new boolean[5][6];
        // Keep track of level calls
        int lvl1 = 0;
        int lvl2 = 0;
        int lvl3 = 0;
        int lvl4 = 0;
        int lvl5 = 0;
        // Keeps going until everything is called twice
        while (lvl1 < 2 || lvl2 < 2 || lvl3 < 2 || lvl4 < 2 || lvl5 < 2) {
            // Random level from 1 through 5
            int level = (int)(Math.random() * 5) + 1;
            // Does it if it hasn't been called 2 times already
            if (level == 1 && lvl1 < 2) {
                // Increase lvl 1 count
                lvl1++;
                // Locked version
                lvl1Locked(twoDArray, locked);
                // Does it if it hasn't been called 2 times already
            } else if (level == 2 && lvl2 < 2) {
                // Increase lvl 2 count
                lvl2++;
                // Locked version
                lvl2Locked(twoDArray, locked);
                // Does it if it hasn't been called 2 times already
            } else if (level == 3 && lvl3 < 2) {
                // Increase lvl 3 count
                lvl3++;
                // Locked version
                lvl3Locked(twoDArray, locked);
                // Does it if it hasn't been called 2 times already
            } else if (level == 4 && lvl4 < 2) {
                // Increase lvl 4 count
                lvl4++;
                // Locked version
                lvl4Locked(twoDArray, locked);
                // Does it if it hasn't been called 2 times already
            } else if (level == 5 && lvl5 < 2) {
                // Increase lvl 5 count
                lvl5++;
                // Locked version
                lvl5Locked(twoDArray, locked);
            }
        }
    }
    // Level 11
    public static void levelEleven(int[][] twoDArray) {
        // Creates scanner object
        Scanner console = new Scanner(System.in);
        // Tells user to pick a level
        System.out.print("Please pick a level [1-5]: ");
        int level = console.nextInt();
        // Checks to see what level they picked and then call that level for them
        switch (level) {
            case 1:
                levelOne(twoDArray);
                break;
            case 2:
                levelTwo(twoDArray);
                break;
            case 3:
                levelThree(twoDArray);
                break;
            case 4:
                levelFour(twoDArray);
                break;
            case 5:
                levelFive(twoDArray);
                break;
        }
    }
    public static void main(String[] args) {
        // 2D Array
        int[][] twoDArray = {
                {55, 23, 12, 7},
                {231, 20, 102, 6},
                {11, 9, 2, 3},
                {65, 19, 39, 42}
        };
        System.out.println("Array: ");
        // Row counter
        int n = 0;
        // Column counter
        int k = 0;
        // Loop through the rows
        while (n < twoDArray.length) {
            // Loop through the columns
            while (k < twoDArray[n].length) {
                // Prints the value of the array position
                System.out.print(twoDArray[n][k] + " ");
                // Increase column
                k++;
            }
            // Reset column back to 0
            k = 0;
            // Increase row
            n++;
            System.out.println();
        }
        System.out.println();
        // Calls all the levels on the 2D array
        levelOne(twoDArray);
        levelTwo(twoDArray);
        levelThree(twoDArray);
        levelFour(twoDArray);
        levelFive(twoDArray);
        levelSeven(twoDArray);
        levelEight(twoDArray);
        levelNine(twoDArray);
        levelTen(twoDArray);
        levelEleven(twoDArray);
    }
}
