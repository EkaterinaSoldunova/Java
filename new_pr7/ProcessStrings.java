public class ProcessStrings implements StringInterface{
    @Override
    public int sizeOfLine(String s){
        int k=0;
        for(int i=0;i<s.length();i++){
            k++;
        }
        return k;
    }
    @Override
    public String oddSymbol(String s){
        String str="";
        for (int i=0; i<s.length();i++){
            if ((i+1)%2!=0){
                str+=s.charAt(i);
            }
        }
        return str;
    }
    @Override
    public String invertLine(String s){
        String str="";
        for (int i=s.length()-1; i>=0;i--){
            str+=s.charAt(i);
        }
        return str;
    }
}
