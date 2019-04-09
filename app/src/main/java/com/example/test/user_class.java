package com.example.test;

public class user_class
{
    private String user_username;
    private String user_fullname;
    private String user_userAddress;
    private double user_lat;
    private double user_lang;

    public user_class(String user_username, String user_fullname, String user_userAddress)
    {
        this.user_username = user_username;
        this.user_fullname = user_fullname;
        this.user_userAddress = user_userAddress;
    }

    public user_class(double user_lat, double user_lang)
    {
        this.user_lat = user_lat;
        this.user_lang = user_lang;
    }

    public double getUser_lat()
    {
        return user_lat;
    }

    public void setUser_lat(double user_lat)
    {
        this.user_lat = user_lat;
    }

    public double getUser_lang()
    {
        return user_lang;
    }

    public void setUser_lang(double user_lang) {
        this.user_lang = user_lang;
    }

    public String getUser_username()
    {
        return user_username;
    }

    public void setUser_username(String user_username)
    {
        this.user_username = user_username;
    }

    public String getUser_fullname()
    {
        return user_fullname;
    }

    public void setUser_fullname(String user_fullname)
    {
        this.user_fullname = user_fullname;
    }

    public String getUser_userAddress()
    {
        return user_userAddress;
    }

    public void setUser_userAddress(String user_userAddress)
    {
        this.user_userAddress = user_userAddress;
    }


}
