package com.github.avarabyeu.restendpoint.http.endpoint;

import com.google.mockwebserver.MockResponse;
import com.google.mockwebserver.RecordedRequest;
import org.junit.Assert;

/**
 * Created by andrey.vorobyov on 17/04/14.
 */
public class BaseRestEndointTest {

    public static final String SERIALIZED_STRING = "{\"intField\":100,\"stringField\":\"test string\"}";
    public static final String SERIALIZED_STRING_PATTERN = "{\"intField\":%d,\"stringField\":\"%s\"}";

    protected void validateHeader(RecordedRequest request) {
        Assert.assertTrue(request.getHeaders().contains("Content-Type: application/json; charset=UTF-8"));
    }

    protected MockResponse prepareResponse(String body) {
        return new MockResponse().setBody(body).setHeader("Content-Type", "application/json");
    }
}
