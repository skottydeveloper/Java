public class MadLibs {
    /* Program description:
    This program generates a mad libbed story. 
    Author: Andreas
    Date: 17/01/2021 */
    public static void main(String[] args) {
        //The template for the story:
        String name1, name2, adjective1, adjective2, adjective3, verb1, noun1, noun2, noun3, noun4, noun5, noun6, place1;
        int number;
      
        name1 = "Steve";
        name2 = "Jeremy";
        adjective1 = "beautiful";
        adjective2 = "great";
        adjective3 = "happy";
        verb1 = "dance";
        noun1 = "gentlemen";
        noun2 = "halloumi cheese";
        noun3 = "Zorba";
        noun4 = "Greek ladies";
        noun5 = "water";
        noun6 = "robots";
        place1 = "Australia";
        number = 2250;
      
        String story = "This morning " + name1 + " woke up feeling " + adjective1 + ". 'It is going to be a " + adjective2 + " day!' Outside, a bunch of " + noun1 + " were protesting to keep " + noun2 + " in stores. They began to " + verb1 + " to the rhythm of the " + noun3 + ", which made all the " + noun4 + " very " + adjective3 + ". Concerned, " + name1 + " texted " + name2 + ", who flew " + name1 + " to " + place1 + " and dropped him" + " in a puddle of frozen " + noun5 + ". " + name1 + " woke up in the year " + number + ", in a world where " + noun6 + " ruled the world.";
      
        System.out.println(story);
    }         
}