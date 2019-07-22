# FaceApi

All URIs are relative to *https://face.himni.com.br*

Method | HTTP request | Description
------------- | ------------- | -------------
[**personCreateFace**](FaceApi.md#personCreateFace) | **POST** /persons/{person_uuid} | Person - Create Face
[**personDeleteFace**](FaceApi.md#personDeleteFace) | **DELETE** /persons/{person_uuid}/{face_uuid} | Person - Delete Face
[**personUpdateFace**](FaceApi.md#personUpdateFace) | **PATCH** /persons/{person_uuid}/{face_uuid} | Person - Update Face
[**personViewFace**](FaceApi.md#personViewFace) | **GET** /persons/{person_uuid}/{face_uuid} | Person - View Face

<a name="personCreateFace"></a>
# **personCreateFace**
> PersonCreateFace personCreateFace(personUuid, picture, meta)

Person - Create Face

Cadastra uma Face para uma Pessoa no Grupo de Pessoas especificado. Em fotos com mais de um rosto, apenas o primeiro rosto identificado será utilizado. Nenhuma imagem é armazenada. Apenas os modelos de reconhecimento facial gerados a partir das imagens serão mantidos no servidor até que seja feita uma chamada a um destes endpoints: Person Group - Delete, Person - Delete e Person - Delete Face.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FaceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


FaceApi apiInstance = new FaceApi();
String personUuid = "personUuid_example"; // String | 
String picture = "picture_example"; // String | 
String meta = "meta_example"; // String | 
try {
    PersonCreateFace result = apiInstance.personCreateFace(personUuid, picture, meta);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FaceApi#personCreateFace");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **personUuid** | **String**|  |
 **picture** | **String**|  | [optional]
 **meta** | **String**|  | [optional]

### Return type

[**PersonCreateFace**](PersonCreateFace.md)

### Authorization

[httpBearer](../README.md#httpBearer)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="personDeleteFace"></a>
# **personDeleteFace**
> personDeleteFace(personUuid, faceUuid)

Person - Delete Face

Exclui uma Face de uma Pessoa existente no Grupo de Pessoas especificado.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FaceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


FaceApi apiInstance = new FaceApi();
String personUuid = "personUuid_example"; // String | 
String faceUuid = "faceUuid_example"; // String | 
try {
    apiInstance.personDeleteFace(personUuid, faceUuid);
} catch (ApiException e) {
    System.err.println("Exception when calling FaceApi#personDeleteFace");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **personUuid** | **String**|  |
 **faceUuid** | **String**|  |

### Return type

null (empty response body)

### Authorization

[httpBearer](../README.md#httpBearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="personUpdateFace"></a>
# **personUpdateFace**
> PersonUpdateFace personUpdateFace(body, personUuid, faceUuid)

Person - Update Face

Atualiza os metados de uma Face existente.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FaceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


FaceApi apiInstance = new FaceApi();
PersonUpdateFaceRequest body = new PersonUpdateFaceRequest(); // PersonUpdateFaceRequest | 
String personUuid = "personUuid_example"; // String | 
String faceUuid = "faceUuid_example"; // String | 
try {
    PersonUpdateFace result = apiInstance.personUpdateFace(body, personUuid, faceUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FaceApi#personUpdateFace");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PersonUpdateFaceRequest**](PersonUpdateFaceRequest.md)|  |
 **personUuid** | **String**|  |
 **faceUuid** | **String**|  |

### Return type

[**PersonUpdateFace**](PersonUpdateFace.md)

### Authorization

[httpBearer](../README.md#httpBearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="personViewFace"></a>
# **personViewFace**
> PersonViewFace personViewFace(personUuid, faceUuid)

Person - View Face

Exibe as informações (identificador e metadados) de uma Face. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FaceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


FaceApi apiInstance = new FaceApi();
String personUuid = "personUuid_example"; // String | 
String faceUuid = "faceUuid_example"; // String | 
try {
    PersonViewFace result = apiInstance.personViewFace(personUuid, faceUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FaceApi#personViewFace");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **personUuid** | **String**|  |
 **faceUuid** | **String**|  |

### Return type

[**PersonViewFace**](PersonViewFace.md)

### Authorization

[httpBearer](../README.md#httpBearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

