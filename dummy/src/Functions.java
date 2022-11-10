public class Functions {

    public Functions(double num1, double num2)
    {

    }

    public Functions() {}

    public boolean isInt(String string)
    {
        try 
        {
            Integer.parseInt(string);
            return true;
        }
        catch (Exception e) 
        {
            return false;
        }
    }

    public double multiply(double num1, double num2)
    {
        return num1 * num2;
    }


}
