package HW.hw5.Core;

import HW.hw5.Сalculations.ActionSelection;
import HW.hw5.Сalculations.Matematics;

public class Model {
    private String ex;

    public Model(String example) {
        this.ex=example;
    }
    public String calculation(){
        Validation val=new Validation();
        this.ex=val.addPow(ex);
        if(val.isAlpha(ex)){
            ActionSelection act=new ActionSelection(ex);
            Matematics math=new Matematics();
            while(act.result==null){
                act.choiceAct();
                switch(act.strAct){
                    case("*"):
                        act.replaceAct(math.pow(act.numberFirst, act.numberSecond));
                        break;
                    case("/"):
                        act.replaceAct(math.div(act.numberFirst, act.numberSecond));
                        break;
                    case("+"):
                        act.replaceAct(math.plus(act.numberFirst, act.numberSecond));
                        break;
                    case("-"):
                        act.replaceAct(math.minus(act.numberFirst, act.numberSecond));
                        break;
                }
            }
            return act.result;
        }
        else
            return "-1";
    }

}
