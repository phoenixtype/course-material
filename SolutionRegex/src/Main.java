public class Main {

    public static void main(String[] args) {
        String string = "I am a string. Yes I am";
        System.out.println(string);

        String yourString = string.replaceAll("I am", "You are");
        System.out.println(yourString);
        String alphanumeric = "abcdeeeF12Ghhiiiijjjjkl99z";
        System.out.println(alphanumeric.replaceAll(".", "Y"));
        System.out.println(alphanumeric.replaceAll("jjkl99z$", "YYY"));
        System.out.println(alphanumeric.replaceAll("[aei]", "X"));
        System.out.println(alphanumeric.replaceAll("[aei][Fj]", "X"));
    }
}
