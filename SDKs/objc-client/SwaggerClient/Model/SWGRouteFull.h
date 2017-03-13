#import <Foundation/Foundation.h>
#import "SWGObject.h"

/**
* Phone.com API
* This is a Phone.com api Swagger definition
*
* OpenAPI spec version: 1.0.0
* Contact: apisupport@phone.com
*
* NOTE: This class is auto generated by the swagger code generator program.
* https://github.com/swagger-api/swagger-codegen.git
* Do not edit the class manually.
*/


#import "SWGExtensionSummary.h"
#import "SWGRuleSet.h"


@protocol SWGRouteFull
@end

@interface SWGRouteFull : SWGObject

/* Integer ID. Read-only. [optional]
 */
@property(nonatomic) NSNumber* _id;
/* Name [optional]
 */
@property(nonatomic) NSString* name;
/* Extension to which this route belongs. Output is an Extension Summary Object. Input must be an Extension Lookup Object. Optional. Cannot be changed after a route is created. [optional]
 */
@property(nonatomic) SWGExtensionSummary* extension;
/* Array of Rule Set Objects. Required. See below for details. When processing incoming calls, the first matching rule set will be used, and all others will be ignored. [optional]
 */
@property(nonatomic) NSArray<SWGRuleSet>* rules;

@end