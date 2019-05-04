package lviv.com;

public class CalculatorEntry {
	public static Operations operVar;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean varBoolean = true;
		do {
            Operations operVar = new Operations();
            int num1 = operVar.num1;
            int num2 = operVar.num2;
            varBoolean = (num1 > 0) && (num2 > 0);
            if (varBoolean && operVar.rez == 1) {
                String operation = operVar.operation;
                Operation operation2 = null;
                CalculateOperation calculateOperation = new CalculateOperation(operVar.num1, operVar.num2);
                operation2 = calculateOperation.getOperation(operVar.operation);
                System.out.println(operation2.getResult());
            } else if (varBoolean && operVar.rez == 2){
                String operation = operVar.operation;
                Operation operation2 = null;
                CalculateOperation calculateOperation = new CalculateOperation(operVar.num1, operVar.num2);
                operation2 = calculateOperation.getOperation(operVar.operation);
                System.out.println(new stringRomToInteger(operation2.getResult()));

            } else {
				System.out.println("Enter the correct data");
			}
		}while (!varBoolean);

	}


}
