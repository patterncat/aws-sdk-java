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
package com.amazonaws.services.kinesisfirehose.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.kinesisfirehose.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * ElasticsearchDestinationDescriptionMarshaller
 */
public class ElasticsearchDestinationDescriptionJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(
            ElasticsearchDestinationDescription elasticsearchDestinationDescription,
            StructuredJsonGenerator jsonGenerator) {

        if (elasticsearchDestinationDescription == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (elasticsearchDestinationDescription.getRoleARN() != null) {
                jsonGenerator.writeFieldName("RoleARN").writeValue(
                        elasticsearchDestinationDescription.getRoleARN());
            }
            if (elasticsearchDestinationDescription.getDomainARN() != null) {
                jsonGenerator.writeFieldName("DomainARN").writeValue(
                        elasticsearchDestinationDescription.getDomainARN());
            }
            if (elasticsearchDestinationDescription.getIndexName() != null) {
                jsonGenerator.writeFieldName("IndexName").writeValue(
                        elasticsearchDestinationDescription.getIndexName());
            }
            if (elasticsearchDestinationDescription.getTypeName() != null) {
                jsonGenerator.writeFieldName("TypeName").writeValue(
                        elasticsearchDestinationDescription.getTypeName());
            }
            if (elasticsearchDestinationDescription.getIndexRotationPeriod() != null) {
                jsonGenerator.writeFieldName("IndexRotationPeriod").writeValue(
                        elasticsearchDestinationDescription
                                .getIndexRotationPeriod());
            }
            if (elasticsearchDestinationDescription.getBufferingHints() != null) {
                jsonGenerator.writeFieldName("BufferingHints");
                ElasticsearchBufferingHintsJsonMarshaller
                        .getInstance()
                        .marshall(
                                elasticsearchDestinationDescription
                                        .getBufferingHints(),
                                jsonGenerator);
            }
            if (elasticsearchDestinationDescription.getRetryOptions() != null) {
                jsonGenerator.writeFieldName("RetryOptions");
                ElasticsearchRetryOptionsJsonMarshaller.getInstance().marshall(
                        elasticsearchDestinationDescription.getRetryOptions(),
                        jsonGenerator);
            }
            if (elasticsearchDestinationDescription.getS3BackupMode() != null) {
                jsonGenerator.writeFieldName("S3BackupMode").writeValue(
                        elasticsearchDestinationDescription.getS3BackupMode());
            }
            if (elasticsearchDestinationDescription
                    .getS3DestinationDescription() != null) {
                jsonGenerator.writeFieldName("S3DestinationDescription");
                S3DestinationDescriptionJsonMarshaller
                        .getInstance()
                        .marshall(
                                elasticsearchDestinationDescription
                                        .getS3DestinationDescription(),
                                jsonGenerator);
            }
            if (elasticsearchDestinationDescription
                    .getCloudWatchLoggingOptions() != null) {
                jsonGenerator.writeFieldName("CloudWatchLoggingOptions");
                CloudWatchLoggingOptionsJsonMarshaller
                        .getInstance()
                        .marshall(
                                elasticsearchDestinationDescription
                                        .getCloudWatchLoggingOptions(),
                                jsonGenerator);
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ElasticsearchDestinationDescriptionJsonMarshaller instance;

    public static ElasticsearchDestinationDescriptionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ElasticsearchDestinationDescriptionJsonMarshaller();
        return instance;
    }

}
