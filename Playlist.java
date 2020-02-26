/*This program is a playlist of music usic a Java Arraylist
Created by Elizabeth Akomolafe
Feb 2020*/
import java.util.ArrayList;

class Playlist {

  public static void main(String[] args) {
   ArrayList<String> desertIslandPlaylist = new ArrayList<String>();

    desertIslandPlaylist.add("Treasure");
    desertIslandPlaylist.add("Want you back");
    desertIslandPlaylist.add("Re-write the Stars");
    desertIslandPlaylist.add("Classic");
    desertIslandPlaylist.add("Dear Future Husband");
    desertIslandPlaylist.add("Water Guns");

desertIslandPlaylist.remove("Water Guns");

System.out.println(desertIslandPlaylist.size());   System.out.println(desertIslandPlaylist);

/*Get the indices of the songs you want to swap.
Create a temporary variable to store the value of song a. (We’ll call the songs a and b here.)
Rewrite the value at the index of a to the value of b.
Rewrite the value at the index of b to the value of the temporary variable.
 */

int indexA = desertIslandPlaylist.indexOf("Treasure");
int indexB = desertIslandPlaylist.indexOf("Want you back");

String tempA = "Treasure";
desertIslandPlaylist.set(indexA, "Want you back");

System.out.println(desertIslandPlaylist);

desertIslandPlaylist.set(indexB,"Treasure");
System.out.println(desertIslandPlaylist);

  }

}
