public class FirstTask2{

public static void main(String[] args){
	if (args.length > 0){
		for(int i = args.length; i >0; i--){
			System.out.println(args[i-1]);
		}
	}
	else{
		System.out.println("В этом задании нужно было ввести несколько аргументов!");
	}
 }
}