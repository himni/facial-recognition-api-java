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


import java.io.File;
import io.swagger.client.model.PersonCreateFace;
import io.swagger.client.model.PersonUpdateFace;
import io.swagger.client.model.PersonUpdateFaceRequest;
import io.swagger.client.model.PersonViewFace;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FaceApi {
    private ApiClient apiClient;

    public FaceApi() {
        this(Configuration.getDefaultApiClient());
    }

    public FaceApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for personCreateFace
     * @param personUuid  (required)
     * @param picture  (optional)
     * @param meta  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call personCreateFaceCall(String personUuid, File picture, String meta, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/persons/{person_uuid}"
            .replaceAll("\\{" + "person_uuid" + "\\}", apiClient.escapeString(personUuid.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (picture != null)
        localVarFormParams.put("picture", picture);
        if (meta != null)
        localVarFormParams.put("meta", meta);

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "multipart/form-data"
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
    private com.squareup.okhttp.Call personCreateFaceValidateBeforeCall(String personUuid, File picture, String meta, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'personUuid' is set
        if (personUuid == null) {
            throw new ApiException("Missing the required parameter 'personUuid' when calling personCreateFace(Async)");
        }
        
        com.squareup.okhttp.Call call = personCreateFaceCall(personUuid, picture, meta, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Person - Create Face
     * Cadastra uma Face para uma Pessoa no Grupo de Pessoas especificado. Em fotos com mais de um rosto, apenas o primeiro rosto identificado será utilizado. Nenhuma imagem é armazenada. Apenas os modelos de reconhecimento facial gerados a partir das imagens serão mantidos no servidor até que seja feita uma chamada a um destes endpoints: Person Group - Delete, Person - Delete e Person - Delete Face.
     * @param personUuid  (required)
     * @param picture  (optional)
     * @param meta  (optional)
     * @return PersonCreateFace
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PersonCreateFace personCreateFace(String personUuid, File picture, String meta) throws ApiException {
        ApiResponse<PersonCreateFace> resp = personCreateFaceWithHttpInfo(personUuid, picture, meta);
        return resp.getData();
    }

    /**
     * Person - Create Face
     * Cadastra uma Face para uma Pessoa no Grupo de Pessoas especificado. Em fotos com mais de um rosto, apenas o primeiro rosto identificado será utilizado. Nenhuma imagem é armazenada. Apenas os modelos de reconhecimento facial gerados a partir das imagens serão mantidos no servidor até que seja feita uma chamada a um destes endpoints: Person Group - Delete, Person - Delete e Person - Delete Face.
     * @param personUuid  (required)
     * @param picture  (optional)
     * @param meta  (optional)
     * @return ApiResponse&lt;PersonCreateFace&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PersonCreateFace> personCreateFaceWithHttpInfo(String personUuid, File picture, String meta) throws ApiException {
        com.squareup.okhttp.Call call = personCreateFaceValidateBeforeCall(personUuid, picture, meta, null, null);
        Type localVarReturnType = new TypeToken<PersonCreateFace>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Person - Create Face (asynchronously)
     * Cadastra uma Face para uma Pessoa no Grupo de Pessoas especificado. Em fotos com mais de um rosto, apenas o primeiro rosto identificado será utilizado. Nenhuma imagem é armazenada. Apenas os modelos de reconhecimento facial gerados a partir das imagens serão mantidos no servidor até que seja feita uma chamada a um destes endpoints: Person Group - Delete, Person - Delete e Person - Delete Face.
     * @param personUuid  (required)
     * @param picture  (optional)
     * @param meta  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call personCreateFaceAsync(String personUuid, File picture, String meta, final ApiCallback<PersonCreateFace> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = personCreateFaceValidateBeforeCall(personUuid, picture, meta, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PersonCreateFace>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for personDeleteFace
     * @param personUuid  (required)
     * @param faceUuid  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call personDeleteFaceCall(String personUuid, String faceUuid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/persons/{person_uuid}/{face_uuid}"
            .replaceAll("\\{" + "person_uuid" + "\\}", apiClient.escapeString(personUuid.toString()))
            .replaceAll("\\{" + "face_uuid" + "\\}", apiClient.escapeString(faceUuid.toString()));

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
    private com.squareup.okhttp.Call personDeleteFaceValidateBeforeCall(String personUuid, String faceUuid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'personUuid' is set
        if (personUuid == null) {
            throw new ApiException("Missing the required parameter 'personUuid' when calling personDeleteFace(Async)");
        }
        // verify the required parameter 'faceUuid' is set
        if (faceUuid == null) {
            throw new ApiException("Missing the required parameter 'faceUuid' when calling personDeleteFace(Async)");
        }
        
        com.squareup.okhttp.Call call = personDeleteFaceCall(personUuid, faceUuid, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Person - Delete Face
     * Exclui uma Face de uma Pessoa existente no Grupo de Pessoas especificado.
     * @param personUuid  (required)
     * @param faceUuid  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void personDeleteFace(String personUuid, String faceUuid) throws ApiException {
        personDeleteFaceWithHttpInfo(personUuid, faceUuid);
    }

    /**
     * Person - Delete Face
     * Exclui uma Face de uma Pessoa existente no Grupo de Pessoas especificado.
     * @param personUuid  (required)
     * @param faceUuid  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> personDeleteFaceWithHttpInfo(String personUuid, String faceUuid) throws ApiException {
        com.squareup.okhttp.Call call = personDeleteFaceValidateBeforeCall(personUuid, faceUuid, null, null);
        return apiClient.execute(call);
    }

    /**
     * Person - Delete Face (asynchronously)
     * Exclui uma Face de uma Pessoa existente no Grupo de Pessoas especificado.
     * @param personUuid  (required)
     * @param faceUuid  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call personDeleteFaceAsync(String personUuid, String faceUuid, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = personDeleteFaceValidateBeforeCall(personUuid, faceUuid, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for personUpdateFace
     * @param body  (required)
     * @param personUuid  (required)
     * @param faceUuid  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call personUpdateFaceCall(PersonUpdateFaceRequest body, String personUuid, String faceUuid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/persons/{person_uuid}/{face_uuid}"
            .replaceAll("\\{" + "person_uuid" + "\\}", apiClient.escapeString(personUuid.toString()))
            .replaceAll("\\{" + "face_uuid" + "\\}", apiClient.escapeString(faceUuid.toString()));

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
    private com.squareup.okhttp.Call personUpdateFaceValidateBeforeCall(PersonUpdateFaceRequest body, String personUuid, String faceUuid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling personUpdateFace(Async)");
        }
        // verify the required parameter 'personUuid' is set
        if (personUuid == null) {
            throw new ApiException("Missing the required parameter 'personUuid' when calling personUpdateFace(Async)");
        }
        // verify the required parameter 'faceUuid' is set
        if (faceUuid == null) {
            throw new ApiException("Missing the required parameter 'faceUuid' when calling personUpdateFace(Async)");
        }
        
        com.squareup.okhttp.Call call = personUpdateFaceCall(body, personUuid, faceUuid, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Person - Update Face
     * Atualiza os metados de uma Face existente.
     * @param body  (required)
     * @param personUuid  (required)
     * @param faceUuid  (required)
     * @return PersonUpdateFace
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PersonUpdateFace personUpdateFace(PersonUpdateFaceRequest body, String personUuid, String faceUuid) throws ApiException {
        ApiResponse<PersonUpdateFace> resp = personUpdateFaceWithHttpInfo(body, personUuid, faceUuid);
        return resp.getData();
    }

    /**
     * Person - Update Face
     * Atualiza os metados de uma Face existente.
     * @param body  (required)
     * @param personUuid  (required)
     * @param faceUuid  (required)
     * @return ApiResponse&lt;PersonUpdateFace&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PersonUpdateFace> personUpdateFaceWithHttpInfo(PersonUpdateFaceRequest body, String personUuid, String faceUuid) throws ApiException {
        com.squareup.okhttp.Call call = personUpdateFaceValidateBeforeCall(body, personUuid, faceUuid, null, null);
        Type localVarReturnType = new TypeToken<PersonUpdateFace>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Person - Update Face (asynchronously)
     * Atualiza os metados de uma Face existente.
     * @param body  (required)
     * @param personUuid  (required)
     * @param faceUuid  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call personUpdateFaceAsync(PersonUpdateFaceRequest body, String personUuid, String faceUuid, final ApiCallback<PersonUpdateFace> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = personUpdateFaceValidateBeforeCall(body, personUuid, faceUuid, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PersonUpdateFace>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for personViewFace
     * @param personUuid  (required)
     * @param faceUuid  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call personViewFaceCall(String personUuid, String faceUuid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/persons/{person_uuid}/{face_uuid}"
            .replaceAll("\\{" + "person_uuid" + "\\}", apiClient.escapeString(personUuid.toString()))
            .replaceAll("\\{" + "face_uuid" + "\\}", apiClient.escapeString(faceUuid.toString()));

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
    private com.squareup.okhttp.Call personViewFaceValidateBeforeCall(String personUuid, String faceUuid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'personUuid' is set
        if (personUuid == null) {
            throw new ApiException("Missing the required parameter 'personUuid' when calling personViewFace(Async)");
        }
        // verify the required parameter 'faceUuid' is set
        if (faceUuid == null) {
            throw new ApiException("Missing the required parameter 'faceUuid' when calling personViewFace(Async)");
        }
        
        com.squareup.okhttp.Call call = personViewFaceCall(personUuid, faceUuid, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Person - View Face
     * Exibe as informações (identificador e metadados) de uma Face. 
     * @param personUuid  (required)
     * @param faceUuid  (required)
     * @return PersonViewFace
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PersonViewFace personViewFace(String personUuid, String faceUuid) throws ApiException {
        ApiResponse<PersonViewFace> resp = personViewFaceWithHttpInfo(personUuid, faceUuid);
        return resp.getData();
    }

    /**
     * Person - View Face
     * Exibe as informações (identificador e metadados) de uma Face. 
     * @param personUuid  (required)
     * @param faceUuid  (required)
     * @return ApiResponse&lt;PersonViewFace&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PersonViewFace> personViewFaceWithHttpInfo(String personUuid, String faceUuid) throws ApiException {
        com.squareup.okhttp.Call call = personViewFaceValidateBeforeCall(personUuid, faceUuid, null, null);
        Type localVarReturnType = new TypeToken<PersonViewFace>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Person - View Face (asynchronously)
     * Exibe as informações (identificador e metadados) de uma Face. 
     * @param personUuid  (required)
     * @param faceUuid  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call personViewFaceAsync(String personUuid, String faceUuid, final ApiCallback<PersonViewFace> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = personViewFaceValidateBeforeCall(personUuid, faceUuid, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PersonViewFace>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
