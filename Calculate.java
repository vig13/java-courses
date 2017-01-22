public class Calculate{
	public static void main(String[] args){
		System.out.println("Calculate");
		char operations = args[1].charAt(0);;
		int first = Integer.valueOf(args[0]);
		int second = Integer.valueOf(args[2]);

	if(operations == '+' || operations == '-' || operations == '/' || operations == '^' || operations == 'p'){
		switch(operations){
		case '+':
		System.out.println(first + second);
		break;
		case '-':
		System.out.println(first - second);
		break;
		case 'p':
		System.out.println(first * second);
		break;
		case '/':
		System.out.println(first / second);
		break;
		case '^':
		System.out.println(Math.pow(first, second));
		break;
		}
	}else{
		System.out.println("Введите верное выражение!");
	}
	}
}
