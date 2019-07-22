# PersonGroupApi

All URIs are relative to *https://face.himni.com.br*

Method | HTTP request | Description
------------- | ------------- | -------------
[**personGroupCreate**](PersonGroupApi.md#personGroupCreate) | **POST** /person-groups | Person Group - Create
[**personGroupDelete**](PersonGroupApi.md#personGroupDelete) | **DELETE** /person-groups/{person_group_uuid} | Person Group - Delete
[**personGroupList**](PersonGroupApi.md#personGroupList) | **GET** /person-groups | Person Group - List
[**personGroupUpdate**](PersonGroupApi.md#personGroupUpdate) | **PATCH** /person-groups/{person_group_uuid} | Person Group - Update
[**personGroupView**](PersonGroupApi.md#personGroupView) | **GET** /person-groups/{person_group_uuid} | Person Group - View

<a name="personGroupCreate"></a>
# **personGroupCreate**
> PersonGroupCreate personGroupCreate(body)

Person Group - Create

Cria um novo grupo de pessoas com nome e metadados especificados pelo usuário.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PersonGroupApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


PersonGroupApi apiInstance = new PersonGroupApi();
PersonGroupCreateRequest body = new PersonGroupCreateRequest(); // PersonGroupCreateRequest | 
try {
    PersonGroupCreate result = apiInstance.personGroupCreate(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PersonGroupApi#personGroupCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PersonGroupCreateRequest**](PersonGroupCreateRequest.md)|  |

### Return type

[**PersonGroupCreate**](PersonGroupCreate.md)

### Authorization

[httpBearer](../README.md#httpBearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="personGroupDelete"></a>
# **personGroupDelete**
> personGroupDelete(personGroupUuid)

Person Group - Delete

Exclui um grupo de pessoas existente. Todos as informações persistidas neste grupo de pessoas, incluindo as pessoas e os modelos de reconhecimento facial serão excluídos.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PersonGroupApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


PersonGroupApi apiInstance = new PersonGroupApi();
String personGroupUuid = "personGroupUuid_example"; // String | 
try {
    apiInstance.personGroupDelete(personGroupUuid);
} catch (ApiException e) {
    System.err.println("Exception when calling PersonGroupApi#personGroupDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **personGroupUuid** | **String**|  |

### Return type

null (empty response body)

### Authorization

[httpBearer](../README.md#httpBearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="personGroupList"></a>
# **personGroupList**
> List&lt;PersonGroupsList&gt; personGroupList()

Person Group - List

Retorna uma listagem de todos os grupos de pessoas existentes contendo UUID, nome, metadados e quantidade de entidades cadastradas.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PersonGroupApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


PersonGroupApi apiInstance = new PersonGroupApi();
try {
    List<PersonGroupsList> result = apiInstance.personGroupList();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PersonGroupApi#personGroupList");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;PersonGroupsList&gt;**](PersonGroupsList.md)

### Authorization

[httpBearer](../README.md#httpBearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="personGroupUpdate"></a>
# **personGroupUpdate**
> PersonGroupUpdate personGroupUpdate(body, personGroupUuid)

Person Group - Update

Atualiza o nome e metadados de um grupo de pessoas existente. As propriedades que estiverem ausentes do corpo da requisição não serão alteradas.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PersonGroupApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


PersonGroupApi apiInstance = new PersonGroupApi();
PersonGroupUpdateRequest body = new PersonGroupUpdateRequest(); // PersonGroupUpdateRequest | 
String personGroupUuid = "personGroupUuid_example"; // String | 
try {
    PersonGroupUpdate result = apiInstance.personGroupUpdate(body, personGroupUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PersonGroupApi#personGroupUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PersonGroupUpdateRequest**](PersonGroupUpdateRequest.md)|  |
 **personGroupUuid** | **String**|  |

### Return type

[**PersonGroupUpdate**](PersonGroupUpdate.md)

### Authorization

[httpBearer](../README.md#httpBearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="personGroupView"></a>
# **personGroupView**
> PersonGroupsView personGroupView(personGroupUuid)

Person Group - View

Retorna as informações de um grupo de pessoas, incluindo nome, metadados, UUID e quantidade de entidades cadastradas. Este endpoint retorna apenas os dados do grupo de pessoas, para obter a lista de pessoas neste grupo utilize o endpoint Person - List.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PersonGroupApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


PersonGroupApi apiInstance = new PersonGroupApi();
String personGroupUuid = "personGroupUuid_example"; // String | 
try {
    PersonGroupsView result = apiInstance.personGroupView(personGroupUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PersonGroupApi#personGroupView");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **personGroupUuid** | **String**|  |

### Return type

[**PersonGroupsView**](PersonGroupsView.md)

### Authorization

[httpBearer](../README.md#httpBearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

