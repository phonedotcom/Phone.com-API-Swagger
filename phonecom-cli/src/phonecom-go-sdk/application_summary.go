/* 
 * Phone.com API
 *
 * This is a Phone.com api Swagger definition
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apisupport@phone.com
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */

package swagger

// The Application Summary Object is used to briefly represent an application. It can occur in several places throughout this API. Here are the properties:
type ApplicationSummary struct {

	// Application ID. Read-only.
	Id int32 `json:"id,omitempty"`

	// Application name
	Name string `json:"name,omitempty"`
}