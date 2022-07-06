import java.util.Arrays;

public class FirstTask31{

public static void main(String[] args){
	int[] myArray = {10, 20, 22, 43, 63, 75, 434, 5, 23, 2, 33, 44, 77, 88, 9};
	
	for (int i = 0; i<myArray.length; i++){
		System.out.println(myArray[i]);
	}
	System.out.println(Arrays.toString(myArray));
		
	System.out.println("Выводим массив из 15 случайных чисел в строку вторым способом:");
	String someString = "";
	for (int i = 0; i < myArray.length; i++){
		System.out.print(someString + myArray[i]);
		someString = ", ";
	}
 }
}