package messenger.telegram.method.exceptions

open class AppException(override val message: String?, t: Throwable? = null) : java.lang.Exception(message, t)
open class TlExceptions(override val message: String, open val code: Int = 400) : AppException(message)

object AllExceptions {
    /**
     * This method can't be used by a bot
     */
    object BotMethodInvalid : TlExceptions("BOT_METHOD_INVALID", 400)

    /**
     * The provided peer id is invalid
     */
    object PeerIdInvalid : TlExceptions("PEER_ID_INVALID", 400)

    /**
     * The provided channel is invalid
     */
    object ChannelInvalid : TlExceptions("CHANNEL_INVALID", 400)

    /**
     * The specified user was deleted
     */
    object InputUserDeactivated : TlExceptions("INPUT_USER_DEACTIVATED", 400)

    /**
     * The provided chat id is invalid
     */
    object ChatIdInvalid : TlExceptions("CHAT_ID_INVALID", 400)

    /**
     * Device model empty
     */
    object ConnectionDeviceModelEmpty : TlExceptions("CONNECTION_DEVICE_MODEL_EMPTY", 400)

    /**
     * Timeout while fetching data
     */
    object Timeout : TlExceptions("Timeout", -503)

    /**
     * Layer invalid
     */
    object ConnectionLayerInvalid : TlExceptions("CONNECTION_LAYER_INVALID", 400)

    /**
     * The provided authorization is invalid
     */
    object AuthBytesInvalid : TlExceptions("AUTH_BYTES_INVALID", 400)

    /**
     * You can't call this method in a CDN DC
     */
    object CdnMethodInvalid : TlExceptions("CDN_METHOD_INVALID", 400)

    /**
     * You can't write in this chat
     */
    object ChatWriteForbidden : TlExceptions("CHAT_WRITE_FORBIDDEN", 403)

    /**
     * The provided API id is invalid
     */
    object ConnectionApiIdInvalid : TlExceptions("CONNECTION_API_ID_INVALID", 400)

    /**
     * Language pack invalid
     */
    object ConnectionLangPackInvalid : TlExceptions("CONNECTION_LANG_PACK_INVALID", 400)

    /**
     * Connection not initialized
     */
    object ConnectionNotInited : TlExceptions("CONNECTION_NOT_INITED", 400)

    /**
     * Connection system empty
     */
    object ConnectionSystemEmpty : TlExceptions("CONNECTION_SYSTEM_EMPTY", 400)

    /**
     * The provided layer is invalid
     */
    object InputLayerInvalid : TlExceptions("INPUT_LAYER_INVALID", 400)

    /**
     * The invite link has expired
     */
    object InviteHashExpired : TlExceptions("INVITE_HASH_EXPIRED", 400)

    /**
     * Encrypted message is incorrect
     */
    object EncryptedMessageInvalid : TlExceptions("ENCRYPTED_MESSAGE_INVALID", 400)

    /**
     * The request is too big
     */
    object InputRequestTooLong : TlExceptions("INPUT_REQUEST_TOO_LONG", 400)

    /**
     * The passed temporary key is already bound to another perm_auth_key_id
     */
    object TempAuthKeyAlreadyBound : TlExceptions("TEMP_AUTH_KEY_ALREADY_BOUND", 400)

    /**
     * The request was not performed with a temporary authorization key
     */
    object TempAuthKeyEmpty : TlExceptions("TEMP_AUTH_KEY_EMPTY", 400)

    /**
     * The phone number is invalid
     */
    object PhoneNumberInvalid : TlExceptions("PHONE_NUMBER_INVALID", 400)

    /**
     * The provided password isn't valid
     */
    object PasswordHashInvalid : TlExceptions("PASSWORD_HASH_INVALID", 400)

    /**
     * The provided DC ID is invalid
     */
    object DcIdInvalid : TlExceptions("DC_ID_INVALID", 400)

    /**
     * The provided user ID is invalid
     */
    object UserIdInvalid : TlExceptions("USER_ID_INVALID", 400)

    /**
     * Bot token expired
     */
    object AccessTokenExpired : TlExceptions("ACCESS_TOKEN_EXPIRED", 400)

    /**
     * The provided token is not valid
     */
    object AccessTokenInvalid : TlExceptions("ACCESS_TOKEN_INVALID", 400)

    /**
     * The api_id/api_hash combination is invalid
     */
    object ApiIdInvalid : TlExceptions("API_ID_INVALID", 400)

    /**
     * The provided code is empty
     */
    object CodeEmpty : TlExceptions("CODE_EMPTY", 400)

    /**
     * The provided password is empty
     */
    object PasswordEmpty : TlExceptions("PASSWORD_EMPTY", 400)

    /**
     * You can't logout other sessions if less than 24 hours have passed since you logged on the current session
     */
    object FreshResetAuthorisationForbidden : TlExceptions("FRESH_RESET_AUTHORISATION_FORBIDDEN", 406)

    /**
     * The provided token is invalid
     */
    object TokenInvalid : TlExceptions("TOKEN_INVALID", 400)

    /**
     * This API id was published somewhere, you can't use it now
     */
    object ApiIdPublishedFlood : TlExceptions("API_ID_PUBLISHED_FLOOD", 400)

    /**
     * Repeat the query to data-center X
     */
    object NetworkMigrateX : TlExceptions("NETWORK_MIGRATE_X", 303)

    /**
     * Repeat the query to data-center X
     */
    object PhoneMigrateX : TlExceptions("PHONE_MIGRATE_X", 303)

    /**
     * You can't sign up using this app
     */
    object PhoneNumberAppSignupForbidden : TlExceptions("PHONE_NUMBER_APP_SIGNUP_FORBIDDEN", 400)

    /**
     * The provided phone number is banned from telegram
     */
    object PhoneNumberBanned : TlExceptions("PHONE_NUMBER_BANNED", 400)

    /**
     * You asked for the code too many times.
     */
    object PhoneNumberFlood : TlExceptions("PHONE_NUMBER_FLOOD", 400)

    /**
     * You have tried logging in too many times
     */
    object PhonePasswordFlood : TlExceptions("PHONE_PASSWORD_FLOOD", 406)

    /**
     * This phone is password protected
     */
    object PhonePasswordProtected : TlExceptions("PHONE_PASSWORD_PROTECTED", 400)

    /**
     * An error occurred while creating the SMS code
     */
    object SmsCodeCreateFailed : TlExceptions("SMS_CODE_CREATE_FAILED", 400)

    /**
     * phone_code from the SMS is empty
     */
    object PhoneCodeEmpty : TlExceptions("PHONE_CODE_EMPTY", 400)

    /**
     * SMS expired
     */
    object PhoneCodeExpired : TlExceptions("PHONE_CODE_EXPIRED", 400)

    /**
     * Invalid SMS code was sent
     */
    object PhoneCodeInvalid : TlExceptions("PHONE_CODE_INVALID", 400)

    /**
     * The code is valid but no user with the given number is registered
     */
    object PhoneNumberUnoccupied : TlExceptions("PHONE_NUMBER_UNOCCUPIED", 400)

    /**
     * The user has enabled 2FA, more steps are needed
     */
    object SessionPasswordNeeded : TlExceptions("SESSION_PASSWORD_NEEDED", 400)

    /**
     * Invalid first name
     */
    object FirstnameInvalid : TlExceptions("FIRSTNAME_INVALID", 400)

    /**
     * Invalid last name
     */
    object LastnameInvalid : TlExceptions("LASTNAME_INVALID", 400)

    /**
     * The phone number is already in use
     */
    object PhoneNumberOccupied : TlExceptions("PHONE_NUMBER_OCCUPIED", 400)

    /**
     * A takeout session has to be initialized, first
     */
    object TakeoutRequired : TlExceptions("TAKEOUT_REQUIRED", 403)

    /**
     * The provided GIF ID is invalid
     */
    object GifIdInvalid : TlExceptions("GIF_ID_INVALID", 400)

    /**
     * The search query is empty
     */
    object SearchQueryEmpty : TlExceptions("SEARCH_QUERY_EMPTY", 400)

    /**
     * Email unconfirmed
     */
    object EmailUnconfirmed : TlExceptions("EMAIL_UNCONFIRMED", 400)

    /**
     * The provided email isn't confirmed, X is the length of the verification code that was just sent to the email: use account.verifyEmail to enter the received verification code and enable the recovery email.
     */
    object EmailUnconfirmedX : TlExceptions("EMAIL_UNCONFIRMED_X", 400)

    /**
     * The new salt is invalid
     */
    object NewSaltInvalid : TlExceptions("NEW_SALT_INVALID", 400)

    /**
     * The new password settings are invalid
     */
    object NewSettingsInvalid : TlExceptions("NEW_SETTINGS_INVALID", 400)

    /**
     * The call was already accepted
     */
    object CallAlreadyAccepted : TlExceptions("CALL_ALREADY_ACCEPTED", 400)

    /**
     * The call was already declined
     */
    object CallAlreadyDeclined : TlExceptions("CALL_ALREADY_DECLINED", 400)

    /**
     * The provided call peer object is invalid
     */
    object CallPeerInvalid : TlExceptions("CALL_PEER_INVALID", 400)

    /**
     * Call protocol flags invalid
     */
    object CallProtocolFlagsInvalid : TlExceptions("CALL_PROTOCOL_FLAGS_INVALID", 400)

    /**
     * The other participant does not use an up to date telegram client with support for calls
     */
    object ParticipantVersionOutdated : TlExceptions("PARTICIPANT_VERSION_OUTDATED", 400)

    /**
     * You were blocked by this user
     */
    object UserIsBlocked : TlExceptions("USER_IS_BLOCKED", 403)

    /**
     * The user's privacy settings do not allow you to do this
     */
    object UserPrivacyRestricted : TlExceptions("USER_PRIVACY_RESTRICTED", 403)

    /**
     * The provided JSON data is invalid
     */
    object DataJsonInvalid : TlExceptions("DATA_JSON_INVALID", 400)

    /**
     * No chat title provided
     */
    object ChatTitleEmpty : TlExceptions("CHAT_TITLE_EMPTY", 400)

    /**
     * You're spamreported, you can't create channels or chats.
     */
    object UserRestricted : TlExceptions("USER_RESTRICTED", 403)

    /**
     * You haven't joined this channel/supergroup
     */
    object ChannelPrivate : TlExceptions("CHANNEL_PRIVATE", 400)

    /**
     * You must be an admin in this chat to do this
     */
    object ChatAdminRequired : TlExceptions("CHAT_ADMIN_REQUIRED", 400)

    /**
     * You can't delete one of the messages you tried to delete, most likely because it is a service message.
     */
    object MessageDeleteForbidden : TlExceptions("MESSAGE_DELETE_FORBIDDEN", 403)

    /**
     * There are too many admins
     */
    object AdminsTooMuch : TlExceptions("ADMINS_TOO_MUCH", 400)

    /**
     * Bots can't edit admin privileges
     */
    object BotChannelsNa : TlExceptions("BOT_CHANNELS_NA", 400)

    /**
     * You do not have the rights to do this
     */
    object ChatAdminInviteRequired : TlExceptions("CHAT_ADMIN_INVITE_REQUIRED", 403)

    /**
     * Your admin rights do not allow you to do this
     */
    object RightForbidden : TlExceptions("RIGHT_FORBIDDEN", 403)

    /**
     * You can't leave this channel, because you're its creator
     */
    object UserCreator : TlExceptions("USER_CREATOR", 400)

    /**
     * The provided user is not a mutual contact
     */
    object UserNotMutualContact : TlExceptions("USER_NOT_MUTUAL_CONTACT", 400)

    /**
     * You're not an admin
     */
    object UserAdminInvalid : TlExceptions("USER_ADMIN_INVALID", 400)

    /**
     * Photo invalid
     */
    object PhotoInvalid : TlExceptions("PHOTO_INVALID", 400)

    /**
     * The pinned message wasn't modified
     */
    object ChatNotModified : TlExceptions("CHAT_NOT_MODIFIED", 400)

    /**
     * channel/supergroup not available
     */
    object ChannelPublicGroupNa : TlExceptions("CHANNEL_PUBLIC_GROUP_NA", 403)

    /**
     * No message ids were provided
     */
    object MessageIdsEmpty : TlExceptions("MESSAGE_IDS_EMPTY", 400)

    /**
     * You're not a member of this supergroup/channel
     */
    object UserNotParticipant : TlExceptions("USER_NOT_PARTICIPANT", 400)

    /**
     * The provided constructor is invalid
     */
    object InputConstructorInvalid : TlExceptions("INPUT_CONSTRUCTOR_INVALID", 400)

    /**
     * There are too many bots in this chat/channel
     */
    object BotsTooMuch : TlExceptions("BOTS_TOO_MUCH", 400)

    /**
     * This bot can't be added to groups
     */
    object BotGroupsBlocked : TlExceptions("BOT_GROUPS_BLOCKED", 400)

    /**
     * Invalid chat
     */
    object ChatInvalid : TlExceptions("CHAT_INVALID", 400)

    /**
     * The maximum number of users has been exceeded (to create a chat, for example)
     */
    object UsersTooMuch : TlExceptions("USERS_TOO_MUCH", 400)

    /**
     * You're banned from sending messages in supergroups/channels
     */
    object UserBannedInChannel : TlExceptions("USER_BANNED_IN_CHANNEL", 400)

    /**
     * User blocked
     */
    object UserBlocked : TlExceptions("USER_BLOCKED", 400)

    /**
     * Bots can only be admins in channels.
     */
    object UserBot : TlExceptions("USER_BOT", 400)

    /**
     * One of the users you tried to add is already in too many channels/supergroups
     */
    object UserChannelsTooMuch : TlExceptions("USER_CHANNELS_TOO_MUCH", 403)

    /**
     * This user was kicked from this supergroup/channel
     */
    object UserKicked : TlExceptions("USER_KICKED", 400)

    /**
     * You have joined too many channels/supergroups
     */
    object ChannelsTooMuch : TlExceptions("CHANNELS_TOO_MUCH", 400)

    /**
     * The invite hash is invalid
     */
    object InviteHashInvalid : TlExceptions("INVITE_HASH_INVALID", 400)

    /**
     * The user is already in the group
     */
    object UserAlreadyParticipant : TlExceptions("USER_ALREADY_PARTICIPANT", 400)

    /**
     * Not enough participants
     */
    object ParticipantsTooFew : TlExceptions("PARTICIPANTS_TOO_FEW", 400)

    /**
     * Invalid method
     */
    object InputMethodInvalid1192227X : TlExceptions("INPUT_METHOD_INVALID_1192227_X", 400)

    /**
     * Invalid method
     */
    object InputMethodInvalid1604042050X : TlExceptions("INPUT_METHOD_INVALID_1604042050_X", 400)

    /**
     * Invalid duration provided
     */
    object SecondsInvalid : TlExceptions("SECONDS_INVALID", 400)

    /**
     * The provided user is not a mutual contact
     */
    object UserNotMutualContact403 : TlExceptions("USER_NOT_MUTUAL_CONTACT", 403)

    /**
     * The invite hash is empty
     */
    object InviteHashEmpty : TlExceptions("INVITE_HASH_EMPTY", 400)

    /**
     * Not enough users (to create a chat, for example)
     */
    object UsersTooFew : TlExceptions("USERS_TOO_FEW", 400)

    /**
     * You provided some invalid flags in the banned rights
     */
    object BannedRightsInvalid : TlExceptions("BANNED_RIGHTS_INVALID", 400)

    /**
     * The extension of the photo is invalid
     */
    object PhotoExtInvalid : TlExceptions("PHOTO_EXT_INVALID", 400)

    /**
     * 2FA is enabled, use a password to login
     */
    object SessionPasswordNeeded401 : TlExceptions("SESSION_PASSWORD_NEEDED", 401)

    /**
     * You must be an admin in this chat to do this
     */
    object ChatAdminRequired403 : TlExceptions("CHAT_ADMIN_REQUIRED", 403)

    /**
     * This is not a valid bot
     */
    object BotInvalid : TlExceptions("BOT_INVALID", 400)

    /**
     * The start parameter is empty
     */
    object StartParamEmpty : TlExceptions("START_PARAM_EMPTY", 400)

    /**
     * Start parameter invalid
     */
    object StartParamInvalid : TlExceptions("START_PARAM_INVALID", 400)

    /**
     * The temporary auth key must be binded to the permanent auth key to use these methods.
     */
    object AuthKeyPermEmpty : TlExceptions("AUTH_KEY_PERM_EMPTY", 401)

    /**
     * Internal RSA decryption failed
     */
    object RsaDecryptFailed : TlExceptions("RSA_DECRYPT_FAILED", 400)

    /**
     * The provided file id is invalid
     */
    object FileIdInvalid : TlExceptions("FILE_ID_INVALID", 400)

    /**
     * The file reference expired, it must be refreshed
     */
    object FileReference : TlExceptions("FILE_REFERENCE_*", 400)

    /**
     * The provided limit is invalid
     */
    object LimitInvalid : TlExceptions("LIMIT_INVALID", 400)

    /**
     * The provided location is invalid
     */
    object LocationInvalid : TlExceptions("LOCATION_INVALID", 400)

    /**
     * The provided offset is invalid
     */
    object OffsetInvalid : TlExceptions("OFFSET_INVALID", 400)

    /**
     * The number of file parts is invalid
     */
    object FilePartsInvalid : TlExceptions("FILE_PARTS_INVALID", 400)

    /**
     * The provided file part is empty
     */
    object FilePartEmpty : TlExceptions("FILE_PART_EMPTY", 400)

    /**
     * The file part number is invalid
     */
    object FilePartInvalid : TlExceptions("FILE_PART_INVALID", 400)

    /**
     * The provided file part size is invalid
     */
    object FilePartSizeInvalid : TlExceptions("FILE_PART_SIZE_INVALID", 400)

    /**
     * This method can only be run by a bot
     */
    object BotMissing : TlExceptions("BOT_MISSING", 400)

    /**
     * Media invalid
     */
    object MediaInvalid : TlExceptions("MEDIA_INVALID", 400)

    /**
     * The provided SHA256 hash is invalid
     */
    object Sha256HashInvalid : TlExceptions("SHA256_HASH_INVALID", 400)

    /**
     * WC convert URL invalid
     */
    object WcConvertUrlInvalid : TlExceptions("WC_CONVERT_URL_INVALID", 400)

    /**
     * The provided message is empty
     */
    object MessageEmpty : TlExceptions("MESSAGE_EMPTY", 400)

    /**
     * A waiting call returned an error
     */
    object MsgWaitFailed : TlExceptions("MSG_WAIT_FAILED", 400)

    /**
     * Secret chat already accepted
     */
    object EncryptionAlreadyAccepted : TlExceptions("ENCRYPTION_ALREADY_ACCEPTED", 400)

    /**
     * The secret chat was already declined
     */
    object EncryptionAlreadyDeclined : TlExceptions("ENCRYPTION_ALREADY_DECLINED", 400)

    /**
     * The provided chat ID is empty
     */
    object ChatIdEmpty : TlExceptions("CHAT_ID_EMPTY", 400)

    /**
     * The provided secret chat ID is invalid
     */
    object EncryptionIdInvalid : TlExceptions("ENCRYPTION_ID_INVALID", 400)

    /**
     * g_a invalid
     */
    object DhGAInvalid : TlExceptions("DH_G_A_INVALID", 400)

    /**
     * Encrypted data invalid
     */
    object DataInvalid : TlExceptions("DATA_INVALID", 400)

    /**
     * The secret chat was declined
     */
    object EncryptionDeclined : TlExceptions("ENCRYPTION_DECLINED", 400)

    /**
     * Random length invalid
     */
    object RandomLengthInvalid : TlExceptions("RANDOM_LENGTH_INVALID", 400)

    /**
     * Persistent timestamp empty
     */
    object PersistentTimestampEmpty : TlExceptions("PERSISTENT_TIMESTAMP_EMPTY", 400)

    /**
     * Persistent timestamp invalid
     */
    object PersistentTimestampInvalid : TlExceptions("PERSISTENT_TIMESTAMP_INVALID", 400)

    /**
     * Invalid range provided
     */
    object RangesInvalid : TlExceptions("RANGES_INVALID", 400)

    /**
     * Date empty
     */
    object DateEmpty : TlExceptions("DATE_EMPTY", 400)

    /**
     * This bot can't be used in inline mode
     */
    object BotInlineDisabled : TlExceptions("BOT_INLINE_DISABLED", 400)

    /**
     * The title of the article is empty
     */
    object ArticleTitleEmpty : TlExceptions("ARTICLE_TITLE_EMPTY", 400)

    /**
     * The data of one or more of the buttons you provided is invalid
     */
    object ButtonDataInvalid : TlExceptions("BUTTON_DATA_INVALID", 400)

    /**
     * The type of one or more of the buttons you provided is invalid
     */
    object ButtonTypeInvalid : TlExceptions("BUTTON_TYPE_INVALID", 400)

    /**
     * Button URL invalid
     */
    object ButtonUrlInvalid : TlExceptions("BUTTON_URL_INVALID", 400)

    /**
     * The provided message is too long
     */
    object MessageTooLong : TlExceptions("MESSAGE_TOO_LONG", 400)

    /**
     * Photo thumbnail URL is empty
     */
    object PhotoThumbUrlEmpty : TlExceptions("PHOTO_THUMB_URL_EMPTY", 400)

    /**
     * The query ID is invalid
     */
    object QueryIdInvalid : TlExceptions("QUERY_ID_INVALID", 400)

    /**
     * The provided reply markup is invalid
     */
    object ReplyMarkupInvalid : TlExceptions("REPLY_MARKUP_INVALID", 400)

    /**
     * Result type invalid
     */
    object ResultTypeInvalid : TlExceptions("RESULT_TYPE_INVALID", 400)

    /**
     * The message type is invalid
     */
    object SendMessageTypeInvalid : TlExceptions("SEND_MESSAGE_TYPE_INVALID", 400)

    /**
     * This method can only be called by a bot
     */
    object UserBotInvalid : TlExceptions("USER_BOT_INVALID", 403)

    /**
     * The inline query expired
     */
    object InlineResultExpired : TlExceptions("INLINE_RESULT_EXPIRED", 400)

    /**
     * The query ID is empty
     */
    object QueryIdEmpty : TlExceptions("QUERY_ID_EMPTY", 400)

    /**
     * Failure while fetching the webpage with cURL
     */
    object WebpageCurlFailed : TlExceptions("WEBPAGE_CURL_FAILED", 400)

    /**
     * Webpage media empty
     */
    object WebpageMediaEmpty : TlExceptions("WEBPAGE_MEDIA_EMPTY", 400)

    /**
     * The provided message id is invalid
     */
    object MessageIdInvalid : TlExceptions("MESSAGE_ID_INVALID", 400)

    /**
     * Invalid URL provided
     */
    object UrlInvalid : TlExceptions("URL_INVALID", 400)

    /**
     * The message text has not changed
     */
    object MessageNotModified : TlExceptions("MESSAGE_NOT_MODIFIED", 400)

    /**
     * This method can only be called by a bot
     */
    object UserBotInvalid400 : TlExceptions("USER_BOT_INVALID", 400)

    /**
     * The provided contact ID is invalid
     */
    object ContactIdInvalid : TlExceptions("CONTACT_ID_INVALID", 400)

    /**
     * No top peer type was provided
     */
    object TypesEmpty : TlExceptions("TYPES_EMPTY", 400)

    /**
     * The query string is too short
     */
    object QueryTooShort : TlExceptions("QUERY_TOO_SHORT", 400)

    /**
     * The provided offset peer is invalid
     */
    object OffsetPeerIdInvalid : TlExceptions("OFFSET_PEER_ID_INVALID", 400)

    /**
     * Invalid folder ID
     */
    object FolderIdInvalid : TlExceptions("FOLDER_ID_INVALID", 400)

    /**
     * You must be an admin in this chat to do this
     */
    object ChatAdminRequired400 : TlExceptions("CHAT_ADMIN_REQUIRED", 400)

    /**
     * You were blocked by this user
     */
    object UserIsBlocked400 : TlExceptions("USER_IS_BLOCKED", 400)

    /**
     * Bots can't send messages to other bots
     */
    object UserIsBot : TlExceptions("USER_IS_BOT", 400)

    /**
     * This method can only be called by a bot
     */
    object UserBotRequired : TlExceptions("USER_BOT_REQUIRED", 400)

    /**
     * The provided language pack is invalid
     */
    object LangPackInvalid : TlExceptions("LANG_PACK_INVALID", 400)

    /**
     * Empty reaction provided
     */
    object ReactionEmpty : TlExceptions("REACTION_EMPTY", 400)

    /**
     * Message author required
     */
    object MessageAuthorRequired : TlExceptions("MESSAGE_AUTHOR_REQUIRED", 403)

    /**
     * You can't edit this message anymore, too much time has passed since its creation.
     */
    object MessageEditTimeExpired : TlExceptions("MESSAGE_EDIT_TIME_EXPIRED", 400)

    /**
     * You can't send gifs in this chat
     */
    object ChatSendGifsForbidden : TlExceptions("CHAT_SEND_GIFS_FORBIDDEN", 403)

    /**
     * You can't send media in this chat
     */
    object ChatSendMediaForbidden : TlExceptions("CHAT_SEND_MEDIA_FORBIDDEN", 403)

    /**
     * You can't send stickers in this chat.
     */
    object ChatSendStickersForbidden : TlExceptions("CHAT_SEND_STICKERS_FORBIDDEN", 403)

    /**
     * Invalid grouped media
     */
    object GroupedMediaInvalid : TlExceptions("GROUPED_MEDIA_INVALID", 400)

    /**
     * The provided media object is invalid
     */
    object MediaEmpty : TlExceptions("MEDIA_EMPTY", 400)

    /**
     * A provided random ID is invalid
     */
    object RandomIdInvalid : TlExceptions("RANDOM_ID_INVALID", 400)

    /**
     * You blocked this user
     */
    object YouBlockedUser : TlExceptions("YOU_BLOCKED_USER", 400)

    /**
     * The provided peer ID is not supported
     */
    object PeerIdNotSupported : TlExceptions("PEER_ID_NOT_SUPPORTED", 400)

    /**
     * External URL invalid
     */
    object ExternalUrlInvalid : TlExceptions("EXTERNAL_URL_INVALID", 400)

    /**
     * The length of a file part is invalid
     */
    object FilePartLengthInvalid : TlExceptions("FILE_PART_LENGTH_INVALID", 400)

    /**
     * Failure while processing image
     */
    object ImageProcessFailed : TlExceptions("IMAGE_PROCESS_FAILED", 400)

    /**
     * The caption is too long
     */
    object MediaCaptionTooLong : TlExceptions("MEDIA_CAPTION_TOO_LONG", 400)

    /**
     * The photo dimensions are invalid
     */
    object PhotoInvalidDimensions : TlExceptions("PHOTO_INVALID_DIMENSIONS", 400)

    /**
     * nan
     */
    object PhotoSaveFileInvalid : TlExceptions("PHOTO_SAVE_FILE_INVALID", 400)

    /**
     * You can't send messages in this chat, you were restricted
     */
    object ChatRestricted : TlExceptions("CHAT_RESTRICTED", 400)

    /**
     * You mentioned an invalid user
     */
    object EntityMentionUserInvalid : TlExceptions("ENTITY_MENTION_USER_INVALID", 400)

    /**
     * Provided reply_to_msg_id is invalid
     */
    object MsgIdInvalid : TlExceptions("MSG_ID_INVALID", 400)

    /**
     * Slowmode is enabled in this chat: you must wait for the specified number of seconds before sending another message to the chat.
     */
    object SlowmodeWaitX : TlExceptions("SLOWMODE_WAIT_X", 420)

    /**
     * The temporary password is disabled
     */
    object TmpPasswordDisabled : TlExceptions("TMP_PASSWORD_DISABLED", 400)

    /**
     * The provided error message is empty
     */
    object ErrorTextEmpty : TlExceptions("ERROR_TEXT_EMPTY", 400)

    /**
     * The provided sticker set is invalid
     */
    object StickersetInvalid : TlExceptions("STICKERSET_INVALID", 400)

    /**
     * The provided sticker is invalid
     */
    object StickerInvalid : TlExceptions("STICKER_INVALID", 400)

    /**
     * Short pack name invalid
     */
    object PackShortNameInvalid : TlExceptions("PACK_SHORT_NAME_INVALID", 400)

    /**
     * A stickerpack with this name already exists
     */
    object PackShortNameOccupied : TlExceptions("PACK_SHORT_NAME_OCCUPIED", 400)

    /**
     * No sticker provided
     */
    object StickersEmpty : TlExceptions("STICKERS_EMPTY", 400)

    /**
     * Sticker emoji invalid
     */
    object StickerEmojiInvalid : TlExceptions("STICKER_EMOJI_INVALID", 400)

    /**
     * Sticker file invalid
     */
    object StickerFileInvalid : TlExceptions("STICKER_FILE_INVALID", 400)

    /**
     * Sticker png dimensions invalid
     */
    object StickerPngDimensions : TlExceptions("STICKER_PNG_DIMENSIONS", 400)

    /**
     * The provided sticker ID is invalid
     */
    object StickerIdInvalid : TlExceptions("STICKER_ID_INVALID", 400)

    /**
     * Code hash invalid
     */
    object CodeHashInvalid : TlExceptions("CODE_HASH_INVALID", 400)

    /**
     * The privacy key is invalid
     */
    object PrivacyKeyInvalid : TlExceptions("PRIVACY_KEY_INVALID", 400)

    /**
     * The provided hash is invalid
     */
    object HashInvalid : TlExceptions("HASH_INVALID", 400)

    /**
     * The provided TTL is invalid
     */
    object TtlDaysInvalid : TlExceptions("TTL_DAYS_INVALID", 400)

    /**
     * About string too long
     */
    object AboutTooLong : TlExceptions("ABOUT_TOO_LONG", 400)

    /**
     * The provided max ID is invalid
     */
    object MaxIdInvalid : TlExceptions("MAX_ID_INVALID", 400)

    /**
     * Photo is too small
     */
    object PhotoCropSizeSmall : TlExceptions("PHOTO_CROP_SIZE_SMALL", 400)

    /**
     * The provided username is not valid
     */
    object UsernameInvalid : TlExceptions("USERNAME_INVALID", 400)

    /**
     * You're admin of too many public channels, make some channels private to change the username of this channel
     */
    object ChannelsAdminPublicTooMuch : TlExceptions("CHANNELS_ADMIN_PUBLIC_TOO_MUCH", 400)

    /**
     * The username was not modified
     */
    object UsernameNotModified : TlExceptions("USERNAME_NOT_MODIFIED", 400)

    /**
     * The provided username is already occupied
     */
    object UsernameOccupied : TlExceptions("USERNAME_OCCUPIED", 400)

    /**
     * The provided username is not occupied
     */
    object UsernameNotOccupied : TlExceptions("USERNAME_NOT_OCCUPIED", 400)

}