//
// MediaAPI.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Alamofire



open class MediaAPI: APIBase {
    /**
     Add a media object to your account that can be used as a greeting or hold music. Users may create a media by using the built-in Text-to-speech (TTS) facility or upload a file of their choice. (Note: The maximum size for media files or JSON objects included with a POST or PUT request is 10 MB)
     
     - parameter accountId: (path) Account ID 
     - parameter data: (body) Media data (optional)
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func createAccountMedia(accountId: Int32, data: CreateMediaParams? = nil, completion: @escaping ((_ data: MediaFull?,_ error: Error?) -> Void)) {
        createAccountMediaWithRequestBuilder(accountId: accountId, data: data).execute { (response, error) -> Void in
            completion(response?.body, error);
        }
    }


    /**
     Add a media object to your account that can be used as a greeting or hold music. Users may create a media by using the built-in Text-to-speech (TTS) facility or upload a file of their choice. (Note: The maximum size for media files or JSON objects included with a POST or PUT request is 10 MB)
     - POST /accounts/{accountId}/media
     - See Account Media for more info on the properties.
     - API Key:
       - type: apiKey Authorization 
       - name: apiKey
     - examples: [{contentType=application/json, example={
  "name" : "aeiou",
  "id" : 123,
  "type" : "aeiou"
}}]
     
     - parameter accountId: (path) Account ID 
     - parameter data: (body) Media data (optional)

     - returns: RequestBuilder<MediaFull> 
     */
    open class func createAccountMediaWithRequestBuilder(accountId: Int32, data: CreateMediaParams? = nil) -> RequestBuilder<MediaFull> {
        var path = "/accounts/{accountId}/media"
        path = path.replacingOccurrences(of: "{accountId}", with: "\(accountId)", options: .literal, range: nil)
        let URLString = SwaggerClientAPI.basePath + path
        let parameters = data?.encodeToJSON() as? [String:AnyObject]

        let url = NSURLComponents(string: URLString)


        let requestBuilder: RequestBuilder<MediaFull>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "POST", URLString: (url?.string ?? URLString), parameters: parameters, isBody: true)
    }

    /**
     Show details of an individual media recording (Greeting or Hold Music)
     
     - parameter accountId: (path) Account ID 
     - parameter recordingId: (path) Recording ID 
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func getAccountMedia(accountId: Int32, recordingId: Int32, completion: @escaping ((_ data: MediaFull?,_ error: Error?) -> Void)) {
        getAccountMediaWithRequestBuilder(accountId: accountId, recordingId: recordingId).execute { (response, error) -> Void in
            completion(response?.body, error);
        }
    }


    /**
     Show details of an individual media recording (Greeting or Hold Music)
     - GET /accounts/{accountId}/media/{recordingId}
     - Get individual media recording
     - API Key:
       - type: apiKey Authorization 
       - name: apiKey
     - examples: [{contentType=application/json, example={
  "name" : "aeiou",
  "id" : 123,
  "type" : "aeiou"
}}]
     
     - parameter accountId: (path) Account ID 
     - parameter recordingId: (path) Recording ID 

     - returns: RequestBuilder<MediaFull> 
     */
    open class func getAccountMediaWithRequestBuilder(accountId: Int32, recordingId: Int32) -> RequestBuilder<MediaFull> {
        var path = "/accounts/{accountId}/media/{recordingId}"
        path = path.replacingOccurrences(of: "{accountId}", with: "\(accountId)", options: .literal, range: nil)
        path = path.replacingOccurrences(of: "{recordingId}", with: "\(recordingId)", options: .literal, range: nil)
        let URLString = SwaggerClientAPI.basePath + path
        let parameters: [String:Any]? = nil

        let url = NSURLComponents(string: URLString)


        let requestBuilder: RequestBuilder<MediaFull>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

    /**
     Get a list of media recordings for an account
     
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
    open class func listAccountMedia(accountId: Int32, filtersId: [String]? = nil, filtersName: [String]? = nil, sortId: String? = nil, sortName: String? = nil, limit: Int32? = nil, offset: Int32? = nil, fields: String? = nil, completion: @escaping ((_ data: ListMedia?,_ error: Error?) -> Void)) {
        listAccountMediaWithRequestBuilder(accountId: accountId, filtersId: filtersId, filtersName: filtersName, sortId: sortId, sortName: sortName, limit: limit, offset: offset, fields: fields).execute { (response, error) -> Void in
            completion(response?.body, error);
        }
    }


    /**
     Get a list of media recordings for an account
     - GET /accounts/{accountId}/media
     - See Account Menus for more info on the properties.
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
    "name" : "aeiou",
    "id" : 123
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

     - returns: RequestBuilder<ListMedia> 
     */
    open class func listAccountMediaWithRequestBuilder(accountId: Int32, filtersId: [String]? = nil, filtersName: [String]? = nil, sortId: String? = nil, sortName: String? = nil, limit: Int32? = nil, offset: Int32? = nil, fields: String? = nil) -> RequestBuilder<ListMedia> {
        var path = "/accounts/{accountId}/media"
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
        

        let requestBuilder: RequestBuilder<ListMedia>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

}
