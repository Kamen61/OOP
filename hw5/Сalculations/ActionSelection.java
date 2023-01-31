package HW.hw5.Сalculations;

public class ActionSelection extends Example {
    public double numberFirst;
    public double numberSecond;
    public String result;
    public String strAct;
    private int indexMath;
    private int indexBegin;
    private int indexLast;
    private String tamp;
    private String strNumSecond;
    private String strNumFirst;
    private String strNumberSecond;
    private String strNumberFirst;





    public ActionSelection (String example){
        super.example=example.trim();
    }
    // Используя переменную example(из абстрактного класса Example) , данный метод выделяет 2 цифры и знак между ними.
    public void choiceAct(){
        indexBegin=0;
        indexLast=0;
        strAct="";
        if (example.contains("(")){
            nextActionCheck(example);
            this.indexMath=nextIndexMath(this.tamp);
            if(this.indexMath==-1){
                String bufer=example.substring(0,indexBegin-1)+example.substring(indexBegin, indexLast)+
                example.substring(indexLast+1);
                example=bufer;
            }
            else{
            parsingFirstNum(indexMath,this.tamp);
            parsingSecondNum(indexMath,this.tamp);
            }

        }
        else{
            nextActionCheck(example);
            this.indexMath=nextIndexMath(example);
            if(this.indexMath==-1){
                result=example;
            }
            else{
                parsingFirstNum(this.indexMath,this.tamp);
                parsingSecondNum(this.indexMath,this.tamp);
            }
        }
    }

    // Принимает пример(строку) возвращает следующее действие
    public void nextActionCheck(String str){
        if(str.contains("(") || str.contains(")")){
            for (int i = 0; i < str.length(); i++) {
                if(str.charAt(i)=='('){
                    this.indexBegin=i+1;
                }    
                else if(str.charAt(i)==')'){
                    this.indexLast=i;
                }    
                if (this.indexBegin>-1 && this.indexLast>0){
                    break;
                }
            }
            this.tamp=str.substring(indexBegin-1, indexLast+1);
        }
        else{
            this.indexBegin=0;
            this.indexLast=str.length();
            this.tamp=str;

        }
    }


    // Принимает пример(строку) и возвращает знак действия между двумя числами
    public int nextIndexMath(String str){
        int index;
        if (str.contains("/")){
            index=str.indexOf("/");
            this.strAct="/";
        }
        else if (str.contains("*")){
            index=str.indexOf("*");
            this.strAct="*";
        }
        else if (str.contains("+")){
            index=str.indexOf("+");
            this.strAct="+";

        }
        else if (str.contains("-")){
            index=str.indexOf("-");
            this.strAct="-";
        }
        else{
            index=-1;
        }
        return index;
    }
    

    // принимает индекс знака между двумя числами и пример(строку) и присваивает переменной  numberFirst - число(левее от знака)
    public void parsingFirstNum(int indexMath, String exam){
        int indexNumLast=indexMath;
        indexMath--;
        while(isDigit(exam.charAt(indexMath))&& indexMath>=1){
                indexMath--;
        }
        if(!isDigit(exam.charAt(indexMath)))
            indexMath++;

        int indexNumBeginExample=indexMath;
        strNumFirst=exam.substring(indexNumBeginExample, indexNumLast);
        if(strNumFirst.contains(","))
            strNumberFirst=strNumFirst.replace(',', '.');
        else{
            strNumberFirst=strNumFirst;
        }
        this.numberFirst=Double.parseDouble(strNumberFirst);
    }
    // принимает индекс знака между двумя числами и пример(строку) и присваивает переменной  numberSecond - число(правее от знака)
    public void parsingSecondNum(int indexMath, String exam){
        int indexNumBegin=indexMath+1;
        indexMath++;
        while(indexMath<=exam.length()-1 && isDigit(exam.charAt(indexMath))){
            indexMath++;
        }
        int indexNumLastExample=indexMath;
        strNumSecond=exam.substring(indexNumBegin, indexNumLastExample);
        if(strNumSecond.contains(","))
            strNumberSecond=strNumSecond.replace(',','.');
        else{
            strNumberSecond=strNumSecond;
        }
        this.numberSecond=Double.parseDouble(strNumberSecond);    
    }


    // Принимает результат между двумя числами и вставляет результат обратно в пример
    public void replaceAct(double num){
        String convert=Double.toString(num);
        String replace=strNumFirst+strAct+strNumSecond;
        example=example.replace(replace, convert);
    }

    // Проверяет точки или запятые в числе 
    private boolean isDigit(char c) {
        if(Character.isDigit(c) || c=='.'|| c==',')
            return true;
        else
            return false;
            
    }
}