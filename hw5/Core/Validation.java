package HW.hw5.Core;

public class Validation {
    // Проверка примера на содержание букв
    public boolean isAlpha(String s)
    {
        if (s == null) {
            return false;
        }
 
        for (int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            if ((c < '(' || c > '9')) {
                return false;
            }
        }
        return true;
    }
    // Добавляет знак умножения если перед(или после) скобкой стоит число 
    public String addPow(String s){
        for (int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            if (c == '(') {
                if((s.charAt(i-1)>='0' || s.charAt(i-1)<='9') && s.charAt(i-1)!='*'){
                    s=s.substring(0,i)+"*"+s.substring(i);
                    i++;
                }            
            }
            if (c == ')') {
                if((s.charAt(i+1)>='0' || s.charAt(i+1)<='9')&& s.charAt(i+1)!='*'){
                    s=s.substring(0,i+1)+"*"+s.substring(i+1);
                    i++;
                }            
            }
        }
        return s;
    }
}
