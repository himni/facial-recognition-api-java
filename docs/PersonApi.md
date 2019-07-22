# PersonApi

All URIs are relative to *https://face.himni.com.br*

Method | HTTP request | Description
------------- | ------------- | -------------
[**personCreate**](PersonApi.md#personCreate) | **POST** /persons | Person - Create
[**personDelete**](PersonApi.md#personDelete) | **DELETE** /persons/{person_uuid} | Person - Delete
[**personList**](PersonApi.md#personList) | **GET** /persons | Person - List
[**personUpdate**](PersonApi.md#personUpdate) | **PATCH** /persons/{person_uuid} | Person - Update
[**personView**](PersonApi.md#personView) | **GET** /persons/{person_uuid} | Person - View

<a name="personCreate"></a>
# **personCreate**
> PersonCreate personCreate(body)

Person - Create

Cria uma nova Pessoa no Grupo de Pessoas especificado. Para cadastrar uma Face para esta Pessoa, utilize o endpoint Person - Create Face.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PersonApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


PersonApi apiInstance = new PersonApi();
PersonCreateRequest body = new PersonCreateRequest(); // PersonCreateRequest | 
try {
    PersonCreate result = apiInstance.personCreate(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PersonApi#personCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PersonCreateRequest**](PersonCreateRequest.md)|  |

### Return type

[**PersonCreate**](PersonCreate.md)

### Authorization

[httpBearer](../README.md#httpBearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="personDelete"></a>
# **personDelete**
> personDelete(personUuid)

Person - Delete

Exclui uma Pessoa existente em um Grupo de Pessoas. Todos os dados relacionados a esta entidade (nome, metadados, identificador e modelos de reconhecimento facial) serão excluídos.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PersonApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


PersonApi apiInstance = new PersonApi();
String personUuid = "personUuid_example"; // String | 
try {
    apiInstance.personDelete(personUuid);
} catch (ApiException e) {
    System.err.println("Exception when calling PersonApi#personDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **personUuid** | **String**|  |

### Return type

null (empty response body)

### Authorization

[httpBearer](../README.md#httpBearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="personList"></a>
# **personList**
> List&lt;PersonList&gt; personList()

Person - List

Exibe uma listagem de todas as informações das Pessoas no Grupo de Pessoas especificado, incluindo identificador, nome, metadados e modelos de reconhecimento facial cadastrados.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PersonApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


PersonApi apiInstance = new PersonApi();
try {
    List<PersonList> result = apiInstance.personList();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PersonApi#personList");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;PersonList&gt;**](PersonList.md)

### Authorization

[httpBearer](../README.md#httpBearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="personUpdate"></a>
# **personUpdate**
> PersonUpdate personUpdate(body, personUuid)

Person - Update

Atualiza o nome e / ou metadados de uma Pessoa.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PersonApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


PersonApi apiInstance = new PersonApi();
PersonUpdateRequest body = new PersonUpdateRequest(); // PersonUpdateRequest | 
String personUuid = "personUuid_example"; // String | 
try {
    PersonUpdate result = apiInstance.personUpdate(body, personUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PersonApi#personUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PersonUpdateRequest**](PersonUpdateRequest.md)|  |
 **personUuid** | **String**|  |

### Return type

[**PersonUpdate**](PersonUpdate.md)

### Authorization

[httpBearer](../README.md#httpBearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="personView"></a>
# **personView**
> PersonView personView(personUuid)

Person - View

Retorna o nome, os metadados e os modelos de reconhecimento facial de uma Pessoa.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PersonApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


PersonApi apiInstance = new PersonApi();
String personUuid = "personUuid_example"; // String | 
try {
    PersonView result = apiInstance.personView(personUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PersonApi#personView");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **personUuid** | **String**|  |

### Return type

[**PersonView**](PersonView.md)

### Authorization

[httpBearer](../README.md#httpBearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

