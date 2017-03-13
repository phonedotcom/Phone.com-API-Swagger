//
// DevicesAPI.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Alamofire



open class DevicesAPI: APIBase {
    /**
     Register a generic VoIP device
     
     - parameter accountId: (path) Account ID 
     - parameter data: (body) Device data (optional)
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func createAccountDevice(accountId: Int32, data: CreateDeviceParams? = nil, completion: @escaping ((_ data: DeviceFull?,_ error: Error?) -> Void)) {
        createAccountDeviceWithRequestBuilder(accountId: accountId, data: data).execute { (response, error) -> Void in
            completion(response?.body, error);
        }
    }


    /**
     Register a generic VoIP device
     - POST /accounts/{accountId}/devices
     - 
     - API Key:
       - type: apiKey Authorization 
       - name: apiKey
     - examples: [{contentType=application/json, example={
  "sip_authentication" : {
    "password" : "aeiou",
    "port" : 123,
    "host" : "aeiou",
    "username" : "aeiou"
  },
  "name" : "aeiou",
  "id" : 123,
  "lines" : [ {
    "extension" : {
      "extension" : 123,
      "name" : "aeiou",
      "id" : 123
    },
    "line" : 123
  } ]
}}]
     
     - parameter accountId: (path) Account ID 
     - parameter data: (body) Device data (optional)

     - returns: RequestBuilder<DeviceFull> 
     */
    open class func createAccountDeviceWithRequestBuilder(accountId: Int32, data: CreateDeviceParams? = nil) -> RequestBuilder<DeviceFull> {
        var path = "/accounts/{accountId}/devices"
        path = path.replacingOccurrences(of: "{accountId}", with: "\(accountId)", options: .literal, range: nil)
        let URLString = SwaggerClientAPI.basePath + path
        let parameters = data?.encodeToJSON() as? [String:AnyObject]

        let url = NSURLComponents(string: URLString)


        let requestBuilder: RequestBuilder<DeviceFull>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "POST", URLString: (url?.string ?? URLString), parameters: parameters, isBody: true)
    }

    /**
     Show details of an individual VoIP device
     
     - parameter accountId: (path) Account ID 
     - parameter deviceId: (path) Device ID 
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func getAccountDevice(accountId: Int32, deviceId: Int32, completion: @escaping ((_ data: DeviceFull?,_ error: Error?) -> Void)) {
        getAccountDeviceWithRequestBuilder(accountId: accountId, deviceId: deviceId).execute { (response, error) -> Void in
            completion(response?.body, error);
        }
    }


    /**
     Show details of an individual VoIP device
     - GET /accounts/{accountId}/devices/{deviceId}
     - 
     - API Key:
       - type: apiKey Authorization 
       - name: apiKey
     - examples: [{contentType=application/json, example={
  "sip_authentication" : {
    "password" : "aeiou",
    "port" : 123,
    "host" : "aeiou",
    "username" : "aeiou"
  },
  "name" : "aeiou",
  "id" : 123,
  "lines" : [ {
    "extension" : {
      "extension" : 123,
      "name" : "aeiou",
      "id" : 123
    },
    "line" : 123
  } ]
}}]
     
     - parameter accountId: (path) Account ID 
     - parameter deviceId: (path) Device ID 

     - returns: RequestBuilder<DeviceFull> 
     */
    open class func getAccountDeviceWithRequestBuilder(accountId: Int32, deviceId: Int32) -> RequestBuilder<DeviceFull> {
        var path = "/accounts/{accountId}/devices/{deviceId}"
        path = path.replacingOccurrences(of: "{accountId}", with: "\(accountId)", options: .literal, range: nil)
        path = path.replacingOccurrences(of: "{deviceId}", with: "\(deviceId)", options: .literal, range: nil)
        let URLString = SwaggerClientAPI.basePath + path
        let parameters: [String:Any]? = nil

        let url = NSURLComponents(string: URLString)


        let requestBuilder: RequestBuilder<DeviceFull>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

    /**
     Get a list of VoIP devices associated with your account
     
     - parameter accountId: (path) Account ID 
     - parameter filtersId: (query) ID filter (optional)
     - parameter filtersName: (query) Name filter (optional)
     - parameter sortId: (query) ID sorting (optional)
     - parameter sortName: (query) Name sorting (optional)
     - parameter limit: (query) Max results (optional)
     - parameter offset: (query) Results to skip (optional)
     - parameter fields: (query) Field set (optional)
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func listAccountDevices(accountId: Int32, filtersId: [String]? = nil, filtersName: [String]? = nil, sortId: String? = nil, sortName: String? = nil, limit: Int32? = nil, offset: Int32? = nil, fields: String? = nil, completion: @escaping ((_ data: ListDevices?,_ error: Error?) -> Void)) {
        listAccountDevicesWithRequestBuilder(accountId: accountId, filtersId: filtersId, filtersName: filtersName, sortId: sortId, sortName: sortName, limit: limit, offset: offset, fields: fields).execute { (response, error) -> Void in
            completion(response?.body, error);
        }
    }


    /**
     Get a list of VoIP devices associated with your account
     - GET /accounts/{accountId}/devices
     - 
     - API Key:
       - type: apiKey Authorization 
       - name: apiKey
     - examples: [{contentType=application/json, example={
  "total" : 123,
  "offset" : 123,
  "limit" : 123,
  "filters" : {
    "name" : "aeiou",
    "id" : "aeiou"
  },
  "sort" : {
    "name" : "aeiou",
    "id" : "aeiou"
  },
  "items" : [ {
    "sip_authentication" : {
      "password" : "aeiou",
      "port" : 123,
      "host" : "aeiou",
      "username" : "aeiou"
    },
    "name" : "aeiou",
    "id" : 123,
    "lines" : [ {
      "extension" : {
        "extension" : 123,
        "name" : "aeiou",
        "id" : 123
      },
      "line" : 123
    } ]
  } ]
}}]
     
     - parameter accountId: (path) Account ID 
     - parameter filtersId: (query) ID filter (optional)
     - parameter filtersName: (query) Name filter (optional)
     - parameter sortId: (query) ID sorting (optional)
     - parameter sortName: (query) Name sorting (optional)
     - parameter limit: (query) Max results (optional)
     - parameter offset: (query) Results to skip (optional)
     - parameter fields: (query) Field set (optional)

     - returns: RequestBuilder<ListDevices> 
     */
    open class func listAccountDevicesWithRequestBuilder(accountId: Int32, filtersId: [String]? = nil, filtersName: [String]? = nil, sortId: String? = nil, sortName: String? = nil, limit: Int32? = nil, offset: Int32? = nil, fields: String? = nil) -> RequestBuilder<ListDevices> {
        var path = "/accounts/{accountId}/devices"
        path = path.replacingOccurrences(of: "{accountId}", with: "\(accountId)", options: .literal, range: nil)
        let URLString = SwaggerClientAPI.basePath + path
        let parameters: [String:Any]? = nil

        let url = NSURLComponents(string: URLString)
        url?.queryItems = APIHelper.mapValuesToQueryItems(values:[
            "filters[id]": filtersId, 
            "filters[name]": filtersName, 
            "sort[id]": sortId, 
            "sort[name]": sortName, 
            "limit": limit?.encodeToJSON(), 
            "offset": offset?.encodeToJSON(), 
            "fields": fields
        ])
        

        let requestBuilder: RequestBuilder<ListDevices>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

    /**
     Update the settings for an individual VoIP device
     
     - parameter accountId: (path) Account ID 
     - parameter deviceId: (path) Device ID 
     - parameter data: (body) Device data (optional)
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func replaceAccountDevice(accountId: Int32, deviceId: Int32, data: CreateDeviceParams? = nil, completion: @escaping ((_ data: DeviceFull?,_ error: Error?) -> Void)) {
        replaceAccountDeviceWithRequestBuilder(accountId: accountId, deviceId: deviceId, data: data).execute { (response, error) -> Void in
            completion(response?.body, error);
        }
    }


    /**
     Update the settings for an individual VoIP device
     - PUT /accounts/{accountId}/devices/{deviceId}
     - 
     - API Key:
       - type: apiKey Authorization 
       - name: apiKey
     - examples: [{contentType=application/json, example={
  "sip_authentication" : {
    "password" : "aeiou",
    "port" : 123,
    "host" : "aeiou",
    "username" : "aeiou"
  },
  "name" : "aeiou",
  "id" : 123,
  "lines" : [ {
    "extension" : {
      "extension" : 123,
      "name" : "aeiou",
      "id" : 123
    },
    "line" : 123
  } ]
}}]
     
     - parameter accountId: (path) Account ID 
     - parameter deviceId: (path) Device ID 
     - parameter data: (body) Device data (optional)

     - returns: RequestBuilder<DeviceFull> 
     */
    open class func replaceAccountDeviceWithRequestBuilder(accountId: Int32, deviceId: Int32, data: CreateDeviceParams? = nil) -> RequestBuilder<DeviceFull> {
        var path = "/accounts/{accountId}/devices/{deviceId}"
        path = path.replacingOccurrences(of: "{accountId}", with: "\(accountId)", options: .literal, range: nil)
        path = path.replacingOccurrences(of: "{deviceId}", with: "\(deviceId)", options: .literal, range: nil)
        let URLString = SwaggerClientAPI.basePath + path
        let parameters = data?.encodeToJSON() as? [String:AnyObject]

        let url = NSURLComponents(string: URLString)


        let requestBuilder: RequestBuilder<DeviceFull>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "PUT", URLString: (url?.string ?? URLString), parameters: parameters, isBody: true)
    }

}