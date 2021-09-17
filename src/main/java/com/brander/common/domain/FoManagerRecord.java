package com.brander.common.domain;

import java.util.Date;

public class FoManagerRecord extends Page {
    private Integer id;

    private Integer userId;

    private String username;

    private String uname;

    private String ip;

    private Date ctime;

    private String browser;

    private String systems;

    private FoManager foManager;

    private String search;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname == null ? null : uname.trim();
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        this.browser = browser == null ? null : browser.trim();
    }

    public String getSystems() {
        return systems;
    }

    public void setSystems(String systems) {
        this.systems = systems == null ? null : systems.trim();
    }

    public FoManager getFoManager() {
        return foManager;
    }

    public void setFoManager(FoManager foManager) {
        this.foManager = foManager;
    }

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }
}