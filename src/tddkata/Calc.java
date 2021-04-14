package tddkata;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calc {
	public int sum(String expression) {
		// TODO Auto-generated method stub
if (expression==null) expression = "0";
		int strSum =0;
		Pattern p = Pattern.compile("\\d");//("[0-9&&[012]]");//("\\b\\w*\\d+\\w*,?\\b");
		Matcher m = p.matcher(expression);
		while(m.find()) {
			strSum = strSum+Integer.parseInt(String.valueOf(expression.substring(m.start(), m.end())));
		}

		return strSum;
		//throw new UnsupportedOperationException();
	}


}
