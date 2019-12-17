package messenger.telegram.method.exceptions


object MethodsPossibleErrors {

    object TLRequestHelpGetTermsOfServiceUpdate {

        val botMethodInvalid = BotMethodInvalid

    }

    object TLRequestHelpAcceptTermsOfService {

        val botMethodInvalid = BotMethodInvalid

    }

    object TLRequestAccountReportPeer {

        val botMethodInvalid = BotMethodInvalid
        val peerIdInvalid = PeerIdInvalid

    }

    object TLRequestChannelsReportSpam {

        val botMethodInvalid = BotMethodInvalid
        val channelInvalid = ChannelInvalid
        val inputUserDeactivated = InputUserDeactivated

    }

    object TLRequestMessagesReport {

        val botMethodInvalid = BotMethodInvalid

    }

    object TLRequestMessagesReportSpam {

        val botMethodInvalid = BotMethodInvalid
        val peerIdInvalid = PeerIdInvalid

    }

    object TLRequestMessagesReportEncryptedSpam {

        val botMethodInvalid = BotMethodInvalid
        val chatIdInvalid = ChatIdInvalid

    }

    object TLRequestHelpGetAppChangelog {

        val botMethodInvalid = BotMethodInvalid

    }

    object TLRequestHelpGetAppConfig {

        val botMethodInvalid = BotMethodInvalid

    }

    object TLRequestHelpGetAppUpdate {

        val botMethodInvalid = BotMethodInvalid

    }

    object TLRequestHelpGetConfig {

        val connectionDeviceModelEmpty = ConnectionDeviceModelEmpty
        val timeout = Timeout

    }

    object TLRequestHelpGetInviteText {

        val botMethodInvalid = BotMethodInvalid

    }

    object TLRequestHelpGetNearestDc {

        val botMethodInvalid = BotMethodInvalid

    }

    object TLRequestHelpGetSupport {

        val botMethodInvalid = BotMethodInvalid

    }

    object TLRequestHelpGetSupportName {

        val botMethodInvalid = BotMethodInvalid

    }

    object TLRequestHelpSaveAppLog {

        val botMethodInvalid = BotMethodInvalid

    }

    object TLRequestInitConnection {

        val connectionLayerInvalid = ConnectionLayerInvalid

    }

    object TLRequestInvokeWithLayer {

        val authBytesInvalid = AuthBytesInvalid
        val cdnMethodInvalid = CdnMethodInvalid
        val chatWriteForbidden = ChatWriteForbidden
        val connectionApiIdInvalid = ConnectionApiIdInvalid
        val connectionDeviceModelEmpty = ConnectionDeviceModelEmpty
        val connectionLangPackInvalid = ConnectionLangPackInvalid
        val connectionNotInited = ConnectionNotInited
        val connectionSystemEmpty = ConnectionSystemEmpty
        val inputLayerInvalid = InputLayerInvalid
        val inviteHashExpired = InviteHashExpired
        val timeout = Timeout

    }

    object TLRequestAuthBindTempAuthKey {

        val encryptedMessageInvalid = EncryptedMessageInvalid
        val inputRequestTooLong = InputRequestTooLong
        val tempAuthKeyAlreadyBound = TempAuthKeyAlreadyBound
        val tempAuthKeyEmpty = TempAuthKeyEmpty
        val timeout = Timeout

    }

    object TLRequestAuthCancelCode {

        val botMethodInvalid = BotMethodInvalid
        val phoneNumberInvalid = PhoneNumberInvalid

    }

    object TLRequestAuthCheckPassword {

        val botMethodInvalid = BotMethodInvalid
        val passwordHashInvalid = PasswordHashInvalid

    }

    object TLRequestAuthExportAuthorization {

        val dcIdInvalid = DcIdInvalid

    }

    object TLRequestAuthImportAuthorization {

        val authBytesInvalid = AuthBytesInvalid
        val userIdInvalid = UserIdInvalid

    }

    object TLRequestAuthImportBotAuthorization {

        val accessTokenExpired = AccessTokenExpired
        val accessTokenInvalid = AccessTokenInvalid
        val apiIdInvalid = ApiIdInvalid

    }

    object TLRequestAuthRecoverPassword {

        val botMethodInvalid = BotMethodInvalid
        val codeEmpty = CodeEmpty

    }

    object TLRequestAuthRequestPasswordRecovery {

        val botMethodInvalid = BotMethodInvalid
        val passwordEmpty = PasswordEmpty

    }

    object TLRequestAuthResendCode {

        val botMethodInvalid = BotMethodInvalid
        val phoneNumberInvalid = PhoneNumberInvalid

    }

    object TLRequestAuthResetAuthorizations {

        val freshResetAuthorisationForbidden = FreshResetAuthorisationForbidden
        val timeout = Timeout

    }

    object TLRequestAuthSendCode {

        val apiIdInvalid = ApiIdInvalid
        val apiIdPublishedFlood = ApiIdPublishedFlood
        val botMethodInvalid = BotMethodInvalid
        val inputRequestTooLong = InputRequestTooLong
        val networkMigrateX = NetworkMigrateX
        val phoneMigrateX = PhoneMigrateX
        val phoneNumberAppSignupForbidden = PhoneNumberAppSignupForbidden
        val phoneNumberBanned = PhoneNumberBanned
        val phoneNumberFlood = PhoneNumberFlood
        val phoneNumberInvalid = PhoneNumberInvalid
        val phonePasswordFlood = PhonePasswordFlood
        val phonePasswordProtected = PhonePasswordProtected
        val smsCodeCreateFailed = SmsCodeCreateFailed

    }

    object TLRequestAuthSignIn {

        val botMethodInvalid = BotMethodInvalid
        val phoneCodeEmpty = PhoneCodeEmpty
        val phoneCodeExpired = PhoneCodeExpired
        val phoneCodeInvalid = PhoneCodeInvalid
        val phoneNumberInvalid = PhoneNumberInvalid
        val phoneNumberUnoccupied = PhoneNumberUnoccupied
        val sessionPasswordNeeded = SessionPasswordNeeded

    }

    object TLRequestAuthSignUp {

        val botMethodInvalid = BotMethodInvalid
        val firstnameInvalid = FirstnameInvalid
        val lastnameInvalid = LastnameInvalid
        val phoneCodeEmpty = PhoneCodeEmpty
        val phoneCodeExpired = PhoneCodeExpired
        val phoneCodeInvalid = PhoneCodeInvalid
        val phoneNumberFlood = PhoneNumberFlood
        val phoneNumberInvalid = PhoneNumberInvalid
        val phoneNumberOccupied = PhoneNumberOccupied

    }

    object TLRequestAccountInitTakeoutSession {

        val botMethodInvalid = BotMethodInvalid

    }

    object TLRequestAccountFinishTakeoutSession {

        val botMethodInvalid = BotMethodInvalid

    }

    object TLRequestMessagesGetSplitRanges {

        val botMethodInvalid = BotMethodInvalid

    }

    object TLRequestChannelsGetLeftChannels {

        val botMethodInvalid = BotMethodInvalid
        val takeoutRequired = TakeoutRequired

    }

    object TLRequestMessagesGetSavedGifs {

        val botMethodInvalid = BotMethodInvalid

    }

    object TLRequestMessagesSaveGif {

        val botMethodInvalid = BotMethodInvalid
        val gifIdInvalid = GifIdInvalid

    }

    object TLRequestMessagesSearchGifs {

        val botMethodInvalid = BotMethodInvalid
        val searchQueryEmpty = SearchQueryEmpty

    }

    object TLRequestHelpEditUserInfo {

        val botMethodInvalid = BotMethodInvalid

    }

    object TLRequestHelpGetUserInfo {

        val botMethodInvalid = BotMethodInvalid

    }

    object TLRequestAccountConfirmPasswordEmail {

        val botMethodInvalid = BotMethodInvalid

    }

    object TLRequestAccountResendPasswordEmail {

        val botMethodInvalid = BotMethodInvalid

    }

    object TLRequestAccountCancelPasswordEmail {

        val botMethodInvalid = BotMethodInvalid

    }

    object TLRequestAccountGetPassword {

        val botMethodInvalid = BotMethodInvalid

    }

    object TLRequestAccountGetPasswordSettings {

        val botMethodInvalid = BotMethodInvalid
        val passwordHashInvalid = PasswordHashInvalid

    }

    object TLRequestAccountUpdatePasswordSettings {

        val botMethodInvalid = BotMethodInvalid
        val emailUnconfirmed = EmailUnconfirmed
        val emailUnconfirmedX = EmailUnconfirmedX
        val newSaltInvalid = NewSaltInvalid
        val newSettingsInvalid = NewSettingsInvalid
        val passwordHashInvalid = PasswordHashInvalid

    }

    object TLRequestMessagesRequestUrlAuth {

        val botMethodInvalid = BotMethodInvalid

    }

    object TLRequestMessagesAcceptUrlAuth {

        val botMethodInvalid = BotMethodInvalid

    }

    object TLRequestAccountGetWebAuthorizations {

        val botMethodInvalid = BotMethodInvalid

    }

    object TLRequestAccountResetWebAuthorization {

        val botMethodInvalid = BotMethodInvalid

    }

    object TLRequestAccountResetWebAuthorizations {

        val botMethodInvalid = BotMethodInvalid

    }

    object TLRequestPhoneAcceptCall {

        val botMethodInvalid = BotMethodInvalid
        val callAlreadyAccepted = CallAlreadyAccepted
        val callAlreadyDeclined = CallAlreadyDeclined
        val callPeerInvalid = CallPeerInvalid
        val callProtocolFlagsInvalid = CallProtocolFlagsInvalid

    }

    object TLRequestPhoneConfirmCall {

        val botMethodInvalid = BotMethodInvalid
        val callAlreadyDeclined = CallAlreadyDeclined
        val callPeerInvalid = CallPeerInvalid

    }

    object TLRequestPhoneDiscardCall {

        val botMethodInvalid = BotMethodInvalid
        val callAlreadyAccepted = CallAlreadyAccepted
        val callPeerInvalid = CallPeerInvalid

    }

    object TLRequestPhoneGetCallConfig {

        val botMethodInvalid = BotMethodInvalid

    }

    object TLRequestPhoneReceivedCall {

        val botMethodInvalid = BotMethodInvalid
        val callAlreadyDeclined = CallAlreadyDeclined
        val callPeerInvalid = CallPeerInvalid

    }

    object TLRequestPhoneRequestCall {

        val botMethodInvalid = BotMethodInvalid
        val callProtocolFlagsInvalid = CallProtocolFlagsInvalid
        val participantVersionOutdated = ParticipantVersionOutdated
        val userIdInvalid = UserIdInvalid
        val userIsBlocked = UserIsBlocked
        val userPrivacyRestricted = UserPrivacyRestricted

    }

    object TLRequestPhoneSaveCallDebug {

        val botMethodInvalid = BotMethodInvalid
        val callPeerInvalid = CallPeerInvalid
        val dataJsonInvalid = DataJsonInvalid

    }

    object TLRequestPhoneSetCallRating {

        val botMethodInvalid = BotMethodInvalid
        val callPeerInvalid = CallPeerInvalid

    }

    object TLRequestChannelsCreateChannel {

        val botMethodInvalid = BotMethodInvalid
        val chatTitleEmpty = ChatTitleEmpty
        val userRestricted = UserRestricted

    }

    object TLRequestChannelsDeleteChannel {

        val botMethodInvalid = BotMethodInvalid
        val channelInvalid = ChannelInvalid
        val channelPrivate = ChannelPrivate
        val chatAdminRequired = ChatAdminRequired

    }

    object TLRequestChannelsDeleteHistory {

        val botMethodInvalid = BotMethodInvalid
        val channelInvalid = ChannelInvalid

    }

    object TLRequestChannelsDeleteMessages {

        val channelInvalid = ChannelInvalid
        val channelPrivate = ChannelPrivate
        val messageDeleteForbidden = MessageDeleteForbidden

    }

    object TLRequestChannelsDeleteUserHistory {

        val botMethodInvalid = BotMethodInvalid
        val channelInvalid = ChannelInvalid
        val chatAdminRequired = ChatAdminRequired

    }

    object TLRequestChannelsEditAdmin {

        val adminsTooMuch = AdminsTooMuch
        val botChannelsNa = BotChannelsNa
        val channelInvalid = ChannelInvalid
        val chatAdminInviteRequired = ChatAdminInviteRequired
        val chatAdminRequired = ChatAdminRequired
        val rightForbidden = RightForbidden
        val userCreator = UserCreator
        val userIdInvalid = UserIdInvalid
        val userNotMutualContact = UserNotMutualContact
        val userPrivacyRestricted = UserPrivacyRestricted

    }

    object TLRequestChannelsEditBanned {

        val channelInvalid = ChannelInvalid
        val channelPrivate = ChannelPrivate
        val chatAdminRequired = ChatAdminRequired
        val userAdminInvalid = UserAdminInvalid
        val userIdInvalid = UserIdInvalid

    }

    object TLRequestChannelsEditCreator {

        val botMethodInvalid = BotMethodInvalid

    }

    object TLRequestChannelsEditLocation {

        val botMethodInvalid = BotMethodInvalid

    }

    object TLRequestChannelsEditPhoto {

        val channelInvalid = ChannelInvalid
        val chatAdminRequired = ChatAdminRequired
        val photoInvalid = PhotoInvalid

    }

    object TLRequestChannelsEditTitle {

        val channelInvalid = ChannelInvalid
        val chatAdminRequired = ChatAdminRequired
        val chatNotModified = ChatNotModified
        val chatTitleEmpty = ChatTitleEmpty

    }

    object TLRequestChannelsExportMessageLink {

        val botMethodInvalid = BotMethodInvalid
        val channelInvalid = ChannelInvalid

    }

    object TLRequestChannelsGetAdminLog {

        val botMethodInvalid = BotMethodInvalid
        val channelInvalid = ChannelInvalid
        val channelPrivate = ChannelPrivate
        val chatAdminRequired = ChatAdminRequired

    }

    object TLRequestChannelsGetChannels {

        val channelInvalid = ChannelInvalid
        val channelPrivate = ChannelPrivate

    }

    object TLRequestChannelsGetFullChannel {

        val channelInvalid = ChannelInvalid
        val channelPrivate = ChannelPrivate
        val channelPublicGroupNa = ChannelPublicGroupNa
        val timeout = Timeout

    }

    object TLRequestChannelsGetGroupsForDiscussion {

        val botMethodInvalid = BotMethodInvalid

    }

    object TLRequestChannelsGetMessages {

        val channelInvalid = ChannelInvalid
        val channelPrivate = ChannelPrivate
        val messageIdsEmpty = MessageIdsEmpty

    }

    object TLRequestChannelsGetParticipant {

        val channelInvalid = ChannelInvalid
        val channelPrivate = ChannelPrivate
        val chatAdminRequired = ChatAdminRequired
        val userIdInvalid = UserIdInvalid
        val userNotParticipant = UserNotParticipant

    }

    object TLRequestChannelsGetParticipants {

        val channelInvalid = ChannelInvalid
        val channelPrivate = ChannelPrivate
        val chatAdminRequired = ChatAdminRequired
        val inputConstructorInvalid = InputConstructorInvalid
        val timeout = Timeout

    }

    object TLRequestChannelsInviteToChannel {

        val botsTooMuch = BotsTooMuch
        val botGroupsBlocked = BotGroupsBlocked
        val botMethodInvalid = BotMethodInvalid
        val channelInvalid = ChannelInvalid
        val channelPrivate = ChannelPrivate
        val chatAdminRequired = ChatAdminRequired
        val chatInvalid = ChatInvalid
        val chatWriteForbidden = ChatWriteForbidden
        val inputUserDeactivated = InputUserDeactivated
        val timeout = Timeout
        val usersTooMuch = UsersTooMuch
        val userBannedInChannel = UserBannedInChannel
        val userBlocked = UserBlocked
        val userBot = UserBot
        val userChannelsTooMuch = UserChannelsTooMuch
        val userIdInvalid = UserIdInvalid
        val userKicked = UserKicked
        val userNotMutualContact = UserNotMutualContact
        val userPrivacyRestricted = UserPrivacyRestricted

    }

    object TLRequestChannelsJoinChannel {

        val botMethodInvalid = BotMethodInvalid
        val channelsTooMuch = ChannelsTooMuch
        val channelInvalid = ChannelInvalid
        val channelPrivate = ChannelPrivate
        val inviteHashExpired = InviteHashExpired
        val inviteHashInvalid = InviteHashInvalid
        val userAlreadyParticipant = UserAlreadyParticipant

    }

    object TLRequestChannelsLeaveChannel {

        val channelInvalid = ChannelInvalid
        val channelPrivate = ChannelPrivate
        val channelPublicGroupNa = ChannelPublicGroupNa
        val userCreator = UserCreator
        val userNotParticipant = UserNotParticipant

    }

    object TLRequestChannelsReadHistory {

        val botMethodInvalid = BotMethodInvalid
        val channelInvalid = ChannelInvalid
        val channelPrivate = ChannelPrivate

    }

    object TLRequestChannelsReadMessageContents {

        val botMethodInvalid = BotMethodInvalid
        val channelInvalid = ChannelInvalid
        val channelPrivate = ChannelPrivate

    }

    object TLRequestChannelsSetDiscussionGroup {

        val botMethodInvalid = BotMethodInvalid

    }

    object TLRequestChannelsSetStickers {

        val channelInvalid = ChannelInvalid
        val participantsTooFew = ParticipantsTooFew

    }

    object TLRequestChannelsTogglePreHistoryHidden {

        val botMethodInvalid = BotMethodInvalid

    }

    object TLRequestChannelsToggleSignatures {

        val botMethodInvalid = BotMethodInvalid
        val channelInvalid = ChannelInvalid

    }

    object TLRequestChannelsToggleSlowMode {

        val botMethodInvalid = BotMethodInvalid
        val chatNotModified = ChatNotModified
        val inputMethodInvalid1192227X = InputMethodInvalid1192227X
        val inputMethodInvalid1604042050X = InputMethodInvalid1604042050X
        val secondsInvalid = SecondsInvalid

    }

    object TLRequestMessagesGetStatsURL {

        val botMethodInvalid = BotMethodInvalid
        val peerIdInvalid = PeerIdInvalid

    }

    object TLRequestMessagesAddChatUser {

        val botMethodInvalid = BotMethodInvalid
        val chatAdminRequired = ChatAdminRequired
        val chatIdInvalid = ChatIdInvalid
        val inputUserDeactivated = InputUserDeactivated
        val peerIdInvalid = PeerIdInvalid
        val usersTooMuch = UsersTooMuch
        val userAlreadyParticipant = UserAlreadyParticipant
        val userIdInvalid = UserIdInvalid
        val userNotMutualContact = UserNotMutualContact403
        val userPrivacyRestricted = UserPrivacyRestricted

    }

    object TLRequestMessagesCheckChatInvite {

        val botMethodInvalid = BotMethodInvalid
        val inviteHashEmpty = InviteHashEmpty
        val inviteHashExpired = InviteHashExpired
        val inviteHashInvalid = InviteHashInvalid

    }

    object TLRequestMessagesCreateChat {

        val botMethodInvalid = BotMethodInvalid
        val inputUserDeactivated = InputUserDeactivated
        val usersTooFew = UsersTooFew
        val userRestricted = UserRestricted

    }

    object TLRequestMessagesDeleteChatUser {

        val chatIdInvalid = ChatIdInvalid
        val peerIdInvalid = PeerIdInvalid
        val userNotParticipant = UserNotParticipant

    }

    object TLRequestMessagesEditChatAbout {

        val peerIdInvalid = PeerIdInvalid

    }

    object TLRequestMessagesEditChatAdmin {

        val botMethodInvalid = BotMethodInvalid
        val chatIdInvalid = ChatIdInvalid

    }

    object TLRequestMessagesEditChatDefaultBannedRights {

        val bannedRightsInvalid = BannedRightsInvalid
        val peerIdInvalid = PeerIdInvalid

    }

    object TLRequestMessagesEditChatPhoto {

        val chatIdInvalid = ChatIdInvalid
        val inputConstructorInvalid = InputConstructorInvalid
        val peerIdInvalid = PeerIdInvalid
        val photoExtInvalid = PhotoExtInvalid

    }

    object TLRequestMessagesEditChatTitle {

        val chatIdInvalid = ChatIdInvalid
        val chatTitleEmpty = ChatTitleEmpty

    }

    object TLRequestMessagesExportChatInvite {

        val botMethodInvalid = BotMethodInvalid
        val chatIdInvalid = ChatIdInvalid

    }

    object TLRequestMessagesGetAllChats {

        val botMethodInvalid = BotMethodInvalid

    }

    object TLRequestMessagesGetChats {

        val chatIdInvalid = ChatIdInvalid
        val peerIdInvalid = PeerIdInvalid

    }

    object TLRequestMessagesGetCommonChats {

        val botMethodInvalid = BotMethodInvalid
        val userIdInvalid = UserIdInvalid

    }

    object TLRequestMessagesGetFullChat {

        val chatIdInvalid = ChatIdInvalid
        val peerIdInvalid = PeerIdInvalid

    }

    object TLRequestMessagesImportChatInvite {

        val botMethodInvalid = BotMethodInvalid
        val channelsTooMuch = ChannelsTooMuch
        val inviteHashEmpty = InviteHashEmpty
        val inviteHashExpired = InviteHashExpired
        val inviteHashInvalid = InviteHashInvalid
        val sessionPasswordNeeded = SessionPasswordNeeded401
        val usersTooMuch = UsersTooMuch
        val userAlreadyParticipant = UserAlreadyParticipant

    }

    object TLRequestMessagesMigrateChat {

        val botMethodInvalid = BotMethodInvalid
        val chatAdminRequired = ChatAdminRequired403
        val chatIdInvalid = ChatIdInvalid
        val peerIdInvalid = PeerIdInvalid

    }

    object TLRequestMessagesStartBot {

        val botInvalid = BotInvalid
        val botMethodInvalid = BotMethodInvalid
        val peerIdInvalid = PeerIdInvalid
        val startParamEmpty = StartParamEmpty
        val startParamInvalid = StartParamInvalid

    }

    object TLRequestHelpGetDeepLinkInfo {

        val botMethodInvalid = BotMethodInvalid

    }

    object TLRequestHelpGetRecentMeUrls {

        val botMethodInvalid = BotMethodInvalid

    }

    object TLRequestHelpGetCdnConfig {

        val authKeyPermEmpty = AuthKeyPermEmpty
        val timeout = Timeout

    }

    object TLRequestUploadGetCdnFile {

        val botMethodInvalid = BotMethodInvalid

    }

    object TLRequestUploadGetCdnFileHashes {

        val cdnMethodInvalid = CdnMethodInvalid
        val rsaDecryptFailed = RsaDecryptFailed

    }

    object TLRequestUploadReuploadCdnFile {

        val rsaDecryptFailed = RsaDecryptFailed

    }

    object TLRequestUploadGetFile {

        val authKeyPermEmpty = AuthKeyPermEmpty
        val fileIdInvalid = FileIdInvalid
        val fileReference = FileReference
        val limitInvalid = LimitInvalid
        val locationInvalid = LocationInvalid
        val offsetInvalid = OffsetInvalid
        val timeout = Timeout

    }

    object TLRequestUploadGetFileHashes {

        val locationInvalid = LocationInvalid

    }

    object TLRequestUploadGetWebFile {

        val locationInvalid = LocationInvalid
        val botMethodInvalid = BotMethodInvalid

    }

    object TLRequestUploadSaveBigFilePart {

        val filePartsInvalid = FilePartsInvalid
        val filePartEmpty = FilePartEmpty
        val filePartInvalid = FilePartInvalid
        val filePartSizeInvalid = FilePartSizeInvalid
        val timeout = Timeout

    }

    object TLRequestUploadSaveFilePart {

        val filePartEmpty = FilePartEmpty
        val filePartInvalid = FilePartInvalid
        val sessionPasswordNeeded = SessionPasswordNeeded

    }

    object TLRequestMessagesUploadEncryptedFile {

        val botMethodInvalid = BotMethodInvalid

    }

    object TLRequestMessagesUploadMedia {

        val botMissing = BotMissing
        val mediaInvalid = MediaInvalid
        val peerIdInvalid = PeerIdInvalid

    }

    object TLRequestMessagesGetDocumentByHash {

        val sha256HashInvalid = Sha256HashInvalid

    }

    object TLRequestMessagesGetWebPage {

        val botMethodInvalid = BotMethodInvalid
        val wcConvertUrlInvalid = WcConvertUrlInvalid

    }

    object TLRequestMessagesGetWebPagePreview {

        val botMethodInvalid = BotMethodInvalid
        val messageEmpty = MessageEmpty

    }

    object TLRequestMessagesSetEncryptedTyping {

        val botMethodInvalid = BotMethodInvalid
        val chatIdInvalid = ChatIdInvalid

    }

    object TLRequestMessagesReadEncryptedHistory {

        val botMethodInvalid = BotMethodInvalid
        val msgWaitFailed = MsgWaitFailed

    }

    object TLRequestMessagesAcceptEncryption {
        val botMethodInvalid = BotMethodInvalid
        val chatIdInvalid = ChatIdInvalid
        val encryptionAlreadyAccepted = EncryptionAlreadyAccepted
        val encryptionAlreadyDeclined = EncryptionAlreadyDeclined

    }

    object TLRequestMessagesDiscardEncryption {

        val botMethodInvalid = BotMethodInvalid
        val chatIdEmpty = ChatIdEmpty
        val encryptionAlreadyDeclined = EncryptionAlreadyDeclined
        val encryptionIdInvalid = EncryptionIdInvalid

    }

    object TLRequestMessagesRequestEncryption {

        val botMethodInvalid = BotMethodInvalid
        val dhGAInvalid = DhGAInvalid
        val userIdInvalid = UserIdInvalid

    }

    object TLRequestMessagesSendEncrypted {

        val botMethodInvalid = BotMethodInvalid
        val chatIdInvalid = ChatIdInvalid
        val dataInvalid = DataInvalid
        val encryptionDeclined = EncryptionDeclined
        val msgWaitFailed = MsgWaitFailed

    }

    object TLRequestMessagesSendEncryptedFile {

        val botMethodInvalid = BotMethodInvalid
        val msgWaitFailed = MsgWaitFailed

    }

    object TLRequestMessagesSendEncryptedService {

        val botMethodInvalid = BotMethodInvalid
        val dataInvalid = DataInvalid
        val encryptionDeclined = EncryptionDeclined
        val msgWaitFailed = MsgWaitFailed
        val userIsBlocked = UserIsBlocked

    }

    object TLRequestMessagesGetDhConfig {

        val botMethodInvalid = BotMethodInvalid
        val randomLengthInvalid = RandomLengthInvalid

    }

    object TLRequestMessagesReceivedQueue {

        val botMethodInvalid = BotMethodInvalid
        val msgWaitFailed = MsgWaitFailed

    }

    object TLRequestAccountSendVerifyEmailCode {

        val botMethodInvalid = BotMethodInvalid

    }

    object TLRequestAccountVerifyEmail {

        val botMethodInvalid = BotMethodInvalid

    }

    object TLRequestAccountSendVerifyPhoneCode {

        val botMethodInvalid = BotMethodInvalid

    }

    object TLRequestAccountVerifyPhone {

        val botMethodInvalid = BotMethodInvalid

    }

    object TLRequestAccountAcceptAuthorization {

        val botMethodInvalid = BotMethodInvalid

    }

    object TLRequestAccountGetAuthorizationForm {

        val botMethodInvalid = BotMethodInvalid

    }

    object TLRequestAccountGetAuthorizations {

        val botMethodInvalid = BotMethodInvalid

    }

    object TLRequestAccountDeleteSecureValue {

        val botMethodInvalid = BotMethodInvalid

    }

    object TLRequestAccountGetAllSecureValues {

        val botMethodInvalid = BotMethodInvalid

    }

    object TLRequestAccountGetSecureValue {

        val botMethodInvalid = BotMethodInvalid

    }

    object TLRequestAccountSaveSecureValue {

        val botMethodInvalid = BotMethodInvalid

    }

    object TLRequestHelpGetPassportConfig {

        val botMethodInvalid = BotMethodInvalid

    }

    object TLRequestUsersSetSecureValueErrors {

        val userIdInvalid = UserIdInvalid

    }

    object TLRequestUpdatesGetChannelDifference {

        val channelInvalid = ChannelInvalid
        val channelPrivate = ChannelPrivate
        val channelPublicGroupNa = ChannelPublicGroupNa
        val persistentTimestampEmpty = PersistentTimestampEmpty
        val persistentTimestampInvalid = PersistentTimestampInvalid
        val rangesInvalid = RangesInvalid
        val timeout = Timeout

    }

    object TLRequestUpdatesGetDifference {

        val authKeyPermEmpty = AuthKeyPermEmpty
        val cdnMethodInvalid = CdnMethodInvalid
        val dateEmpty = DateEmpty
        val persistentTimestampEmpty = PersistentTimestampEmpty
        val persistentTimestampInvalid = PersistentTimestampInvalid
        val sessionPasswordNeeded = SessionPasswordNeeded
        val timeout = Timeout

    }

    object TLRequestUpdatesGetState {

        val sessionPasswordNeeded = SessionPasswordNeeded
        val timeout = Timeout

    }

    object TLRequestMessagesGetInlineBotResults {

        val botInlineDisabled = BotInlineDisabled
        val botInvalid = BotInvalid
        val botMethodInvalid = BotMethodInvalid
        val channelPrivate = ChannelPrivate
        val timeout = Timeout

    }

    object TLRequestMessagesSetInlineBotResults {

        val articleTitleEmpty = ArticleTitleEmpty
        val buttonDataInvalid = ButtonDataInvalid
        val buttonTypeInvalid = ButtonTypeInvalid
        val buttonUrlInvalid = ButtonUrlInvalid
        val messageEmpty = MessageEmpty
        val messageTooLong = MessageTooLong
        val photoInvalid = PhotoInvalid
        val photoThumbUrlEmpty = PhotoThumbUrlEmpty
        val queryIdInvalid = QueryIdInvalid
        val replyMarkupInvalid = ReplyMarkupInvalid
        val resultTypeInvalid = ResultTypeInvalid
        val sendMessageTypeInvalid = SendMessageTypeInvalid
        val startParamInvalid = StartParamInvalid
        val userBotInvalid = UserBotInvalid

    }

    object TLRequestMessagesSendInlineBotResult {

        val botMethodInvalid = BotMethodInvalid
        val chatWriteForbidden = ChatWriteForbidden
        val inlineResultExpired = InlineResultExpired
        val peerIdInvalid = PeerIdInvalid
        val queryIdEmpty = QueryIdEmpty
        val webpageCurlFailed = WebpageCurlFailed
        val webpageMediaEmpty = WebpageMediaEmpty

    }

    object TLRequestMessagesGetBotCallbackAnswer {

        val botMethodInvalid = BotMethodInvalid
        val channelInvalid = ChannelInvalid
        val dataInvalid = DataInvalid
        val messageIdInvalid = MessageIdInvalid
        val peerIdInvalid = PeerIdInvalid
        val timeout = Timeout

    }

    object TLRequestMessagesSetBotCallbackAnswer {

        val queryIdInvalid = QueryIdInvalid
        val urlInvalid = UrlInvalid

    }

    object TLRequestMessagesEditInlineBotMessage {

        val messageIdInvalid = MessageIdInvalid
        val messageNotModified = MessageNotModified

    }

    object TLRequestBotsAnswerWebhookJSONQuery {

        val queryIdInvalid = QueryIdInvalid
        val userBotInvalid = UserBotInvalid400

    }

    object TLRequestBotsSendCustomRequest {

        val userBotInvalid = UserBotInvalid

    }

    object TLRequestAccountGetContactSignUpNotification {

        val botMethodInvalid = BotMethodInvalid

    }

    object TLRequestAccountSetContactSignUpNotification {

        val botMethodInvalid = BotMethodInvalid

    }

    object TLRequestContactsAcceptContact {

        val botMethodInvalid = BotMethodInvalid

    }

    object TLRequestContactsAddContact {

        val botMethodInvalid = BotMethodInvalid
        val contactIdInvalid = ContactIdInvalid

    }

    object TLRequestContactsBlock {

        val botMethodInvalid = BotMethodInvalid
        val contactIdInvalid = ContactIdInvalid

    }

    object TLRequestContactsDeleteByPhones {

        val botMethodInvalid = BotMethodInvalid

    }

    object TLRequestContactsDeleteContacts {

        val botMethodInvalid = BotMethodInvalid
        val timeout = Timeout

    }

    object TLRequestContactsGetBlocked {

        val botMethodInvalid = BotMethodInvalid

    }

    object TLRequestContactsGetContactIDs {

        val botMethodInvalid = BotMethodInvalid

    }

    object TLRequestContactsGetContacts {

        val botMethodInvalid = BotMethodInvalid

    }

    object TLRequestContactsGetLocated {

        val botMethodInvalid = BotMethodInvalid

    }

    object TLRequestContactsGetSaved {

        val botMethodInvalid = BotMethodInvalid
        val takeoutRequired = TakeoutRequired

    }

    object TLRequestContactsGetStatuses {

        val botMethodInvalid = BotMethodInvalid
        val sessionPasswordNeeded = SessionPasswordNeeded

    }

    object TLRequestContactsGetTopPeers {

        val botMethodInvalid = BotMethodInvalid
        val typesEmpty = TypesEmpty

    }

    object TLRequestContactsImportContacts {

        val botMethodInvalid = BotMethodInvalid

    }

    object TLRequestContactsResetSaved {

        val botMethodInvalid = BotMethodInvalid

    }

    object TLRequestContactsResetTopPeerRating {

        val botMethodInvalid = BotMethodInvalid
        val peerIdInvalid = PeerIdInvalid

    }

    object TLRequestContactsSearch {

        val botMethodInvalid = BotMethodInvalid
        val queryTooShort = QueryTooShort
        val searchQueryEmpty = SearchQueryEmpty
        val timeout = Timeout

    }

    object TLRequestContactsToggleTopPeers {

        val botMethodInvalid = BotMethodInvalid

    }

    object TLRequestContactsUnblock {

        val botMethodInvalid = BotMethodInvalid
        val contactIdInvalid = ContactIdInvalid

    }

    object TLRequestMessagesGetDialogs {

        val botMethodInvalid = BotMethodInvalid
        val inputConstructorInvalid = InputConstructorInvalid
        val offsetPeerIdInvalid = OffsetPeerIdInvalid
        val sessionPasswordNeeded = SessionPasswordNeeded
        val timeout = Timeout

    }

    object TLRequestMessagesGetPeerDialogs {

        val botMethodInvalid = BotMethodInvalid
        val channelPrivate = ChannelPrivate
        val peerIdInvalid = PeerIdInvalid

    }

    object TLRequestMessagesGetPinnedDialogs {

        val botMethodInvalid = BotMethodInvalid
        val folderIdInvalid = FolderIdInvalid

    }

    object TLRequestMessagesToggleDialogPin {

        val botMethodInvalid = BotMethodInvalid
        val peerIdInvalid = PeerIdInvalid

    }

    object TLRequestMessagesReorderPinnedDialogs {

        val botMethodInvalid = BotMethodInvalid
        val peerIdInvalid = PeerIdInvalid

    }

    object TLRequestMessagesGetDialogUnreadMarks {

        val botMethodInvalid = BotMethodInvalid

    }

    object TLRequestMessagesMarkDialogUnread {

        val botMethodInvalid = BotMethodInvalid

    }

    object TLRequestMessagesGetPeerSettings {

        val botMethodInvalid = BotMethodInvalid
        val channelInvalid = ChannelInvalid
        val peerIdInvalid = PeerIdInvalid

    }

    object TLRequestMessagesHidePeerSettingsBar {

        val botMethodInvalid = BotMethodInvalid

    }

    object TLRequestMessagesGetOnlines {

        val botMethodInvalid = BotMethodInvalid

    }

    object TLRequestMessagesSendScreenshotNotification {

        val botMethodInvalid = BotMethodInvalid
        val peerIdInvalid = PeerIdInvalid

    }

    object TLRequestMessagesSetTyping {

        val channelInvalid = ChannelInvalid
        val channelPrivate = ChannelPrivate
        val chatAdminRequired = ChatAdminRequired400
        val chatIdInvalid = ChatIdInvalid
        val chatWriteForbidden = ChatWriteForbidden
        val peerIdInvalid = PeerIdInvalid
        val userBannedInChannel = UserBannedInChannel
        val userIsBlocked = UserIsBlocked400
        val userIsBot = UserIsBot

    }

    object TLRequestMessagesClearAllDrafts {

        val botMethodInvalid = BotMethodInvalid

    }

    object TLRequestMessagesGetAllDrafts {

        val botMethodInvalid = BotMethodInvalid

    }

    object TLRequestMessagesSaveDraft {

        val botMethodInvalid = BotMethodInvalid
        val peerIdInvalid = PeerIdInvalid

    }

    object TLRequestMessagesGetEmojiKeywords {

        val botMethodInvalid = BotMethodInvalid

    }

    object TLRequestMessagesGetEmojiKeywordsDifference {

        val botMethodInvalid = BotMethodInvalid

    }

    object TLRequestMessagesGetEmojiKeywordsLanguages {

        val botMethodInvalid = BotMethodInvalid

    }

    object TLRequestMessagesGetEmojiURL {

        val botMethodInvalid = BotMethodInvalid

    }

    object TLRequestFoldersDeleteFolder {

        val botMethodInvalid = BotMethodInvalid

    }

    object TLRequestFoldersEditPeerFolders {

        val botMethodInvalid = BotMethodInvalid
        val folderIdInvalid = FolderIdInvalid

    }

    object TLRequestMessagesGetGameHighScores {

        val messageIdInvalid = MessageIdInvalid
        val peerIdInvalid = PeerIdInvalid
        val userBotRequired = UserBotRequired

    }

    object TLRequestMessagesGetInlineGameHighScores {

        val messageIdInvalid = MessageIdInvalid
        val userBotRequired = UserBotRequired

    }

    object TLRequestMessagesSetGameScore {

        val messageIdInvalid = MessageIdInvalid
        val peerIdInvalid = PeerIdInvalid
        val userBotRequired = UserBotRequired

    }

    object TLRequestMessagesSetInlineGameScore {

        val messageIdInvalid = MessageIdInvalid
        val userBotRequired = UserBotRequired

    }

    object TLRequestLangpackGetDifference {

        val botMethodInvalid = BotMethodInvalid
        val langPackInvalid = LangPackInvalid

    }

    object TLRequestLangpackGetLangPack {

        val botMethodInvalid = BotMethodInvalid
        val langPackInvalid = LangPackInvalid

    }

    object TLRequestLangpackGetLanguage {

        val botMethodInvalid = BotMethodInvalid

    }

    object TLRequestLangpackGetLanguages {

        val botMethodInvalid = BotMethodInvalid
        val langPackInvalid = LangPackInvalid

    }

    object TLRequestLangpackGetStrings {

        val botMethodInvalid = BotMethodInvalid
        val langPackInvalid = LangPackInvalid

    }

    object TLRequestAccountGetAutoDownloadSettings {

        val botMethodInvalid = BotMethodInvalid

    }

    object TLRequestAccountSaveAutoDownloadSettings {

        val botMethodInvalid = BotMethodInvalid

    }

    object TLRequestMessagesSendReaction {

        val messageIdInvalid = MessageIdInvalid
        val reactionEmpty = ReactionEmpty

    }

    object TLRequestMessagesDeleteHistory {

        val botMethodInvalid = BotMethodInvalid
        val peerIdInvalid = PeerIdInvalid

    }

    object TLRequestMessagesDeleteMessages {

        val messageDeleteForbidden = MessageDeleteForbidden

    }

    object TLRequestMessagesEditMessage {

        val channelInvalid = ChannelInvalid
        val channelPrivate = ChannelPrivate
        val chatWriteForbidden = ChatWriteForbidden
        val inputUserDeactivated = InputUserDeactivated
        val messageAuthorRequired = MessageAuthorRequired
        val messageEditTimeExpired = MessageEditTimeExpired
        val messageEmpty = MessageEmpty
        val messageIdInvalid = MessageIdInvalid
        val messageNotModified = MessageNotModified
        val peerIdInvalid = PeerIdInvalid
        val userBannedInChannel = UserBannedInChannel

    }

    object TLRequestMessagesForwardMessages {

        val channelInvalid = ChannelInvalid
        val channelPrivate = ChannelPrivate
        val chatAdminRequired = ChatAdminRequired
        val chatIdInvalid = ChatIdInvalid
        val chatSendGifsForbidden = ChatSendGifsForbidden
        val chatSendMediaForbidden = ChatSendMediaForbidden
        val chatSendStickersForbidden = ChatSendStickersForbidden
        val chatWriteForbidden = ChatWriteForbidden
        val groupedMediaInvalid = GroupedMediaInvalid
        val inputUserDeactivated = InputUserDeactivated
        val mediaEmpty = MediaEmpty
        val messageIdsEmpty = MessageIdsEmpty
        val messageIdInvalid = MessageIdInvalid
        val peerIdInvalid = PeerIdInvalid
        val randomIdInvalid = RandomIdInvalid
        val timeout = Timeout
        val userBannedInChannel = UserBannedInChannel
        val userIsBlocked = UserIsBlocked
        val userIsBot = UserIsBot
        val youBlockedUser = YouBlockedUser

    }

    object TLRequestMessagesGetHistory {

        val authKeyPermEmpty = AuthKeyPermEmpty
        val botMethodInvalid = BotMethodInvalid
        val channelInvalid = ChannelInvalid
        val channelPrivate = ChannelPrivate
        val chatIdInvalid = ChatIdInvalid
        val peerIdInvalid = PeerIdInvalid
        val timeout = Timeout

    }

    object TLRequestMessagesGetMessageEditData {

        val botMethodInvalid = BotMethodInvalid
        val messageAuthorRequired = MessageAuthorRequired
        val peerIdInvalid = PeerIdInvalid

    }

    object TLRequestMessagesGetMessagesViews {

        val botMethodInvalid = BotMethodInvalid
        val channelPrivate = ChannelPrivate
        val chatIdInvalid = ChatIdInvalid
        val peerIdInvalid = PeerIdInvalid

    }

    object TLRequestMessagesGetRecentLocations {

        val botMethodInvalid = BotMethodInvalid

    }

    object TLRequestMessagesGetSearchCounters {

        val botMethodInvalid = BotMethodInvalid

    }

    object TLRequestMessagesSearch {

        val botMethodInvalid = BotMethodInvalid
        val chatAdminRequired = ChatAdminRequired
        val inputConstructorInvalid = InputConstructorInvalid
        val inputUserDeactivated = InputUserDeactivated
        val peerIdInvalid = PeerIdInvalid
        val peerIdNotSupported = PeerIdNotSupported
        val searchQueryEmpty = SearchQueryEmpty
        val userIdInvalid = UserIdInvalid

    }

    object TLRequestMessagesGetUnreadMentions {

        val botMethodInvalid = BotMethodInvalid
        val peerIdInvalid = PeerIdInvalid

    }

    object TLRequestMessagesReadHistory {

        val botMethodInvalid = BotMethodInvalid
        val peerIdInvalid = PeerIdInvalid
        val timeout = Timeout

    }

    object TLRequestMessagesReadMentions {

        val botMethodInvalid = BotMethodInvalid

    }

    object TLRequestMessagesReadMessageContents {

        val botMethodInvalid = BotMethodInvalid

    }

    object TLRequestMessagesReceivedMessages {

        val botMethodInvalid = BotMethodInvalid

    }

    object TLRequestMessagesSearchGlobal {

        val botMethodInvalid = BotMethodInvalid
        val searchQueryEmpty = SearchQueryEmpty

    }

    object TLRequestMessagesSendMedia {

        val channelInvalid = ChannelInvalid
        val channelPrivate = ChannelPrivate
        val chatAdminRequired = ChatAdminRequired
        val chatSendMediaForbidden = ChatSendMediaForbidden
        val chatWriteForbidden = ChatWriteForbidden
        val externalUrlInvalid = ExternalUrlInvalid
        val filePartsInvalid = FilePartsInvalid
        val filePartLengthInvalid = FilePartLengthInvalid
        val imageProcessFailed = ImageProcessFailed
        val inputUserDeactivated = InputUserDeactivated
        val mediaCaptionTooLong = MediaCaptionTooLong
        val mediaEmpty = MediaEmpty
        val mediaInvalid = MediaInvalid
        val peerIdInvalid = PeerIdInvalid
        val photoExtInvalid = PhotoExtInvalid
        val photoInvalidDimensions = PhotoInvalidDimensions
        val photoSaveFileInvalid = PhotoSaveFileInvalid
        val timeout = Timeout
        val userBannedInChannel = UserBannedInChannel
        val userIsBlocked = UserIsBlocked
        val userIsBot = UserIsBot
        val webpageCurlFailed = WebpageCurlFailed
        val webpageMediaEmpty = WebpageMediaEmpty

    }

    object TLRequestMessagesSendMessage {

        val buttonDataInvalid = ButtonDataInvalid
        val buttonTypeInvalid = ButtonTypeInvalid
        val buttonUrlInvalid = ButtonUrlInvalid
        val channelInvalid = ChannelInvalid
        val channelPrivate = ChannelPrivate
        val chatAdminRequired = ChatAdminRequired
        val chatIdInvalid = ChatIdInvalid
        val chatRestricted = ChatRestricted
        val chatWriteForbidden = ChatWriteForbidden
        val entityMentionUserInvalid = EntityMentionUserInvalid
        val inputUserDeactivated = InputUserDeactivated
        val messageEmpty = MessageEmpty
        val messageTooLong = MessageTooLong
        val msgIdInvalid = MsgIdInvalid
        val peerIdInvalid = PeerIdInvalid
        val replyMarkupInvalid = ReplyMarkupInvalid
        val slowmodeWaitX = SlowmodeWaitX
        val timeout = Timeout
        val userBannedInChannel = UserBannedInChannel
        val userIsBlocked = UserIsBlocked
        val userIsBot = UserIsBot
        val youBlockedUser = YouBlockedUser

    }

    object TLRequestMessagesSendMultiMedia {

        val mediaInvalid = MediaInvalid
        val peerIdInvalid = PeerIdInvalid

    }

    object TLRequestAccountRegisterDevice {

        val botMethodInvalid = BotMethodInvalid
        val tokenInvalid = TokenInvalid

    }

    object TLRequestAccountUnregisterDevice {

        val botMethodInvalid = BotMethodInvalid
        val tokenInvalid = TokenInvalid

    }

    object TLRequestAccountUpdateDeviceLocked {

        val botMethodInvalid = BotMethodInvalid

    }

    object TLRequestAccountGetNotifyExceptions {

        val botMethodInvalid = BotMethodInvalid

    }

    object TLRequestAccountGetNotifySettings {

        val botMethodInvalid = BotMethodInvalid
        val peerIdInvalid = PeerIdInvalid

    }

    object TLRequestAccountUpdateNotifySettings {

        val botMethodInvalid = BotMethodInvalid
        val peerIdInvalid = PeerIdInvalid

    }

    object TLRequestAccountResetNotifySettings {

        val botMethodInvalid = BotMethodInvalid

    }

    object TLRequestUsersGetFullUser {

        val timeout = Timeout
        val userIdInvalid = UserIdInvalid

    }

    object TLRequestUsersGetUsers {

        val authKeyPermEmpty = AuthKeyPermEmpty
        val sessionPasswordNeeded = SessionPasswordNeeded
        val timeout = Timeout

    }

    object TLRequestPaymentsGetSavedInfo {

        val botMethodInvalid = BotMethodInvalid

    }

    object TLRequestPaymentsClearSavedInfo {

        val botMethodInvalid = BotMethodInvalid

    }

    object TLRequestPaymentsGetPaymentForm {

        val botMethodInvalid = BotMethodInvalid
        val messageIdInvalid = MessageIdInvalid

    }

    object TLRequestPaymentsValidateRequestedInfo {

        val botMethodInvalid = BotMethodInvalid
        val messageIdInvalid = MessageIdInvalid

    }

    object TLRequestMessagesSetBotShippingResults {

        val queryIdInvalid = QueryIdInvalid

    }

    object TLRequestAccountGetTmpPassword {

        val botMethodInvalid = BotMethodInvalid
        val passwordHashInvalid = PasswordHashInvalid
        val tmpPasswordDisabled = TmpPasswordDisabled

    }

    object TLRequestPaymentsSendPaymentForm {

        val botMethodInvalid = BotMethodInvalid
        val messageIdInvalid = MessageIdInvalid

    }

    object TLRequestMessagesSetBotPrecheckoutResults {

        val errorTextEmpty = ErrorTextEmpty

    }

    object TLRequestPaymentsGetPaymentReceipt {

        val botMethodInvalid = BotMethodInvalid
        val messageIdInvalid = MessageIdInvalid

    }

    object TLRequestMessagesGetPollResults {

        val botMethodInvalid = BotMethodInvalid

    }

    object TLRequestMessagesSendVote {

        val botMethodInvalid = BotMethodInvalid

    }

    object TLRequestHelpGetProxyData {

        val botMethodInvalid = BotMethodInvalid

    }

    object TLRequestStickersAddStickerToSet {

        val botMissing = BotMissing
        val stickersetInvalid = StickersetInvalid

    }

    object TLRequestStickersChangeStickerPosition {

        val botMissing = BotMissing
        val stickerInvalid = StickerInvalid

    }

    object TLRequestStickersCreateStickerSet {

        val botMissing = BotMissing
        val packShortNameInvalid = PackShortNameInvalid
        val packShortNameOccupied = PackShortNameOccupied
        val peerIdInvalid = PeerIdInvalid
        val stickersEmpty = StickersEmpty
        val stickerEmojiInvalid = StickerEmojiInvalid
        val stickerFileInvalid = StickerFileInvalid
        val stickerPngDimensions = StickerPngDimensions
        val userIdInvalid = UserIdInvalid

    }

    object TLRequestStickersRemoveStickerFromSet {

        val botMissing = BotMissing
        val stickerInvalid = StickerInvalid

    }

    object TLRequestMessagesClearRecentStickers {

        val botMethodInvalid = BotMethodInvalid

    }

    object TLRequestMessagesFaveSticker {

        val botMethodInvalid = BotMethodInvalid
        val stickerIdInvalid = StickerIdInvalid

    }

    object TLRequestMessagesGetAllStickers {

        val botMethodInvalid = BotMethodInvalid

    }

    object TLRequestMessagesGetArchivedStickers {

        val botMethodInvalid = BotMethodInvalid

    }

    object TLRequestMessagesGetAttachedStickers {

        val botMethodInvalid = BotMethodInvalid

    }

    object TLRequestMessagesGetFavedStickers {

        val botMethodInvalid = BotMethodInvalid

    }

    object TLRequestMessagesGetFeaturedStickers {

        val botMethodInvalid = BotMethodInvalid

    }

    object TLRequestMessagesGetMaskStickers {

        val botMethodInvalid = BotMethodInvalid

    }

    object TLRequestMessagesGetRecentStickers {

        val botMethodInvalid = BotMethodInvalid

    }

    object TLRequestMessagesGetStickerSet {

        val stickersetInvalid = StickersetInvalid

    }

    object TLRequestMessagesGetStickers {

        val botMethodInvalid = BotMethodInvalid

    }

    object TLRequestMessagesSaveRecentSticker {

        val botMethodInvalid = BotMethodInvalid
        val stickerIdInvalid = StickerIdInvalid

    }

    object TLRequestMessagesInstallStickerSet {

        val botMethodInvalid = BotMethodInvalid
        val stickersetInvalid = StickersetInvalid

    }

    object TLRequestMessagesReadFeaturedStickers {

        val botMethodInvalid = BotMethodInvalid

    }

    object TLRequestMessagesReorderStickerSets {

        val botMethodInvalid = BotMethodInvalid

    }

    object TLRequestMessagesSearchStickerSets {

        val botMethodInvalid = BotMethodInvalid

    }

    object TLRequestMessagesUninstallStickerSet {

        val botMethodInvalid = BotMethodInvalid
        val stickersetInvalid = StickersetInvalid

    }

    object TLRequestAccountChangePhone {

        val botMethodInvalid = BotMethodInvalid
        val phoneNumberInvalid = PhoneNumberInvalid

    }

    object TLRequestAccountConfirmPhone {

        val botMethodInvalid = BotMethodInvalid
        val codeHashInvalid = CodeHashInvalid
        val phoneCodeEmpty = PhoneCodeEmpty

    }

    object TLRequestAccountDeleteAccount {

        val botMethodInvalid = BotMethodInvalid

    }

    object TLRequestAccountGetAccountTTL {

        val botMethodInvalid = BotMethodInvalid

    }

    object TLRequestAccountGetPrivacy {

        val botMethodInvalid = BotMethodInvalid
        val privacyKeyInvalid = PrivacyKeyInvalid

    }

    object TLRequestAccountResetAuthorization {

        val botMethodInvalid = BotMethodInvalid
        val hashInvalid = HashInvalid

    }

    object TLRequestAccountSendChangePhoneCode {

        val botMethodInvalid = BotMethodInvalid
        val phoneNumberInvalid = PhoneNumberInvalid

    }

    object TLRequestAccountSendConfirmPhoneCode {

        val botMethodInvalid = BotMethodInvalid
        val hashInvalid = HashInvalid

    }

    object TLRequestAccountSetAccountTTL {

        val botMethodInvalid = BotMethodInvalid
        val ttlDaysInvalid = TtlDaysInvalid

    }

    object TLRequestAccountSetPrivacy {

        val botMethodInvalid = BotMethodInvalid
        val privacyKeyInvalid = PrivacyKeyInvalid

    }

    object TLRequestAccountUpdateProfile {

        val aboutTooLong = AboutTooLong
        val botMethodInvalid = BotMethodInvalid
        val firstnameInvalid = FirstnameInvalid

    }

    object TLRequestAccountUpdateStatus {

        val botMethodInvalid = BotMethodInvalid
        val sessionPasswordNeeded = SessionPasswordNeeded

    }

    object TLRequestPhotosDeletePhotos {

        val botMethodInvalid = BotMethodInvalid

    }

    object TLRequestPhotosGetUserPhotos {

        val maxIdInvalid = MaxIdInvalid
        val userIdInvalid = UserIdInvalid

    }

    object TLRequestPhotosUpdateProfilePhoto {

        val botMethodInvalid = BotMethodInvalid
        val filePartsInvalid = FilePartsInvalid
        val imageProcessFailed = ImageProcessFailed
        val photoCropSizeSmall = PhotoCropSizeSmall

    }

    object TLRequestPhotosUploadProfilePhoto {

        val botMethodInvalid = BotMethodInvalid
        val filePartsInvalid = FilePartsInvalid
        val imageProcessFailed = ImageProcessFailed
        val photoCropSizeSmall = PhotoCropSizeSmall
        val photoExtInvalid = PhotoExtInvalid

    }

    object TLRequestChannelsCheckUsername {

        val botMethodInvalid = BotMethodInvalid
        val channelInvalid = ChannelInvalid
        val chatIdInvalid = ChatIdInvalid
        val usernameInvalid = UsernameInvalid

    }

    object TLRequestChannelsUpdateUsername {

        val botMethodInvalid = BotMethodInvalid
        val channelsAdminPublicTooMuch = ChannelsAdminPublicTooMuch
        val channelInvalid = ChannelInvalid
        val channelPrivate = ChannelPrivate
        val chatAdminRequired = ChatAdminRequired
        val usernameInvalid = UsernameInvalid
        val usernameNotModified = UsernameNotModified
        val usernameOccupied = UsernameOccupied

    }

    object TLRequestAccountUpdateUsername {

        val botMethodInvalid = BotMethodInvalid
        val sessionPasswordNeeded = SessionPasswordNeeded
        val usernameInvalid = UsernameInvalid
        val usernameNotModified = UsernameNotModified
        val usernameOccupied = UsernameOccupied

    }

    object TLRequestAccountCheckUsername {

        val botMethodInvalid = BotMethodInvalid
        val usernameInvalid = UsernameInvalid

    }

    object TLRequestContactsResolveUsername {

        val authKeyPermEmpty = AuthKeyPermEmpty
        val sessionPasswordNeeded = SessionPasswordNeeded
        val usernameInvalid = UsernameInvalid
        val usernameNotOccupied = UsernameNotOccupied

    }

    object TLRequestAccountGetWallPaper {

        val botMethodInvalid = BotMethodInvalid

    }

    object TLRequestAccountGetWallPapers {

        val botMethodInvalid = BotMethodInvalid

    }

    object TLRequestAccountInstallWallPaper {

        val botMethodInvalid = BotMethodInvalid

    }

    object TLRequestAccountResetWallPapers {

        val botMethodInvalid = BotMethodInvalid

    }

    object TLRequestAccountSaveWallPaper {

        val botMethodInvalid = BotMethodInvalid

    }

    object TLRequestAccountUploadWallPaper {

        val botMethodInvalid = BotMethodInvalid

    }


}