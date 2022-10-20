public class StringUtil{
    public static Integer ConvertToInt(String str){
        if(str == null||str.length()==0){
            throw new IllegalArgumentException("The string value should not be empty or NUll");
        }
        return Integer.valueOf(str);
    }
}
