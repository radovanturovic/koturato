package rvg.svsots.rest;

import org.imsglobal.lti.launch.*;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.NoSuchAlgorithmException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by charmingc0d3r on 24.5.17..
 */
@Path("/startup")
public class BasicLTI {

    @POST
    @Path("/lti")
    public static Response startupLTI(@Context HttpServletRequest httpRequest) throws URISyntaxException, NoSuchAlgorithmException, LtiSigningException {
        Response.ResponseBuilder response;
//        LtiVerifier ltiVerifier = new LtiOauthVerifier();
//        String key = httpRequest.getParameter("oauth_consumer_key");
//        String secret = getSecret(key);
//        String signed = httpRequest.getParameter("oauth_signature");
//        LtiSigner ls = new LtiOauthSigner();
//        HashMap<String, String> map = new HashMap<>(), map2 = new HashMap<>();
//        Enumeration<String> kljuci = httpRequest.getParameterNames();
//        while (kljuci.hasMoreElements()) {
//            String kii = kljuci.nextElement();
//            map2.put(kii, httpRequest.getParameter(kii));
//            if (kii.equals("oauth_signature"))
//                continue;
//            if (!kii.contains("oauth"))// && !kii.contains("context"))
//                continue;
//            map.put(kii, httpRequest.getParameter(kii));
//        }
//        map.put("oauth_token", "");
//        map2.put("oauth_token", "");
//        Map<String, String> signedParameters = ls.signParameters(map, key, secret,
//                httpRequest.getRequestURL().toString(), "POST");
//        LtiVerificationResult ltiResult = new LtiVerificationResult(true,null,"");
//        LtiVerificationResult ltiResult2 = new LtiVerificationResult(true,null,"");
//        LtiVerificationResult ltiResult3 = new LtiVerificationResult(true,null,"");
//        try {
//            ltiResult = ltiVerifier.verify(httpRequest, secret);
//            ltiResult2 = ltiVerifier.verifyParameters(map, httpRequest.getRequestURL().toString(),"POST", secret);
//            ltiResult3 = ltiVerifier.verifyParameters(map2, httpRequest.getRequestURL().toString(),"POST", secret);
//        } catch (LtiVerificationException e) {e.printStackTrace();}
//        String trace = ltiResult.getMessage();
//        if (ltiResult.getSuccess() || ltiResult2.getSuccess() || ltiResult3.getSuccess())
        if (httpRequest.getParameterMap().containsKey("lti_message_type") &&
                httpRequest.getParameter("lti_message_type").equals("basic-lti-launch-request") &&
                httpRequest.getParameterMap().containsKey("lti_version") &&
                httpRequest.getParameter("lti_version").equals("LTI-1p0"))
            response = Response.seeOther(new URI("http://localhost:8000"));
        else
            response = Response.serverError();
        return response.build();
    }

    public static String getSecret(String key) {
        if (key.equals("abc"))
            return "cba";
        else
            return "";
    }
}
