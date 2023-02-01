package HW.hw2.Core;

public class Present {
    Zoo zoo;
    View view;
    public void buttonClick(){
        View view=new View();
        Zoo zoo=new Zoo();
        zoo.add();
        int choise=view.printMenuAndScanInfo();
        boolean bool=true;
        while(bool){
                switch(choise){
                case(1):    
                    view.printInfo(zoo.printAllInfo());
                    break;
                case(2):
                    view.printAnimal(zoo.printOneInfo(view.writeIndex()));
                    break;
                case(3):
                    view.printInfo(zoo.sayVoiceAll());
                    break;
                case(4):
                    view.printInfo(zoo.sayVoice(view.writeIndex()));
                    break;
                case(5):
                    view.printInfo(zoo.delAnimal(view.writeIndex()));
                    break;
                case(6):
                    bool=view.goodbye();
                    break;
                default:
                    view.error();
            }
            if(bool)
                choise=view.printMenuAndScanInfo();

        }
    }
}
