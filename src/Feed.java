import java.util.ArrayList;

public class Feed {
    public static void main(String[] args) {
          // Step 1: Create your ArrayList to hold post descriptions
        ArrayList<String> feed = new ArrayList<String>();
        System.out.println("--- Top of Feed ---");
        feed.add("Guy posted a story");
        feed.add("Shaya requested to follow you");
        feed.add("Eliora added you back");
        feed.add("Gabe snapped you back");
        feed.add("Elizabeth posted a video");
        feed.add("Ella wants to be your friend");
        feed.add("DR.Moden started following you");
        for(int i = 0;i<4;i++){
            System.out.println(feed.get(i));
        }


        // Step 2: Add 7 post descriptions using .add()
        // Example: feed.add("Maya posted a photo");


        // Step 3: Print only the FIRST 3 posts (the top of the feed)
        // Use a for loop — think carefully about when your loop should stop


        // Step 4: Print how many posts are still waiting below the top 3
        

    }
}
