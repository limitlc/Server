package com.lichuang.servlet;

import android.os.Environment;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DetailServlet extends BaseServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setStatus(HttpServletResponse.SC_OK);
		String name = req.getParameter("packageName");
		String path = Environment.getExternalStorageDirectory().getAbsolutePath() + "/" + "WebInfos/app/" + name
				+ "/" + name;
		File file = new File(path);
		long length = file.length();
		resp.setContentLength((int) length);
		OutputStream out = resp.getOutputStream();
		FileInputStream stream = new FileInputStream(file);
		int count = -1;
		byte[] buffer = new byte[1024];
		while ((count = stream.read(buffer)) != -1) {
			out.write(buffer, 0, count);
			out.flush();
		}
		stream.close();
		out.close();
	}
}
