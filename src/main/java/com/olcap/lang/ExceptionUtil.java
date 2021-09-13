package com.olcap.lang;

import java.io.PrintWriter;
import java.io.StringWriter;

public class ExceptionUtil {
	public static String stackTrace(Exception e) {
		StringWriter sw = new StringWriter();
		PrintWriter pw = new PrintWriter(sw);
		e.printStackTrace(pw);

		return sw.toString();
	}
}