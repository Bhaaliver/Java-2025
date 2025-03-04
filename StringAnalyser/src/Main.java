public class Main
{
    public static void main(String[] args) 
    {
        String notAnalyesdString = "This is a string that needs to be analysed by the StringAnalyer class in the StringAnalyer.java file in the src folder of the project folder in the workspace folder of the workspace directory with the workspace name as workspace";
        StringAnalyer analysedString = new StringAnalyer(notAnalyesdString);
        System.out.println(analysedString.getStr());
        System.out.println(analysedString.getSubString(4));
        System.out.println(analysedString.getSubStringTrimmed(4));
        System.out.println(analysedString.getWords()[3]);
    }
}