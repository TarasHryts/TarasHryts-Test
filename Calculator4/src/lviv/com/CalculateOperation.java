package lviv.com;

public class CalculateOperation {

	private int firstNum;
	private int secondNum;


	public CalculateOperation(int firstNum, int secondNum) {
		this.firstNum = firstNum;
		this.secondNum = secondNum;
	}


	public Operation getOperation(String operation) {
			switch (operation) {
			case Operation.ACTION_PLUS:  
				return new AddOperation(firstNum, secondNum);
			case Operation.ACTION_MINUS:
				return new MinusOperation(firstNum, secondNum);
			case Operation.ACTION_MULTIPLY: 
				return new MultiplyOperation(firstNum, secondNum);
			case Operation.ACTION_DEVIDE: 
				return new DevideOperation(firstNum, secondNum);
			}
			return null;
	}

}
