/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerprogra.fundametal;

/**
 *
 * @author fred
 */
public class CalcEngine {
    
    public static void main(String[] args) {
        double[] leftVals = {100.0d, 25.0d, 225.0d, 11.0d};
        double[] rightVals = {50.0d, 92.0d, 17.0d, 3.0d};
        char[] opCodes = {'d', 'a', 's', 'm'};
        double[] results = new double[opCodes.length];
//	    double val1 = 100.0d;
//        double val2 = 50.0d;
//        double result;
//        char opCode = 'd';

        for(int i = 0; i < opCodes.length; i++) {
            switch(opCodes[i]) {
                case 'a':
                    results[i] = leftVals[i] + rightVals[i];
                    break;
                case 's':
                    results[i] = leftVals[i] - rightVals[i];
                    break;
                case 'd':
                    results[i] = rightVals[i] != 0.0d ? leftVals[i] / rightVals[i] : 0.0d;
//            if(val2 != 0.0d)
//                result = val1 / val2;
//            else
//                result = 0.0d;
                    break;
                case 'm':
                    results[i] = leftVals[i] * rightVals[i];
                    break;
                default:
                    System.out.println("Error - invalid opCode");
                    results[i] = 0.0d;
                    break;
            }
        }
        for(double theResult : results) {
            System.out.print("result = ");
            System.out.println(theResult);
        }
    }
}