package eu.arrowhead.common.filter;

import java.io.IOException;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.Provider;

import eu.arrowhead.common.exception.ErrorMessage;

@Provider
public class EmptyPayloadRequestFilter implements ContainerRequestFilter  {

	@Override
	public void filter(ContainerRequestContext requestContext) throws IOException {
		String method = requestContext.getMethod();
		if(method.equals("PUT")){
			int contentLength = requestContext.getLength();
			if(contentLength == 0){
				ErrorMessage em = new ErrorMessage("Payload is null! If you want to send an empty payload, "
                		+ "try sending empty brackets ({})", 400, "No documentation yet.");
				requestContext.abortWith(Response.status(Response.Status.BAD_REQUEST)
		                .entity(em)
		                .build());
			}
		}
	}

}