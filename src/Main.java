public class Main {

    public static void main(String[] args) {
        // Create a new friends array using the array literal shortcut.
        // Include Ben, Alena, Pasan
        String[] friends = {"Ben","Alena","Pasan"};
        for (String friend : friends){
            System.out.printf("Hey %s! The movie starts at 19:00, see you there! %n",
                              friend);

        }
    }
}
