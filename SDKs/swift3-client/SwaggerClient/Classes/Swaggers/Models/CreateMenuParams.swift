//
// CreateMenuParams.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


open class CreateMenuParams: JSONEncodable {
    public var name: String?
    public var mainMessage: Any?
    public var invalidKeypressMessage: Any?
    public var allowExtensionDial: Bool?
    public var keypressWaitTime: Int32?
    public var timeoutHandler: Any?
    public var options: [Any]?

    public init() {}

    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["name"] = self.name
        nillableDictionary["main_message"] = self.mainMessage
        nillableDictionary["invalid_keypress_message"] = self.invalidKeypressMessage
        nillableDictionary["allow_extension_dial"] = self.allowExtensionDial
        nillableDictionary["keypress_wait_time"] = self.keypressWaitTime?.encodeToJSON()
        nillableDictionary["timeout_handler"] = self.timeoutHandler
        nillableDictionary["options"] = self.options?.encodeToJSON()
        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}