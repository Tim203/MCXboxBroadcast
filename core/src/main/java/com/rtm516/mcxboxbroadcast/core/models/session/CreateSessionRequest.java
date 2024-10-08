package com.rtm516.mcxboxbroadcast.core.models.session;

import com.rtm516.mcxboxbroadcast.core.ExpandedSessionInfo;

import java.util.Collections;
import java.util.UUID;

public class CreateSessionRequest extends JoinSessionRequest {
    public SessionProperties properties;

    public CreateSessionRequest(ExpandedSessionInfo sessionInfo) {
        super(sessionInfo);
        this.properties = new SessionProperties(new SessionSystemProperties(), new SessionCustomProperties(
            2,
            false,
            "joinable_by_friends",
            true,
            sessionInfo.getMaxPlayers(),
            sessionInfo.getPlayers(),
            true,
            Collections.singletonList(new Connection(sessionInfo.getWebrtcNetworkId())),
            0,
            2,
            "level",
            sessionInfo.getHostName(),
            sessionInfo.getXuid(),
            "",
            sessionInfo.getWebrtcNetworkId(),
            UUID.randomUUID().toString(),
            "Survival",
            sessionInfo.getProtocol(),
            sessionInfo.getVersion(),
            false
        ));
    }
}
