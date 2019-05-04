package lviv.com;

public final class MinusOperation implements Operation {

    int firstNum;
    int secondNum;

    MinusOperation (int firstNum, int secondNum) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
    }

    @Override
    public int getResult() {
        // TODO Auto-generated method stub
        return firstNum - secondNum;
    }

}
