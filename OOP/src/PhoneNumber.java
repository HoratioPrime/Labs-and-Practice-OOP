public class PhoneNumber {
    private  StringBuffer number;
    public String parseNewFormat(StringBuffer str){
        if(str.charAt(0) == '8'){
            str.setCharAt(0, '7');
            str.insert(0, "+");
        }
        number = new StringBuffer(str.substring(0, str.length() - 7) + "–" +
                str.substring(str.length() - 7, str.length() - 4) + "–" +
                str.substring(str.length() - 4, str.length()));
        return number.toString();
    }
}
