package com.dounine.clouddisk360.parser.deserializer.differpre;

import com.dounine.clouddisk360.parser.DifferPressParser;
import com.dounine.clouddisk360.parser.deserializer.BaseRequestInterceptor;
import org.apache.http.HttpException;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.protocol.HttpContext;

import java.io.IOException;

public class DifferPressRequestInterceptor extends BaseRequestInterceptor<DifferPressConst,DifferPressParser>
		implements HttpRequestInterceptor {

	public DifferPressRequestInterceptor(final DifferPressParser parser) {
		super(parser);
	}

	@Override
	public void process(HttpRequest request, HttpContext context) throws HttpException, IOException {
		super.process(request, context);
	}

}
