package com.mapper;

import javax.websocket.server.PathParam;

public interface LoginMapper {
    String login(@PathParam("name") String name, @PathParam("pwd") String pwd);
}
