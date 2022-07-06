public class FirstTask{

public static void main(String[] args){
	if (args.length > 0){
		System.out.println("Hello, " + args[0]);
		if (args.length > 1) System.out.println("Вообще-то Вы должны были ввести только имя. Только одно слово! " 
		+ "Поэтому мы вывели Первое слово!");
	}
	else{
		System.out.println("Нужно при запуске ввести Имя (одно слово). Т.е. передать аргумент методу main");
	}
 }
}