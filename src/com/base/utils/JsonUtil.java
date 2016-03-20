package com.base.utils;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServletResponse;
import com.google.gson.Gson;

public class JsonUtil {
	private static Gson gson=new Gson();
	public static void toJson(HttpServletResponse response,Object jsonObj) throws IOException {
		PrintWriter out=response.getWriter();
		out.write(gson.toJson(jsonObj));
	}
}
