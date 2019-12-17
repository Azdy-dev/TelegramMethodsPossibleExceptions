package messenger.telegram.method.exceptions

open class AppException(override val message: String?, t: Throwable? = null) : java.lang.Exception(message, t)
open class AllPossibleExceptions(override val message: String, open val code: Int = 400) : AppException(message)


/**
 * This method can't be used by a bot
 */
object BotMethodInvalid : AllPossibleExceptions("BOT_METHOD_INVALID", 400)

/**
 * The provided peer id is invalid
 */
object PeerIdInvalid : AllPossibleExceptions("PEER_ID_INVALID", 400)

/**
 * The provided channel is invalid
 */
object ChannelInvalid : AllPossibleExceptions("CHANNEL_INVALID", 400)

/**
 * The specified user was deleted
 */
object InputUserDeactivated : AllPossibleExceptions("INPUT_USER_DEACTIVATED", 400)

/**
 * The provided chat id is invalid
 */
object ChatIdInvalid : AllPossibleExceptions("CHAT_ID_INVALID", 400)

/**
 * Device model empty
 */
object ConnectionDeviceModelEmpty : AllPossibleExceptions("CONNECTION_DEVICE_MODEL_EMPTY", 400)

/**
 * Timeout while fetching data
 */
object Timeout : AllPossibleExceptions("Timeout", -503)

/**
 * Layer invalid
 */
object ConnectionLayerInvalid : AllPossibleExceptions("CONNECTION_LAYER_INVALID", 400)

/**
 * The provided authorization is invalid
 */
object AuthBytesInvalid : AllPossibleExceptions("AUTH_BYTES_INVALID", 400)

/**
 * You can't call this method in a CDN DC
 */
object CdnMethodInvalid : AllPossibleExceptions("CDN_METHOD_INVALID", 400)

/**
 * You can't write in this chat
 */
object ChatWriteForbidden : AllPossibleExceptions("CHAT_WRITE_FORBIDDEN", 403)

/**
 * The provided API id is invalid
 */
object ConnectionApiIdInvalid : AllPossibleExceptions("CONNECTION_API_ID_INVALID", 400)

/**
 * Language pack invalid
 */
object ConnectionLangPackInvalid : AllPossibleExceptions("CONNECTION_LANG_PACK_INVALID", 400)

/**
 * Connection not initialized
 */
object ConnectionNotInited : AllPossibleExceptions("CONNECTION_NOT_INITED", 400)

/**
 * Connection system empty
 */
object ConnectionSystemEmpty : AllPossibleExceptions("CONNECTION_SYSTEM_EMPTY", 400)

/**
 * The provided layer is invalid
 */
object InputLayerInvalid : AllPossibleExceptions("INPUT_LAYER_INVALID", 400)

/**
 * The invite link has expired
 */
object InviteHashExpired : AllPossibleExceptions("INVITE_HASH_EXPIRED", 400)

/**
 * Encrypted message is incorrect
 */
object EncryptedMessageInvalid : AllPossibleExceptions("ENCRYPTED_MESSAGE_INVALID", 400)

/**
 * The request is too big
 */
object InputRequestTooLong : AllPossibleExceptions("INPUT_REQUEST_TOO_LONG", 400)

/**
 * The passed temporary key is already bound to another perm_auth_key_id
 */
object TempAuthKeyAlreadyBound : AllPossibleExceptions("TEMP_AUTH_KEY_ALREADY_BOUND", 400)

/**
 * The request was not performed with a temporary authorization key
 */
object TempAuthKeyEmpty : AllPossibleExceptions("TEMP_AUTH_KEY_EMPTY", 400)

/**
 * The phone number is invalid
 */
object PhoneNumberInvalid : AllPossibleExceptions("PHONE_NUMBER_INVALID", 400)

/**
 * The provided password isn't valid
 */
object PasswordHashInvalid : AllPossibleExceptions("PASSWORD_HASH_INVALID", 400)

/**
 * The provided DC ID is invalid
 */
object DcIdInvalid : AllPossibleExceptions("DC_ID_INVALID", 400)

/**
 * The provided user ID is invalid
 */
object UserIdInvalid : AllPossibleExceptions("USER_ID_INVALID", 400)

/**
 * Bot token expired
 */
object AccessTokenExpired : AllPossibleExceptions("ACCESS_TOKEN_EXPIRED", 400)

/**
 * The provided token is not valid
 */
object AccessTokenInvalid : AllPossibleExceptions("ACCESS_TOKEN_INVALID", 400)

/**
 * The api_id/api_hash combination is invalid
 */
object ApiIdInvalid : AllPossibleExceptions("API_ID_INVALID", 400)

/**
 * The provided code is empty
 */
object CodeEmpty : AllPossibleExceptions("CODE_EMPTY", 400)

/**
 * The provided password is empty
 */
object PasswordEmpty : AllPossibleExceptions("PASSWORD_EMPTY", 400)

/**
 * You can't logout other sessions if less than 24 hours have passed since you logged on the current session
 */
object FreshResetAuthorisationForbidden : AllPossibleExceptions("FRESH_RESET_AUTHORISATION_FORBIDDEN", 406)

/**
 * The provided token is invalid
 */
object TokenInvalid : AllPossibleExceptions("TOKEN_INVALID", 400)

/**
 * This API id was published somewhere, you can't use it now
 */
object ApiIdPublishedFlood : AllPossibleExceptions("API_ID_PUBLISHED_FLOOD", 400)

/**
 * Repeat the query to data-center X
 */
object NetworkMigrateX : AllPossibleExceptions("NETWORK_MIGRATE_X", 303)

/**
 * Repeat the query to data-center X
 */
object PhoneMigrateX : AllPossibleExceptions("PHONE_MIGRATE_X", 303)

/**
 * You can't sign up using this app
 */
object PhoneNumberAppSignupForbidden : AllPossibleExceptions("PHONE_NUMBER_APP_SIGNUP_FORBIDDEN", 400)

/**
 * The provided phone number is banned from telegram
 */
object PhoneNumberBanned : AllPossibleExceptions("PHONE_NUMBER_BANNED", 400)

/**
 * You asked for the code too many times.
 */
object PhoneNumberFlood : AllPossibleExceptions("PHONE_NUMBER_FLOOD", 400)

/**
 * You have tried logging in too many times
 */
object PhonePasswordFlood : AllPossibleExceptions("PHONE_PASSWORD_FLOOD", 406)

/**
 * This phone is password protected
 */
object PhonePasswordProtected : AllPossibleExceptions("PHONE_PASSWORD_PROTECTED", 400)

/**
 * An error occurred while creating the SMS code
 */
object SmsCodeCreateFailed : AllPossibleExceptions("SMS_CODE_CREATE_FAILED", 400)

/**
 * phone_code from the SMS is empty
 */
object PhoneCodeEmpty : AllPossibleExceptions("PHONE_CODE_EMPTY", 400)

/**
 * SMS expired
 */
object PhoneCodeExpired : AllPossibleExceptions("PHONE_CODE_EXPIRED", 400)

/**
 * Invalid SMS code was sent
 */
object PhoneCodeInvalid : AllPossibleExceptions("PHONE_CODE_INVALID", 400)

/**
 * The code is valid but no user with the given number is registered
 */
object PhoneNumberUnoccupied : AllPossibleExceptions("PHONE_NUMBER_UNOCCUPIED", 400)

/**
 * The user has enabled 2FA, more steps are needed
 */
object SessionPasswordNeeded : AllPossibleExceptions("SESSION_PASSWORD_NEEDED", 400)

/**
 * Invalid first name
 */
object FirstnameInvalid : AllPossibleExceptions("FIRSTNAME_INVALID", 400)

/**
 * Invalid last name
 */
object LastnameInvalid : AllPossibleExceptions("LASTNAME_INVALID", 400)

/**
 * The phone number is already in use
 */
object PhoneNumberOccupied : AllPossibleExceptions("PHONE_NUMBER_OCCUPIED", 400)

/**
 * A takeout session has to be initialized, first
 */
object TakeoutRequired : AllPossibleExceptions("TAKEOUT_REQUIRED", 403)

/**
 * The provided GIF ID is invalid
 */
object GifIdInvalid : AllPossibleExceptions("GIF_ID_INVALID", 400)

/**
 * The search query is empty
 */
object SearchQueryEmpty : AllPossibleExceptions("SEARCH_QUERY_EMPTY", 400)

/**
 * Email unconfirmed
 */
object EmailUnconfirmed : AllPossibleExceptions("EMAIL_UNCONFIRMED", 400)

/**
 * The provided email isn't confirmed, X is the length of the verification code that was just sent to the email: use account.verifyEmail to enter the received verification code and enable the recovery email.
 */
object EmailUnconfirmedX : AllPossibleExceptions("EMAIL_UNCONFIRMED_X", 400)

/**
 * The new salt is invalid
 */
object NewSaltInvalid : AllPossibleExceptions("NEW_SALT_INVALID", 400)

/**
 * The new password settings are invalid
 */
object NewSettingsInvalid : AllPossibleExceptions("NEW_SETTINGS_INVALID", 400)

/**
 * The call was already accepted
 */
object CallAlreadyAccepted : AllPossibleExceptions("CALL_ALREADY_ACCEPTED", 400)

/**
 * The call was already declined
 */
object CallAlreadyDeclined : AllPossibleExceptions("CALL_ALREADY_DECLINED", 400)

/**
 * The provided call peer object is invalid
 */
object CallPeerInvalid : AllPossibleExceptions("CALL_PEER_INVALID", 400)

/**
 * Call protocol flags invalid
 */
object CallProtocolFlagsInvalid : AllPossibleExceptions("CALL_PROTOCOL_FLAGS_INVALID", 400)

/**
 * The other participant does not use an up to date telegram client with support for calls
 */
object ParticipantVersionOutdated : AllPossibleExceptions("PARTICIPANT_VERSION_OUTDATED", 400)

/**
 * You were blocked by this user
 */
object UserIsBlocked : AllPossibleExceptions("USER_IS_BLOCKED", 403)

/**
 * The user's privacy settings do not allow you to do this
 */
object UserPrivacyRestricted : AllPossibleExceptions("USER_PRIVACY_RESTRICTED", 403)

/**
 * The provided JSON data is invalid
 */
object DataJsonInvalid : AllPossibleExceptions("DATA_JSON_INVALID", 400)

/**
 * No chat title provided
 */
object ChatTitleEmpty : AllPossibleExceptions("CHAT_TITLE_EMPTY", 400)

/**
 * You're spamreported, you can't create channels or chats.
 */
object UserRestricted : AllPossibleExceptions("USER_RESTRICTED", 403)

/**
 * You haven't joined this channel/supergroup
 */
object ChannelPrivate : AllPossibleExceptions("CHANNEL_PRIVATE", 400)

/**
 * You must be an admin in this chat to do this
 */
object ChatAdminRequired : AllPossibleExceptions("CHAT_ADMIN_REQUIRED", 400)

/**
 * You can't delete one of the messages you tried to delete, most likely because it is a service message.
 */
object MessageDeleteForbidden : AllPossibleExceptions("MESSAGE_DELETE_FORBIDDEN", 403)

/**
 * There are too many admins
 */
object AdminsTooMuch : AllPossibleExceptions("ADMINS_TOO_MUCH", 400)

/**
 * Bots can't edit admin privileges
 */
object BotChannelsNa : AllPossibleExceptions("BOT_CHANNELS_NA", 400)

/**
 * You do not have the rights to do this
 */
object ChatAdminInviteRequired : AllPossibleExceptions("CHAT_ADMIN_INVITE_REQUIRED", 403)

/**
 * Your admin rights do not allow you to do this
 */
object RightForbidden : AllPossibleExceptions("RIGHT_FORBIDDEN", 403)

/**
 * You can't leave this channel, because you're its creator
 */
object UserCreator : AllPossibleExceptions("USER_CREATOR", 400)

/**
 * The provided user is not a mutual contact
 */
object UserNotMutualContact : AllPossibleExceptions("USER_NOT_MUTUAL_CONTACT", 400)

/**
 * You're not an admin
 */
object UserAdminInvalid : AllPossibleExceptions("USER_ADMIN_INVALID", 400)

/**
 * Photo invalid
 */
object PhotoInvalid : AllPossibleExceptions("PHOTO_INVALID", 400)

/**
 * The pinned message wasn't modified
 */
object ChatNotModified : AllPossibleExceptions("CHAT_NOT_MODIFIED", 400)

/**
 * channel/supergroup not available
 */
object ChannelPublicGroupNa : AllPossibleExceptions("CHANNEL_PUBLIC_GROUP_NA", 403)

/**
 * No message ids were provided
 */
object MessageIdsEmpty : AllPossibleExceptions("MESSAGE_IDS_EMPTY", 400)

/**
 * You're not a member of this supergroup/channel
 */
object UserNotParticipant : AllPossibleExceptions("USER_NOT_PARTICIPANT", 400)

/**
 * The provided constructor is invalid
 */
object InputConstructorInvalid : AllPossibleExceptions("INPUT_CONSTRUCTOR_INVALID", 400)

/**
 * There are too many bots in this chat/channel
 */
object BotsTooMuch : AllPossibleExceptions("BOTS_TOO_MUCH", 400)

/**
 * This bot can't be added to groups
 */
object BotGroupsBlocked : AllPossibleExceptions("BOT_GROUPS_BLOCKED", 400)

/**
 * Invalid chat
 */
object ChatInvalid : AllPossibleExceptions("CHAT_INVALID", 400)

/**
 * The maximum number of users has been exceeded (to create a chat, for example)
 */
object UsersTooMuch : AllPossibleExceptions("USERS_TOO_MUCH", 400)

/**
 * You're banned from sending messages in supergroups/channels
 */
object UserBannedInChannel : AllPossibleExceptions("USER_BANNED_IN_CHANNEL", 400)

/**
 * User blocked
 */
object UserBlocked : AllPossibleExceptions("USER_BLOCKED", 400)

/**
 * Bots can only be admins in channels.
 */
object UserBot : AllPossibleExceptions("USER_BOT", 400)

/**
 * One of the users you tried to add is already in too many channels/supergroups
 */
object UserChannelsTooMuch : AllPossibleExceptions("USER_CHANNELS_TOO_MUCH", 403)

/**
 * This user was kicked from this supergroup/channel
 */
object UserKicked : AllPossibleExceptions("USER_KICKED", 400)

/**
 * You have joined too many channels/supergroups
 */
object ChannelsTooMuch : AllPossibleExceptions("CHANNELS_TOO_MUCH", 400)

/**
 * The invite hash is invalid
 */
object InviteHashInvalid : AllPossibleExceptions("INVITE_HASH_INVALID", 400)

/**
 * The user is already in the group
 */
object UserAlreadyParticipant : AllPossibleExceptions("USER_ALREADY_PARTICIPANT", 400)

/**
 * Not enough participants
 */
object ParticipantsTooFew : AllPossibleExceptions("PARTICIPANTS_TOO_FEW", 400)

/**
 * Invalid method
 */
object InputMethodInvalid1192227X : AllPossibleExceptions("INPUT_METHOD_INVALID_1192227_X", 400)

/**
 * Invalid method
 */
object InputMethodInvalid1604042050X : AllPossibleExceptions("INPUT_METHOD_INVALID_1604042050_X", 400)

/**
 * Invalid duration provided
 */
object SecondsInvalid : AllPossibleExceptions("SECONDS_INVALID", 400)

/**
 * The provided user is not a mutual contact
 */
object UserNotMutualContact403 : AllPossibleExceptions("USER_NOT_MUTUAL_CONTACT", 403)

/**
 * The invite hash is empty
 */
object InviteHashEmpty : AllPossibleExceptions("INVITE_HASH_EMPTY", 400)

/**
 * Not enough users (to create a chat, for example)
 */
object UsersTooFew : AllPossibleExceptions("USERS_TOO_FEW", 400)

/**
 * You provided some invalid flags in the banned rights
 */
object BannedRightsInvalid : AllPossibleExceptions("BANNED_RIGHTS_INVALID", 400)

/**
 * The extension of the photo is invalid
 */
object PhotoExtInvalid : AllPossibleExceptions("PHOTO_EXT_INVALID", 400)

/**
 * 2FA is enabled, use a password to login
 */
object SessionPasswordNeeded401 : AllPossibleExceptions("SESSION_PASSWORD_NEEDED", 401)

/**
 * You must be an admin in this chat to do this
 */
object ChatAdminRequired403 : AllPossibleExceptions("CHAT_ADMIN_REQUIRED", 403)

/**
 * This is not a valid bot
 */
object BotInvalid : AllPossibleExceptions("BOT_INVALID", 400)

/**
 * The start parameter is empty
 */
object StartParamEmpty : AllPossibleExceptions("START_PARAM_EMPTY", 400)

/**
 * Start parameter invalid
 */
object StartParamInvalid : AllPossibleExceptions("START_PARAM_INVALID", 400)

/**
 * The temporary auth key must be binded to the permanent auth key to use these methods.
 */
object AuthKeyPermEmpty : AllPossibleExceptions("AUTH_KEY_PERM_EMPTY", 401)

/**
 * Internal RSA decryption failed
 */
object RsaDecryptFailed : AllPossibleExceptions("RSA_DECRYPT_FAILED", 400)

/**
 * The provided file id is invalid
 */
object FileIdInvalid : AllPossibleExceptions("FILE_ID_INVALID", 400)

/**
 * The file reference expired, it must be refreshed
 */
object FileReference : AllPossibleExceptions("FILE_REFERENCE_*", 400)

/**
 * The provided limit is invalid
 */
object LimitInvalid : AllPossibleExceptions("LIMIT_INVALID", 400)

/**
 * The provided location is invalid
 */
object LocationInvalid : AllPossibleExceptions("LOCATION_INVALID", 400)

/**
 * The provided offset is invalid
 */
object OffsetInvalid : AllPossibleExceptions("OFFSET_INVALID", 400)

/**
 * The number of file parts is invalid
 */
object FilePartsInvalid : AllPossibleExceptions("FILE_PARTS_INVALID", 400)

/**
 * The provided file part is empty
 */
object FilePartEmpty : AllPossibleExceptions("FILE_PART_EMPTY", 400)

/**
 * The file part number is invalid
 */
object FilePartInvalid : AllPossibleExceptions("FILE_PART_INVALID", 400)

/**
 * The provided file part size is invalid
 */
object FilePartSizeInvalid : AllPossibleExceptions("FILE_PART_SIZE_INVALID", 400)

/**
 * This method can only be run by a bot
 */
object BotMissing : AllPossibleExceptions("BOT_MISSING", 400)

/**
 * Media invalid
 */
object MediaInvalid : AllPossibleExceptions("MEDIA_INVALID", 400)

/**
 * The provided SHA256 hash is invalid
 */
object Sha256HashInvalid : AllPossibleExceptions("SHA256_HASH_INVALID", 400)

/**
 * WC convert URL invalid
 */
object WcConvertUrlInvalid : AllPossibleExceptions("WC_CONVERT_URL_INVALID", 400)

/**
 * The provided message is empty
 */
object MessageEmpty : AllPossibleExceptions("MESSAGE_EMPTY", 400)

/**
 * A waiting call returned an error
 */
object MsgWaitFailed : AllPossibleExceptions("MSG_WAIT_FAILED", 400)

/**
 * Secret chat already accepted
 */
object EncryptionAlreadyAccepted : AllPossibleExceptions("ENCRYPTION_ALREADY_ACCEPTED", 400)

/**
 * The secret chat was already declined
 */
object EncryptionAlreadyDeclined : AllPossibleExceptions("ENCRYPTION_ALREADY_DECLINED", 400)

/**
 * The provided chat ID is empty
 */
object ChatIdEmpty : AllPossibleExceptions("CHAT_ID_EMPTY", 400)

/**
 * The provided secret chat ID is invalid
 */
object EncryptionIdInvalid : AllPossibleExceptions("ENCRYPTION_ID_INVALID", 400)

/**
 * g_a invalid
 */
object DhGAInvalid : AllPossibleExceptions("DH_G_A_INVALID", 400)

/**
 * Encrypted data invalid
 */
object DataInvalid : AllPossibleExceptions("DATA_INVALID", 400)

/**
 * The secret chat was declined
 */
object EncryptionDeclined : AllPossibleExceptions("ENCRYPTION_DECLINED", 400)

/**
 * Random length invalid
 */
object RandomLengthInvalid : AllPossibleExceptions("RANDOM_LENGTH_INVALID", 400)

/**
 * Persistent timestamp empty
 */
object PersistentTimestampEmpty : AllPossibleExceptions("PERSISTENT_TIMESTAMP_EMPTY", 400)

/**
 * Persistent timestamp invalid
 */
object PersistentTimestampInvalid : AllPossibleExceptions("PERSISTENT_TIMESTAMP_INVALID", 400)

/**
 * Invalid range provided
 */
object RangesInvalid : AllPossibleExceptions("RANGES_INVALID", 400)

/**
 * Date empty
 */
object DateEmpty : AllPossibleExceptions("DATE_EMPTY", 400)

/**
 * This bot can't be used in inline mode
 */
object BotInlineDisabled : AllPossibleExceptions("BOT_INLINE_DISABLED", 400)

/**
 * The title of the article is empty
 */
object ArticleTitleEmpty : AllPossibleExceptions("ARTICLE_TITLE_EMPTY", 400)

/**
 * The data of one or more of the buttons you provided is invalid
 */
object ButtonDataInvalid : AllPossibleExceptions("BUTTON_DATA_INVALID", 400)

/**
 * The type of one or more of the buttons you provided is invalid
 */
object ButtonTypeInvalid : AllPossibleExceptions("BUTTON_TYPE_INVALID", 400)

/**
 * Button URL invalid
 */
object ButtonUrlInvalid : AllPossibleExceptions("BUTTON_URL_INVALID", 400)

/**
 * The provided message is too long
 */
object MessageTooLong : AllPossibleExceptions("MESSAGE_TOO_LONG", 400)

/**
 * Photo thumbnail URL is empty
 */
object PhotoThumbUrlEmpty : AllPossibleExceptions("PHOTO_THUMB_URL_EMPTY", 400)

/**
 * The query ID is invalid
 */
object QueryIdInvalid : AllPossibleExceptions("QUERY_ID_INVALID", 400)

/**
 * The provided reply markup is invalid
 */
object ReplyMarkupInvalid : AllPossibleExceptions("REPLY_MARKUP_INVALID", 400)

/**
 * Result type invalid
 */
object ResultTypeInvalid : AllPossibleExceptions("RESULT_TYPE_INVALID", 400)

/**
 * The message type is invalid
 */
object SendMessageTypeInvalid : AllPossibleExceptions("SEND_MESSAGE_TYPE_INVALID", 400)

/**
 * This method can only be called by a bot
 */
object UserBotInvalid : AllPossibleExceptions("USER_BOT_INVALID", 403)

/**
 * The inline query expired
 */
object InlineResultExpired : AllPossibleExceptions("INLINE_RESULT_EXPIRED", 400)

/**
 * The query ID is empty
 */
object QueryIdEmpty : AllPossibleExceptions("QUERY_ID_EMPTY", 400)

/**
 * Failure while fetching the webpage with cURL
 */
object WebpageCurlFailed : AllPossibleExceptions("WEBPAGE_CURL_FAILED", 400)

/**
 * Webpage media empty
 */
object WebpageMediaEmpty : AllPossibleExceptions("WEBPAGE_MEDIA_EMPTY", 400)

/**
 * The provided message id is invalid
 */
object MessageIdInvalid : AllPossibleExceptions("MESSAGE_ID_INVALID", 400)

/**
 * Invalid URL provided
 */
object UrlInvalid : AllPossibleExceptions("URL_INVALID", 400)

/**
 * The message text has not changed
 */
object MessageNotModified : AllPossibleExceptions("MESSAGE_NOT_MODIFIED", 400)

/**
 * This method can only be called by a bot
 */
object UserBotInvalid400 : AllPossibleExceptions("USER_BOT_INVALID", 400)

/**
 * The provided contact ID is invalid
 */
object ContactIdInvalid : AllPossibleExceptions("CONTACT_ID_INVALID", 400)

/**
 * No top peer type was provided
 */
object TypesEmpty : AllPossibleExceptions("TYPES_EMPTY", 400)

/**
 * The query string is too short
 */
object QueryTooShort : AllPossibleExceptions("QUERY_TOO_SHORT", 400)

/**
 * The provided offset peer is invalid
 */
object OffsetPeerIdInvalid : AllPossibleExceptions("OFFSET_PEER_ID_INVALID", 400)

/**
 * Invalid folder ID
 */
object FolderIdInvalid : AllPossibleExceptions("FOLDER_ID_INVALID", 400)

/**
 * You must be an admin in this chat to do this
 */
object ChatAdminRequired400 : AllPossibleExceptions("CHAT_ADMIN_REQUIRED", 400)

/**
 * You were blocked by this user
 */
object UserIsBlocked400 : AllPossibleExceptions("USER_IS_BLOCKED", 400)

/**
 * Bots can't send messages to other bots
 */
object UserIsBot : AllPossibleExceptions("USER_IS_BOT", 400)

/**
 * This method can only be called by a bot
 */
object UserBotRequired : AllPossibleExceptions("USER_BOT_REQUIRED", 400)

/**
 * The provided language pack is invalid
 */
object LangPackInvalid : AllPossibleExceptions("LANG_PACK_INVALID", 400)

/**
 * Empty reaction provided
 */
object ReactionEmpty : AllPossibleExceptions("REACTION_EMPTY", 400)

/**
 * Message author required
 */
object MessageAuthorRequired : AllPossibleExceptions("MESSAGE_AUTHOR_REQUIRED", 403)

/**
 * You can't edit this message anymore, too much time has passed since its creation.
 */
object MessageEditTimeExpired : AllPossibleExceptions("MESSAGE_EDIT_TIME_EXPIRED", 400)

/**
 * You can't send gifs in this chat
 */
object ChatSendGifsForbidden : AllPossibleExceptions("CHAT_SEND_GIFS_FORBIDDEN", 403)

/**
 * You can't send media in this chat
 */
object ChatSendMediaForbidden : AllPossibleExceptions("CHAT_SEND_MEDIA_FORBIDDEN", 403)

/**
 * You can't send stickers in this chat.
 */
object ChatSendStickersForbidden : AllPossibleExceptions("CHAT_SEND_STICKERS_FORBIDDEN", 403)

/**
 * Invalid grouped media
 */
object GroupedMediaInvalid : AllPossibleExceptions("GROUPED_MEDIA_INVALID", 400)

/**
 * The provided media object is invalid
 */
object MediaEmpty : AllPossibleExceptions("MEDIA_EMPTY", 400)

/**
 * A provided random ID is invalid
 */
object RandomIdInvalid : AllPossibleExceptions("RANDOM_ID_INVALID", 400)

/**
 * You blocked this user
 */
object YouBlockedUser : AllPossibleExceptions("YOU_BLOCKED_USER", 400)

/**
 * The provided peer ID is not supported
 */
object PeerIdNotSupported : AllPossibleExceptions("PEER_ID_NOT_SUPPORTED", 400)

/**
 * External URL invalid
 */
object ExternalUrlInvalid : AllPossibleExceptions("EXTERNAL_URL_INVALID", 400)

/**
 * The length of a file part is invalid
 */
object FilePartLengthInvalid : AllPossibleExceptions("FILE_PART_LENGTH_INVALID", 400)

/**
 * Failure while processing image
 */
object ImageProcessFailed : AllPossibleExceptions("IMAGE_PROCESS_FAILED", 400)

/**
 * The caption is too long
 */
object MediaCaptionTooLong : AllPossibleExceptions("MEDIA_CAPTION_TOO_LONG", 400)

/**
 * The photo dimensions are invalid
 */
object PhotoInvalidDimensions : AllPossibleExceptions("PHOTO_INVALID_DIMENSIONS", 400)

/**
 * nan
 */
object PhotoSaveFileInvalid : AllPossibleExceptions("PHOTO_SAVE_FILE_INVALID", 400)

/**
 * You can't send messages in this chat, you were restricted
 */
object ChatRestricted : AllPossibleExceptions("CHAT_RESTRICTED", 400)

/**
 * You mentioned an invalid user
 */
object EntityMentionUserInvalid : AllPossibleExceptions("ENTITY_MENTION_USER_INVALID", 400)

/**
 * Provided reply_to_msg_id is invalid
 */
object MsgIdInvalid : AllPossibleExceptions("MSG_ID_INVALID", 400)

/**
 * Slowmode is enabled in this chat: you must wait for the specified number of seconds before sending another message to the chat.
 */
object SlowmodeWaitX : AllPossibleExceptions("SLOWMODE_WAIT_X", 420)

/**
 * The temporary password is disabled
 */
object TmpPasswordDisabled : AllPossibleExceptions("TMP_PASSWORD_DISABLED", 400)

/**
 * The provided error message is empty
 */
object ErrorTextEmpty : AllPossibleExceptions("ERROR_TEXT_EMPTY", 400)

/**
 * The provided sticker set is invalid
 */
object StickersetInvalid : AllPossibleExceptions("STICKERSET_INVALID", 400)

/**
 * The provided sticker is invalid
 */
object StickerInvalid : AllPossibleExceptions("STICKER_INVALID", 400)

/**
 * Short pack name invalid
 */
object PackShortNameInvalid : AllPossibleExceptions("PACK_SHORT_NAME_INVALID", 400)

/**
 * A stickerpack with this name already exists
 */
object PackShortNameOccupied : AllPossibleExceptions("PACK_SHORT_NAME_OCCUPIED", 400)

/**
 * No sticker provided
 */
object StickersEmpty : AllPossibleExceptions("STICKERS_EMPTY", 400)

/**
 * Sticker emoji invalid
 */
object StickerEmojiInvalid : AllPossibleExceptions("STICKER_EMOJI_INVALID", 400)

/**
 * Sticker file invalid
 */
object StickerFileInvalid : AllPossibleExceptions("STICKER_FILE_INVALID", 400)

/**
 * Sticker png dimensions invalid
 */
object StickerPngDimensions : AllPossibleExceptions("STICKER_PNG_DIMENSIONS", 400)

/**
 * The provided sticker ID is invalid
 */
object StickerIdInvalid : AllPossibleExceptions("STICKER_ID_INVALID", 400)

/**
 * Code hash invalid
 */
object CodeHashInvalid : AllPossibleExceptions("CODE_HASH_INVALID", 400)

/**
 * The privacy key is invalid
 */
object PrivacyKeyInvalid : AllPossibleExceptions("PRIVACY_KEY_INVALID", 400)

/**
 * The provided hash is invalid
 */
object HashInvalid : AllPossibleExceptions("HASH_INVALID", 400)

/**
 * The provided TTL is invalid
 */
object TtlDaysInvalid : AllPossibleExceptions("TTL_DAYS_INVALID", 400)

/**
 * About string too long
 */
object AboutTooLong : AllPossibleExceptions("ABOUT_TOO_LONG", 400)

/**
 * The provided max ID is invalid
 */
object MaxIdInvalid : AllPossibleExceptions("MAX_ID_INVALID", 400)

/**
 * Photo is too small
 */
object PhotoCropSizeSmall : AllPossibleExceptions("PHOTO_CROP_SIZE_SMALL", 400)

/**
 * The provided username is not valid
 */
object UsernameInvalid : AllPossibleExceptions("USERNAME_INVALID", 400)

/**
 * You're admin of too many public channels, make some channels private to change the username of this channel
 */
object ChannelsAdminPublicTooMuch : AllPossibleExceptions("CHANNELS_ADMIN_PUBLIC_TOO_MUCH", 400)

/**
 * The username was not modified
 */
object UsernameNotModified : AllPossibleExceptions("USERNAME_NOT_MODIFIED", 400)

/**
 * The provided username is already occupied
 */
object UsernameOccupied : AllPossibleExceptions("USERNAME_OCCUPIED", 400)

/**
 * The provided username is not occupied
 */
object UsernameNotOccupied : AllPossibleExceptions("USERNAME_NOT_OCCUPIED", 400)

