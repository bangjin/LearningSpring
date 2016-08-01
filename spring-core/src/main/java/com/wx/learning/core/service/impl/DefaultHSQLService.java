package com.wx.learning.core.service.impl;

import com.wx.learning.core.service.HSQLService;
import org.hsqldb.server.Server;

import java.io.PrintWriter;

public class DefaultHSQLService implements HSQLService {
    private Server server = new Server();

    public DefaultHSQLService(String address, String databaseName, String databasePath, int port) {
        server.setAddress(address);
        server.setDatabaseName(0, databaseName);
        server.setDatabasePath(0, databasePath);
        server.setPort(port);
        server.setTrace(true);
        server.setLogWriter(new PrintWriter(System.out));
    }

    public void start() {
        server.start();
    }

    public void shutdown() {
        server.shutdown();
    }

}
