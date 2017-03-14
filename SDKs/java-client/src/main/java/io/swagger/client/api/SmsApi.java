/*
 * Phone.com API
 * This is a Phone.com api Swagger definition
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apisupport@phone.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.swagger.client.model.CreateSmsParams;
import io.swagger.client.model.ListSms;
import io.swagger.client.model.SmsFull;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SmsApi {
    private ApiClient apiClient;

    public SmsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SmsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for createAccountSms */
    private com.squareup.okhttp.Call createAccountSmsCall(Integer accountId, CreateSmsParams data, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = data;
        
        // create path and map variables
        String localVarPath = "/accounts/{account_id}/sms".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "apiKey" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call createAccountSmsValidateBeforeCall(Integer accountId, CreateSmsParams data, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling createAccountSms(Async)");
        }
        
        // verify the required parameter 'data' is set
        if (data == null) {
            throw new ApiException("Missing the required parameter 'data' when calling createAccountSms(Async)");
        }
        
        
        com.squareup.okhttp.Call call = createAccountSmsCall(accountId, data, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Send a SMS to one or a group of recipients
     * For more on the input fields, see Intro to SMS.
     * @param accountId Account ID (required)
     * @param data SMS data (required)
     * @return SmsFull
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SmsFull createAccountSms(Integer accountId, CreateSmsParams data) throws ApiException {
        ApiResponse<SmsFull> resp = createAccountSmsWithHttpInfo(accountId, data);
        return resp.getData();
    }

    /**
     * Send a SMS to one or a group of recipients
     * For more on the input fields, see Intro to SMS.
     * @param accountId Account ID (required)
     * @param data SMS data (required)
     * @return ApiResponse&lt;SmsFull&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SmsFull> createAccountSmsWithHttpInfo(Integer accountId, CreateSmsParams data) throws ApiException {
        com.squareup.okhttp.Call call = createAccountSmsValidateBeforeCall(accountId, data, null, null);
        Type localVarReturnType = new TypeToken<SmsFull>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Send a SMS to one or a group of recipients (asynchronously)
     * For more on the input fields, see Intro to SMS.
     * @param accountId Account ID (required)
     * @param data SMS data (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createAccountSmsAsync(Integer accountId, CreateSmsParams data, final ApiCallback<SmsFull> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = createAccountSmsValidateBeforeCall(accountId, data, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SmsFull>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getAccountSms */
    private com.squareup.okhttp.Call getAccountSmsCall(Integer accountId, String smsId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/accounts/{account_id}/sms/{sms_id}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()))
        .replaceAll("\\{" + "sms_id" + "\\}", apiClient.escapeString(smsId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "apiKey" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getAccountSmsValidateBeforeCall(Integer accountId, String smsId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling getAccountSms(Async)");
        }
        
        // verify the required parameter 'smsId' is set
        if (smsId == null) {
            throw new ApiException("Missing the required parameter 'smsId' when calling getAccountSms(Async)");
        }
        
        
        com.squareup.okhttp.Call call = getAccountSmsCall(accountId, smsId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Show details of an individual SMS
     * This service shows the details of an individual sms. See Intro to SMS for more info on the properties.
     * @param accountId Account ID (required)
     * @param smsId SMS ID (required)
     * @return SmsFull
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SmsFull getAccountSms(Integer accountId, String smsId) throws ApiException {
        ApiResponse<SmsFull> resp = getAccountSmsWithHttpInfo(accountId, smsId);
        return resp.getData();
    }

    /**
     * Show details of an individual SMS
     * This service shows the details of an individual sms. See Intro to SMS for more info on the properties.
     * @param accountId Account ID (required)
     * @param smsId SMS ID (required)
     * @return ApiResponse&lt;SmsFull&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SmsFull> getAccountSmsWithHttpInfo(Integer accountId, String smsId) throws ApiException {
        com.squareup.okhttp.Call call = getAccountSmsValidateBeforeCall(accountId, smsId, null, null);
        Type localVarReturnType = new TypeToken<SmsFull>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Show details of an individual SMS (asynchronously)
     * This service shows the details of an individual sms. See Intro to SMS for more info on the properties.
     * @param accountId Account ID (required)
     * @param smsId SMS ID (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAccountSmsAsync(Integer accountId, String smsId, final ApiCallback<SmsFull> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getAccountSmsValidateBeforeCall(accountId, smsId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SmsFull>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for listAccountSms */
    private com.squareup.okhttp.Call listAccountSmsCall(Integer accountId, List<String> filtersId, String filtersDirection, String filtersFrom, String sortId, String sortCreatedAt, Integer limit, Integer offset, String fields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/accounts/{account_id}/sms".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (filtersId != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filters[id]", filtersId));
        if (filtersDirection != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "filters[direction]", filtersDirection));
        if (filtersFrom != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "filters[from]", filtersFrom));
        if (sortId != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort[id]", sortId));
        if (sortCreatedAt != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort[created_at]", sortCreatedAt));
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
        if (offset != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));
        if (fields != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "fields", fields));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "apiKey" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call listAccountSmsValidateBeforeCall(Integer accountId, List<String> filtersId, String filtersDirection, String filtersFrom, String sortId, String sortCreatedAt, Integer limit, Integer offset, String fields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling listAccountSms(Async)");
        }
        
        
        com.squareup.okhttp.Call call = listAccountSmsCall(accountId, filtersId, filtersDirection, filtersFrom, sortId, sortCreatedAt, limit, offset, fields, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get a list of SMS messages for an account
     * See Intro to SMS for more info on the properties.
     * @param accountId Account ID (required)
     * @param filtersId ID filter (optional)
     * @param filtersDirection Direction filter (optional)
     * @param filtersFrom Caller ID filter (optional)
     * @param sortId ID sorting (optional)
     * @param sortCreatedAt Sort by created time of message (optional)
     * @param limit Max results (optional)
     * @param offset Results to skip (optional)
     * @param fields Field set (optional)
     * @return ListSms
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ListSms listAccountSms(Integer accountId, List<String> filtersId, String filtersDirection, String filtersFrom, String sortId, String sortCreatedAt, Integer limit, Integer offset, String fields) throws ApiException {
        ApiResponse<ListSms> resp = listAccountSmsWithHttpInfo(accountId, filtersId, filtersDirection, filtersFrom, sortId, sortCreatedAt, limit, offset, fields);
        return resp.getData();
    }

    /**
     * Get a list of SMS messages for an account
     * See Intro to SMS for more info on the properties.
     * @param accountId Account ID (required)
     * @param filtersId ID filter (optional)
     * @param filtersDirection Direction filter (optional)
     * @param filtersFrom Caller ID filter (optional)
     * @param sortId ID sorting (optional)
     * @param sortCreatedAt Sort by created time of message (optional)
     * @param limit Max results (optional)
     * @param offset Results to skip (optional)
     * @param fields Field set (optional)
     * @return ApiResponse&lt;ListSms&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ListSms> listAccountSmsWithHttpInfo(Integer accountId, List<String> filtersId, String filtersDirection, String filtersFrom, String sortId, String sortCreatedAt, Integer limit, Integer offset, String fields) throws ApiException {
        com.squareup.okhttp.Call call = listAccountSmsValidateBeforeCall(accountId, filtersId, filtersDirection, filtersFrom, sortId, sortCreatedAt, limit, offset, fields, null, null);
        Type localVarReturnType = new TypeToken<ListSms>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get a list of SMS messages for an account (asynchronously)
     * See Intro to SMS for more info on the properties.
     * @param accountId Account ID (required)
     * @param filtersId ID filter (optional)
     * @param filtersDirection Direction filter (optional)
     * @param filtersFrom Caller ID filter (optional)
     * @param sortId ID sorting (optional)
     * @param sortCreatedAt Sort by created time of message (optional)
     * @param limit Max results (optional)
     * @param offset Results to skip (optional)
     * @param fields Field set (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listAccountSmsAsync(Integer accountId, List<String> filtersId, String filtersDirection, String filtersFrom, String sortId, String sortCreatedAt, Integer limit, Integer offset, String fields, final ApiCallback<ListSms> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = listAccountSmsValidateBeforeCall(accountId, filtersId, filtersDirection, filtersFrom, sortId, sortCreatedAt, limit, offset, fields, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ListSms>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}