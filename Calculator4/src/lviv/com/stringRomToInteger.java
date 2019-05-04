package lviv.com;
public class stringRomToInteger {
    String row;
    //translate arabic numerals into roman
    public stringRomToInteger(int number){
        switch (number){
            case 1: row = "I"; break;
            case 2: row = "II"; break;
            case 3: row = "III"; break;
            case 4: row = "IV"; break;
            case 5: row = "V"; break;
            case 6: row = "VI"; break;
            case 7: row = "VII"; break;
            case 8: row = "VIII"; break;
            case 9: row = "IX"; break;
            case 10: row = "X"; break;
            case 11: row = "XI"; break;
            case 12: row = "XII"; break;
            case 13: row = "XIII"; break;
            case 14: row = "XIV"; break;
            case 15: row = "XV"; break;
            case 16: row = "XVI"; break;
            case 17: row = "XVII"; break;
            case 18: row = "XVIII"; break;
            case 19: row = "XIX"; break;
            case 20: row = "XX"; break;

            default: row ="out of range"; break;
        }

    }
    @Override
    public String toString(){
        //System.out.print(row);
        return row;
    }

}
