package String;

public class SortingSentences {
    public static void main(String[] args) {
        String sentence = "is2 sentence4 This1 a3";
        System.out.println(sortSentence(sentence));
    }

    public static String sortSentence(String s) {
        String[] array = s.split("\\s");
        String[] newArray = new String[array.length];
        // int value = Character.getNumericValue(array[1].charAt(array[1].length() - 1)-1);

        for(int i = 0; i < array.length; i++) {
            newArray[Character.getNumericValue(array[i].charAt(array[i].length() - 1)-1)] = array[i].substring(0, array[i].length() - 1);
            /*System.out.println("First " +Character.getNumericValue(array[1].charAt(array[1].length() - 1)-1));
            System.out.println("Second " +array[1].substring(0, array[1].length() - 1));*/
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < newArray.length; i++) {
            sb = sb.append(newArray[i]).append(" ");
        }

        return sb.substring(0, sb.length() -1);
    }
}
