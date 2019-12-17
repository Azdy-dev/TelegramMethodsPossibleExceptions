package messenger.telegram.method.exceptions


object MethodsPossibleExceptions {

    object TLRequestHelpGetTermsOfServiceUpdate {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid

    }

    object TLRequestHelpAcceptTermsOfService {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid

    }

    object TLRequestAccountReportPeer {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid
        val peerIdInvalid   = AllExceptions.PeerIdInvalid

    }

    object TLRequestChannelsReportSpam {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid
        val channelInvalid   = AllExceptions.ChannelInvalid
        val inputUserDeactivated   = AllExceptions.InputUserDeactivated

    }

    object TLRequestMessagesReport {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid

    }

    object TLRequestMessagesReportSpam {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid
        val peerIdInvalid   = AllExceptions.PeerIdInvalid

    }

    object TLRequestMessagesReportEncryptedSpam {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid
        val chatIdInvalid   = AllExceptions.ChatIdInvalid

    }

    object TLRequestHelpGetAppChangelog {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid

    }

    object TLRequestHelpGetAppConfig {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid

    }

    object TLRequestHelpGetAppUpdate {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid

    }

    object TLRequestHelpGetConfig {

        val connectionDeviceModelEmpty   = AllExceptions.ConnectionDeviceModelEmpty
        val timeout   = AllExceptions.Timeout

    }

    object TLRequestHelpGetInviteText {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid

    }

    object TLRequestHelpGetNearestDc {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid

    }

    object TLRequestHelpGetSupport {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid

    }

    object TLRequestHelpGetSupportName {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid

    }

    object TLRequestHelpSaveAppLog {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid

    }

    object TLRequestInitConnection {

        val connectionLayerInvalid   = AllExceptions.ConnectionLayerInvalid

    }

    object TLRequestInvokeWithLayer {

        val authBytesInvalid   = AllExceptions.AuthBytesInvalid
        val cdnMethodInvalid   = AllExceptions.CdnMethodInvalid
        val chatWriteForbidden   = AllExceptions.ChatWriteForbidden
        val connectionApiIdInvalid   = AllExceptions.ConnectionApiIdInvalid
        val connectionDeviceModelEmpty   = AllExceptions.ConnectionDeviceModelEmpty
        val connectionLangPackInvalid   = AllExceptions.ConnectionLangPackInvalid
        val connectionNotInited   = AllExceptions.ConnectionNotInited
        val connectionSystemEmpty   = AllExceptions.ConnectionSystemEmpty
        val inputLayerInvalid   = AllExceptions.InputLayerInvalid
        val inviteHashExpired   = AllExceptions.InviteHashExpired
        val timeout   = AllExceptions.Timeout

    }

    object TLRequestAuthBindTempAuthKey {

        val encryptedMessageInvalid   = AllExceptions.EncryptedMessageInvalid
        val inputRequestTooLong   = AllExceptions.InputRequestTooLong
        val tempAuthKeyAlreadyBound   = AllExceptions.TempAuthKeyAlreadyBound
        val tempAuthKeyEmpty   = AllExceptions.TempAuthKeyEmpty
        val timeout   = AllExceptions.Timeout

    }

    object TLRequestAuthCancelCode {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid
        val phoneNumberInvalid   = AllExceptions.PhoneNumberInvalid

    }

    object TLRequestAuthCheckPassword {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid
        val passwordHashInvalid   = AllExceptions.PasswordHashInvalid

    }

    object TLRequestAuthExportAuthorization {

        val dcIdInvalid   = AllExceptions.DcIdInvalid

    }

    object TLRequestAuthImportAuthorization {

        val authBytesInvalid   = AllExceptions.AuthBytesInvalid
        val userIdInvalid   = AllExceptions.UserIdInvalid

    }

    object TLRequestAuthImportBotAuthorization {

        val accessTokenExpired   = AllExceptions.AccessTokenExpired
        val accessTokenInvalid   = AllExceptions.AccessTokenInvalid
        val apiIdInvalid   = AllExceptions.ApiIdInvalid

    }

    object TLRequestAuthRecoverPassword {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid
        val codeEmpty   = AllExceptions.CodeEmpty

    }

    object TLRequestAuthRequestPasswordRecovery {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid
        val passwordEmpty   = AllExceptions.PasswordEmpty

    }

    object TLRequestAuthResendCode {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid
        val phoneNumberInvalid   = AllExceptions.PhoneNumberInvalid

    }

    object TLRequestAuthResetAuthorizations {

        val freshResetAuthorisationForbidden   = AllExceptions.FreshResetAuthorisationForbidden
        val timeout   = AllExceptions.Timeout

    }

    object TLRequestAuthSendCode {

        val apiIdInvalid   = AllExceptions.ApiIdInvalid
        val apiIdPublishedFlood   = AllExceptions.ApiIdPublishedFlood
        val botMethodInvalid   = AllExceptions.BotMethodInvalid
        val inputRequestTooLong   = AllExceptions.InputRequestTooLong
        val networkMigrateX   = AllExceptions.NetworkMigrateX
        val phoneMigrateX   = AllExceptions.PhoneMigrateX
        val phoneNumberAppSignupForbidden   = AllExceptions.PhoneNumberAppSignupForbidden
        val phoneNumberBanned   = AllExceptions.PhoneNumberBanned
        val phoneNumberFlood   = AllExceptions.PhoneNumberFlood
        val phoneNumberInvalid   = AllExceptions.PhoneNumberInvalid
        val phonePasswordFlood   = AllExceptions.PhonePasswordFlood
        val phonePasswordProtected   = AllExceptions.PhonePasswordProtected
        val smsCodeCreateFailed   = AllExceptions.SmsCodeCreateFailed

    }

    object TLRequestAuthSignIn {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid
        val phoneCodeEmpty   = AllExceptions.PhoneCodeEmpty
        val phoneCodeExpired   = AllExceptions.PhoneCodeExpired
        val phoneCodeInvalid   = AllExceptions.PhoneCodeInvalid
        val phoneNumberInvalid   = AllExceptions.PhoneNumberInvalid
        val phoneNumberUnoccupied   = AllExceptions.PhoneNumberUnoccupied
        val sessionPasswordNeeded   = AllExceptions.SessionPasswordNeeded

    }

    object TLRequestAuthSignUp {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid
        val firstnameInvalid   = AllExceptions.FirstnameInvalid
        val lastnameInvalid   = AllExceptions.LastnameInvalid
        val phoneCodeEmpty   = AllExceptions.PhoneCodeEmpty
        val phoneCodeExpired   = AllExceptions.PhoneCodeExpired
        val phoneCodeInvalid   = AllExceptions.PhoneCodeInvalid
        val phoneNumberFlood   = AllExceptions.PhoneNumberFlood
        val phoneNumberInvalid   = AllExceptions.PhoneNumberInvalid
        val phoneNumberOccupied   = AllExceptions.PhoneNumberOccupied

    }

    object TLRequestAccountInitTakeoutSession {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid

    }

    object TLRequestAccountFinishTakeoutSession {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid

    }

    object TLRequestMessagesGetSplitRanges {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid

    }

    object TLRequestChannelsGetLeftChannels {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid
        val takeoutRequired   = AllExceptions.TakeoutRequired

    }

    object TLRequestMessagesGetSavedGifs {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid

    }

    object TLRequestMessagesSaveGif {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid
        val gifIdInvalid   = AllExceptions.GifIdInvalid

    }

    object TLRequestMessagesSearchGifs {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid
        val searchQueryEmpty   = AllExceptions.SearchQueryEmpty

    }

    object TLRequestHelpEditUserInfo {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid

    }

    object TLRequestHelpGetUserInfo {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid

    }

    object TLRequestAccountConfirmPasswordEmail {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid

    }

    object TLRequestAccountResendPasswordEmail {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid

    }

    object TLRequestAccountCancelPasswordEmail {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid

    }

    object TLRequestAccountGetPassword {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid

    }

    object TLRequestAccountGetPasswordSettings {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid
        val passwordHashInvalid   = AllExceptions.PasswordHashInvalid

    }

    object TLRequestAccountUpdatePasswordSettings {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid
        val emailUnconfirmed   = AllExceptions.EmailUnconfirmed
        val emailUnconfirmedX   = AllExceptions.EmailUnconfirmedX
        val newSaltInvalid   = AllExceptions.NewSaltInvalid
        val newSettingsInvalid   = AllExceptions.NewSettingsInvalid
        val passwordHashInvalid   = AllExceptions.PasswordHashInvalid

    }

    object TLRequestMessagesRequestUrlAuth {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid

    }

    object TLRequestMessagesAcceptUrlAuth {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid

    }

    object TLRequestAccountGetWebAuthorizations {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid

    }

    object TLRequestAccountResetWebAuthorization {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid

    }

    object TLRequestAccountResetWebAuthorizations {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid

    }

    object TLRequestPhoneAcceptCall {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid
        val callAlreadyAccepted   = AllExceptions.CallAlreadyAccepted
        val callAlreadyDeclined   = AllExceptions.CallAlreadyDeclined
        val callPeerInvalid   = AllExceptions.CallPeerInvalid
        val callProtocolFlagsInvalid   = AllExceptions.CallProtocolFlagsInvalid

    }

    object TLRequestPhoneConfirmCall {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid
        val callAlreadyDeclined   = AllExceptions.CallAlreadyDeclined
        val callPeerInvalid   = AllExceptions.CallPeerInvalid

    }

    object TLRequestPhoneDiscardCall {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid
        val callAlreadyAccepted   = AllExceptions.CallAlreadyAccepted
        val callPeerInvalid   = AllExceptions.CallPeerInvalid

    }

    object TLRequestPhoneGetCallConfig {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid

    }

    object TLRequestPhoneReceivedCall {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid
        val callAlreadyDeclined   = AllExceptions.CallAlreadyDeclined
        val callPeerInvalid   = AllExceptions.CallPeerInvalid

    }

    object TLRequestPhoneRequestCall {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid
        val callProtocolFlagsInvalid   = AllExceptions.CallProtocolFlagsInvalid
        val participantVersionOutdated   = AllExceptions.ParticipantVersionOutdated
        val userIdInvalid   = AllExceptions.UserIdInvalid
        val userIsBlocked   = AllExceptions.UserIsBlocked
        val userPrivacyRestricted   = AllExceptions.UserPrivacyRestricted

    }

    object TLRequestPhoneSaveCallDebug {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid
        val callPeerInvalid   = AllExceptions.CallPeerInvalid
        val dataJsonInvalid   = AllExceptions.DataJsonInvalid

    }

    object TLRequestPhoneSetCallRating {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid
        val callPeerInvalid   = AllExceptions.CallPeerInvalid

    }

    object TLRequestChannelsCreateChannel {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid
        val chatTitleEmpty   = AllExceptions.ChatTitleEmpty
        val userRestricted   = AllExceptions.UserRestricted

    }

    object TLRequestChannelsDeleteChannel {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid
        val channelInvalid   = AllExceptions.ChannelInvalid
        val channelPrivate   = AllExceptions.ChannelPrivate
        val chatAdminRequired   = AllExceptions.ChatAdminRequired

    }

    object TLRequestChannelsDeleteHistory {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid
        val channelInvalid   = AllExceptions.ChannelInvalid

    }

    object TLRequestChannelsDeleteMessages {

        val channelInvalid   = AllExceptions.ChannelInvalid
        val channelPrivate   = AllExceptions.ChannelPrivate
        val messageDeleteForbidden   = AllExceptions.MessageDeleteForbidden

    }

    object TLRequestChannelsDeleteUserHistory {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid
        val channelInvalid   = AllExceptions.ChannelInvalid
        val chatAdminRequired   = AllExceptions.ChatAdminRequired

    }

    object TLRequestChannelsEditAdmin {

        val adminsTooMuch   = AllExceptions.AdminsTooMuch
        val botChannelsNa   = AllExceptions.BotChannelsNa
        val channelInvalid   = AllExceptions.ChannelInvalid
        val chatAdminInviteRequired   = AllExceptions.ChatAdminInviteRequired
        val chatAdminRequired   = AllExceptions.ChatAdminRequired
        val rightForbidden   = AllExceptions.RightForbidden
        val userCreator   = AllExceptions.UserCreator
        val userIdInvalid   = AllExceptions.UserIdInvalid
        val userNotMutualContact   = AllExceptions.UserNotMutualContact
        val userPrivacyRestricted   = AllExceptions.UserPrivacyRestricted

    }

    object TLRequestChannelsEditBanned {

        val channelInvalid   = AllExceptions.ChannelInvalid
        val channelPrivate   = AllExceptions.ChannelPrivate
        val chatAdminRequired   = AllExceptions.ChatAdminRequired
        val userAdminInvalid   = AllExceptions.UserAdminInvalid
        val userIdInvalid   = AllExceptions.UserIdInvalid

    }

    object TLRequestChannelsEditCreator {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid

    }

    object TLRequestChannelsEditLocation {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid

    }

    object TLRequestChannelsEditPhoto {

        val channelInvalid   = AllExceptions.ChannelInvalid
        val chatAdminRequired   = AllExceptions.ChatAdminRequired
        val photoInvalid   = AllExceptions.PhotoInvalid

    }

    object TLRequestChannelsEditTitle {

        val channelInvalid   = AllExceptions.ChannelInvalid
        val chatAdminRequired   = AllExceptions.ChatAdminRequired
        val chatNotModified   = AllExceptions.ChatNotModified
        val chatTitleEmpty   = AllExceptions.ChatTitleEmpty

    }

    object TLRequestChannelsExportMessageLink {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid
        val channelInvalid   = AllExceptions.ChannelInvalid

    }

    object TLRequestChannelsGetAdminLog {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid
        val channelInvalid   = AllExceptions.ChannelInvalid
        val channelPrivate   = AllExceptions.ChannelPrivate
        val chatAdminRequired   = AllExceptions.ChatAdminRequired

    }

    object TLRequestChannelsGetChannels {

        val channelInvalid   = AllExceptions.ChannelInvalid
        val channelPrivate   = AllExceptions.ChannelPrivate

    }

    object TLRequestChannelsGetFullChannel {

        val channelInvalid   = AllExceptions.ChannelInvalid
        val channelPrivate   = AllExceptions.ChannelPrivate
        val channelPublicGroupNa   = AllExceptions.ChannelPublicGroupNa
        val timeout   = AllExceptions.Timeout

    }

    object TLRequestChannelsGetGroupsForDiscussion {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid

    }

    object TLRequestChannelsGetMessages {

        val channelInvalid   = AllExceptions.ChannelInvalid
        val channelPrivate   = AllExceptions.ChannelPrivate
        val messageIdsEmpty   = AllExceptions.MessageIdsEmpty

    }

    object TLRequestChannelsGetParticipant {

        val channelInvalid   = AllExceptions.ChannelInvalid
        val channelPrivate   = AllExceptions.ChannelPrivate
        val chatAdminRequired   = AllExceptions.ChatAdminRequired
        val userIdInvalid   = AllExceptions.UserIdInvalid
        val userNotParticipant   = AllExceptions.UserNotParticipant

    }

    object TLRequestChannelsGetParticipants {

        val channelInvalid   = AllExceptions.ChannelInvalid
        val channelPrivate   = AllExceptions.ChannelPrivate
        val chatAdminRequired   = AllExceptions.ChatAdminRequired
        val inputConstructorInvalid   = AllExceptions.InputConstructorInvalid
        val timeout   = AllExceptions.Timeout

    }

    object TLRequestChannelsInviteToChannel {

        val botsTooMuch   = AllExceptions.BotsTooMuch
        val botGroupsBlocked   = AllExceptions.BotGroupsBlocked
        val botMethodInvalid   = AllExceptions.BotMethodInvalid
        val channelInvalid   = AllExceptions.ChannelInvalid
        val channelPrivate   = AllExceptions.ChannelPrivate
        val chatAdminRequired   = AllExceptions.ChatAdminRequired
        val chatInvalid   = AllExceptions.ChatInvalid
        val chatWriteForbidden   = AllExceptions.ChatWriteForbidden
        val inputUserDeactivated   = AllExceptions.InputUserDeactivated
        val timeout   = AllExceptions.Timeout
        val usersTooMuch   = AllExceptions.UsersTooMuch
        val userBannedInChannel   = AllExceptions.UserBannedInChannel
        val userBlocked   = AllExceptions.UserBlocked
        val userBot   = AllExceptions.UserBot
        val userChannelsTooMuch   = AllExceptions.UserChannelsTooMuch
        val userIdInvalid   = AllExceptions.UserIdInvalid
        val userKicked   = AllExceptions.UserKicked
        val userNotMutualContact   = AllExceptions.UserNotMutualContact
        val userPrivacyRestricted   = AllExceptions.UserPrivacyRestricted

    }

    object TLRequestChannelsJoinChannel {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid
        val channelsTooMuch   = AllExceptions.ChannelsTooMuch
        val channelInvalid   = AllExceptions.ChannelInvalid
        val channelPrivate   = AllExceptions.ChannelPrivate
        val inviteHashExpired   = AllExceptions.InviteHashExpired
        val inviteHashInvalid   = AllExceptions.InviteHashInvalid
        val userAlreadyParticipant   = AllExceptions.UserAlreadyParticipant

    }

    object TLRequestChannelsLeaveChannel {

        val channelInvalid   = AllExceptions.ChannelInvalid
        val channelPrivate   = AllExceptions.ChannelPrivate
        val channelPublicGroupNa   = AllExceptions.ChannelPublicGroupNa
        val userCreator   = AllExceptions.UserCreator
        val userNotParticipant   = AllExceptions.UserNotParticipant

    }

    object TLRequestChannelsReadHistory {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid
        val channelInvalid   = AllExceptions.ChannelInvalid
        val channelPrivate   = AllExceptions.ChannelPrivate

    }

    object TLRequestChannelsReadMessageContents {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid
        val channelInvalid   = AllExceptions.ChannelInvalid
        val channelPrivate   = AllExceptions.ChannelPrivate

    }

    object TLRequestChannelsSetDiscussionGroup {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid

    }

    object TLRequestChannelsSetStickers {

        val channelInvalid   = AllExceptions.ChannelInvalid
        val participantsTooFew   = AllExceptions.ParticipantsTooFew

    }

    object TLRequestChannelsTogglePreHistoryHidden {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid

    }

    object TLRequestChannelsToggleSignatures {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid
        val channelInvalid   = AllExceptions.ChannelInvalid

    }

    object TLRequestChannelsToggleSlowMode {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid
        val chatNotModified   = AllExceptions.ChatNotModified
        val inputMethodInvalid1192227X   = AllExceptions.InputMethodInvalid1192227X
        val inputMethodInvalid1604042050X   = AllExceptions.InputMethodInvalid1604042050X
        val secondsInvalid   = AllExceptions.SecondsInvalid

    }

    object TLRequestMessagesGetStatsURL {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid
        val peerIdInvalid   = AllExceptions.PeerIdInvalid

    }

    object TLRequestMessagesAddChatUser {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid
        val chatAdminRequired   = AllExceptions.ChatAdminRequired
        val chatIdInvalid   = AllExceptions.ChatIdInvalid
        val inputUserDeactivated   = AllExceptions.InputUserDeactivated
        val peerIdInvalid   = AllExceptions.PeerIdInvalid
        val usersTooMuch   = AllExceptions.UsersTooMuch
        val userAlreadyParticipant   = AllExceptions.UserAlreadyParticipant
        val userIdInvalid   = AllExceptions.UserIdInvalid
        val userNotMutualContact   = AllExceptions.UserNotMutualContact403
        val userPrivacyRestricted   = AllExceptions.UserPrivacyRestricted

    }

    object TLRequestMessagesCheckChatInvite {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid
        val inviteHashEmpty   = AllExceptions.InviteHashEmpty
        val inviteHashExpired   = AllExceptions.InviteHashExpired
        val inviteHashInvalid   = AllExceptions.InviteHashInvalid

    }

    object TLRequestMessagesCreateChat {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid
        val inputUserDeactivated   = AllExceptions.InputUserDeactivated
        val usersTooFew   = AllExceptions.UsersTooFew
        val userRestricted   = AllExceptions.UserRestricted

    }

    object TLRequestMessagesDeleteChatUser {

        val chatIdInvalid   = AllExceptions.ChatIdInvalid
        val peerIdInvalid   = AllExceptions.PeerIdInvalid
        val userNotParticipant   = AllExceptions.UserNotParticipant

    }

    object TLRequestMessagesEditChatAbout {

        val peerIdInvalid   = AllExceptions.PeerIdInvalid

    }

    object TLRequestMessagesEditChatAdmin {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid
        val chatIdInvalid   = AllExceptions.ChatIdInvalid

    }

    object TLRequestMessagesEditChatDefaultBannedRights {

        val bannedRightsInvalid   = AllExceptions.BannedRightsInvalid
        val peerIdInvalid   = AllExceptions.PeerIdInvalid

    }

    object TLRequestMessagesEditChatPhoto {

        val chatIdInvalid   = AllExceptions.ChatIdInvalid
        val inputConstructorInvalid   = AllExceptions.InputConstructorInvalid
        val peerIdInvalid   = AllExceptions.PeerIdInvalid
        val photoExtInvalid   = AllExceptions.PhotoExtInvalid

    }

    object TLRequestMessagesEditChatTitle {

        val chatIdInvalid   = AllExceptions.ChatIdInvalid
        val chatTitleEmpty   = AllExceptions.ChatTitleEmpty

    }

    object TLRequestMessagesExportChatInvite {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid
        val chatIdInvalid   = AllExceptions.ChatIdInvalid

    }

    object TLRequestMessagesGetAllChats {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid

    }

    object TLRequestMessagesGetChats {

        val chatIdInvalid   = AllExceptions.ChatIdInvalid
        val peerIdInvalid   = AllExceptions.PeerIdInvalid

    }

    object TLRequestMessagesGetCommonChats {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid
        val userIdInvalid   = AllExceptions.UserIdInvalid

    }

    object TLRequestMessagesGetFullChat {

        val chatIdInvalid   = AllExceptions.ChatIdInvalid
        val peerIdInvalid   = AllExceptions.PeerIdInvalid

    }

    object TLRequestMessagesImportChatInvite {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid
        val channelsTooMuch   = AllExceptions.ChannelsTooMuch
        val inviteHashEmpty   = AllExceptions.InviteHashEmpty
        val inviteHashExpired   = AllExceptions.InviteHashExpired
        val inviteHashInvalid   = AllExceptions.InviteHashInvalid
        val sessionPasswordNeeded   = AllExceptions.SessionPasswordNeeded401
        val usersTooMuch   = AllExceptions.UsersTooMuch
        val userAlreadyParticipant   = AllExceptions.UserAlreadyParticipant

    }

    object TLRequestMessagesMigrateChat {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid
        val chatAdminRequired   = AllExceptions.ChatAdminRequired403
        val chatIdInvalid   = AllExceptions.ChatIdInvalid
        val peerIdInvalid   = AllExceptions.PeerIdInvalid

    }

    object TLRequestMessagesStartBot {

        val botInvalid   = AllExceptions.BotInvalid
        val botMethodInvalid   = AllExceptions.BotMethodInvalid
        val peerIdInvalid   = AllExceptions.PeerIdInvalid
        val startParamEmpty   = AllExceptions.StartParamEmpty
        val startParamInvalid   = AllExceptions.StartParamInvalid

    }

    object TLRequestHelpGetDeepLinkInfo {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid

    }

    object TLRequestHelpGetRecentMeUrls {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid

    }

    object TLRequestHelpGetCdnConfig {

        val authKeyPermEmpty   = AllExceptions.AuthKeyPermEmpty
        val timeout   = AllExceptions.Timeout

    }

    object TLRequestUploadGetCdnFile {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid

    }

    object TLRequestUploadGetCdnFileHashes {

        val cdnMethodInvalid   = AllExceptions.CdnMethodInvalid
        val rsaDecryptFailed   = AllExceptions.RsaDecryptFailed

    }

    object TLRequestUploadReuploadCdnFile {

        val rsaDecryptFailed   = AllExceptions.RsaDecryptFailed

    }

    object TLRequestUploadGetFile {

        val authKeyPermEmpty   = AllExceptions.AuthKeyPermEmpty
        val fileIdInvalid   = AllExceptions.FileIdInvalid
        val fileReference   = AllExceptions.FileReference
        val limitInvalid   = AllExceptions.LimitInvalid
        val locationInvalid   = AllExceptions.LocationInvalid
        val offsetInvalid   = AllExceptions.OffsetInvalid
        val timeout   = AllExceptions.Timeout

    }

    object TLRequestUploadGetFileHashes {

        val locationInvalid   = AllExceptions.LocationInvalid

    }

    object TLRequestUploadGetWebFile {

        val locationInvalid   = AllExceptions.LocationInvalid
        val botMethodInvalid   = AllExceptions.BotMethodInvalid

    }

    object TLRequestUploadSaveBigFilePart {

        val filePartsInvalid   = AllExceptions.FilePartsInvalid
        val filePartEmpty   = AllExceptions.FilePartEmpty
        val filePartInvalid   = AllExceptions.FilePartInvalid
        val filePartSizeInvalid   = AllExceptions.FilePartSizeInvalid
        val timeout   = AllExceptions.Timeout

    }

    object TLRequestUploadSaveFilePart {

        val filePartEmpty   = AllExceptions.FilePartEmpty
        val filePartInvalid   = AllExceptions.FilePartInvalid
        val sessionPasswordNeeded   = AllExceptions.SessionPasswordNeeded

    }

    object TLRequestMessagesUploadEncryptedFile {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid

    }

    object TLRequestMessagesUploadMedia {

        val botMissing   = AllExceptions.BotMissing
        val mediaInvalid   = AllExceptions.MediaInvalid
        val peerIdInvalid   = AllExceptions.PeerIdInvalid

    }

    object TLRequestMessagesGetDocumentByHash {

        val sha256HashInvalid   = AllExceptions.Sha256HashInvalid

    }

    object TLRequestMessagesGetWebPage {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid
        val wcConvertUrlInvalid   = AllExceptions.WcConvertUrlInvalid

    }

    object TLRequestMessagesGetWebPagePreview {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid
        val messageEmpty   = AllExceptions.MessageEmpty

    }

    object TLRequestMessagesSetEncryptedTyping {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid
        val chatIdInvalid   = AllExceptions.ChatIdInvalid

    }

    object TLRequestMessagesReadEncryptedHistory {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid
        val msgWaitFailed   = AllExceptions.MsgWaitFailed

    }

    object TLRequestMessagesAcceptEncryption {
        val botMethodInvalid   = AllExceptions.BotMethodInvalid
        val chatIdInvalid   = AllExceptions.ChatIdInvalid
        val encryptionAlreadyAccepted   = AllExceptions.EncryptionAlreadyAccepted
        val encryptionAlreadyDeclined   = AllExceptions.EncryptionAlreadyDeclined

    }

    object TLRequestMessagesDiscardEncryption {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid
        val chatIdEmpty   = AllExceptions.ChatIdEmpty
        val encryptionAlreadyDeclined   = AllExceptions.EncryptionAlreadyDeclined
        val encryptionIdInvalid   = AllExceptions.EncryptionIdInvalid

    }

    object TLRequestMessagesRequestEncryption {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid
        val dhGAInvalid   = AllExceptions.DhGAInvalid
        val userIdInvalid   = AllExceptions.UserIdInvalid

    }

    object TLRequestMessagesSendEncrypted {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid
        val chatIdInvalid   = AllExceptions.ChatIdInvalid
        val dataInvalid   = AllExceptions.DataInvalid
        val encryptionDeclined   = AllExceptions.EncryptionDeclined
        val msgWaitFailed   = AllExceptions.MsgWaitFailed

    }

    object TLRequestMessagesSendEncryptedFile {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid
        val msgWaitFailed   = AllExceptions.MsgWaitFailed

    }

    object TLRequestMessagesSendEncryptedService {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid
        val dataInvalid   = AllExceptions.DataInvalid
        val encryptionDeclined   = AllExceptions.EncryptionDeclined
        val msgWaitFailed   = AllExceptions.MsgWaitFailed
        val userIsBlocked   = AllExceptions.UserIsBlocked

    }

    object TLRequestMessagesGetDhConfig {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid
        val randomLengthInvalid   = AllExceptions.RandomLengthInvalid

    }

    object TLRequestMessagesReceivedQueue {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid
        val msgWaitFailed   = AllExceptions.MsgWaitFailed

    }

    object TLRequestAccountSendVerifyEmailCode {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid

    }

    object TLRequestAccountVerifyEmail {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid

    }

    object TLRequestAccountSendVerifyPhoneCode {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid

    }

    object TLRequestAccountVerifyPhone {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid

    }

    object TLRequestAccountAcceptAuthorization {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid

    }

    object TLRequestAccountGetAuthorizationForm {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid

    }

    object TLRequestAccountGetAuthorizations {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid

    }

    object TLRequestAccountDeleteSecureValue {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid

    }

    object TLRequestAccountGetAllSecureValues {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid

    }

    object TLRequestAccountGetSecureValue {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid

    }

    object TLRequestAccountSaveSecureValue {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid

    }

    object TLRequestHelpGetPassportConfig {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid

    }

    object TLRequestUsersSetSecureValueErrors {

        val userIdInvalid   = AllExceptions.UserIdInvalid

    }

    object TLRequestUpdatesGetChannelDifference {

        val channelInvalid   = AllExceptions.ChannelInvalid
        val channelPrivate   = AllExceptions.ChannelPrivate
        val channelPublicGroupNa   = AllExceptions.ChannelPublicGroupNa
        val persistentTimestampEmpty   = AllExceptions.PersistentTimestampEmpty
        val persistentTimestampInvalid   = AllExceptions.PersistentTimestampInvalid
        val rangesInvalid   = AllExceptions.RangesInvalid
        val timeout   = AllExceptions.Timeout

    }

    object TLRequestUpdatesGetDifference {

        val authKeyPermEmpty   = AllExceptions.AuthKeyPermEmpty
        val cdnMethodInvalid   = AllExceptions.CdnMethodInvalid
        val dateEmpty   = AllExceptions.DateEmpty
        val persistentTimestampEmpty   = AllExceptions.PersistentTimestampEmpty
        val persistentTimestampInvalid   = AllExceptions.PersistentTimestampInvalid
        val sessionPasswordNeeded   = AllExceptions.SessionPasswordNeeded
        val timeout   = AllExceptions.Timeout

    }

    object TLRequestUpdatesGetState {

        val sessionPasswordNeeded   = AllExceptions.SessionPasswordNeeded
        val timeout   = AllExceptions.Timeout

    }

    object TLRequestMessagesGetInlineBotResults {

        val botInlineDisabled   = AllExceptions.BotInlineDisabled
        val botInvalid   = AllExceptions.BotInvalid
        val botMethodInvalid   = AllExceptions.BotMethodInvalid
        val channelPrivate   = AllExceptions.ChannelPrivate
        val timeout   = AllExceptions.Timeout

    }

    object TLRequestMessagesSetInlineBotResults {

        val articleTitleEmpty   = AllExceptions.ArticleTitleEmpty
        val buttonDataInvalid   = AllExceptions.ButtonDataInvalid
        val buttonTypeInvalid   = AllExceptions.ButtonTypeInvalid
        val buttonUrlInvalid   = AllExceptions.ButtonUrlInvalid
        val messageEmpty   = AllExceptions.MessageEmpty
        val messageTooLong   = AllExceptions.MessageTooLong
        val photoInvalid   = AllExceptions.PhotoInvalid
        val photoThumbUrlEmpty   = AllExceptions.PhotoThumbUrlEmpty
        val queryIdInvalid   = AllExceptions.QueryIdInvalid
        val replyMarkupInvalid   = AllExceptions.ReplyMarkupInvalid
        val resultTypeInvalid   = AllExceptions.ResultTypeInvalid
        val sendMessageTypeInvalid   = AllExceptions.SendMessageTypeInvalid
        val startParamInvalid   = AllExceptions.StartParamInvalid
        val userBotInvalid   = AllExceptions.UserBotInvalid

    }

    object TLRequestMessagesSendInlineBotResult {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid
        val chatWriteForbidden   = AllExceptions.ChatWriteForbidden
        val inlineResultExpired   = AllExceptions.InlineResultExpired
        val peerIdInvalid   = AllExceptions.PeerIdInvalid
        val queryIdEmpty   = AllExceptions.QueryIdEmpty
        val webpageCurlFailed   = AllExceptions.WebpageCurlFailed
        val webpageMediaEmpty   = AllExceptions.WebpageMediaEmpty

    }

    object TLRequestMessagesGetBotCallbackAnswer {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid
        val channelInvalid   = AllExceptions.ChannelInvalid
        val dataInvalid   = AllExceptions.DataInvalid
        val messageIdInvalid   = AllExceptions.MessageIdInvalid
        val peerIdInvalid   = AllExceptions.PeerIdInvalid
        val timeout   = AllExceptions.Timeout

    }

    object TLRequestMessagesSetBotCallbackAnswer {

        val queryIdInvalid   = AllExceptions.QueryIdInvalid
        val urlInvalid   = AllExceptions.UrlInvalid

    }

    object TLRequestMessagesEditInlineBotMessage {

        val messageIdInvalid   = AllExceptions.MessageIdInvalid
        val messageNotModified   = AllExceptions.MessageNotModified

    }

    object TLRequestBotsAnswerWebhookJSONQuery {

        val queryIdInvalid   = AllExceptions.QueryIdInvalid
        val userBotInvalid   = AllExceptions.UserBotInvalid400

    }

    object TLRequestBotsSendCustomRequest {

        val userBotInvalid   = AllExceptions.UserBotInvalid

    }

    object TLRequestAccountGetContactSignUpNotification {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid

    }

    object TLRequestAccountSetContactSignUpNotification {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid

    }

    object TLRequestContactsAcceptContact {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid

    }

    object TLRequestContactsAddContact {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid
        val contactIdInvalid   = AllExceptions.ContactIdInvalid

    }

    object TLRequestContactsBlock {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid
        val contactIdInvalid   = AllExceptions.ContactIdInvalid

    }

    object TLRequestContactsDeleteByPhones {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid

    }

    object TLRequestContactsDeleteContacts {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid
        val timeout   = AllExceptions.Timeout

    }

    object TLRequestContactsGetBlocked {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid

    }

    object TLRequestContactsGetContactIDs {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid

    }

    object TLRequestContactsGetContacts {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid

    }

    object TLRequestContactsGetLocated {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid

    }

    object TLRequestContactsGetSaved {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid
        val takeoutRequired   = AllExceptions.TakeoutRequired

    }

    object TLRequestContactsGetStatuses {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid
        val sessionPasswordNeeded   = AllExceptions.SessionPasswordNeeded

    }

    object TLRequestContactsGetTopPeers {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid
        val typesEmpty   = AllExceptions.TypesEmpty

    }

    object TLRequestContactsImportContacts {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid

    }

    object TLRequestContactsResetSaved {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid

    }

    object TLRequestContactsResetTopPeerRating {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid
        val peerIdInvalid   = AllExceptions.PeerIdInvalid

    }

    object TLRequestContactsSearch {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid
        val queryTooShort   = AllExceptions.QueryTooShort
        val searchQueryEmpty   = AllExceptions.SearchQueryEmpty
        val timeout   = AllExceptions.Timeout

    }

    object TLRequestContactsToggleTopPeers {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid

    }

    object TLRequestContactsUnblock {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid
        val contactIdInvalid   = AllExceptions.ContactIdInvalid

    }

    object TLRequestMessagesGetDialogs {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid
        val inputConstructorInvalid   = AllExceptions.InputConstructorInvalid
        val offsetPeerIdInvalid   = AllExceptions.OffsetPeerIdInvalid
        val sessionPasswordNeeded   = AllExceptions.SessionPasswordNeeded
        val timeout   = AllExceptions.Timeout

    }

    object TLRequestMessagesGetPeerDialogs {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid
        val channelPrivate   = AllExceptions.ChannelPrivate
        val peerIdInvalid   = AllExceptions.PeerIdInvalid

    }

    object TLRequestMessagesGetPinnedDialogs {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid
        val folderIdInvalid   = AllExceptions.FolderIdInvalid

    }

    object TLRequestMessagesToggleDialogPin {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid
        val peerIdInvalid   = AllExceptions.PeerIdInvalid

    }

    object TLRequestMessagesReorderPinnedDialogs {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid
        val peerIdInvalid   = AllExceptions.PeerIdInvalid

    }

    object TLRequestMessagesGetDialogUnreadMarks {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid

    }

    object TLRequestMessagesMarkDialogUnread {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid

    }

    object TLRequestMessagesGetPeerSettings {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid
        val channelInvalid   = AllExceptions.ChannelInvalid
        val peerIdInvalid   = AllExceptions.PeerIdInvalid

    }

    object TLRequestMessagesHidePeerSettingsBar {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid

    }

    object TLRequestMessagesGetOnlines {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid

    }

    object TLRequestMessagesSendScreenshotNotification {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid
        val peerIdInvalid   = AllExceptions.PeerIdInvalid

    }

    object TLRequestMessagesSetTyping {

        val channelInvalid   = AllExceptions.ChannelInvalid
        val channelPrivate   = AllExceptions.ChannelPrivate
        val chatAdminRequired   = AllExceptions.ChatAdminRequired400
        val chatIdInvalid   = AllExceptions.ChatIdInvalid
        val chatWriteForbidden   = AllExceptions.ChatWriteForbidden
        val peerIdInvalid   = AllExceptions.PeerIdInvalid
        val userBannedInChannel   = AllExceptions.UserBannedInChannel
        val userIsBlocked   = AllExceptions.UserIsBlocked400
        val userIsBot   = AllExceptions.UserIsBot

    }

    object TLRequestMessagesClearAllDrafts {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid

    }

    object TLRequestMessagesGetAllDrafts {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid

    }

    object TLRequestMessagesSaveDraft {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid
        val peerIdInvalid   = AllExceptions.PeerIdInvalid

    }

    object TLRequestMessagesGetEmojiKeywords {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid

    }

    object TLRequestMessagesGetEmojiKeywordsDifference {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid

    }

    object TLRequestMessagesGetEmojiKeywordsLanguages {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid

    }

    object TLRequestMessagesGetEmojiURL {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid

    }

    object TLRequestFoldersDeleteFolder {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid

    }

    object TLRequestFoldersEditPeerFolders {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid
        val folderIdInvalid   = AllExceptions.FolderIdInvalid

    }

    object TLRequestMessagesGetGameHighScores {

        val messageIdInvalid   = AllExceptions.MessageIdInvalid
        val peerIdInvalid   = AllExceptions.PeerIdInvalid
        val userBotRequired   = AllExceptions.UserBotRequired

    }

    object TLRequestMessagesGetInlineGameHighScores {

        val messageIdInvalid   = AllExceptions.MessageIdInvalid
        val userBotRequired   = AllExceptions.UserBotRequired

    }

    object TLRequestMessagesSetGameScore {

        val messageIdInvalid   = AllExceptions.MessageIdInvalid
        val peerIdInvalid   = AllExceptions.PeerIdInvalid
        val userBotRequired   = AllExceptions.UserBotRequired

    }

    object TLRequestMessagesSetInlineGameScore {

        val messageIdInvalid   = AllExceptions.MessageIdInvalid
        val userBotRequired   = AllExceptions.UserBotRequired

    }

    object TLRequestLangpackGetDifference {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid
        val langPackInvalid   = AllExceptions.LangPackInvalid

    }

    object TLRequestLangpackGetLangPack {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid
        val langPackInvalid   = AllExceptions.LangPackInvalid

    }

    object TLRequestLangpackGetLanguage {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid

    }

    object TLRequestLangpackGetLanguages {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid
        val langPackInvalid   = AllExceptions.LangPackInvalid

    }

    object TLRequestLangpackGetStrings {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid
        val langPackInvalid   = AllExceptions.LangPackInvalid

    }

    object TLRequestAccountGetAutoDownloadSettings {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid

    }

    object TLRequestAccountSaveAutoDownloadSettings {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid

    }

    object TLRequestMessagesSendReaction {

        val messageIdInvalid   = AllExceptions.MessageIdInvalid
        val reactionEmpty   = AllExceptions.ReactionEmpty

    }

    object TLRequestMessagesDeleteHistory {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid
        val peerIdInvalid   = AllExceptions.PeerIdInvalid

    }

    object TLRequestMessagesDeleteMessages {

        val messageDeleteForbidden   = AllExceptions.MessageDeleteForbidden

    }

    object TLRequestMessagesEditMessage {

        val channelInvalid   = AllExceptions.ChannelInvalid
        val channelPrivate   = AllExceptions.ChannelPrivate
        val chatWriteForbidden   = AllExceptions.ChatWriteForbidden
        val inputUserDeactivated   = AllExceptions.InputUserDeactivated
        val messageAuthorRequired   = AllExceptions.MessageAuthorRequired
        val messageEditTimeExpired   = AllExceptions.MessageEditTimeExpired
        val messageEmpty   = AllExceptions.MessageEmpty
        val messageIdInvalid   = AllExceptions.MessageIdInvalid
        val messageNotModified   = AllExceptions.MessageNotModified
        val peerIdInvalid   = AllExceptions.PeerIdInvalid
        val userBannedInChannel   = AllExceptions.UserBannedInChannel

    }

    object TLRequestMessagesForwardMessages {

        val channelInvalid   = AllExceptions.ChannelInvalid
        val channelPrivate   = AllExceptions.ChannelPrivate
        val chatAdminRequired   = AllExceptions.ChatAdminRequired
        val chatIdInvalid   = AllExceptions.ChatIdInvalid
        val chatSendGifsForbidden   = AllExceptions.ChatSendGifsForbidden
        val chatSendMediaForbidden   = AllExceptions.ChatSendMediaForbidden
        val chatSendStickersForbidden   = AllExceptions.ChatSendStickersForbidden
        val chatWriteForbidden   = AllExceptions.ChatWriteForbidden
        val groupedMediaInvalid   = AllExceptions.GroupedMediaInvalid
        val inputUserDeactivated   = AllExceptions.InputUserDeactivated
        val mediaEmpty   = AllExceptions.MediaEmpty
        val messageIdsEmpty   = AllExceptions.MessageIdsEmpty
        val messageIdInvalid   = AllExceptions.MessageIdInvalid
        val peerIdInvalid   = AllExceptions.PeerIdInvalid
        val randomIdInvalid   = AllExceptions.RandomIdInvalid
        val timeout   = AllExceptions.Timeout
        val userBannedInChannel   = AllExceptions.UserBannedInChannel
        val userIsBlocked   = AllExceptions.UserIsBlocked
        val userIsBot   = AllExceptions.UserIsBot
        val youBlockedUser   = AllExceptions.YouBlockedUser

    }

    object TLRequestMessagesGetHistory {

        val authKeyPermEmpty   = AllExceptions.AuthKeyPermEmpty
        val botMethodInvalid   = AllExceptions.BotMethodInvalid
        val channelInvalid   = AllExceptions.ChannelInvalid
        val channelPrivate   = AllExceptions.ChannelPrivate
        val chatIdInvalid   = AllExceptions.ChatIdInvalid
        val peerIdInvalid   = AllExceptions.PeerIdInvalid
        val timeout   = AllExceptions.Timeout

    }

    object TLRequestMessagesGetMessageEditData {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid
        val messageAuthorRequired   = AllExceptions.MessageAuthorRequired
        val peerIdInvalid   = AllExceptions.PeerIdInvalid

    }

    object TLRequestMessagesGetMessagesViews {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid
        val channelPrivate   = AllExceptions.ChannelPrivate
        val chatIdInvalid   = AllExceptions.ChatIdInvalid
        val peerIdInvalid   = AllExceptions.PeerIdInvalid

    }

    object TLRequestMessagesGetRecentLocations {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid

    }

    object TLRequestMessagesGetSearchCounters {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid

    }

    object TLRequestMessagesSearch {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid
        val chatAdminRequired   = AllExceptions.ChatAdminRequired
        val inputConstructorInvalid   = AllExceptions.InputConstructorInvalid
        val inputUserDeactivated   = AllExceptions.InputUserDeactivated
        val peerIdInvalid   = AllExceptions.PeerIdInvalid
        val peerIdNotSupported   = AllExceptions.PeerIdNotSupported
        val searchQueryEmpty   = AllExceptions.SearchQueryEmpty
        val userIdInvalid   = AllExceptions.UserIdInvalid

    }

    object TLRequestMessagesGetUnreadMentions {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid
        val peerIdInvalid   = AllExceptions.PeerIdInvalid

    }

    object TLRequestMessagesReadHistory {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid
        val peerIdInvalid   = AllExceptions.PeerIdInvalid
        val timeout   = AllExceptions.Timeout

    }

    object TLRequestMessagesReadMentions {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid

    }

    object TLRequestMessagesReadMessageContents {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid

    }

    object TLRequestMessagesReceivedMessages {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid

    }

    object TLRequestMessagesSearchGlobal {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid
        val searchQueryEmpty   = AllExceptions.SearchQueryEmpty

    }

    object TLRequestMessagesSendMedia {

        val channelInvalid   = AllExceptions.ChannelInvalid
        val channelPrivate   = AllExceptions.ChannelPrivate
        val chatAdminRequired   = AllExceptions.ChatAdminRequired
        val chatSendMediaForbidden   = AllExceptions.ChatSendMediaForbidden
        val chatWriteForbidden   = AllExceptions.ChatWriteForbidden
        val externalUrlInvalid   = AllExceptions.ExternalUrlInvalid
        val filePartsInvalid   = AllExceptions.FilePartsInvalid
        val filePartLengthInvalid   = AllExceptions.FilePartLengthInvalid
        val imageProcessFailed   = AllExceptions.ImageProcessFailed
        val inputUserDeactivated   = AllExceptions.InputUserDeactivated
        val mediaCaptionTooLong   = AllExceptions.MediaCaptionTooLong
        val mediaEmpty   = AllExceptions.MediaEmpty
        val mediaInvalid   = AllExceptions.MediaInvalid
        val peerIdInvalid   = AllExceptions.PeerIdInvalid
        val photoExtInvalid   = AllExceptions.PhotoExtInvalid
        val photoInvalidDimensions   = AllExceptions.PhotoInvalidDimensions
        val photoSaveFileInvalid   = AllExceptions.PhotoSaveFileInvalid
        val timeout   = AllExceptions.Timeout
        val userBannedInChannel   = AllExceptions.UserBannedInChannel
        val userIsBlocked   = AllExceptions.UserIsBlocked
        val userIsBot   = AllExceptions.UserIsBot
        val webpageCurlFailed   = AllExceptions.WebpageCurlFailed
        val webpageMediaEmpty   = AllExceptions.WebpageMediaEmpty

    }

    object TLRequestMessagesSendMessage {

        val buttonDataInvalid   = AllExceptions.ButtonDataInvalid
        val buttonTypeInvalid   = AllExceptions.ButtonTypeInvalid
        val buttonUrlInvalid   = AllExceptions.ButtonUrlInvalid
        val channelInvalid   = AllExceptions.ChannelInvalid
        val channelPrivate   = AllExceptions.ChannelPrivate
        val chatAdminRequired   = AllExceptions.ChatAdminRequired
        val chatIdInvalid   = AllExceptions.ChatIdInvalid
        val chatRestricted   = AllExceptions.ChatRestricted
        val chatWriteForbidden   = AllExceptions.ChatWriteForbidden
        val entityMentionUserInvalid   = AllExceptions.EntityMentionUserInvalid
        val inputUserDeactivated   = AllExceptions.InputUserDeactivated
        val messageEmpty   = AllExceptions.MessageEmpty
        val messageTooLong   = AllExceptions.MessageTooLong
        val msgIdInvalid   = AllExceptions.MsgIdInvalid
        val peerIdInvalid   = AllExceptions.PeerIdInvalid
        val replyMarkupInvalid   = AllExceptions.ReplyMarkupInvalid
        val slowmodeWaitX   = AllExceptions.SlowmodeWaitX
        val timeout   = AllExceptions.Timeout
        val userBannedInChannel   = AllExceptions.UserBannedInChannel
        val userIsBlocked   = AllExceptions.UserIsBlocked
        val userIsBot   = AllExceptions.UserIsBot
        val youBlockedUser   = AllExceptions.YouBlockedUser

    }

    object TLRequestMessagesSendMultiMedia {

        val mediaInvalid   = AllExceptions.MediaInvalid
        val peerIdInvalid   = AllExceptions.PeerIdInvalid

    }

    object TLRequestAccountRegisterDevice {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid
        val tokenInvalid   = AllExceptions.TokenInvalid

    }

    object TLRequestAccountUnregisterDevice {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid
        val tokenInvalid   = AllExceptions.TokenInvalid

    }

    object TLRequestAccountUpdateDeviceLocked {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid

    }

    object TLRequestAccountGetNotifyExceptions {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid

    }

    object TLRequestAccountGetNotifySettings {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid
        val peerIdInvalid   = AllExceptions.PeerIdInvalid

    }

    object TLRequestAccountUpdateNotifySettings {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid
        val peerIdInvalid   = AllExceptions.PeerIdInvalid

    }

    object TLRequestAccountResetNotifySettings {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid

    }

    object TLRequestUsersGetFullUser {

        val timeout   = AllExceptions.Timeout
        val userIdInvalid   = AllExceptions.UserIdInvalid

    }

    object TLRequestUsersGetUsers {

        val authKeyPermEmpty   = AllExceptions.AuthKeyPermEmpty
        val sessionPasswordNeeded   = AllExceptions.SessionPasswordNeeded
        val timeout   = AllExceptions.Timeout

    }

    object TLRequestPaymentsGetSavedInfo {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid

    }

    object TLRequestPaymentsClearSavedInfo {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid

    }

    object TLRequestPaymentsGetPaymentForm {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid
        val messageIdInvalid   = AllExceptions.MessageIdInvalid

    }

    object TLRequestPaymentsValidateRequestedInfo {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid
        val messageIdInvalid   = AllExceptions.MessageIdInvalid

    }

    object TLRequestMessagesSetBotShippingResults {

        val queryIdInvalid   = AllExceptions.QueryIdInvalid

    }

    object TLRequestAccountGetTmpPassword {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid
        val passwordHashInvalid   = AllExceptions.PasswordHashInvalid
        val tmpPasswordDisabled   = AllExceptions.TmpPasswordDisabled

    }

    object TLRequestPaymentsSendPaymentForm {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid
        val messageIdInvalid   = AllExceptions.MessageIdInvalid

    }

    object TLRequestMessagesSetBotPrecheckoutResults {

        val errorTextEmpty   = AllExceptions.ErrorTextEmpty

    }

    object TLRequestPaymentsGetPaymentReceipt {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid
        val messageIdInvalid   = AllExceptions.MessageIdInvalid

    }

    object TLRequestMessagesGetPollResults {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid

    }

    object TLRequestMessagesSendVote {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid

    }

    object TLRequestHelpGetProxyData {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid

    }

    object TLRequestStickersAddStickerToSet {

        val botMissing   = AllExceptions.BotMissing
        val stickersetInvalid   = AllExceptions.StickersetInvalid

    }

    object TLRequestStickersChangeStickerPosition {

        val botMissing   = AllExceptions.BotMissing
        val stickerInvalid   = AllExceptions.StickerInvalid

    }

    object TLRequestStickersCreateStickerSet {

        val botMissing   = AllExceptions.BotMissing
        val packShortNameInvalid   = AllExceptions.PackShortNameInvalid
        val packShortNameOccupied   = AllExceptions.PackShortNameOccupied
        val peerIdInvalid   = AllExceptions.PeerIdInvalid
        val stickersEmpty   = AllExceptions.StickersEmpty
        val stickerEmojiInvalid   = AllExceptions.StickerEmojiInvalid
        val stickerFileInvalid   = AllExceptions.StickerFileInvalid
        val stickerPngDimensions   = AllExceptions.StickerPngDimensions
        val userIdInvalid   = AllExceptions.UserIdInvalid

    }

    object TLRequestStickersRemoveStickerFromSet {

        val botMissing   = AllExceptions.BotMissing
        val stickerInvalid   = AllExceptions.StickerInvalid

    }

    object TLRequestMessagesClearRecentStickers {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid

    }

    object TLRequestMessagesFaveSticker {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid
        val stickerIdInvalid   = AllExceptions.StickerIdInvalid

    }

    object TLRequestMessagesGetAllStickers {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid

    }

    object TLRequestMessagesGetArchivedStickers {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid

    }

    object TLRequestMessagesGetAttachedStickers {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid

    }

    object TLRequestMessagesGetFavedStickers {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid

    }

    object TLRequestMessagesGetFeaturedStickers {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid

    }

    object TLRequestMessagesGetMaskStickers {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid

    }

    object TLRequestMessagesGetRecentStickers {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid

    }

    object TLRequestMessagesGetStickerSet {

        val stickersetInvalid   = AllExceptions.StickersetInvalid

    }

    object TLRequestMessagesGetStickers {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid

    }

    object TLRequestMessagesSaveRecentSticker {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid
        val stickerIdInvalid   = AllExceptions.StickerIdInvalid

    }

    object TLRequestMessagesInstallStickerSet {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid
        val stickersetInvalid   = AllExceptions.StickersetInvalid

    }

    object TLRequestMessagesReadFeaturedStickers {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid

    }

    object TLRequestMessagesReorderStickerSets {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid

    }

    object TLRequestMessagesSearchStickerSets {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid

    }

    object TLRequestMessagesUninstallStickerSet {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid
        val stickersetInvalid   = AllExceptions.StickersetInvalid

    }

    object TLRequestAccountChangePhone {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid
        val phoneNumberInvalid   = AllExceptions.PhoneNumberInvalid

    }

    object TLRequestAccountConfirmPhone {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid
        val codeHashInvalid   = AllExceptions.CodeHashInvalid
        val phoneCodeEmpty   = AllExceptions.PhoneCodeEmpty

    }

    object TLRequestAccountDeleteAccount {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid

    }

    object TLRequestAccountGetAccountTTL {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid

    }

    object TLRequestAccountGetPrivacy {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid
        val privacyKeyInvalid   = AllExceptions.PrivacyKeyInvalid

    }

    object TLRequestAccountResetAuthorization {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid
        val hashInvalid   = AllExceptions.HashInvalid

    }

    object TLRequestAccountSendChangePhoneCode {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid
        val phoneNumberInvalid   = AllExceptions.PhoneNumberInvalid

    }

    object TLRequestAccountSendConfirmPhoneCode {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid
        val hashInvalid   = AllExceptions.HashInvalid

    }

    object TLRequestAccountSetAccountTTL {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid
        val ttlDaysInvalid   = AllExceptions.TtlDaysInvalid

    }

    object TLRequestAccountSetPrivacy {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid
        val privacyKeyInvalid   = AllExceptions.PrivacyKeyInvalid

    }

    object TLRequestAccountUpdateProfile {

        val aboutTooLong   = AllExceptions.AboutTooLong
        val botMethodInvalid   = AllExceptions.BotMethodInvalid
        val firstnameInvalid   = AllExceptions.FirstnameInvalid

    }

    object TLRequestAccountUpdateStatus {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid
        val sessionPasswordNeeded   = AllExceptions.SessionPasswordNeeded

    }

    object TLRequestPhotosDeletePhotos {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid

    }

    object TLRequestPhotosGetUserPhotos {

        val maxIdInvalid   = AllExceptions.MaxIdInvalid
        val userIdInvalid   = AllExceptions.UserIdInvalid

    }

    object TLRequestPhotosUpdateProfilePhoto {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid
        val filePartsInvalid   = AllExceptions.FilePartsInvalid
        val imageProcessFailed   = AllExceptions.ImageProcessFailed
        val photoCropSizeSmall   = AllExceptions.PhotoCropSizeSmall

    }

    object TLRequestPhotosUploadProfilePhoto {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid
        val filePartsInvalid   = AllExceptions.FilePartsInvalid
        val imageProcessFailed   = AllExceptions.ImageProcessFailed
        val photoCropSizeSmall   = AllExceptions.PhotoCropSizeSmall
        val photoExtInvalid   = AllExceptions.PhotoExtInvalid

    }

    object TLRequestChannelsCheckUsername {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid
        val channelInvalid   = AllExceptions.ChannelInvalid
        val chatIdInvalid   = AllExceptions.ChatIdInvalid
        val usernameInvalid   = AllExceptions.UsernameInvalid

    }

    object TLRequestChannelsUpdateUsername {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid
        val channelsAdminPublicTooMuch   = AllExceptions.ChannelsAdminPublicTooMuch
        val channelInvalid   = AllExceptions.ChannelInvalid
        val channelPrivate   = AllExceptions.ChannelPrivate
        val chatAdminRequired   = AllExceptions.ChatAdminRequired
        val usernameInvalid   = AllExceptions.UsernameInvalid
        val usernameNotModified   = AllExceptions.UsernameNotModified
        val usernameOccupied   = AllExceptions.UsernameOccupied

    }

    object TLRequestAccountUpdateUsername {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid
        val sessionPasswordNeeded   = AllExceptions.SessionPasswordNeeded
        val usernameInvalid   = AllExceptions.UsernameInvalid
        val usernameNotModified   = AllExceptions.UsernameNotModified
        val usernameOccupied   = AllExceptions.UsernameOccupied

    }

    object TLRequestAccountCheckUsername {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid
        val usernameInvalid   = AllExceptions.UsernameInvalid

    }

    object TLRequestContactsResolveUsername {

        val authKeyPermEmpty   = AllExceptions.AuthKeyPermEmpty
        val sessionPasswordNeeded   = AllExceptions.SessionPasswordNeeded
        val usernameInvalid   = AllExceptions.UsernameInvalid
        val usernameNotOccupied   = AllExceptions.UsernameNotOccupied

    }

    object TLRequestAccountGetWallPaper {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid

    }

    object TLRequestAccountGetWallPapers {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid

    }

    object TLRequestAccountInstallWallPaper {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid

    }

    object TLRequestAccountResetWallPapers {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid

    }

    object TLRequestAccountSaveWallPaper {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid

    }

    object TLRequestAccountUploadWallPaper {

        val botMethodInvalid   = AllExceptions.BotMethodInvalid

    }


}