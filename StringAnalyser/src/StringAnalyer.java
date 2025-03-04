public class StringAnalyer
{
    private String str;
    public StringAnalyer(String str)
    {
        this.str = str;
    }

    public String getStr()
    {
        return this.str;
    }

    public int getLength()
    {
        return this.str.length();
    }

    public String getSubString(int start, int end)
    {
        return this.str.substring(start, end);
    }

    public String getSubString(int start)
    {
        System.out.println("starts at " + start);
        return this.str.substring(start);
    }

    public String getSubStringTrimmed(int start, int end)
    {
        return this.str.substring(start, end).trim();
    }

    public String getSubStringTrimmed(int start)
    {
        return this.str.substring(start).trim();
    }

    public String[] getWords(){
        return this.str.split(" ");
    }
}