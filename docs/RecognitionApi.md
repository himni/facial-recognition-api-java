# RecognitionApi

All URIs are relative to *https://face.himni.com.br*

Method | HTTP request | Description
------------- | ------------- | -------------
[**personGroupIdentify**](RecognitionApi.md#personGroupIdentify) | **POST** /person-groups/{person_group_uuid}/identify | Person Group - Identify
[**personVerify**](RecognitionApi.md#personVerify) | **POST** /persons/{person_uuid}/verify | Person - Verify

<a name="personGroupIdentify"></a>
# **personGroupIdentify**
> List&lt;PersonGroupIdentify&gt; personGroupIdentify(personGroupUuid, picture)

Person Group - Identify

Identificação das correspondências mais próximas a uma imagem enviada, dentro de um Grupo de Pessoas. Será calculada a similaridade entre a imagem enviada e os modelos de reconhecimento facial cadastrados no Grupo de Pessoas, e será retornada uma listagem dos candidatos àquela Face ordenadas pelo índice de confiança.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RecognitionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


RecognitionApi apiInstance = new RecognitionApi();
String personGroupUuid = "personGroupUuid_example"; // String | 
File picture = new File("picture_example"); // File | 
try {
    List<PersonGroupIdentify> result = apiInstance.personGroupIdentify(personGroupUuid, picture);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecognitionApi#personGroupIdentify");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **personGroupUuid** | **String**|  |
 **picture** | **File**|  | [optional]

### Return type

[**List&lt;PersonGroupIdentify&gt;**](PersonGroupIdentify.md)

### Authorization

[httpBearer](../README.md#httpBearer)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="personVerify"></a>
# **personVerify**
> PersonVerify personVerify(personUuid, picture)

Person - Verify

Verifica se a imagem enviada corresponde à uma Pessoa específica.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RecognitionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


RecognitionApi apiInstance = new RecognitionApi();
String personUuid = "personUuid_example"; // String | 
File picture = new File("picture_example"); // File | 
try {
    PersonVerify result = apiInstance.personVerify(personUuid, picture);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecognitionApi#personVerify");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **personUuid** | **String**|  |
 **picture** | **File**|  | [optional]

### Return type

[**PersonVerify**](PersonVerify.md)

### Authorization

[httpBearer](../README.md#httpBearer)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

