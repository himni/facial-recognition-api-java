/*
 * facial recognition api
 * # Introducão  Seja bem-vindo a documentação da API de Reconhecimento Facial da [HIMNI.COM](https://himni.com)   Nossa API foi criada utilizando o padrão [REST](https://restfulapi.net/) e [HATEOAS](https://restfulapi.net/hateoas/), possibilitando a integração de seu sistema ao nosso, e está documentada abaixo.  # Como usar a API?  Logo a seguir você encontrará todos os recursos e métodos suportados pela API, sendo que essa página possibilita que você teste os recursos e métodos diretamente através dela.  # Autenticação  Você precisa de um [HTTP BEARER TOKEN](https://oauth.net/2/bearer-tokens/) para identificar a conta que está realizando solicitações para a API. Você pode obter seu token de autenticação no seu [Painel do Cliente](https://face.himni.com.br/).  Insira seu token no campo que se encontra topo desta página para testar os métodos da API.
 *
 * OpenAPI spec version: 1.0
 * 
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


import io.swagger.client.model.PersonGroupCreate;
import io.swagger.client.model.PersonGroupCreateRequest;
import io.swagger.client.model.PersonGroupUpdate;
import io.swagger.client.model.PersonGroupUpdateRequest;
import io.swagger.client.model.PersonGroupsList;
import io.swagger.client.model.PersonGroupsView;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PersonGroupApi {
    private ApiClient apiClient;

    public PersonGroupApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PersonGroupApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for personGroupCreate
     * @param body  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call personGroupCreateCall(PersonGroupCreateRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/person-groups";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

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

        String[] localVarAuthNames = new String[] { "httpBearer" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call personGroupCreateValidateBeforeCall(PersonGroupCreateRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling personGroupCreate(Async)");
        }
        
        com.squareup.okhttp.Call call = personGroupCreateCall(body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Person Group - Create
     * Cria um novo grupo de pessoas com nome e metadados especificados pelo usuário.
     * @param body  (required)
     * @return PersonGroupCreate
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PersonGroupCreate personGroupCreate(PersonGroupCreateRequest body) throws ApiException {
        ApiResponse<PersonGroupCreate> resp = personGroupCreateWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Person Group - Create
     * Cria um novo grupo de pessoas com nome e metadados especificados pelo usuário.
     * @param body  (required)
     * @return ApiResponse&lt;PersonGroupCreate&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PersonGroupCreate> personGroupCreateWithHttpInfo(PersonGroupCreateRequest body) throws ApiException {
        com.squareup.okhttp.Call call = personGroupCreateValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<PersonGroupCreate>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Person Group - Create (asynchronously)
     * Cria um novo grupo de pessoas com nome e metadados especificados pelo usuário.
     * @param body  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call personGroupCreateAsync(PersonGroupCreateRequest body, final ApiCallback<PersonGroupCreate> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = personGroupCreateValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PersonGroupCreate>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for personGroupDelete
     * @param personGroupUuid  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call personGroupDeleteCall(String personGroupUuid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/person-groups/{person_group_uuid}"
            .replaceAll("\\{" + "person_group_uuid" + "\\}", apiClient.escapeString(personGroupUuid.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
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

        String[] localVarAuthNames = new String[] { "httpBearer" };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call personGroupDeleteValidateBeforeCall(String personGroupUuid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'personGroupUuid' is set
        if (personGroupUuid == null) {
            throw new ApiException("Missing the required parameter 'personGroupUuid' when calling personGroupDelete(Async)");
        }
        
        com.squareup.okhttp.Call call = personGroupDeleteCall(personGroupUuid, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Person Group - Delete
     * Exclui um grupo de pessoas existente. Todos as informações persistidas neste grupo de pessoas, incluindo as pessoas e os modelos de reconhecimento facial serão excluídos.
     * @param personGroupUuid  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void personGroupDelete(String personGroupUuid) throws ApiException {
        personGroupDeleteWithHttpInfo(personGroupUuid);
    }

    /**
     * Person Group - Delete
     * Exclui um grupo de pessoas existente. Todos as informações persistidas neste grupo de pessoas, incluindo as pessoas e os modelos de reconhecimento facial serão excluídos.
     * @param personGroupUuid  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> personGroupDeleteWithHttpInfo(String personGroupUuid) throws ApiException {
        com.squareup.okhttp.Call call = personGroupDeleteValidateBeforeCall(personGroupUuid, null, null);
        return apiClient.execute(call);
    }

    /**
     * Person Group - Delete (asynchronously)
     * Exclui um grupo de pessoas existente. Todos as informações persistidas neste grupo de pessoas, incluindo as pessoas e os modelos de reconhecimento facial serão excluídos.
     * @param personGroupUuid  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call personGroupDeleteAsync(String personGroupUuid, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = personGroupDeleteValidateBeforeCall(personGroupUuid, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for personGroupList
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call personGroupListCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/person-groups";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
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

        String[] localVarAuthNames = new String[] { "httpBearer" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call personGroupListValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = personGroupListCall(progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Person Group - List
     * Retorna uma listagem de todos os grupos de pessoas existentes contendo UUID, nome, metadados e quantidade de entidades cadastradas.
     * @return List&lt;PersonGroupsList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<PersonGroupsList> personGroupList() throws ApiException {
        ApiResponse<List<PersonGroupsList>> resp = personGroupListWithHttpInfo();
        return resp.getData();
    }

    /**
     * Person Group - List
     * Retorna uma listagem de todos os grupos de pessoas existentes contendo UUID, nome, metadados e quantidade de entidades cadastradas.
     * @return ApiResponse&lt;List&lt;PersonGroupsList&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<PersonGroupsList>> personGroupListWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = personGroupListValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<List<PersonGroupsList>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Person Group - List (asynchronously)
     * Retorna uma listagem de todos os grupos de pessoas existentes contendo UUID, nome, metadados e quantidade de entidades cadastradas.
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call personGroupListAsync(final ApiCallback<List<PersonGroupsList>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = personGroupListValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<PersonGroupsList>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for personGroupUpdate
     * @param body  (required)
     * @param personGroupUuid  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call personGroupUpdateCall(PersonGroupUpdateRequest body, String personGroupUuid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/person-groups/{person_group_uuid}"
            .replaceAll("\\{" + "person_group_uuid" + "\\}", apiClient.escapeString(personGroupUuid.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

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

        String[] localVarAuthNames = new String[] { "httpBearer" };
        return apiClient.buildCall(localVarPath, "PATCH", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call personGroupUpdateValidateBeforeCall(PersonGroupUpdateRequest body, String personGroupUuid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling personGroupUpdate(Async)");
        }
        // verify the required parameter 'personGroupUuid' is set
        if (personGroupUuid == null) {
            throw new ApiException("Missing the required parameter 'personGroupUuid' when calling personGroupUpdate(Async)");
        }
        
        com.squareup.okhttp.Call call = personGroupUpdateCall(body, personGroupUuid, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Person Group - Update
     * Atualiza o nome e metadados de um grupo de pessoas existente. As propriedades que estiverem ausentes do corpo da requisição não serão alteradas.
     * @param body  (required)
     * @param personGroupUuid  (required)
     * @return PersonGroupUpdate
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PersonGroupUpdate personGroupUpdate(PersonGroupUpdateRequest body, String personGroupUuid) throws ApiException {
        ApiResponse<PersonGroupUpdate> resp = personGroupUpdateWithHttpInfo(body, personGroupUuid);
        return resp.getData();
    }

    /**
     * Person Group - Update
     * Atualiza o nome e metadados de um grupo de pessoas existente. As propriedades que estiverem ausentes do corpo da requisição não serão alteradas.
     * @param body  (required)
     * @param personGroupUuid  (required)
     * @return ApiResponse&lt;PersonGroupUpdate&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PersonGroupUpdate> personGroupUpdateWithHttpInfo(PersonGroupUpdateRequest body, String personGroupUuid) throws ApiException {
        com.squareup.okhttp.Call call = personGroupUpdateValidateBeforeCall(body, personGroupUuid, null, null);
        Type localVarReturnType = new TypeToken<PersonGroupUpdate>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Person Group - Update (asynchronously)
     * Atualiza o nome e metadados de um grupo de pessoas existente. As propriedades que estiverem ausentes do corpo da requisição não serão alteradas.
     * @param body  (required)
     * @param personGroupUuid  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call personGroupUpdateAsync(PersonGroupUpdateRequest body, String personGroupUuid, final ApiCallback<PersonGroupUpdate> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = personGroupUpdateValidateBeforeCall(body, personGroupUuid, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PersonGroupUpdate>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for personGroupView
     * @param personGroupUuid  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call personGroupViewCall(String personGroupUuid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/person-groups/{person_group_uuid}"
            .replaceAll("\\{" + "person_group_uuid" + "\\}", apiClient.escapeString(personGroupUuid.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
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

        String[] localVarAuthNames = new String[] { "httpBearer" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call personGroupViewValidateBeforeCall(String personGroupUuid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'personGroupUuid' is set
        if (personGroupUuid == null) {
            throw new ApiException("Missing the required parameter 'personGroupUuid' when calling personGroupView(Async)");
        }
        
        com.squareup.okhttp.Call call = personGroupViewCall(personGroupUuid, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Person Group - View
     * Retorna as informações de um grupo de pessoas, incluindo nome, metadados, UUID e quantidade de entidades cadastradas. Este endpoint retorna apenas os dados do grupo de pessoas, para obter a lista de pessoas neste grupo utilize o endpoint Person - List.
     * @param personGroupUuid  (required)
     * @return PersonGroupsView
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PersonGroupsView personGroupView(String personGroupUuid) throws ApiException {
        ApiResponse<PersonGroupsView> resp = personGroupViewWithHttpInfo(personGroupUuid);
        return resp.getData();
    }

    /**
     * Person Group - View
     * Retorna as informações de um grupo de pessoas, incluindo nome, metadados, UUID e quantidade de entidades cadastradas. Este endpoint retorna apenas os dados do grupo de pessoas, para obter a lista de pessoas neste grupo utilize o endpoint Person - List.
     * @param personGroupUuid  (required)
     * @return ApiResponse&lt;PersonGroupsView&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PersonGroupsView> personGroupViewWithHttpInfo(String personGroupUuid) throws ApiException {
        com.squareup.okhttp.Call call = personGroupViewValidateBeforeCall(personGroupUuid, null, null);
        Type localVarReturnType = new TypeToken<PersonGroupsView>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Person Group - View (asynchronously)
     * Retorna as informações de um grupo de pessoas, incluindo nome, metadados, UUID e quantidade de entidades cadastradas. Este endpoint retorna apenas os dados do grupo de pessoas, para obter a lista de pessoas neste grupo utilize o endpoint Person - List.
     * @param personGroupUuid  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call personGroupViewAsync(String personGroupUuid, final ApiCallback<PersonGroupsView> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = personGroupViewValidateBeforeCall(personGroupUuid, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PersonGroupsView>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}