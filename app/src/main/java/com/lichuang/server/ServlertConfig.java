package com.lichuang.server;

import com.lichuang.servlet.AppServlet;
import com.lichuang.servlet.CategoryServlet;
import com.lichuang.servlet.DetailServlet;
import com.lichuang.servlet.DownloadServlet;
import com.lichuang.servlet.GameServlet;
import com.lichuang.servlet.HomeServlet;
import com.lichuang.servlet.HotServlet;
import com.lichuang.servlet.ImageServlet;
import com.lichuang.servlet.RecommendServlet;
import com.lichuang.servlet.SubjectServlet;
import com.lichuang.servlet.UserServlet;

import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

public class ServlertConfig {
    public static void config(ServletContextHandler handler) {
		handler.addServlet(new ServletHolder(new CategoryServlet()), "/category");
		handler.addServlet(new ServletHolder(new ImageServlet()), "/image");
		handler.addServlet(new ServletHolder(new RecommendServlet()), "/recommend");
		handler.addServlet(new ServletHolder(new SubjectServlet()), "/subject");
		handler.addServlet(new ServletHolder(new DetailServlet()), "/detail");
		handler.addServlet(new ServletHolder(new HomeServlet()), "/home");
		handler.addServlet(new ServletHolder(new AppServlet()), "/app");
		handler.addServlet(new ServletHolder(new GameServlet()), "/game");
		handler.addServlet(new ServletHolder(new DownloadServlet()), "/download");
		handler.addServlet(new ServletHolder(new UserServlet()), "/user");
		handler.addServlet(new ServletHolder(new HotServlet()), "/hot");
	}
}
