# DefaultApi

All URIs are relative to *https://localhost/api/v2/operations*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getTicket**](DefaultApi.md#getTicket) | **GET** /tickets/{ticket_id} | 
[**getTickets**](DefaultApi.md#getTickets) | **GET** /tickets | 
[**postMessages**](DefaultApi.md#postMessages) | **POST** /tickets/{ticket_id}/messages | 
[**postTickets**](DefaultApi.md#postTickets) | **POST** /tickets | 
[**putTickets**](DefaultApi.md#putTickets) | **PUT** /tickets | 


<a name="getTicket"></a>
# **getTicket**
> Ticket getTicket(ticketId, authenticationToken, category, statuses, orderedColumn, orderedBy, clientId, clientSecret)



Retrievs a ticket

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String ticketId = "ticketId_example"; // String | 
String authenticationToken = "authenticationToken_example"; // String | 
String category = "category_example"; // String | 
String statuses = "statuses_example"; // String | 
String orderedColumn = "orderedColumn_example"; // String | 
String orderedBy = "orderedBy_example"; // String | 
String clientId = "clientId_example"; // String | 
String clientSecret = "clientSecret_example"; // String | 
try {
    Ticket result = apiInstance.getTicket(ticketId, authenticationToken, category, statuses, orderedColumn, orderedBy, clientId, clientSecret);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getTicket");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ticketId** | **String**|  |
 **authenticationToken** | **String**|  | [optional]
 **category** | **String**|  | [optional]
 **statuses** | **String**|  | [optional]
 **orderedColumn** | **String**|  | [optional]
 **orderedBy** | **String**|  | [optional]
 **clientId** | **String**|  | [optional]
 **clientSecret** | **String**|  | [optional]

### Return type

[**Ticket**](Ticket.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTickets"></a>
# **getTickets**
> List&lt;Ticket&gt; getTickets(authenticationToken, start, length, draw, q, sortBy, sortByOrder, passedAccountId, passedUserId, viewId, clientId, clientSecret)



Retrieve tickets

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
BigDecimal authenticationToken = new BigDecimal(); // BigDecimal | User athentication uuid
Integer start = 56; // Integer | Start query value
Integer length = 56; // Integer | Number of rows query
Integer draw = 56; // Integer | Number of times table has been reloaded
String q = "q_example"; // String | Values provided in q are tokenized and search on columns: TICKET_ID,SUBJECT,REQUESTOR_UERNAME, REQUESTOR_EMAIL, TICKET_MESSAGES
String sortBy = "sortBy_example"; // String | Column name to order table by
String sortByOrder = "sortByOrder_example"; // String | Sort by ascending or descending
String passedAccountId = "passedAccountId_example"; // String | 
String passedUserId = "passedUserId_example"; // String | 
Integer viewId = 56; // Integer | View Id
String clientId = "clientId_example"; // String | API ID
String clientSecret = "clientSecret_example"; // String | API Secret
try {
    List<Ticket> result = apiInstance.getTickets(authenticationToken, start, length, draw, q, sortBy, sortByOrder, passedAccountId, passedUserId, viewId, clientId, clientSecret);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getTickets");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authenticationToken** | **BigDecimal**| User athentication uuid | [optional]
 **start** | **Integer**| Start query value | [optional]
 **length** | **Integer**| Number of rows query | [optional]
 **draw** | **Integer**| Number of times table has been reloaded | [optional]
 **q** | **String**| Values provided in q are tokenized and search on columns: TICKET_ID,SUBJECT,REQUESTOR_UERNAME, REQUESTOR_EMAIL, TICKET_MESSAGES | [optional]
 **sortBy** | **String**| Column name to order table by | [optional]
 **sortByOrder** | **String**| Sort by ascending or descending | [optional]
 **passedAccountId** | **String**|  | [optional]
 **passedUserId** | **String**|  | [optional]
 **viewId** | **Integer**| View Id | [optional]
 **clientId** | **String**| API ID | [optional]
 **clientSecret** | **String**| API Secret | [optional]

### Return type

[**List&lt;Ticket&gt;**](Ticket.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="postMessages"></a>
# **postMessages**
> postMessages(body, ticketId, authenticationToken, clientId, clientSecret)



Insert a messages

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Ticket body = new Ticket(); // Ticket | The request body for the operation
String ticketId = "ticketId_example"; // String | 
String authenticationToken = "authenticationToken_example"; // String | User athentication
String clientId = "clientId_example"; // String | api client
String clientSecret = "clientSecret_example"; // String | api secret
try {
    apiInstance.postMessages(body, ticketId, authenticationToken, clientId, clientSecret);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#postMessages");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Ticket**](Ticket.md)| The request body for the operation |
 **ticketId** | **String**|  |
 **authenticationToken** | **String**| User athentication | [optional]
 **clientId** | **String**| api client | [optional]
 **clientSecret** | **String**| api secret | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postTickets"></a>
# **postTickets**
> Ticket postTickets(body, authenticationToken, clientId, clientSecret)



Insert a tickets

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
List<TicketMessage> body = Arrays.asList(new TicketMessage()); // List<TicketMessage> | The request body for the operation
BigDecimal authenticationToken = new BigDecimal(); // BigDecimal | User athentication uuid
String clientId = "clientId_example"; // String | 
String clientSecret = "clientSecret_example"; // String | 
try {
    Ticket result = apiInstance.postTickets(body, authenticationToken, clientId, clientSecret);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#postTickets");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**List&lt;TicketMessage&gt;**](TicketMessage.md)| The request body for the operation |
 **authenticationToken** | **BigDecimal**| User athentication uuid | [optional]
 **clientId** | **String**|  | [optional]
 **clientSecret** | **String**|  | [optional]

### Return type

[**Ticket**](Ticket.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putTickets"></a>
# **putTickets**
> List&lt;Ticket&gt; putTickets(body, authenticationToken, clientId, clientSecret)



Update tickets

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
List<Ticket> body = Arrays.asList(new Ticket()); // List<Ticket> | The request body for the operation
Boolean authenticationToken = true; // Boolean | User athentication uuid
String clientId = "clientId_example"; // String | 
String clientSecret = "clientSecret_example"; // String | 
try {
    List<Ticket> result = apiInstance.putTickets(body, authenticationToken, clientId, clientSecret);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#putTickets");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**List&lt;Ticket&gt;**](Ticket.md)| The request body for the operation |
 **authenticationToken** | **Boolean**| User athentication uuid | [optional]
 **clientId** | **String**|  | [optional]
 **clientSecret** | **String**|  | [optional]

### Return type

[**List&lt;Ticket&gt;**](Ticket.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

