package com.suelake.habbo.communication.requests;

import com.suelake.habbo.communication.ClientMessage;
import com.suelake.habbo.communication.ClientRequestHandler;
import com.suelake.habbo.communication.CommunicationHandler;

public class QUIT implements ClientRequestHandler
{
	public void handle(ClientMessage msg, CommunicationHandler comm)
	{
		comm.leaveSpace();
	}
}
