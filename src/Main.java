public class Main {

    public static void main(String[] args) {
        // Create a new friends array using the array literal shortcut.
        // Include Ben, Alena, Pasan
        String[] friends = {"Ben","Alena","Pasan"};

        // Enhanced for (-each) loop --> Added in Java 5
        /*
        The for each loop should be used for iterating an array. For each friend I have in my friends variable, print out a message for them.
        */
        for (String friend : friends){
            System.out.printf("Hey %s! The movie starts at 19:00, see you there! %n",
                              friend);

        }

        // Standard for loop
        /*
        expression 1 (int i = 0)          : The initialization, which happens at the beginning of the loop. We start it as 0 now because our array starts at 0.
        expression 2 (i < friends.length) : The conditional -> If this expression returns true, the loop will continue, if it returns false, we'll exit the loop
                                            friends.length = 3 (there's 3 elemnts in the array). If the variable i = 2, the Conditional will return true
                                                                                                 If the variable i = 3, the Conditional will return false
        expression 3 (i++)                : The increment. Runs after every completed iteration of the loop. We'll increase out var i by 1
        */
        for (int i = 0; i < friends.length; i++){
            String friend = friends[i];
            System.out.printf("Hey %s! The movie starts at 19:00, see you there! %n",
                    friend);
        }

        int[] bensScoreCard = {1, 2, 1, 5, 2, 4, 4, 4, 3, 6, 1, 2, 5, 4, 3, 2, 6, 3};
        for (int i = 0; i < bensScoreCard.length; i++){
            System.out.printf("Hole number %d: %d %n",
                              i + 1,
                              bensScoreCard[i]);
        }

    }
}
