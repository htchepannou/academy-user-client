package io.tchepannou.academy.user.client.auth;

import io.tchepannou.academy.user.client.BaseResponse;
import io.tchepannou.academy.user.client.dto.SessionDto;

public class AuthResponse extends BaseResponse{
    private SessionDto session;

    public SessionDto getSession() {
        return session;
    }

    public void setSession(final SessionDto session) {
        this.session = session;
    }
}
