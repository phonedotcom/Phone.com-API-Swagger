package main

/******************* Phone.com API endpoints *********************/

const createCall = "create-account-call"
const createDevice = "create-account-device"
const createListener = "create-account-listener"
const createExtension = "create-account-extension"
const createMediaFiles = "create-account-media-files"
const createMediaTts = "create-account-media-tts"
const createMenu = "create-account-menu"
const createPhoneNumber = "create-account-phone-number"
const createQueue = "create-account-queue"
const createRoute = "create-account-route"
const createSms = "create-account-sms"
const createSubaccount = "create-account-subaccount"
const createPricing = "create-account-subaccount-pricing"
const createTrunk = "create-account-trunk"
const createContact = "create-account-extension-contact"
const createGroup = "create-account-extension-contact-group"
const createOauthClientRedirectUri = "create-account-oauth-client-redirect-uri"
const createPaymentMethod = "create-account-payment-method"

const deleteDevice = "delete-account-device"
const deleteListener = "delete-account-listener"
const deleteMedia = "delete-account-media"
const deleteMenu = "delete-account-menu"
const deleteQueue = "delete-account-queue"
const deleteRoute = "delete-account-route"
const deletePricing = "delete-account-subaccount-pricing"
const deleteTrunk = "delete-account-trunk"
const deleteContact = "delete-account-extension-contact"
const deleteGroup = "delete-account-extension-contact-group"
const deleteOauthClient = "delete-account-oauth-client"
const deleteOauthClientRedirectUri = "delete-account-oauth-client-redirect-uri"
const deletePaymentMethod = "delete-account-payment-method"

const getAccount = "get-account"
const getApplication = "get-account-application"
const getCallLog = "get-account-call-log"
const getDevice = "get-account-device"
const getListener = "get-account-listener"
const getExpressServiceCode = "get-account-express-service-code"
const getExtension = "get-account-extension"
const getMedia = "get-account-media"
const getMenu = "get-account-menu"
const getOauthClient = "get-account-oauth-client"
const getOauthClientsRedirectUri = "get-account-oauth-clients-redirect-uri"
const getPaymentMethod = "get-account-payment-method"
const getPhoneNumber = "get-account-phone-number"
const getQueue = "get-account-queue"
const getRoute = "get-account-route"
const getSchedule = "get-account-schedule"
const getSms = "get-account-sms"
const getPricing = "get-account-subaccount-pricing"
const getTrunk = "get-account-trunk"
const getVoicemail = "get-account-voicemail"
const getContact = "get-account-extension-contact"
const getGroup = "get-account-extension-contact-group"

const listAccounts = "list-accounts"
const listApplications = "list-account-applications"
const listCallLogs = "list-account-call-logs"
const listDevices = "list-account-devices"
const listListeners = "list-account-listeners"
const listExpressServiceCodes = "list-account-express-service-codes"
const listExtensions = "list-account-extensions"
const listMedia = "list-account-media"
const listMenus = "list-account-menus"
const listOauthClients = "list-account-oauth-clients"
const listOauthClientsRedirectUris = "list-account-oauth-clients-redirect-uris"
const listPaymentMethods = "list-account-payment-methods"
const listPhoneNumbers = "list-account-phone-numbers"
const listQueues = "list-account-queues"
const listRoutes = "list-account-routes"
const listSchedules = "list-account-schedules"
const listSms = "list-account-sms"
const listSubaccounts = "list-account-subaccounts"
const listPricing = "list-account-subaccount-pricing"
const listTrunks = "list-account-trunks"
const listVoicemail= "list-account-voicemail"
const listCallerIds = "list-account-extension-caller-ids"
const listContacts = "list-account-extension-contacts"
const listGroups = "list-account-extension-contact-groups"
const listAvailablePhoneNumbers = "list-available-phone-numbers"
const listAvailablePhoneNumberRegions = "list-available-phone-number-regions"

const replaceDevice = "replace-account-device"
const replaceListener = "replace-account-listener"
const replaceExtension = "replace-account-extension"
const replaceMediaFiles = "replace-account-media-files"
const replaceMediaTts = "replace-account-media-tts"
const replaceMenu = "replace-account-menu"
const replacePhoneNumber = "replace-account-phone-number"
const replaceQueue = "replace-account-queue"
const replaceRoute = "replace-account-route"
const replaceTrunk = "replace-account-trunk"
const replaceContact = "replace-account-extension-contact"
const replaceGroup = "replace-account-extension-contact-group"

const patchPaymentMethod = "patch-account-payment-method"
const patchSms = "patch-account-sms"
const patchVoicemail = "patch-account-voicemail"

/******************* Code constants ***********************/

const responseError = "@error"
const responseHttpStatusCode = "@httpStatusCode"
const responseMessage = "@message"

const msgCouldNotGetResponse = "Could not get response from API"
const invalidCommand = "Invalid command: %s.\n\nPossible commands: \n\n%s"
const msgInvalidJson = "Phone.com API Error: Invalid JSON"
const msgHttpError = "Phone.com API HTTP Error: %v %v"
const msgCallingApi = "Calling '%+v' with parameters: %+v, expecting JSON response\n"
const couldNotUnmarshal = "Could not unmarshal input file: %s"
const couldNotReadFile = "Could not read input file: %s"
const msgFilterTypeNotRecognized = "The filter type '%s' is not recognized."
