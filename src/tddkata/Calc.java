package tddkata;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calc {
	public int sum(String expression) {
		// TODO Auto-generated method stub
		if (expression==null) expression = "0";
		int strSum =0;

if (expression.contains("//")) {
			//String[] ss;
	String[] ss = expression.split("//");
			ss = ss[1].split("\n");
			System.out.println(ss[0]);
			String[] strDigits = expression.substring(4).split(ss[0]);

	for (String dig : strDigits) {
		strSum = strSum +Integer.parseInt(dig);
	}

		} else{

			Pattern p = Pattern.compile("\\d");//("[0-9&&[012]]")
			Matcher m = p.matcher(expression);
			while (m.find()) {
				strSum = strSum + Integer.parseInt(String.valueOf(expression.substring(m.start(), m.end())));
			}
		}
		return strSum;
		//throw new UnsupportedOperationException();
	}


}
