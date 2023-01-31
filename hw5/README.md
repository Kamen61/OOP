структура

Создать калькулятор для работы с рациональными числами, организовать меню, добавив в неё систему логирования.


Структура программы :

- Calculation :
    - Example - Абстрактный класс в котором находится введенный пример
    - ActionSelection - В классе происходит выбор следующего действия, выделяются числа для подсчета и математический знак между числами. Так же происходит вставка ответа в пример для дальнейших вычислений.
    - Matematics - В класс передаются числа и математический знак между числами. На выходи получаем ответ  
- Core :
    - Logger -
    - Validation -
    - Model -
    - View -        
    - Present -        




абстракция в котором будет находится пример для подсчета 
abstract Example
private String exemple


класс для выбора следующего действия 
в конструкторе происходит передача примера в абстракцию
class actionSelection exetands Example
private double num1
private double num2
private String math
list String act{}
actionSelection(String example)
choiceAct()-берет строку с всем примером а выводит следующее дийствие в виде списка  (нужно удалить из строчки примера ,действие которое выбрали)
nextActionCheck()-проверка следующего действия 

parsingDouble()-выделяет 1 цифру 
parsingDouble()-выделяет 2 цифру 
outputMath()-выделяет действие между ними


class Matematics 
pow() 
dix()
sum()
minus()


совмещение actionSelection и Matematics implements log
class Model


класс для работы с пользователем через консоль
class View throw Exception
writeExample() ввод примера
outputResult() вывод результата


class presenter
совмещение model и view с логикой 


programm
1 кнопка