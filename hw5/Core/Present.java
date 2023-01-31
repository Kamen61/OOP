package HW.hw5.Core;

public class Present {
    Model model;
    View view;
    Logger log;

    public void buttonClick(){
        View view=new View();
        Logger log=new Logger();
        String example =view.getValue("Введите пример для подсчета : ");
        Model model=new Model(example);
        log.log(example);
        String result=model.calculation();
        if(result=="-1")
            view.printError();
        else
            view.print(result);
            log.log(result);

    }
}
