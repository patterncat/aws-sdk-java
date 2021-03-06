/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not
 * use this file except in compliance with the License. A copy of the License is
 * located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.apigateway.model.transform;

import java.util.Map;
import java.util.Map.Entry;
import java.math.*;
import java.nio.ByteBuffer;

import com.amazonaws.services.apigateway.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * UpdateAuthorizerResult JSON Unmarshaller
 */
public class UpdateAuthorizerResultJsonUnmarshaller implements
        Unmarshaller<UpdateAuthorizerResult, JsonUnmarshallerContext> {

    public UpdateAuthorizerResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        UpdateAuthorizerResult updateAuthorizerResult = new UpdateAuthorizerResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL)
            return null;

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("id", targetDepth)) {
                    context.nextToken();
                    updateAuthorizerResult.setId(context.getUnmarshaller(
                            String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    updateAuthorizerResult.setName(context.getUnmarshaller(
                            String.class).unmarshall(context));
                }
                if (context.testExpression("type", targetDepth)) {
                    context.nextToken();
                    updateAuthorizerResult.setType(context.getUnmarshaller(
                            String.class).unmarshall(context));
                }
                if (context.testExpression("providerARNs", targetDepth)) {
                    context.nextToken();
                    updateAuthorizerResult
                            .setProviderARNs(new ListUnmarshaller<String>(
                                    context.getUnmarshaller(String.class))
                                    .unmarshall(context));
                }
                if (context.testExpression("authType", targetDepth)) {
                    context.nextToken();
                    updateAuthorizerResult.setAuthType(context.getUnmarshaller(
                            String.class).unmarshall(context));
                }
                if (context.testExpression("authorizerUri", targetDepth)) {
                    context.nextToken();
                    updateAuthorizerResult.setAuthorizerUri(context
                            .getUnmarshaller(String.class).unmarshall(context));
                }
                if (context
                        .testExpression("authorizerCredentials", targetDepth)) {
                    context.nextToken();
                    updateAuthorizerResult.setAuthorizerCredentials(context
                            .getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("identitySource", targetDepth)) {
                    context.nextToken();
                    updateAuthorizerResult.setIdentitySource(context
                            .getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("identityValidationExpression",
                        targetDepth)) {
                    context.nextToken();
                    updateAuthorizerResult
                            .setIdentityValidationExpression(context
                                    .getUnmarshaller(String.class).unmarshall(
                                            context));
                }
                if (context.testExpression("authorizerResultTtlInSeconds",
                        targetDepth)) {
                    context.nextToken();
                    updateAuthorizerResult
                            .setAuthorizerResultTtlInSeconds(context
                                    .getUnmarshaller(Integer.class).unmarshall(
                                            context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null
                        || context.getLastParsedParentElement().equals(
                                currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return updateAuthorizerResult;
    }

    private static UpdateAuthorizerResultJsonUnmarshaller instance;

    public static UpdateAuthorizerResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UpdateAuthorizerResultJsonUnmarshaller();
        return instance;
    }
}
