import java.util.*;
/**
* Эта программа считает сумму четных элементов ряда Фибоначи по указанное граничное значение
* использовал рекурсию
* @version 1.30	 2015/04/20
* @author OZubenia
*/
public class FibonachiEvenSum3
{
public static void main(String[] args)
{
int sumEven = 0;
int el_curr = 1;
int i = 0;
// Новый элемент ряда генерируется до тех пор, пока не будет достигнуто заданое значение.
while (el_curr < 4000000)
{
//Сумма четных чисел
if (el_curr % 2 == 0)
	{
	sumEven+=el_curr;
	};
//переход к следующему элементу ряда
el_curr = f_el(i++);
};

//Вывод результата
System.out.println("Result = " + sumEven);
}


    private static int f_el(int number) 
	{
        if (number <= 0) 
		 {return 0;} 
		 else if (number == 1) 
            {return 1;}
            else if (number == 2) 
               {return 1;}
				else 
					{return f_el(number - 1) + f_el(number - 2);}
    }
	
}

