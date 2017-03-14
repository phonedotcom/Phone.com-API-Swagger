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

package io.swagger.client;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Date;
import io.swagger.client.model.*;

public class JsonUtil {
  public static GsonBuilder gsonBuilder;

  static {
    gsonBuilder = new GsonBuilder();
    gsonBuilder.serializeNulls();
    gsonBuilder.setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
    gsonBuilder.registerTypeAdapter(Date.class, new JsonDeserializer<Date>() {
      public Date deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        return new Date(json.getAsJsonPrimitive().getAsLong());
      }
    });
  }

  public static Gson getGson() {
    return gsonBuilder.create();
  }

  public static String serialize(Object obj){
    return getGson().toJson(obj);
  }

  public static <T> T deserializeToList(String jsonString, Class cls){
    return getGson().fromJson(jsonString, getListTypeForDeserialization(cls));
  }

  public static <T> T deserializeToObject(String jsonString, Class cls){
    return getGson().fromJson(jsonString, getTypeForDeserialization(cls));
  }

  public static Type getListTypeForDeserialization(Class cls) {
    String className = cls.getSimpleName();
    
    if ("AccountFull".equalsIgnoreCase(className)) {
      return new TypeToken<List<AccountFull>>(){}.getType();
    }
    
    if ("AccountSummary".equalsIgnoreCase(className)) {
      return new TypeToken<List<AccountSummary>>(){}.getType();
    }
    
    if ("Address".equalsIgnoreCase(className)) {
      return new TypeToken<List<Address>>(){}.getType();
    }
    
    if ("AddressListContacts".equalsIgnoreCase(className)) {
      return new TypeToken<List<AddressListContacts>>(){}.getType();
    }
    
    if ("ApplicationFull".equalsIgnoreCase(className)) {
      return new TypeToken<List<ApplicationFull>>(){}.getType();
    }
    
    if ("ApplicationSummary".equalsIgnoreCase(className)) {
      return new TypeToken<List<ApplicationSummary>>(){}.getType();
    }
    
    if ("AvailableNumbersFull".equalsIgnoreCase(className)) {
      return new TypeToken<List<AvailableNumbersFull>>(){}.getType();
    }
    
    if ("CallDetails".equalsIgnoreCase(className)) {
      return new TypeToken<List<CallDetails>>(){}.getType();
    }
    
    if ("CallFull".equalsIgnoreCase(className)) {
      return new TypeToken<List<CallFull>>(){}.getType();
    }
    
    if ("CallLogFull".equalsIgnoreCase(className)) {
      return new TypeToken<List<CallLogFull>>(){}.getType();
    }
    
    if ("CallNotifications".equalsIgnoreCase(className)) {
      return new TypeToken<List<CallNotifications>>(){}.getType();
    }
    
    if ("CallerIdFull".equalsIgnoreCase(className)) {
      return new TypeToken<List<CallerIdFull>>(){}.getType();
    }
    
    if ("CallerIdPhoneNumber".equalsIgnoreCase(className)) {
      return new TypeToken<List<CallerIdPhoneNumber>>(){}.getType();
    }
    
    if ("ContactAccount".equalsIgnoreCase(className)) {
      return new TypeToken<List<ContactAccount>>(){}.getType();
    }
    
    if ("ContactFull".equalsIgnoreCase(className)) {
      return new TypeToken<List<ContactFull>>(){}.getType();
    }
    
    if ("ContactSubaccount".equalsIgnoreCase(className)) {
      return new TypeToken<List<ContactSubaccount>>(){}.getType();
    }
    
    if ("ContactSummary".equalsIgnoreCase(className)) {
      return new TypeToken<List<ContactSummary>>(){}.getType();
    }
    
    if ("CreateCallParams".equalsIgnoreCase(className)) {
      return new TypeToken<List<CreateCallParams>>(){}.getType();
    }
    
    if ("CreateContactParams".equalsIgnoreCase(className)) {
      return new TypeToken<List<CreateContactParams>>(){}.getType();
    }
    
    if ("CreateDeviceParams".equalsIgnoreCase(className)) {
      return new TypeToken<List<CreateDeviceParams>>(){}.getType();
    }
    
    if ("CreateExtensionParams".equalsIgnoreCase(className)) {
      return new TypeToken<List<CreateExtensionParams>>(){}.getType();
    }
    
    if ("CreateGroupParams".equalsIgnoreCase(className)) {
      return new TypeToken<List<CreateGroupParams>>(){}.getType();
    }
    
    if ("CreateMediaParams".equalsIgnoreCase(className)) {
      return new TypeToken<List<CreateMediaParams>>(){}.getType();
    }
    
    if ("CreateMenuParams".equalsIgnoreCase(className)) {
      return new TypeToken<List<CreateMenuParams>>(){}.getType();
    }
    
    if ("CreatePhoneNumberParams".equalsIgnoreCase(className)) {
      return new TypeToken<List<CreatePhoneNumberParams>>(){}.getType();
    }
    
    if ("CreateQueueParams".equalsIgnoreCase(className)) {
      return new TypeToken<List<CreateQueueParams>>(){}.getType();
    }
    
    if ("CreateRouteParams".equalsIgnoreCase(className)) {
      return new TypeToken<List<CreateRouteParams>>(){}.getType();
    }
    
    if ("CreateSmsParams".equalsIgnoreCase(className)) {
      return new TypeToken<List<CreateSmsParams>>(){}.getType();
    }
    
    if ("CreateSubaccountParams".equalsIgnoreCase(className)) {
      return new TypeToken<List<CreateSubaccountParams>>(){}.getType();
    }
    
    if ("CreateTrunkParams".equalsIgnoreCase(className)) {
      return new TypeToken<List<CreateTrunkParams>>(){}.getType();
    }
    
    if ("DeleteContact".equalsIgnoreCase(className)) {
      return new TypeToken<List<DeleteContact>>(){}.getType();
    }
    
    if ("DeleteGroup".equalsIgnoreCase(className)) {
      return new TypeToken<List<DeleteGroup>>(){}.getType();
    }
    
    if ("DeleteMenu".equalsIgnoreCase(className)) {
      return new TypeToken<List<DeleteMenu>>(){}.getType();
    }
    
    if ("DeleteQueue".equalsIgnoreCase(className)) {
      return new TypeToken<List<DeleteQueue>>(){}.getType();
    }
    
    if ("DeleteRoute".equalsIgnoreCase(className)) {
      return new TypeToken<List<DeleteRoute>>(){}.getType();
    }
    
    if ("DeleteTrunk".equalsIgnoreCase(className)) {
      return new TypeToken<List<DeleteTrunk>>(){}.getType();
    }
    
    if ("DeviceFull".equalsIgnoreCase(className)) {
      return new TypeToken<List<DeviceFull>>(){}.getType();
    }
    
    if ("DeviceMembership".equalsIgnoreCase(className)) {
      return new TypeToken<List<DeviceMembership>>(){}.getType();
    }
    
    if ("DeviceSummary".equalsIgnoreCase(className)) {
      return new TypeToken<List<DeviceSummary>>(){}.getType();
    }
    
    if ("Email".equalsIgnoreCase(className)) {
      return new TypeToken<List<Email>>(){}.getType();
    }
    
    if ("ExpressServiceCodeFull".equalsIgnoreCase(className)) {
      return new TypeToken<List<ExpressServiceCodeFull>>(){}.getType();
    }
    
    if ("ExtensionFull".equalsIgnoreCase(className)) {
      return new TypeToken<List<ExtensionFull>>(){}.getType();
    }
    
    if ("ExtensionSummary".equalsIgnoreCase(className)) {
      return new TypeToken<List<ExtensionSummary>>(){}.getType();
    }
    
    if ("FilterCallLogs".equalsIgnoreCase(className)) {
      return new TypeToken<List<FilterCallLogs>>(){}.getType();
    }
    
    if ("FilterIdArray".equalsIgnoreCase(className)) {
      return new TypeToken<List<FilterIdArray>>(){}.getType();
    }
    
    if ("FilterIdDirectionFrom".equalsIgnoreCase(className)) {
      return new TypeToken<List<FilterIdDirectionFrom>>(){}.getType();
    }
    
    if ("FilterIdExtensionNameArray".equalsIgnoreCase(className)) {
      return new TypeToken<List<FilterIdExtensionNameArray>>(){}.getType();
    }
    
    if ("FilterIdGroupIdUpdatedAtArray".equalsIgnoreCase(className)) {
      return new TypeToken<List<FilterIdGroupIdUpdatedAtArray>>(){}.getType();
    }
    
    if ("FilterIdNameArray".equalsIgnoreCase(className)) {
      return new TypeToken<List<FilterIdNameArray>>(){}.getType();
    }
    
    if ("FilterIdNamePhoneNumberArray".equalsIgnoreCase(className)) {
      return new TypeToken<List<FilterIdNamePhoneNumberArray>>(){}.getType();
    }
    
    if ("FilterListAvailableNumbers".equalsIgnoreCase(className)) {
      return new TypeToken<List<FilterListAvailableNumbers>>(){}.getType();
    }
    
    if ("FilterListPhoneNumbersRegions".equalsIgnoreCase(className)) {
      return new TypeToken<List<FilterListPhoneNumbersRegions>>(){}.getType();
    }
    
    if ("FilterNameNumberArray".equalsIgnoreCase(className)) {
      return new TypeToken<List<FilterNameNumberArray>>(){}.getType();
    }
    
    if ("Greeting".equalsIgnoreCase(className)) {
      return new TypeToken<List<Greeting>>(){}.getType();
    }
    
    if ("GroupFull".equalsIgnoreCase(className)) {
      return new TypeToken<List<GroupFull>>(){}.getType();
    }
    
    if ("GroupListContacts".equalsIgnoreCase(className)) {
      return new TypeToken<List<GroupListContacts>>(){}.getType();
    }
    
    if ("GroupSummary".equalsIgnoreCase(className)) {
      return new TypeToken<List<GroupSummary>>(){}.getType();
    }
    
    if ("HoldMusic".equalsIgnoreCase(className)) {
      return new TypeToken<List<HoldMusic>>(){}.getType();
    }
    
    if ("Line".equalsIgnoreCase(className)) {
      return new TypeToken<List<Line>>(){}.getType();
    }
    
    if ("ListAccounts".equalsIgnoreCase(className)) {
      return new TypeToken<List<ListAccounts>>(){}.getType();
    }
    
    if ("ListApplications".equalsIgnoreCase(className)) {
      return new TypeToken<List<ListApplications>>(){}.getType();
    }
    
    if ("ListAvailableNumbers".equalsIgnoreCase(className)) {
      return new TypeToken<List<ListAvailableNumbers>>(){}.getType();
    }
    
    if ("ListCallLogs".equalsIgnoreCase(className)) {
      return new TypeToken<List<ListCallLogs>>(){}.getType();
    }
    
    if ("ListCallerIds".equalsIgnoreCase(className)) {
      return new TypeToken<List<ListCallerIds>>(){}.getType();
    }
    
    if ("ListContacts".equalsIgnoreCase(className)) {
      return new TypeToken<List<ListContacts>>(){}.getType();
    }
    
    if ("ListDevices".equalsIgnoreCase(className)) {
      return new TypeToken<List<ListDevices>>(){}.getType();
    }
    
    if ("ListExpressServiceCodes".equalsIgnoreCase(className)) {
      return new TypeToken<List<ListExpressServiceCodes>>(){}.getType();
    }
    
    if ("ListExtensions".equalsIgnoreCase(className)) {
      return new TypeToken<List<ListExtensions>>(){}.getType();
    }
    
    if ("ListGroups".equalsIgnoreCase(className)) {
      return new TypeToken<List<ListGroups>>(){}.getType();
    }
    
    if ("ListMedia".equalsIgnoreCase(className)) {
      return new TypeToken<List<ListMedia>>(){}.getType();
    }
    
    if ("ListMenus".equalsIgnoreCase(className)) {
      return new TypeToken<List<ListMenus>>(){}.getType();
    }
    
    if ("ListPhoneNumbers".equalsIgnoreCase(className)) {
      return new TypeToken<List<ListPhoneNumbers>>(){}.getType();
    }
    
    if ("ListPhoneNumbersRegions".equalsIgnoreCase(className)) {
      return new TypeToken<List<ListPhoneNumbersRegions>>(){}.getType();
    }
    
    if ("ListQueues".equalsIgnoreCase(className)) {
      return new TypeToken<List<ListQueues>>(){}.getType();
    }
    
    if ("ListRoutes".equalsIgnoreCase(className)) {
      return new TypeToken<List<ListRoutes>>(){}.getType();
    }
    
    if ("ListSchedules".equalsIgnoreCase(className)) {
      return new TypeToken<List<ListSchedules>>(){}.getType();
    }
    
    if ("ListSms".equalsIgnoreCase(className)) {
      return new TypeToken<List<ListSms>>(){}.getType();
    }
    
    if ("ListTrunks".equalsIgnoreCase(className)) {
      return new TypeToken<List<ListTrunks>>(){}.getType();
    }
    
    if ("MediaFull".equalsIgnoreCase(className)) {
      return new TypeToken<List<MediaFull>>(){}.getType();
    }
    
    if ("MediaSummary".equalsIgnoreCase(className)) {
      return new TypeToken<List<MediaSummary>>(){}.getType();
    }
    
    if ("Member".equalsIgnoreCase(className)) {
      return new TypeToken<List<Member>>(){}.getType();
    }
    
    if ("MenuFull".equalsIgnoreCase(className)) {
      return new TypeToken<List<MenuFull>>(){}.getType();
    }
    
    if ("MenuSummary".equalsIgnoreCase(className)) {
      return new TypeToken<List<MenuSummary>>(){}.getType();
    }
    
    if ("Notification".equalsIgnoreCase(className)) {
      return new TypeToken<List<Notification>>(){}.getType();
    }
    
    if ("Option".equalsIgnoreCase(className)) {
      return new TypeToken<List<Option>>(){}.getType();
    }
    
    if ("PhoneNumberContact".equalsIgnoreCase(className)) {
      return new TypeToken<List<PhoneNumberContact>>(){}.getType();
    }
    
    if ("PhoneNumberFull".equalsIgnoreCase(className)) {
      return new TypeToken<List<PhoneNumberFull>>(){}.getType();
    }
    
    if ("PhoneNumbersRegionFull".equalsIgnoreCase(className)) {
      return new TypeToken<List<PhoneNumbersRegionFull>>(){}.getType();
    }
    
    if ("PingResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<PingResponse>>(){}.getType();
    }
    
    if ("QueueFull".equalsIgnoreCase(className)) {
      return new TypeToken<List<QueueFull>>(){}.getType();
    }
    
    if ("QueueSummary".equalsIgnoreCase(className)) {
      return new TypeToken<List<QueueSummary>>(){}.getType();
    }
    
    if ("Recipient".equalsIgnoreCase(className)) {
      return new TypeToken<List<Recipient>>(){}.getType();
    }
    
    if ("ReplaceExtensionParams".equalsIgnoreCase(className)) {
      return new TypeToken<List<ReplaceExtensionParams>>(){}.getType();
    }
    
    if ("ReplaceMenuParams".equalsIgnoreCase(className)) {
      return new TypeToken<List<ReplaceMenuParams>>(){}.getType();
    }
    
    if ("ReplacePhoneNumberParams".equalsIgnoreCase(className)) {
      return new TypeToken<List<ReplacePhoneNumberParams>>(){}.getType();
    }
    
    if ("RouteFull".equalsIgnoreCase(className)) {
      return new TypeToken<List<RouteFull>>(){}.getType();
    }
    
    if ("RouteSummary".equalsIgnoreCase(className)) {
      return new TypeToken<List<RouteSummary>>(){}.getType();
    }
    
    if ("RuleSet".equalsIgnoreCase(className)) {
      return new TypeToken<List<RuleSet>>(){}.getType();
    }
    
    if ("RuleSetAction".equalsIgnoreCase(className)) {
      return new TypeToken<List<RuleSetAction>>(){}.getType();
    }
    
    if ("RuleSetFilter".equalsIgnoreCase(className)) {
      return new TypeToken<List<RuleSetFilter>>(){}.getType();
    }
    
    if ("RuleSetForwardItem".equalsIgnoreCase(className)) {
      return new TypeToken<List<RuleSetForwardItem>>(){}.getType();
    }
    
    if ("ScheduleFull".equalsIgnoreCase(className)) {
      return new TypeToken<List<ScheduleFull>>(){}.getType();
    }
    
    if ("ScheduleSummary".equalsIgnoreCase(className)) {
      return new TypeToken<List<ScheduleSummary>>(){}.getType();
    }
    
    if ("SipAuthentication".equalsIgnoreCase(className)) {
      return new TypeToken<List<SipAuthentication>>(){}.getType();
    }
    
    if ("SmsForwarding".equalsIgnoreCase(className)) {
      return new TypeToken<List<SmsForwarding>>(){}.getType();
    }
    
    if ("SmsFull".equalsIgnoreCase(className)) {
      return new TypeToken<List<SmsFull>>(){}.getType();
    }
    
    if ("SortCallLogs".equalsIgnoreCase(className)) {
      return new TypeToken<List<SortCallLogs>>(){}.getType();
    }
    
    if ("SortId".equalsIgnoreCase(className)) {
      return new TypeToken<List<SortId>>(){}.getType();
    }
    
    if ("SortIdCreatedAt".equalsIgnoreCase(className)) {
      return new TypeToken<List<SortIdCreatedAt>>(){}.getType();
    }
    
    if ("SortIdExtensionName".equalsIgnoreCase(className)) {
      return new TypeToken<List<SortIdExtensionName>>(){}.getType();
    }
    
    if ("SortIdName".equalsIgnoreCase(className)) {
      return new TypeToken<List<SortIdName>>(){}.getType();
    }
    
    if ("SortIdNamePhoneNumber".equalsIgnoreCase(className)) {
      return new TypeToken<List<SortIdNamePhoneNumber>>(){}.getType();
    }
    
    if ("SortIdUpdatedAt".equalsIgnoreCase(className)) {
      return new TypeToken<List<SortIdUpdatedAt>>(){}.getType();
    }
    
    if ("SortListAvailableNumbers".equalsIgnoreCase(className)) {
      return new TypeToken<List<SortListAvailableNumbers>>(){}.getType();
    }
    
    if ("SortListPhoneNumbersRegions".equalsIgnoreCase(className)) {
      return new TypeToken<List<SortListPhoneNumbersRegions>>(){}.getType();
    }
    
    if ("SortNameNumber".equalsIgnoreCase(className)) {
      return new TypeToken<List<SortNameNumber>>(){}.getType();
    }
    
    if ("TrunkFull".equalsIgnoreCase(className)) {
      return new TypeToken<List<TrunkFull>>(){}.getType();
    }
    
    if ("TrunkSummary".equalsIgnoreCase(className)) {
      return new TypeToken<List<TrunkSummary>>(){}.getType();
    }
    
    if ("Voicemail".equalsIgnoreCase(className)) {
      return new TypeToken<List<Voicemail>>(){}.getType();
    }
    
    return new TypeToken<List<Object>>(){}.getType();
  }

  public static Type getTypeForDeserialization(Class cls) {
    String className = cls.getSimpleName();
    
    if ("AccountFull".equalsIgnoreCase(className)) {
      return new TypeToken<AccountFull>(){}.getType();
    }
    
    if ("AccountSummary".equalsIgnoreCase(className)) {
      return new TypeToken<AccountSummary>(){}.getType();
    }
    
    if ("Address".equalsIgnoreCase(className)) {
      return new TypeToken<Address>(){}.getType();
    }
    
    if ("AddressListContacts".equalsIgnoreCase(className)) {
      return new TypeToken<AddressListContacts>(){}.getType();
    }
    
    if ("ApplicationFull".equalsIgnoreCase(className)) {
      return new TypeToken<ApplicationFull>(){}.getType();
    }
    
    if ("ApplicationSummary".equalsIgnoreCase(className)) {
      return new TypeToken<ApplicationSummary>(){}.getType();
    }
    
    if ("AvailableNumbersFull".equalsIgnoreCase(className)) {
      return new TypeToken<AvailableNumbersFull>(){}.getType();
    }
    
    if ("CallDetails".equalsIgnoreCase(className)) {
      return new TypeToken<CallDetails>(){}.getType();
    }
    
    if ("CallFull".equalsIgnoreCase(className)) {
      return new TypeToken<CallFull>(){}.getType();
    }
    
    if ("CallLogFull".equalsIgnoreCase(className)) {
      return new TypeToken<CallLogFull>(){}.getType();
    }
    
    if ("CallNotifications".equalsIgnoreCase(className)) {
      return new TypeToken<CallNotifications>(){}.getType();
    }
    
    if ("CallerIdFull".equalsIgnoreCase(className)) {
      return new TypeToken<CallerIdFull>(){}.getType();
    }
    
    if ("CallerIdPhoneNumber".equalsIgnoreCase(className)) {
      return new TypeToken<CallerIdPhoneNumber>(){}.getType();
    }
    
    if ("ContactAccount".equalsIgnoreCase(className)) {
      return new TypeToken<ContactAccount>(){}.getType();
    }
    
    if ("ContactFull".equalsIgnoreCase(className)) {
      return new TypeToken<ContactFull>(){}.getType();
    }
    
    if ("ContactSubaccount".equalsIgnoreCase(className)) {
      return new TypeToken<ContactSubaccount>(){}.getType();
    }
    
    if ("ContactSummary".equalsIgnoreCase(className)) {
      return new TypeToken<ContactSummary>(){}.getType();
    }
    
    if ("CreateCallParams".equalsIgnoreCase(className)) {
      return new TypeToken<CreateCallParams>(){}.getType();
    }
    
    if ("CreateContactParams".equalsIgnoreCase(className)) {
      return new TypeToken<CreateContactParams>(){}.getType();
    }
    
    if ("CreateDeviceParams".equalsIgnoreCase(className)) {
      return new TypeToken<CreateDeviceParams>(){}.getType();
    }
    
    if ("CreateExtensionParams".equalsIgnoreCase(className)) {
      return new TypeToken<CreateExtensionParams>(){}.getType();
    }
    
    if ("CreateGroupParams".equalsIgnoreCase(className)) {
      return new TypeToken<CreateGroupParams>(){}.getType();
    }
    
    if ("CreateMediaParams".equalsIgnoreCase(className)) {
      return new TypeToken<CreateMediaParams>(){}.getType();
    }
    
    if ("CreateMenuParams".equalsIgnoreCase(className)) {
      return new TypeToken<CreateMenuParams>(){}.getType();
    }
    
    if ("CreatePhoneNumberParams".equalsIgnoreCase(className)) {
      return new TypeToken<CreatePhoneNumberParams>(){}.getType();
    }
    
    if ("CreateQueueParams".equalsIgnoreCase(className)) {
      return new TypeToken<CreateQueueParams>(){}.getType();
    }
    
    if ("CreateRouteParams".equalsIgnoreCase(className)) {
      return new TypeToken<CreateRouteParams>(){}.getType();
    }
    
    if ("CreateSmsParams".equalsIgnoreCase(className)) {
      return new TypeToken<CreateSmsParams>(){}.getType();
    }
    
    if ("CreateSubaccountParams".equalsIgnoreCase(className)) {
      return new TypeToken<CreateSubaccountParams>(){}.getType();
    }
    
    if ("CreateTrunkParams".equalsIgnoreCase(className)) {
      return new TypeToken<CreateTrunkParams>(){}.getType();
    }
    
    if ("DeleteContact".equalsIgnoreCase(className)) {
      return new TypeToken<DeleteContact>(){}.getType();
    }
    
    if ("DeleteGroup".equalsIgnoreCase(className)) {
      return new TypeToken<DeleteGroup>(){}.getType();
    }
    
    if ("DeleteMenu".equalsIgnoreCase(className)) {
      return new TypeToken<DeleteMenu>(){}.getType();
    }
    
    if ("DeleteQueue".equalsIgnoreCase(className)) {
      return new TypeToken<DeleteQueue>(){}.getType();
    }
    
    if ("DeleteRoute".equalsIgnoreCase(className)) {
      return new TypeToken<DeleteRoute>(){}.getType();
    }
    
    if ("DeleteTrunk".equalsIgnoreCase(className)) {
      return new TypeToken<DeleteTrunk>(){}.getType();
    }
    
    if ("DeviceFull".equalsIgnoreCase(className)) {
      return new TypeToken<DeviceFull>(){}.getType();
    }
    
    if ("DeviceMembership".equalsIgnoreCase(className)) {
      return new TypeToken<DeviceMembership>(){}.getType();
    }
    
    if ("DeviceSummary".equalsIgnoreCase(className)) {
      return new TypeToken<DeviceSummary>(){}.getType();
    }
    
    if ("Email".equalsIgnoreCase(className)) {
      return new TypeToken<Email>(){}.getType();
    }
    
    if ("ExpressServiceCodeFull".equalsIgnoreCase(className)) {
      return new TypeToken<ExpressServiceCodeFull>(){}.getType();
    }
    
    if ("ExtensionFull".equalsIgnoreCase(className)) {
      return new TypeToken<ExtensionFull>(){}.getType();
    }
    
    if ("ExtensionSummary".equalsIgnoreCase(className)) {
      return new TypeToken<ExtensionSummary>(){}.getType();
    }
    
    if ("FilterCallLogs".equalsIgnoreCase(className)) {
      return new TypeToken<FilterCallLogs>(){}.getType();
    }
    
    if ("FilterIdArray".equalsIgnoreCase(className)) {
      return new TypeToken<FilterIdArray>(){}.getType();
    }
    
    if ("FilterIdDirectionFrom".equalsIgnoreCase(className)) {
      return new TypeToken<FilterIdDirectionFrom>(){}.getType();
    }
    
    if ("FilterIdExtensionNameArray".equalsIgnoreCase(className)) {
      return new TypeToken<FilterIdExtensionNameArray>(){}.getType();
    }
    
    if ("FilterIdGroupIdUpdatedAtArray".equalsIgnoreCase(className)) {
      return new TypeToken<FilterIdGroupIdUpdatedAtArray>(){}.getType();
    }
    
    if ("FilterIdNameArray".equalsIgnoreCase(className)) {
      return new TypeToken<FilterIdNameArray>(){}.getType();
    }
    
    if ("FilterIdNamePhoneNumberArray".equalsIgnoreCase(className)) {
      return new TypeToken<FilterIdNamePhoneNumberArray>(){}.getType();
    }
    
    if ("FilterListAvailableNumbers".equalsIgnoreCase(className)) {
      return new TypeToken<FilterListAvailableNumbers>(){}.getType();
    }
    
    if ("FilterListPhoneNumbersRegions".equalsIgnoreCase(className)) {
      return new TypeToken<FilterListPhoneNumbersRegions>(){}.getType();
    }
    
    if ("FilterNameNumberArray".equalsIgnoreCase(className)) {
      return new TypeToken<FilterNameNumberArray>(){}.getType();
    }
    
    if ("Greeting".equalsIgnoreCase(className)) {
      return new TypeToken<Greeting>(){}.getType();
    }
    
    if ("GroupFull".equalsIgnoreCase(className)) {
      return new TypeToken<GroupFull>(){}.getType();
    }
    
    if ("GroupListContacts".equalsIgnoreCase(className)) {
      return new TypeToken<GroupListContacts>(){}.getType();
    }
    
    if ("GroupSummary".equalsIgnoreCase(className)) {
      return new TypeToken<GroupSummary>(){}.getType();
    }
    
    if ("HoldMusic".equalsIgnoreCase(className)) {
      return new TypeToken<HoldMusic>(){}.getType();
    }
    
    if ("Line".equalsIgnoreCase(className)) {
      return new TypeToken<Line>(){}.getType();
    }
    
    if ("ListAccounts".equalsIgnoreCase(className)) {
      return new TypeToken<ListAccounts>(){}.getType();
    }
    
    if ("ListApplications".equalsIgnoreCase(className)) {
      return new TypeToken<ListApplications>(){}.getType();
    }
    
    if ("ListAvailableNumbers".equalsIgnoreCase(className)) {
      return new TypeToken<ListAvailableNumbers>(){}.getType();
    }
    
    if ("ListCallLogs".equalsIgnoreCase(className)) {
      return new TypeToken<ListCallLogs>(){}.getType();
    }
    
    if ("ListCallerIds".equalsIgnoreCase(className)) {
      return new TypeToken<ListCallerIds>(){}.getType();
    }
    
    if ("ListContacts".equalsIgnoreCase(className)) {
      return new TypeToken<ListContacts>(){}.getType();
    }
    
    if ("ListDevices".equalsIgnoreCase(className)) {
      return new TypeToken<ListDevices>(){}.getType();
    }
    
    if ("ListExpressServiceCodes".equalsIgnoreCase(className)) {
      return new TypeToken<ListExpressServiceCodes>(){}.getType();
    }
    
    if ("ListExtensions".equalsIgnoreCase(className)) {
      return new TypeToken<ListExtensions>(){}.getType();
    }
    
    if ("ListGroups".equalsIgnoreCase(className)) {
      return new TypeToken<ListGroups>(){}.getType();
    }
    
    if ("ListMedia".equalsIgnoreCase(className)) {
      return new TypeToken<ListMedia>(){}.getType();
    }
    
    if ("ListMenus".equalsIgnoreCase(className)) {
      return new TypeToken<ListMenus>(){}.getType();
    }
    
    if ("ListPhoneNumbers".equalsIgnoreCase(className)) {
      return new TypeToken<ListPhoneNumbers>(){}.getType();
    }
    
    if ("ListPhoneNumbersRegions".equalsIgnoreCase(className)) {
      return new TypeToken<ListPhoneNumbersRegions>(){}.getType();
    }
    
    if ("ListQueues".equalsIgnoreCase(className)) {
      return new TypeToken<ListQueues>(){}.getType();
    }
    
    if ("ListRoutes".equalsIgnoreCase(className)) {
      return new TypeToken<ListRoutes>(){}.getType();
    }
    
    if ("ListSchedules".equalsIgnoreCase(className)) {
      return new TypeToken<ListSchedules>(){}.getType();
    }
    
    if ("ListSms".equalsIgnoreCase(className)) {
      return new TypeToken<ListSms>(){}.getType();
    }
    
    if ("ListTrunks".equalsIgnoreCase(className)) {
      return new TypeToken<ListTrunks>(){}.getType();
    }
    
    if ("MediaFull".equalsIgnoreCase(className)) {
      return new TypeToken<MediaFull>(){}.getType();
    }
    
    if ("MediaSummary".equalsIgnoreCase(className)) {
      return new TypeToken<MediaSummary>(){}.getType();
    }
    
    if ("Member".equalsIgnoreCase(className)) {
      return new TypeToken<Member>(){}.getType();
    }
    
    if ("MenuFull".equalsIgnoreCase(className)) {
      return new TypeToken<MenuFull>(){}.getType();
    }
    
    if ("MenuSummary".equalsIgnoreCase(className)) {
      return new TypeToken<MenuSummary>(){}.getType();
    }
    
    if ("Notification".equalsIgnoreCase(className)) {
      return new TypeToken<Notification>(){}.getType();
    }
    
    if ("Option".equalsIgnoreCase(className)) {
      return new TypeToken<Option>(){}.getType();
    }
    
    if ("PhoneNumberContact".equalsIgnoreCase(className)) {
      return new TypeToken<PhoneNumberContact>(){}.getType();
    }
    
    if ("PhoneNumberFull".equalsIgnoreCase(className)) {
      return new TypeToken<PhoneNumberFull>(){}.getType();
    }
    
    if ("PhoneNumbersRegionFull".equalsIgnoreCase(className)) {
      return new TypeToken<PhoneNumbersRegionFull>(){}.getType();
    }
    
    if ("PingResponse".equalsIgnoreCase(className)) {
      return new TypeToken<PingResponse>(){}.getType();
    }
    
    if ("QueueFull".equalsIgnoreCase(className)) {
      return new TypeToken<QueueFull>(){}.getType();
    }
    
    if ("QueueSummary".equalsIgnoreCase(className)) {
      return new TypeToken<QueueSummary>(){}.getType();
    }
    
    if ("Recipient".equalsIgnoreCase(className)) {
      return new TypeToken<Recipient>(){}.getType();
    }
    
    if ("ReplaceExtensionParams".equalsIgnoreCase(className)) {
      return new TypeToken<ReplaceExtensionParams>(){}.getType();
    }
    
    if ("ReplaceMenuParams".equalsIgnoreCase(className)) {
      return new TypeToken<ReplaceMenuParams>(){}.getType();
    }
    
    if ("ReplacePhoneNumberParams".equalsIgnoreCase(className)) {
      return new TypeToken<ReplacePhoneNumberParams>(){}.getType();
    }
    
    if ("RouteFull".equalsIgnoreCase(className)) {
      return new TypeToken<RouteFull>(){}.getType();
    }
    
    if ("RouteSummary".equalsIgnoreCase(className)) {
      return new TypeToken<RouteSummary>(){}.getType();
    }
    
    if ("RuleSet".equalsIgnoreCase(className)) {
      return new TypeToken<RuleSet>(){}.getType();
    }
    
    if ("RuleSetAction".equalsIgnoreCase(className)) {
      return new TypeToken<RuleSetAction>(){}.getType();
    }
    
    if ("RuleSetFilter".equalsIgnoreCase(className)) {
      return new TypeToken<RuleSetFilter>(){}.getType();
    }
    
    if ("RuleSetForwardItem".equalsIgnoreCase(className)) {
      return new TypeToken<RuleSetForwardItem>(){}.getType();
    }
    
    if ("ScheduleFull".equalsIgnoreCase(className)) {
      return new TypeToken<ScheduleFull>(){}.getType();
    }
    
    if ("ScheduleSummary".equalsIgnoreCase(className)) {
      return new TypeToken<ScheduleSummary>(){}.getType();
    }
    
    if ("SipAuthentication".equalsIgnoreCase(className)) {
      return new TypeToken<SipAuthentication>(){}.getType();
    }
    
    if ("SmsForwarding".equalsIgnoreCase(className)) {
      return new TypeToken<SmsForwarding>(){}.getType();
    }
    
    if ("SmsFull".equalsIgnoreCase(className)) {
      return new TypeToken<SmsFull>(){}.getType();
    }
    
    if ("SortCallLogs".equalsIgnoreCase(className)) {
      return new TypeToken<SortCallLogs>(){}.getType();
    }
    
    if ("SortId".equalsIgnoreCase(className)) {
      return new TypeToken<SortId>(){}.getType();
    }
    
    if ("SortIdCreatedAt".equalsIgnoreCase(className)) {
      return new TypeToken<SortIdCreatedAt>(){}.getType();
    }
    
    if ("SortIdExtensionName".equalsIgnoreCase(className)) {
      return new TypeToken<SortIdExtensionName>(){}.getType();
    }
    
    if ("SortIdName".equalsIgnoreCase(className)) {
      return new TypeToken<SortIdName>(){}.getType();
    }
    
    if ("SortIdNamePhoneNumber".equalsIgnoreCase(className)) {
      return new TypeToken<SortIdNamePhoneNumber>(){}.getType();
    }
    
    if ("SortIdUpdatedAt".equalsIgnoreCase(className)) {
      return new TypeToken<SortIdUpdatedAt>(){}.getType();
    }
    
    if ("SortListAvailableNumbers".equalsIgnoreCase(className)) {
      return new TypeToken<SortListAvailableNumbers>(){}.getType();
    }
    
    if ("SortListPhoneNumbersRegions".equalsIgnoreCase(className)) {
      return new TypeToken<SortListPhoneNumbersRegions>(){}.getType();
    }
    
    if ("SortNameNumber".equalsIgnoreCase(className)) {
      return new TypeToken<SortNameNumber>(){}.getType();
    }
    
    if ("TrunkFull".equalsIgnoreCase(className)) {
      return new TypeToken<TrunkFull>(){}.getType();
    }
    
    if ("TrunkSummary".equalsIgnoreCase(className)) {
      return new TypeToken<TrunkSummary>(){}.getType();
    }
    
    if ("Voicemail".equalsIgnoreCase(className)) {
      return new TypeToken<Voicemail>(){}.getType();
    }
    
    return new TypeToken<Object>(){}.getType();
  }

};
