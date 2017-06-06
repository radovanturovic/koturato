package rvg.svsots.rest;

import org.imsglobal.lti.launch.LtiOauthVerifier;
import org.imsglobal.lti.launch.LtiVerificationException;
import org.imsglobal.lti.launch.LtiVerificationResult;
import org.imsglobal.lti.launch.LtiVerifier;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * Created by charmingc0d3r on 24.5.17..
 */
@Path("/startup")
public class BasicLTI {

    @GET
    @Path("/lti")
    public static Response startupLTI(@Context HttpServletRequest httpRequest) throws URISyntaxException {
        Response.ResponseBuilder response;
        LtiVerifier ltiVerifier = new LtiOauthVerifier();
        String key = httpRequest.getParameter("oauth_consumer_key");
        String secret = ""; // retrieve corresponding secret for key from db
        LtiVerificationResult ltiResult = new LtiVerificationResult(false,null,"");
        try {
            ltiResult = ltiVerifier.verify(httpRequest, secret);
        } catch (LtiVerificationException e) {
            e.printStackTrace();
        }
        if (ltiResult.getSuccess())
            response = Response.temporaryRedirect(new URI(""));
        else
            response = Response.serverError();
        return response.build();
    }
}
