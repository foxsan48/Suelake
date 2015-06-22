package com.suelake.habbo.communication;

import com.suelake.habbo.communication.requests.*;

/**
 * Holds immutable integers, Strings and ClientRequestHandlers representing client>server messages.\r
 * Provides methods for invoking handlers for clients.
 * 
 * @author Nillus
 */
public final class ClientCommands
{
	private final static int min = 2;
	public final static int max = 115;
	
	public final static int ROOM_DIRECTORY = 2;
	public final static int KEYENCRYPTED = 3;
	public final static int LOGIN = 4;
	public final static int VERSIONCHECK = 5;
	public final static int UNIQUEMACHINEID = 6;
	public final static int INFORETRIEVE = 7;
	public final static int GETCREDITS = 8;
	public final static int GETAVAILABLESETS = 9;
	public final static int GETADFORME = 10;
	public final static int GETALLUNITS = 11;
	public final static int MESSENGERINIT = 12;
	public final static int SBUSYF = 13;
	public final static int GETUNITUPDATES = 14;
	public final static int MESSENGER_SENDUPDATE = 15;
	public final static int SUSERF = 16;
	public final static int SRCHF = 17;
	public final static int GETFVRF = 18;
	public final static int ADD_FAVORITE_ROOM = 19;
	public final static int DEL_FAVORITE_ROOM = 20;
	public final static int GETFLATINFO = 21;
	public final static int GETUNITUSERS = 22;
	public final static int DELETEFLAT = 23;
	public final static int UPDATEFLAT = 24;
	public final static int SETFLATINFO = 25;
	public final static int SCR_GINFO = 26;
	public final static int GETDOORFLAT = 28;
	public final static int CREATEFLAT = 29;
	public final static int MESSENGER_C_CLICK = 30;
	public final static int MESSENGER_C_READ = 31;
	public final static int MESSENGER_MARKREAD = 32;
	public final static int MESSENGER_SENDMSG = 33;
	public final static int MESSENGER_ASSIGNPERSMSG = 36;
	public final static int MESSENGER_ACCEPTBUDDY = 37;
	public final static int MESSENGER_DECLINEBUDDY = 38;
	public final static int MESSENGER_REQUESTBUDDY = 39;
	public final static int MESSENGER_REMOVEBUDDY = 40;
	public final static int FINDUSER = 41;
	public final static int APPROVENAME = 42;
	public final static int REGISTER = 43;
	public final static int UPDATE = 44;
	public final static int SCR_SUBSCRIBE = 45;
	public final static int SCR_EXTSCR = 46;
	public final static int SEND_USERPASS_TO_EMAIL = 47;
	public final static int PICK_CRYFORHELP = 48;
	public final static int SHOWBADGE = 50;
	public final static int HIDEBADGE = 51;
	public final static int CHAT = 52;
	public final static int QUIT = 53;
	public final static int GOVIADOOR = 54;
	public final static int SHOUT = 55;
	public final static int WHISPER = 56;
	public final static int TRYFLAT = 57;
	public final static int LANGCHECK = 58;
	public final static int GOTOFLAT = 59;
	public final static int G_HMAP = 60;
	public final static int G_USRS = 61;
	public final static int G_OBJS = 62;
	public final static int G_ITEMS = 63;
	public final static int G_STAT = 64;
	public final static int GETSTRIP = 65;
	public final static int FLATPROPERTYBYITEM = 66;
	public final static int ADDSTRIPITEM = 67;
	public final static int TRADE_UNACCEPT = 68;
	public final static int TRADE_ACCEPT = 69;
	public final static int TRADE_CLOSE = 70;
	public final static int TRADE_OPEN = 71;
	public final static int TRADE_ADDITEM = 72;
	public final static int MOVESTUFF = 73;
	public final static int SETSTUFFDATA = 74;
	public final static int MOVE = 75;
	public final static int THROW_DICE = 76;
	public final static int DICE_OFF = 77;
	public final static int PRESENTOPEN = 78;
	public final static int LOOKTO = 79;
	public final static int CARRYDRINK = 80;
	public final static int INTODOOR = 81;
	public final static int DOORGOIN = 82;
	public final static int G_IDATA = 83;
	public final static int SETITEMDATA = 84;
	public final static int REMOVEITEM = 85;
	public final static int CRYFORHELP = 86;
	public final static int CARRYITEM = 87;
	public final static int STOP = 88;
	public final static int USEITEM = 89;
	public final static int PLACESTUFFFROMSTRIP = 90;
	public final static int PLACEITEMFROMSTRIP = 91;
	public final static int DANCE = 93;
	public final static int WAVE = 94;
	public final static int KILLUSER = 95;
	public final static int ASSIGNRIGHTS = 96;
	public final static int REMOVERIGHTS = 97;
	public final static int LETUSERIN = 98;
	public final static int REMOVESTUFF = 99;
	public final static int GPRC = 100;
	public final static int GCIX = 101;
	public final static int GCAP = 102;
	public final static int JUMPSTART = 103;
	public final static int SIGN = 104;
	public final static int BTCKS = 105;
	public final static int JUMPPERF = 106;
	public final static int SPLASH_POSITION = 107;
	public final static int CLOSE_UIMAKOPPI = 108;
	public final static int HUBU_VOTE = 112;
	public final static int PTM = 114;
	public final static int GOAWAY = 115;
	
	private static ClientRequestHandler[] REQUESTHANDLERS;
	private static String[] REQUESTCOMMANDS;
	
	static
	{
		REQUESTHANDLERS = new ClientRequestHandler[max + 1];
		//REQUESTHANDLERS[ROOM_DIRECTORY + 1] = new ROOM_DIRECTORY();
		REQUESTHANDLERS[KEYENCRYPTED] = new KEYENCRYPTED();
		REQUESTHANDLERS[LOGIN] = new LOGIN();
		REQUESTHANDLERS[VERSIONCHECK] = new VERSIONCHECK();
		REQUESTHANDLERS[UNIQUEMACHINEID] = new UNIQUEMACHINEID();
		REQUESTHANDLERS[INFORETRIEVE] = new INFORETRIEVE();
		REQUESTHANDLERS[GETCREDITS] = new GETCREDITS();
		REQUESTHANDLERS[GETAVAILABLESETS] = new GETAVAILABLESETS();
		REQUESTHANDLERS[GETADFORME] = new GETADFORME();
		REQUESTHANDLERS[GETALLUNITS] = new GETALLUNITS();
		REQUESTHANDLERS[MESSENGERINIT] = new MESSENGERINIT();
		REQUESTHANDLERS[SBUSYF] = new SBUSYF();
		REQUESTHANDLERS[GETUNITUPDATES] = new GETUNITUPDATES();
		REQUESTHANDLERS[MESSENGER_SENDUPDATE] = new MESSENGER_SENDUPDATE();
		REQUESTHANDLERS[SUSERF] = new SUSERF();
		REQUESTHANDLERS[SRCHF] = new SRCHF();
		REQUESTHANDLERS[GETFVRF] = new GETFVRF();
		REQUESTHANDLERS[ADD_FAVORITE_ROOM] = new ADD_FAVORITE_ROOM();
		REQUESTHANDLERS[DEL_FAVORITE_ROOM] = new DEL_FAVORITE_ROOM();
		REQUESTHANDLERS[GETFLATINFO] = new GETFLATINFO();
		REQUESTHANDLERS[GETUNITUSERS] = new GETUNITUSERS();
		REQUESTHANDLERS[DELETEFLAT] = new DELETEFLAT();
		REQUESTHANDLERS[UPDATEFLAT] = new UPDATEFLAT();
		REQUESTHANDLERS[SETFLATINFO] = new SETFLATINFO();
		REQUESTHANDLERS[SCR_GINFO] = new SCR_GINFO();
		REQUESTHANDLERS[GETDOORFLAT] = new GETDOORFLAT();
		REQUESTHANDLERS[CREATEFLAT] = new CREATEFLAT();
		//REQUESTHANDLERS[MESSENGER_C_CLICK] = new MESSENGER_C_CLICK();
		//REQUESTHANDLERS[MESSENGER_C_READ] = new MESSENGER_C_READ();
		REQUESTHANDLERS[MESSENGER_MARKREAD] = new MESSENGER_MARKREAD();
		REQUESTHANDLERS[MESSENGER_SENDMSG] = new MESSENGER_SENDMSG();
		REQUESTHANDLERS[MESSENGER_ASSIGNPERSMSG] = new MESSENGER_ASSIGNPERSMSG();
		REQUESTHANDLERS[MESSENGER_ACCEPTBUDDY] = new MESSENGER_ACCEPTBUDDY();
		REQUESTHANDLERS[MESSENGER_DECLINEBUDDY] = new MESSENGER_DECLINEBUDDY();
		REQUESTHANDLERS[MESSENGER_REQUESTBUDDY] = new MESSENGER_REQUESTBUDDY();
		REQUESTHANDLERS[MESSENGER_REMOVEBUDDY] = new MESSENGER_REMOVEBUDDY();
		REQUESTHANDLERS[FINDUSER] = new FINDUSER();
		REQUESTHANDLERS[APPROVENAME] = new APPROVENAME();
		REQUESTHANDLERS[REGISTER] = new REGISTER();
		REQUESTHANDLERS[UPDATE] = new UPDATE();
		REQUESTHANDLERS[SCR_SUBSCRIBE] = new SCR_SUBSCRIBE();
		REQUESTHANDLERS[SCR_EXTSCR] = new SCR_EXTSCR();
		REQUESTHANDLERS[SEND_USERPASS_TO_EMAIL] = new SEND_USERPASS_TO_EMAIL();
		REQUESTHANDLERS[PICK_CRYFORHELP] = new PICK_CRYFORHELP();
		REQUESTHANDLERS[SHOWBADGE] = new SHOWBADGE();
		REQUESTHANDLERS[HIDEBADGE] = new HIDEBADGE();
		REQUESTHANDLERS[CHAT] = new CHAT();
		REQUESTHANDLERS[QUIT] = new QUIT();
		REQUESTHANDLERS[GOVIADOOR] = new GOVIADOOR();
		REQUESTHANDLERS[SHOUT] = new SHOUT();
		REQUESTHANDLERS[WHISPER] = new WHISPER();
		REQUESTHANDLERS[TRYFLAT] = new TRYFLAT();
		//REQUESTHANDLERS[LANGCHECK] = new LANGCHECK();
		REQUESTHANDLERS[GOTOFLAT] = new GOTOFLAT();
		REQUESTHANDLERS[G_HMAP] = new G_HMAP();
		REQUESTHANDLERS[G_USRS] = new G_USRS();
		REQUESTHANDLERS[G_OBJS] = new G_OBJS();
		REQUESTHANDLERS[G_ITEMS] = new G_ITEMS();
		REQUESTHANDLERS[G_STAT] = new G_STAT();
		REQUESTHANDLERS[GETSTRIP] = new GETSTRIP();
		REQUESTHANDLERS[FLATPROPERTYBYITEM] = new FLATPROPERTYBYITEM();
		REQUESTHANDLERS[ADDSTRIPITEM] = new ADDSTRIPITEM();
		REQUESTHANDLERS[TRADE_UNACCEPT] = new TRADE_UNACCEPT();
		REQUESTHANDLERS[TRADE_ACCEPT] = new TRADE_ACCEPT();
		REQUESTHANDLERS[TRADE_CLOSE] = new TRADE_CLOSE();
		REQUESTHANDLERS[TRADE_OPEN] = new TRADE_OPEN();
		REQUESTHANDLERS[TRADE_ADDITEM] = new TRADE_ADDITEM();
		REQUESTHANDLERS[MOVESTUFF] = new MOVESTUFF();
		REQUESTHANDLERS[SETSTUFFDATA] = new SETSTUFFDATA();
		REQUESTHANDLERS[MOVE] = new MOVE();
		REQUESTHANDLERS[THROW_DICE] = new THROW_DICE();
		REQUESTHANDLERS[DICE_OFF] = new DICE_OFF();
		REQUESTHANDLERS[PRESENTOPEN] = new PRESENTOPEN();
		REQUESTHANDLERS[LOOKTO] = new LOOKTO();
		REQUESTHANDLERS[CARRYDRINK] = new CARRYDRINK();
		REQUESTHANDLERS[INTODOOR] = new INTODOOR();
		REQUESTHANDLERS[DOORGOIN] = new DOORGOIN();
		REQUESTHANDLERS[G_IDATA] = new G_IDATA();
		REQUESTHANDLERS[SETITEMDATA] = new SETITEMDATA();
		REQUESTHANDLERS[REMOVEITEM] = new REMOVEITEM();
		REQUESTHANDLERS[CRYFORHELP] = new CRYFORHELP();
		REQUESTHANDLERS[CARRYITEM] = new CARRYITEM();
		REQUESTHANDLERS[STOP] = new STOP();
		REQUESTHANDLERS[USEITEM] = new USEITEM();
		REQUESTHANDLERS[PLACESTUFFFROMSTRIP] = new PLACESTUFFFROMSTRIP();
		REQUESTHANDLERS[PLACEITEMFROMSTRIP] = new PLACEITEMFROMSTRIP();
		REQUESTHANDLERS[DANCE] = new DANCE();
		REQUESTHANDLERS[WAVE] = new WAVE();
		REQUESTHANDLERS[KILLUSER] = new KILLUSER();
		REQUESTHANDLERS[ASSIGNRIGHTS] = new ASSIGNRIGHTS();
		REQUESTHANDLERS[REMOVERIGHTS] = new REMOVERIGHTS();
		REQUESTHANDLERS[LETUSERIN] = new LETUSERIN();
		REQUESTHANDLERS[REMOVESTUFF] = new REMOVESTUFF();
		REQUESTHANDLERS[GPRC] = new GPRC();
		REQUESTHANDLERS[GCIX] = new GCIX();
		REQUESTHANDLERS[GCAP] = new GCAP();
		REQUESTHANDLERS[JUMPSTART] = new JUMPSTART();
		REQUESTHANDLERS[SIGN] = new SIGN();
		REQUESTHANDLERS[BTCKS] = new BTCKS();
		REQUESTHANDLERS[JUMPPERF] = new JUMPPERF();
		REQUESTHANDLERS[SPLASH_POSITION] = new SPLASH_POSITION();
		REQUESTHANDLERS[CLOSE_UIMAKOPPI] = new CLOSE_UIMAKOPPI();
		//REQUESTHANDLERS[HUBU_VOTE] = new HUBU_VOTE();
		REQUESTHANDLERS[PTM] = new PTM();
		REQUESTHANDLERS[GOAWAY] = new GOAWAY();
		
		REQUESTCOMMANDS = new String[max + 1];
		REQUESTCOMMANDS[KEYENCRYPTED] = "KEYENCRYPTED";
		REQUESTCOMMANDS[ROOM_DIRECTORY] = "ROOM_DIRECTORY";
		REQUESTCOMMANDS[LOGIN] = "LOGIN";
		REQUESTCOMMANDS[VERSIONCHECK] = "VERSIONCHECK";
		REQUESTCOMMANDS[UNIQUEMACHINEID] = "UNIQUEMACHINEID";
		REQUESTCOMMANDS[INFORETRIEVE] = "INFORETRIEVE";
		REQUESTCOMMANDS[GETCREDITS] = "GETCREDITS";
		REQUESTCOMMANDS[GETAVAILABLESETS] = "GETAVAILABLESETS";
		REQUESTCOMMANDS[GETADFORME] = "GETADFORME";
		REQUESTCOMMANDS[GETALLUNITS] = "GETALLUNITS";
		REQUESTCOMMANDS[MESSENGERINIT] = "MESSENGERINIT";
		REQUESTCOMMANDS[SBUSYF] = "SBUSYF";
		REQUESTCOMMANDS[GETUNITUPDATES] = "GETUNITUPDATES";
		REQUESTCOMMANDS[MESSENGER_SENDUPDATE] = "MESSENGER_SENDUPDATE";
		REQUESTCOMMANDS[SUSERF] = "SUSERF";
		REQUESTCOMMANDS[SRCHF] = "SRCHF";
		REQUESTCOMMANDS[GETFVRF] = "GETFVRF";
		REQUESTCOMMANDS[ADD_FAVORITE_ROOM] = "ADD_FAVORITE_ROOM";
		REQUESTCOMMANDS[DEL_FAVORITE_ROOM] = "DEL_FAVORITE_ROOM";
		REQUESTCOMMANDS[GETFLATINFO] = "GETFLATINFO";
		REQUESTCOMMANDS[GETUNITUSERS] = "GETUNITUSERS";
		REQUESTCOMMANDS[DELETEFLAT] = "DELETEFLAT";
		REQUESTCOMMANDS[UPDATEFLAT] = "UPDATEFLAT";
		REQUESTCOMMANDS[SETFLATINFO] = "SETFLATINFO";
		REQUESTCOMMANDS[SCR_GINFO] = "SCR_GINFO";
		REQUESTCOMMANDS[GETDOORFLAT] = "GETDOORFLAT";
		REQUESTCOMMANDS[CREATEFLAT] = "CREATEFLAT";
		REQUESTCOMMANDS[MESSENGER_C_CLICK] = "MESSENGER_C_CLICK";
		REQUESTCOMMANDS[MESSENGER_C_READ] = "MESSENGER_C_READ";
		REQUESTCOMMANDS[MESSENGER_MARKREAD] = "MESSENGER_MARKREAD";
		REQUESTCOMMANDS[MESSENGER_SENDMSG] = "MESSENGER_SENDMSG";
		REQUESTCOMMANDS[MESSENGER_ASSIGNPERSMSG] = "MESSENGER_ASSIGNPERSMSG";
		REQUESTCOMMANDS[MESSENGER_ACCEPTBUDDY] = "MESSENGER_ACCEPTBUDDY";
		REQUESTCOMMANDS[MESSENGER_DECLINEBUDDY] = "MESSENGER_DECLINEBUDDY";
		REQUESTCOMMANDS[MESSENGER_REQUESTBUDDY] = "MESSENGER_REQUESTBUDDY";
		REQUESTCOMMANDS[MESSENGER_REMOVEBUDDY] = "MESSENGER_REMOVEBUDDY";
		REQUESTCOMMANDS[FINDUSER] = "FINDUSER";
		REQUESTCOMMANDS[APPROVENAME] = "APPROVENAME";
		REQUESTCOMMANDS[REGISTER] = "REGISTER";
		REQUESTCOMMANDS[UPDATE] = "UPDATE";
		REQUESTCOMMANDS[SCR_SUBSCRIBE] = "SCR_SUBSCRIBE";
		REQUESTCOMMANDS[SCR_EXTSCR] = "SCR_EXTSCR";
		REQUESTCOMMANDS[SEND_USERPASS_TO_EMAIL] = "SEND_USERPASS_TO_EMAIL";
		REQUESTCOMMANDS[PICK_CRYFORHELP] = "PICK_CRYFORHELP";
		REQUESTCOMMANDS[SHOWBADGE] = "SHOWBADGE";
		REQUESTCOMMANDS[HIDEBADGE] = "HIDEBADGE";
		REQUESTCOMMANDS[CHAT] = "CHAT";
		REQUESTCOMMANDS[QUIT] = "QUIT";
		REQUESTCOMMANDS[GOVIADOOR] = "GOVIADOOR";
		REQUESTCOMMANDS[SHOUT] = "SHOUT";
		REQUESTCOMMANDS[WHISPER] = "WHISPER";
		REQUESTCOMMANDS[TRYFLAT] = "TRYFLAT";
		REQUESTCOMMANDS[LANGCHECK] = "LANGCHECK";
		REQUESTCOMMANDS[GOTOFLAT] = "GOTOFLAT";
		REQUESTCOMMANDS[G_HMAP] = "G_HMAP";
		REQUESTCOMMANDS[G_USRS] = "G_USRS";
		REQUESTCOMMANDS[G_OBJS] = "G_OBJS";
		REQUESTCOMMANDS[G_ITEMS] = "G_ITEMS";
		REQUESTCOMMANDS[G_STAT] = "G_STAT";
		REQUESTCOMMANDS[GETSTRIP] = "GETSTRIP";
		REQUESTCOMMANDS[FLATPROPERTYBYITEM] = "FLATPROPERTYBYITEM";
		REQUESTCOMMANDS[ADDSTRIPITEM] = "ADDSTRIPITEM";
		REQUESTCOMMANDS[TRADE_UNACCEPT] = "TRADE_UNACCEPT";
		REQUESTCOMMANDS[TRADE_ACCEPT] = "TRADE_ACCEPT";
		REQUESTCOMMANDS[TRADE_CLOSE] = "TRADE_CLOSE";
		REQUESTCOMMANDS[TRADE_OPEN] = "TRADE_OPEN";
		REQUESTCOMMANDS[TRADE_ADDITEM] = "TRADE_ADDITEM";
		REQUESTCOMMANDS[MOVESTUFF] = "MOVESTUFF";
		REQUESTCOMMANDS[SETSTUFFDATA] = "SETSTUFFDATA";
		REQUESTCOMMANDS[MOVE] = "Move";
		REQUESTCOMMANDS[THROW_DICE] = "THROW_DICE";
		REQUESTCOMMANDS[DICE_OFF] = "DICE_OFF";
		REQUESTCOMMANDS[PRESENTOPEN] = "PRESENTOPEN";
		REQUESTCOMMANDS[LOOKTO] = "LOOKTO";
		REQUESTCOMMANDS[CARRYDRINK] = "CarryDrink";
		REQUESTCOMMANDS[INTODOOR] = "IntoDoor";
		REQUESTCOMMANDS[DOORGOIN] = "DOORGOIN";
		REQUESTCOMMANDS[G_IDATA] = "G_IDATA";
		REQUESTCOMMANDS[SETITEMDATA] = "SETITEMDATA";
		REQUESTCOMMANDS[REMOVEITEM] = "REMOVEITEM";
		REQUESTCOMMANDS[CRYFORHELP] = "CRYFORHELP";
		REQUESTCOMMANDS[CARRYITEM] = "CarryItem";
		REQUESTCOMMANDS[STOP] = "STOP";
		REQUESTCOMMANDS[USEITEM] = "UseItem";
		REQUESTCOMMANDS[PLACESTUFFFROMSTRIP] = "PLACESTUFFFROMSTRIP";
		REQUESTCOMMANDS[PLACEITEMFROMSTRIP] = "PLACEITEMFROMSTRIP";
		REQUESTCOMMANDS[DANCE] = "Dance";
		REQUESTCOMMANDS[WAVE] = "Wave";
		REQUESTCOMMANDS[KILLUSER] = "KILLUSER";
		REQUESTCOMMANDS[ASSIGNRIGHTS] = "ASSIGNRIGHTS";
		REQUESTCOMMANDS[REMOVERIGHTS] = "REMOVERIGHTS";
		REQUESTCOMMANDS[LETUSERIN] = "LETUSERIN";
		REQUESTCOMMANDS[REMOVESTUFF] = "REMOVESTUFF";
		REQUESTCOMMANDS[GPRC] = "GPRC";
		REQUESTCOMMANDS[GCIX] = "GCIX";
		REQUESTCOMMANDS[GCAP] = "GCAP";
		REQUESTCOMMANDS[JUMPSTART] = "JUMPSTART";
		REQUESTCOMMANDS[SIGN] = "Sign";
		REQUESTCOMMANDS[BTCKS] = "BTCKS";
		REQUESTCOMMANDS[JUMPPERF] = "JUMPPERF";
		REQUESTCOMMANDS[SPLASH_POSITION] = "SPLASH_POSITION";
		REQUESTCOMMANDS[CLOSE_UIMAKOPPI] = "CLOSE_UIMAKOPPI";
		REQUESTCOMMANDS[HUBU_VOTE] = "HUBU_VOTE";
		REQUESTCOMMANDS[PTM] = "PTM";
		REQUESTCOMMANDS[GOAWAY] = "GOAWAY";
	}
	
	/**
	 * Invokes a ClientRequestHandler for a given CommunicationHandler, ClientMessage and a set of booleans.
	 * @param comm The CommunicationHandler of the client that invokes this handler.
	 * @param request The ClientMessage holding the data of message (request) the client sent.
	 * @param registered An array of booleans representing the 'registered true/false' for each handler of the client.
	 * @return True if the handler was found and invoked, False otherwise.
	 */
	public final static boolean handleRequest(CommunicationHandler comm, ClientMessage request, boolean[] registered)
	{
		for(int i = min; i <= max; i++)
		{
			// Handler with this command registered for invoker?
			if(registered[i])
			{
				// Is this command the command of the request that is being processed?
				if(REQUESTCOMMANDS[i] != null && REQUESTCOMMANDS[i].equals(request.getType()))
				{
					// Invoke handler
					REQUESTHANDLERS[i].handle(request, comm);
					return true;
				}
			}
		}
		
		// No request handler exists / handler not registered for invoker
		return false;
	}
	
	/**
	 * Invokes a ClientRequestHandler for a given CommunicationHandler and command ID.
	 * @param comm The CommunicationHandler to pass to the ClientRequestHandler.
	 * @param commandID The ID (number) of the command/request to invoke. UNCHECKED.
	 */
	public final static void invokeHandler(CommunicationHandler comm, int commandID)
	{
		REQUESTHANDLERS[commandID].handle(null, comm);
	}
}
