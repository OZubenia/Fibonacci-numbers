import java.util.*;
/**
* Эта программа считает сумму четных элементов ряда Фибоначи по указанное граничное значение
* вынес рассчет в отдельный статичный метод
* @version 1.00 2015/04/20
* @author OZubenia
*/
public class FibonachiEvenSum2
{
public static void main(String[] args)
{
System.out.println("Result = " + SumEvenElements(4000000) );
}

public static int SumEvenElements(int limit)
{
int sumEven = 0;
int el_prev = 0;
int el_curr = 1;
// Новый элемент ряда генерируется до тех пор, пока не будет достигнуто заданое значение.
while (el_curr < limit)
	{
	//Сумма четных чисел
	if (el_curr % 2 == 0)
		{
		sumEven+=el_curr;
		};
	//переход к следующему элементу ряда
	int sumFib = el_prev + el_curr;
	el_prev = el_curr;
	el_curr = sumFib;
	};
return sumEven;
}
}
